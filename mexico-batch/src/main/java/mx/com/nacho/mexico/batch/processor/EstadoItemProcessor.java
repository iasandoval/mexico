package mx.com.nacho.mexico.batch.processor;

import mx.com.nacho.mexico.batch.domain.Estado;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

public class EstadoItemProcessor implements ItemProcessor<Estado, Estado> {
    private static final Logger log = LoggerFactory.getLogger(EstadoItemProcessor.class);

    @Override
    public Estado process(final Estado estado) throws Exception {

        String abrev = estado.getAbrev().replaceAll("\\.", "").toUpperCase().trim();

        final Estado estadoNuevo = new Estado(estado.getId(), estado.getClave(), estado.getNombre(), abrev);

        log.info("Converting (" + estado + ") into (" + estadoNuevo + ")");

        return estadoNuevo;
    }
}
