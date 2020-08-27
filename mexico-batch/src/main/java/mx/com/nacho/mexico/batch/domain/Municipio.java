package mx.com.nacho.mexico.batch.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "municipios")
public class Municipio {

    // Clave del Municipio a 4 digitos
    @Id
    private String clave;
    // Nombre del Municipio
    @Indexed
    private String nombre;
    // Estado
    private Estado estado;

    public Municipio() {
        // Empty Constructor
    }

    public Municipio(String clave, String nombre, Estado estado) {
        this.clave = clave;
        this.nombre = nombre;
        this.estado = estado;
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

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Municipio{" +
                "clave='" + clave + '\'' +
                ", nombre='" + nombre + '\'' +
                ", estado=" + estado +
                '}';
    }
}
