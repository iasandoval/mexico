# Mexico-Batch

## Origen de Datos
INEGI - Catálogo Único de Claves de Áreas Geoestadísticas Estatales, Municipales y Localidades - https://www.inegi.org.mx/app/ageeml/


## Proceso (Esperado)

1. Descarga archivo
    1.1 https://www.inegi.org.mx/contenidos/app/ageeml/catun_localidad.zip
2. Extrae archivo
    2.1 catun_localidad.csv
3. Lee el archivo descargado
    3.1 catun_localidad.csv
4. Procesa el archivo
    4.1 Convierte Coordenadas en Grados a Coordenadas Decimales
    4.2 Convierte R/U a Rural o Urbano
    4.3 Genera Objetos JSON
5. Escribe en Base de Datos MongoDB
    5.1 Inserta o Actualiza (Upsert)

## Proceso (En Curso)
1. Lee Archivo catun_localidad.csv
2. Inserta registros en Base de Datos MySQL


## Diccionario de Datos

### INEGI

https://www.inegi.org.mx/contenidos/app/ageeml/Ayuda/Ayuda_Gral_Cat_Unico.pdf

| Nombre de la Columna              | Descripcion |
|-----------------------------------|-------------|
|Mapa								| |
|Cve_Ent							| |
|Nom_Ent							| |
|Nom_Abr							| |
|Cve_Mun							| |
|Nom_Mun							| |
|Cve_Loc							| |
|Nom_Loc							| |
|Ámbito								| |
|Latitud							| |
|Longitud							| |
|Lat_Decimal						| |
|Lon_Decimal						| |
|Altitud							| |
|Cve_Carta							| |
|Pob_Total							| |
|Pob_Masculina						| |
|Pob_Femenina						| |
|Total De Viviendas Habitadas		| |


### MongoDB



