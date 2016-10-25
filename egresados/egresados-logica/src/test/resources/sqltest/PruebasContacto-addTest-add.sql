INSERT INTO `Egresados`.`T_PAIS` (`cod`, `nombre`) VALUES ('321', 'colombia');
INSERT INTO `Egresados`.`T_DEPARTAMENTO` (`ID_DEPARTAMENTO`, `nom_dep`, `pais`) VALUES ('432', 'quindo', '321');
INSERT INTO `Egresados`.`T_CIUDAD` (`ID_CIUDAD`, `nombre_ciudad`, `ID_DEPARTAMENTO`) VALUES ('543', 'armenia', '432');
INSERT INTO `Egresados`.`T_SECTORLABORAL` (`ID_SECTOR`, `nombre`) VALUES ('2', 'administracion');
INSERT INTO `Egresados`.`T_EMPRESA` (`NIT`, `direccion`, `razon_social`, `telefono`, `tipo_empresa`, `dir_web`, `ID_CIUDAD`, `depto`, `pais`, `ID_SECTOR`) VALUES ('656', 'boreal', 'no se', '300712', 'PRIVADA', 'boreal.com', '543', '432', '321', '2');