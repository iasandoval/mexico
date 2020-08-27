package mx.com.nacho.mexico.batch.domain;

public class CLocalidad {
    private String mapa;
    private String claveEntidad;
    private String nombreEntidad;
    private String entidadAbreviada;
    private String claveMunicipio;
    private String nombreMunicipio;
    private String claveLocalidad;
    private String nombreLocalidad;
    private String ambito;
    private String latitudDMS;
    private String longitudDMS;
    private String latitudDecimal;
    private String longitudDecimal;
    private String altitud;
    private String claveCarta;
    private String poblacionTotal;
    private String poblacionMasculina;
    private String poblacionFemenina;
    private String totalViviendas;

    public CLocalidad() {
        // Empty Constructor
    }

    public CLocalidad(String mapa, String claveEntidad, String nombreEntidad, String claveMunicipio, String nombreMunicipio, String claveLocalidad, String nombreLocalidad) {
        this.mapa = mapa;
        this.claveEntidad = claveEntidad;
        this.nombreEntidad = nombreEntidad;
        this.claveMunicipio = claveMunicipio;
        this.nombreMunicipio = nombreMunicipio;
        this.claveLocalidad = claveLocalidad;
        this.nombreLocalidad = nombreLocalidad;
    }

    public String getMapa() {
        return mapa;
    }

    public void setMapa(String mapa) {
        this.mapa = mapa;
    }

    public String getClaveEntidad() {
        return claveEntidad;
    }

    public void setClaveEntidad(String claveEntidad) {
        this.claveEntidad = claveEntidad;
    }

    public String getNombreEntidad() {
        return nombreEntidad;
    }

    public void setNombreEntidad(String nombreEntidad) {
        this.nombreEntidad = nombreEntidad;
    }

    public String getEntidadAbreviada() {
        return entidadAbreviada;
    }

    public void setEntidadAbreviada(String entidadAbreviada) {
        this.entidadAbreviada = entidadAbreviada;
    }

    public String getClaveMunicipio() {
        return claveMunicipio;
    }

    public void setClaveMunicipio(String claveMunicipio) {
        this.claveMunicipio = claveMunicipio;
    }

    public String getNombreMunicipio() {
        return nombreMunicipio;
    }

    public void setNombreMunicipio(String nombreMunicipio) {
        this.nombreMunicipio = nombreMunicipio;
    }

    public String getClaveLocalidad() {
        return claveLocalidad;
    }

    public void setClaveLocalidad(String claveLocalidad) {
        this.claveLocalidad = claveLocalidad;
    }

    public String getNombreLocalidad() {
        return nombreLocalidad;
    }

    public void setNombreLocalidad(String nombreLocalidad) {
        this.nombreLocalidad = nombreLocalidad;
    }

    public String getAmbito() {
        return ambito;
    }

    public void setAmbito(String ambito) {
        this.ambito = ambito;
    }

    public String getLatitudDMS() {
        return latitudDMS;
    }

    public void setLatitudDMS(String latitudDMS) {
        this.latitudDMS = latitudDMS;
    }

    public String getLongitudDMS() {
        return longitudDMS;
    }

    public void setLongitudDMS(String longitudDMS) {
        this.longitudDMS = longitudDMS;
    }

    public String getLatitudDecimal() {
        return latitudDecimal;
    }

    public void setLatitudDecimal(String latitudDecimal) {
        this.latitudDecimal = latitudDecimal;
    }

    public String getLongitudDecimal() {
        return longitudDecimal;
    }

    public void setLongitudDecimal(String longitudDecimal) {
        this.longitudDecimal = longitudDecimal;
    }

    public String getAltitud() {
        return altitud;
    }

    public void setAltitud(String altitud) {
        this.altitud = altitud;
    }

    public String getClaveCarta() {
        return claveCarta;
    }

    public void setClaveCarta(String claveCarta) {
        this.claveCarta = claveCarta;
    }

    public String getPoblacionTotal() {
        return poblacionTotal;
    }

    public void setPoblacionTotal(String poblacionTotal) {
        this.poblacionTotal = poblacionTotal;
    }

    public String getPoblacionMasculina() {
        return poblacionMasculina;
    }

    public void setPoblacionMasculina(String poblacionMasculina) {
        this.poblacionMasculina = poblacionMasculina;
    }

    public String getPoblacionFemenina() {
        return poblacionFemenina;
    }

    public void setPoblacionFemenina(String poblacionFemenina) {
        this.poblacionFemenina = poblacionFemenina;
    }

    public String getTotalViviendas() {
        return totalViviendas;
    }

    public void setTotalViviendas(String totalViviendas) {
        this.totalViviendas = totalViviendas;
    }

    @Override
    public String toString() {
        return "CLocalidad{" +
                "mapa='" + mapa + '\'' +
                ", claveEntidad='" + claveEntidad + '\'' +
                ", nombreEntidad='" + nombreEntidad + '\'' +
                ", entidadAbreviada='" + entidadAbreviada + '\'' +
                ", claveMunicipio='" + claveMunicipio + '\'' +
                ", nombreMunicipio='" + nombreMunicipio + '\'' +
                ", claveLocalidad='" + claveLocalidad + '\'' +
                ", nombreLocalidad='" + nombreLocalidad + '\'' +
                ", ambito='" + ambito + '\'' +
                ", latitudDMS='" + latitudDMS + '\'' +
                ", longitudDMS='" + longitudDMS + '\'' +
                ", latitudDecimal='" + latitudDecimal + '\'' +
                ", longitudDecimal='" + longitudDecimal + '\'' +
                ", altitud='" + altitud + '\'' +
                ", claveCarta='" + claveCarta + '\'' +
                ", poblacionTotal='" + poblacionTotal + '\'' +
                ", poblacionMasculina='" + poblacionMasculina + '\'' +
                ", poblacionFemenina='" + poblacionFemenina + '\'' +
                ", totalViviendas='" + totalViviendas + '\'' +
                '}';
    }
}
