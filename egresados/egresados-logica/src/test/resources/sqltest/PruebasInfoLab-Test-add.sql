INSERT INTO `egresados`.`t_facultad` (`ID_FACULTAD`, `nombre`) VALUES ('456789', 'Admin');
INSERT INTO `egresados`.`t_programa` (`ID_PROGRAMA`, `creditos_programa`, `nom_programa`, `ID_FACULTAD`) VALUES ('456', '35', 'admin', '456789');
INSERT INTO `egresados`.`t_egresado` (`ID_EGRESADO`, `apellido`, `correo`, `nombre`, `num_documento`, `num_tel`, `tipo_documento`, `ID_PROGRAMA`) VALUES ('123', 'Van', 'no tiene', 'luis', '123', '000', 'cedula', '456');
INSERT INTO `Egresados`.`T_SECTORLABORAL` (`ID_SECTOR`, `nombre`) VALUES ('567', 'contaduria');
