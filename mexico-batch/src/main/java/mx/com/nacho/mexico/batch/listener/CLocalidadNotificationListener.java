package mx.com.nacho.mexico.batch.listener;

import mx.com.nacho.mexico.batch.domain.CLocalidad;
import mx.com.nacho.mexico.batch.domain.Estado;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class CLocalidadNotificationListener extends JobExecutionListenerSupport {
    private static final Logger log = LoggerFactory.getLogger(CLocalidadNotificationListener.class);

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public CLocalidadNotificationListener(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void afterJob(JobExecution jobExecution) {
        if(jobExecution.getStatus() == BatchStatus.COMPLETED) {
            log.info("!!! JOB FINISHED! Time to verify the results");

            jdbcTemplate.query("SELECT mapa, cve_ent, nom_ent, cve_mun, nom_mun, cve_loc, nom_loc FROM catun_localidad",
                    (rs, row) -> new CLocalidad(
                            rs.getString(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getString(5),
                            rs.getString(6),
                            rs.getString(7))
            ).forEach(localidad -> log.info("Found <" + localidad + "> in the database."));
        }
    }

}
