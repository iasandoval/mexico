package mx.com.nacho.mexico.batch.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "localidades")
public class Localidad {


    // Mapa
    @Id
    private String claveMapa;
    // Clave de la localidad a 4 digitos
    private String clave;
    // Nombre de la localidad
    private String nombre;
    // Municipio
    private Municipio municipio;
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

    public Localidad(String claveMapa, String clave, String nombre, String claveCarta, String ambito) {
        this.claveMapa = claveMapa;
        this.clave = clave;
        this.nombre = nombre;
        this.claveCarta = claveCarta;
        this.ambito = ambito;
    }

    public Localidad withMunicipio(Municipio municipio) {
        this.municipio = municipio;
        return this;
    }

    public Localidad withPoblacion(long total, long masculino, long femenino, long viviendas){
        this.poblacion = new Poblacion(total, masculino, femenino, viviendas);
        return this;
    }

    public Localidad withCoordenadas(String latitudDMS, String longitudDMS, double altitud, double latitud, double longitud){
        this.coordenadas = new Coordenadas(latitudDMS, longitudDMS, altitud, latitud, longitud);
        return this;
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

        public Poblacion(long total, long masculino, long femenino, long viviendas) {
            this.total = total;
            this.masculino = masculino;
            this.femenino = femenino;
            this.viviendas = viviendas;
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

        @Override
        public String toString() {
            return "Poblacion{" +
                    "total=" + total +
                    ", masculino=" + masculino +
                    ", femenino=" + femenino +
                    ", viviendas=" + viviendas +
                    '}';
        }
    }

    class Coordenadas {
        // Latitud (en DMS)
        private String latitudDMS;
        // Longitud (en DMS)
        private String longitudDMS;
        // Altitud
        private double altitud;
        // Latitud en decimal
        private double latitud;
        // Longitud en decimal
        private double longitud;

        public Coordenadas() {
            // Empty Constructor
        }

        public Coordenadas(String latitudDMS, String longitudDMS, double altitud, double latitud, double longitud) {
            this.latitudDMS = latitudDMS;
            this.longitudDMS = longitudDMS;
            this.altitud = altitud;
            this.latitud = latitud;
            this.longitud = longitud;
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

        @Override
        public String toString() {
            return "Coordenadas{" +
                    "latitudDMS='" + latitudDMS + '\'' +
                    ", longitudDMS='" + longitudDMS + '\'' +
                    ", altitud=" + altitud +
                    ", latitud=" + latitud +
                    ", longitud=" + longitud +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Localidad{" +
                "claveMapa='" + claveMapa + '\'' +
                ", clave='" + clave + '\'' +
                ", nombre='" + nombre + '\'' +
                ", municipio=" + municipio +
                ", poblacion=" + poblacion +
                ", coordenadas=" + coordenadas +
                ", claveCarta='" + claveCarta + '\'' +
                ", ambito='" + ambito + '\'' +
                '}';
    }
}
