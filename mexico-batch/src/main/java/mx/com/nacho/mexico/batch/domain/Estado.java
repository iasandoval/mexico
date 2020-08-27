package mx.com.nacho.mexico.batch.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "estados")
public class Estado {

    // Clave del Estado a 2 digitos
    @Id
    private String clave;
    // Nombre del estado
    @Indexed
    private String nombre;
    // Abreviatura del estado
    private String abreviado;

    public Estado() {
        // Empty Constructor
    }

    public Estado(String clave, String nombre, String abreviado) {
        this.clave = clave;
        this.nombre = nombre;
        this.abreviado = abreviado;
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

    public String getAbreviado() {
        return abreviado;
    }

    public void setAbreviado(String abreviado) {
        this.abreviado = abreviado;
    }

    @Override
    public String toString() {
        return "Estado{" +
                "clave='" + clave + '\'' +
                ", nombre='" + nombre + '\'' +
                ", abreviado='" + abreviado + '\'' +
                '}';
    }
}
