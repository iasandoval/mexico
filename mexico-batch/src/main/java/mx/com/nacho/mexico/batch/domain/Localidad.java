package mx.com.nacho.mexico.batch.domain;


public class Localidad {
    private long id;
    // Municipio
    private long municipioID;
    // Clave de la localidad'
    private String clave;
    // Nombre de la localidad
    private String nombre;
    // Poblacion
    // Población Total
    private long total;
    // Población Masculina
    private long masculino;
    // Población Femenina
    private long femenino;
    //Número total de viviendas
    private long viviendas;
    // Coordenadas
    // Latitud (en DMS)
    private double latitudDMS;
    // Longitud (en DMS)
    private double longitudDMS;
    // Altitud
    private double altitud;
    // Latitud en decimal
    private double latitud;
    // Longitud en decimal
    private double longitud;
    // Clave Carta
    private String claveCarta;
    // Ambito (Rural, Urbano)
    private String ambito;

    public Localidad() {
        // Empty Constructor
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getMunicipioID() {
        return municipioID;
    }

    public void setMunicipioID(long municipioID) {
        this.municipioID = municipioID;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public long getMasculino() {
        return masculino;
    }

    public void setMasculino(long masculino) {
        this.masculino = masculino;
    }

    public long getFemenino() {
        return femenino;
    }

    public void setFemenino(long femenino) {
        this.femenino = femenino;
    }

    public long getViviendas() {
        return viviendas;
    }

    public void setViviendas(long viviendas) {
        this.viviendas = viviendas;
    }

    public double getLatitudDMS() {
        return latitudDMS;
    }

    public void setLatitudDMS(double latitudDMS) {
        this.latitudDMS = latitudDMS;
    }

    public double getLongitudDMS() {
        return longitudDMS;
    }

    public void setLongitudDMS(double longitudDMS) {
        this.longitudDMS = longitudDMS;
    }

    public double getAltitud() {
        return altitud;
    }

    public void setAltitud(double altitud) {
        this.altitud = altitud;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public String getClaveCarta() {
        return claveCarta;
    }

    public void setClaveCarta(String claveCarta) {
        this.claveCarta = claveCarta;
    }

    public String getAmbito() {
        return ambito;
    }

    public void setAmbito(String ambito) {
        this.ambito = ambito;
    }
}
