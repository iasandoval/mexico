package mx.com.nacho.mexico.batch.mapper;

import mx.com.nacho.mexico.batch.domain.CLocalidad;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

public class CLocalidadFieldSetMapper implements FieldSetMapper<CLocalidad> {
    @Override
    public CLocalidad mapFieldSet(FieldSet fieldSet) throws BindException {

        CLocalidad localidad = new CLocalidad();

        localidad.setMapa(fieldSet.readString("mapa"));
        localidad.setClaveEntidad(fieldSet.readString("cve_ent"));
        localidad.setNombreEntidad(fieldSet.readString("nom_ent"));
        localidad.setEntidadAbreviada(fieldSet.readString("nom_abr"));
        localidad.setClaveMunicipio(fieldSet.readString("cve_mun"));
        localidad.setNombreMunicipio(fieldSet.readString("nom_mun"));
        localidad.setClaveLocalidad(fieldSet.readString("cve_loc"));
        localidad.setNombreLocalidad(fieldSet.readString("nom_loc"));
        localidad.setAmbito(fieldSet.readString("ámbito"));
        localidad.setLatitudDMS(fieldSet.readString("latitud"));
        localidad.setLongitudDMS(fieldSet.readString("longitud"));
        localidad.setLatitudDecimal(fieldSet.readString("lat_decimal"));
        localidad.setLongitudDecimal(fieldSet.readString("lon_decimal"));
        localidad.setAltitud(fieldSet.readString("altitud"));
        localidad.setClaveCarta(fieldSet.readString("cve_carta"));
        localidad.setPoblacionTotal(fieldSet.readString("pob_total"));
        localidad.setPoblacionMasculina(fieldSet.readString("pob_masculina"));
        localidad.setPoblacionFemenina(fieldSet.readString("pob_femenina"));
        localidad.setTotalViviendas(fieldSet.readString("total de viviendas habitadas"));

        return localidad;
    }
}
