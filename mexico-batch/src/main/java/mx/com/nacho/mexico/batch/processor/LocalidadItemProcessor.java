package mx.com.nacho.mexico.batch.processor;

import mx.com.nacho.mexico.batch.domain.CLocalidad;
import mx.com.nacho.mexico.batch.domain.Estado;
import mx.com.nacho.mexico.batch.domain.Localidad;
import mx.com.nacho.mexico.batch.domain.Municipio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

public class LocalidadItemProcessor implements ItemProcessor<CLocalidad, Localidad> {
    private static final Logger log = LoggerFactory.getLogger(LocalidadItemProcessor.class);

    @Override
    public Localidad process(final CLocalidad loc) throws Exception {

        String claveEstado = String.format("%02d", loc.getClaveEntidad());
        String abrev = loc.getEntidadAbreviada().replaceAll("\\.", "").toUpperCase().trim();

        final Estado estado = new Estado(claveEstado, loc.getNombreEntidad(), abrev);

        String claveMunicipio = String.format("%04d", loc.getClaveMunicipio());
        final Municipio municipio = new Municipio(claveMunicipio, loc.getNombreMunicipio(), estado);

        String claveLocalidad = String.format("%04d", loc.getClaveLocalidad());
        String ambito = ("U".equals(loc.getAmbito()))?"Urbano":"Rural";
        long poblacionTotal = this.parseLong(loc.getPoblacionTotal());
        long poblacionMasculina = this.parseLong(loc.getPoblacionMasculina());
        long poblacionFemenina = this.parseLong(loc.getPoblacionFemenina());
        long viviendas = this.parseLong(loc.getTotalViviendas());

        double altitud = this.parseDouble(loc.getAltitud());
        double latitud = this.parseDouble(loc.getLatitudDecimal());
        double longitud = this.parseDouble(loc.getLongitudDecimal());

        final Localidad localidad = new Localidad(loc.getMapa(), claveLocalidad, loc.getNombreLocalidad(),
                loc.getClaveCarta(), ambito)
                .withMunicipio(municipio)
                .withPoblacion(poblacionTotal, poblacionMasculina, poblacionFemenina, viviendas)
                .withCoordenadas(loc.getLatitudDMS(), loc.getLongitudDMS(), altitud, latitud, longitud);

        log.info("Converting (" + loc + ") into (" + localidad + ")");

        return localidad;
    }

    private double parseDouble(String valor) {
        double val;
        try {
            val = Double.parseDouble(valor);
        } catch(NumberFormatException ex) {
            val = 0;
        }

        return val;
    }

    private long parseLong(String valor) {
        long val;
        try {
            val = Long.parseLong(valor);
        } catch (NumberFormatException ex) {
            val = 0L;
        }

        return val;
    }
}
