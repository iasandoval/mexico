package mx.com.nacho.mexico.api.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "localidades")
public class Localidad {
    @Id
    private String id;
    // Municipio
    private Municipio municipio;
    // Clave de la localidad'
    private String clave;
    // Nombre de la localidad
    private String nombre;
    // Poblacion
    private Poblacion poblacion;
    // Coordenadas
    private Coordenadas coordenadas;
    // Clave Carta
    private String claveCarta;
    // Ambito (Rural, Urbano)
    private String ambito;

    public Localidad() {
        // Empty Constructor
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
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

    public Poblacion getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(Poblacion poblacion) {
        this.poblacion = poblacion;
    }

    public Coordenadas getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(Coordenadas coordenadas) {
        this.coordenadas = coordenadas;
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

    class Poblacion {
        // Población Total
        private long total;
        // Población Masculina
        private long masculino;
        // Población Femenina
        private long femenino;
        //Número total de viviendas
        private long viviendas;


        public Poblacion() {
            // Empty Constructor
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
    }

    class Coordenadas {
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

        public Coordenadas() {
            // Empty Constructor
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
    }

}
