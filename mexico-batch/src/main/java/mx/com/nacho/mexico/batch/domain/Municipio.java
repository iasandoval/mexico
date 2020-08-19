package mx.com.nacho.mexico.batch.domain;

public class Municipio {

    private long id;
    // Estado
    private long estadoId;
    // Clave del Municipio
    private String clave;
    // Nombre del Municipio
    private String nombre;

    public Municipio() {
        // Empty Constructor
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getEstadoId() {
        return estadoId;
    }

    public void setEstadoId(long estadoId) {
        this.estadoId = estadoId;
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
}
