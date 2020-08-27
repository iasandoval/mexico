package mx.com.nacho.mexico.batch.processor;

import mx.com.nacho.mexico.batch.domain.CLocalidad;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

public class CLocalidadItemProcessor implements ItemProcessor<CLocalidad, CLocalidad> {
    private static final Logger log = LoggerFactory.getLogger(CLocalidadItemProcessor.class);

    @Override
    public CLocalidad process(final CLocalidad loc) throws Exception {

        CLocalidad localidad = loc;

        //String claveEntidad = String.format("%02d", loc.getClaveEntidad());
        //localidad.setClaveEntidad(claveEntidad);

        String abrev = loc.getEntidadAbreviada().replaceAll("\\.", "").toUpperCase().trim();
        localidad.setEntidadAbreviada(abrev);

        //String claveMunicipio = String.format("%04d", loc.getClaveMunicipio());
        //localidad.setClaveMunicipio(claveMunicipio);

        //String claveLocalidad = String.format("%04d", loc.getClaveLocalidad());
        //localidad.setClaveLocalidad(claveLocalidad);

        log.info("Converting (" + loc + ") into (" + localidad + ")");

        return localidad;
    }

}
