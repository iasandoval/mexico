package mx.com.nacho.mexico.batch.domain;

public class Estado {

    private long id;
    // Clave del Estado
    private String clave;
    // Nombre del estado
    private String nombre;
    // Nombre abreviado del estado
    private String abrev;

    public Estado() {
        // Empty Constructor
    }

    public Estado(long id, String clave, String nombre, String abrev) {
        this.id = id;
        this.clave = clave;
        this.nombre = nombre;
        this.abrev = abrev;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getAbrev() {
        return abrev;
    }

    public void setAbrev(String abrev) {
        this.abrev = abrev;
    }

    @Override
    public String toString() {
        return "Estado{" +
                "id=" + id +
                ", clave='" + clave + '\'' +
                ", nombre='" + nombre + '\'' +
                ", abrev='" + abrev + '\'' +
                '}';
    }
}
