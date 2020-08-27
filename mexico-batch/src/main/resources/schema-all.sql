DROP TABLE IF EXISTS `catun_localidad`;
CREATE TABLE `catun_localidad` (
  `mapa` varchar(11) NOT NULL COMMENT 'MAPA - ',
  `cve_ent` varchar(2) NOT NULL COMMENT 'CVE_ENT - Clave de la entidad',
  `nom_ent` varchar(100) NOT NULL COMMENT 'NOM_ENT - Nombre de la entidad',
  `nom_abr` varchar(10) NOT NULL COMMENT 'NOM_ABR - Nombre abreviado de la entidad',
  `cve_mun` varchar(4) NOT NULL COMMENT 'CVE_MUN – Clave del municipio',
  `nom_mun` varchar(100) NOT NULL COMMENT 'NOM_MUN – Nombre del municipio',
  `cve_loc` varchar(4) NOT NULL COMMENT 'CVE_LOC – Clave de la localidad',
  `nom_loc` varchar(100) NOT NULL COMMENT 'NOM_LOC – Nombre de la localidad',
  `ambito` varchar(1) NOT NULL COMMENT 'AMBITO - Urbano o Rural',
  `latitud` varchar(15) NOT NULL COMMENT 'LATITUD – Latitud (en DMS)',
  `longitud` varchar(15) NOT NULL COMMENT 'LONGITUD – Longitud (en DMS)',
  `lat_decimal` varchar(20) NOT NULL COMMENT 'LAT_DECIMAL - Latitud en decimal',
  `lon_decimal` varchar(20) NOT NULL COMMENT 'LON_DECIMAL - Longitud en decimal',
  `altitud` varchar(11) NOT NULL COMMENT 'ALTITUD – Altitud',
  `cve_carta` varchar(10) NOT NULL COMMENT 'CVE_CARTA',
  `pob_total` varchar(11) NOT NULL COMMENT 'POB_TOTAL – Población Total',
  `pob_masculina` varchar(11) NOT NULL COMMENT 'POB_MASCULINA – Población Masculina',
  `pob_femenina` varchar(11) NOT NULL COMMENT 'POB_FEMENINA – Población Femenina',
  `total_viviendas` varchar(11) NOT NULL COMMENT 'total de viviendas habitadas  – Número total de viviendas'
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='Localidades de la República Mexicana';

ALTER TABLE `catun_localidad`
  ADD PRIMARY KEY (`mapa`);
