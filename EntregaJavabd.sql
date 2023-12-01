SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";

CREATE TABLE `albergue` (
  `IdAlbergue` int(11) NOT NULL,
  `Calle` varchar(25) NOT NULL,
  `Numero` int(11) NOT NULL,
  `Region` varchar(25) NOT NULL,
  `Comuna` varchar(25) NOT NULL,
  `Encargado` varchar(25) NOT NULL,
  `Capacidad` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

INSERT INTO `albergue` (`IdAlbergue`, `Calle`, `Numero`, `Region`, `Comuna`, `Encargado`, `Capacidad`) VALUES
(0, 'Valdivia', 419, 'Valparaiso', 'Villa Alemana', 'Alexander Gallardo', 505),
(1, 'Valparaiso', 123, 'Maule', 'Curico', 'Miguel', 40),
(2, 'Valparaiso', 456, 'Maule', 'Curico', 'Sergio', 50),
(3, 'Valparaiso', 789, 'Maule', 'Curico', 'Camilo', 46),
(4, 'Valparaiso', 159, 'Maule', 'Curico', 'Gonzalo', 50);

CREATE TABLE `casa` (
  `IdCasa` int(11) NOT NULL,
  `Calle` varchar(25) NOT NULL,
  `Numero` int(11) NOT NULL,
  `Region` varchar(25) NOT NULL,
  `Comuna` varchar(25) NOT NULL,
  `Estado` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

INSERT INTO `casa` (`IdCasa`, `Calle`, `Numero`, `Region`, `Comuna`, `Estado`) VALUES
(0, 'Valdivia', 419, 'Valparaiso', 'Villa Alemana', 'Bueno'),
(1, 'Viña del mar', 321, 'Maule', 'Curico', 'Inundada'),
(2, 'Viña del mar', 523, 'Maule', 'Curico', 'Inundada'),
(3, 'Viña del Mar', 454, 'Maule', 'Curico', 'Inundada'),
(4, 'Pedro Montt', 485, 'Maule', 'Curico', 'Inundada'),
(5, 'Pedro Montt', 654, 'Maule', 'Curico', 'Inundada'),
(6, 'Pedro Montt', 648, 'Maule', 'Curico', 'Inundada'),
(7, 'Molina', 418, 'Maule', 'Curico', 'Deprorable'),
(8, 'Molina', 271, 'Maule', 'Curico', 'Inavitable'),
(9, 'Molina', 634, 'Maule', 'Curico', 'Deprorable'),
(10, 'Molina', 673, 'Maule', 'Curico', 'Inavitable'),
(11, 'Molina', 871, 'Maule', 'Curico', 'Deprorable'),
(12, 'Romeral', 651, 'Maule', 'Curico', 'Inavitable'),
(13, 'Romeral', 769, 'Maule', 'Curico', 'Deprorable'),
(14, 'Romeral', 831, 'Maule', 'Curico', 'Bueno'),
(15, 'Romeral', 462, 'Maule', 'Curico', 'Bueno');

CREATE TABLE `familia` (
  `IdFamilia` int(11) NOT NULL,
  `CantidadIntegrantes` int(11) NOT NULL,
  `IdCasa` int(11) NOT NULL,
  `IdAlbergue` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

INSERT INTO `familia` (`IdFamilia`, `CantidadIntegrantes`, `IdCasa`, `IdAlbergue`) VALUES
(0, 4, 0, 0),
(1, 1, 1, 1),
(2, 4, 2, 1),
(3, 1, 3, 1),
(4, 4, 4, 2),
(5, 1, 5, 2),
(6, 1, 6, 2),
(7, 1, 7, 3),
(8, 3, 8, 3),
(9, 1, 9, 3),
(10, 1, 10, 4),
(11, 1, 11, 3),
(12, 5, 12, 4),
(13, 1, 13, 4),
(14, 2, 14, 0),
(15, 2, 15, 0);

CREATE TABLE `familiar` (
  `RutFamiliar` varchar(25) NOT NULL,
  `Alojamiento` int(11) NOT NULL,
  `Nombre` varchar(25) NOT NULL,
  `ApellidoPaterno` varchar(25) NOT NULL,
  `ApellidoMaterno` varchar(25) NOT NULL,
  `Edad` int(11) NOT NULL,
  `Telefono` int(11) NOT NULL,
  `IdFamilia` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

INSERT INTO `familiar` (`RutFamiliar`, `Alojamiento`, `Nombre`, `ApellidoPaterno`, `ApellidoMaterno`, `Edad`, `Telefono`, `IdFamilia`) VALUES
('101053989', 0, 'Sebastian ', 'Montenegro', 'Peña', 48, 961785534, 4),
('103139006', 1, 'Victor ', 'Jimenez', 'Salazar', 55, 966154768, 14),
('106698430', 1, 'Carolina ', 'Hernandez', 'Sepulveda', 55, 995193919, 14),
('116626772', 1, 'Natalia ', 'Rios', 'Vasquez', 51, 965486547, 9),
('119213045', 1, 'Andres ', 'Medina', 'Ramos', 45, 945146854, 6),
('130225674', 1, 'Carlos ', 'Montalvo', 'Mendoza', 43, 999118723, 11),
('130225675', 0, 'Adrian ', 'Contreras', 'Muñoz', 43, 965846884, 10),
('132111847', 0, 'Javier ', 'Ramirez', 'Cerda', 43, 981974664, 13),
('157305360', 0, 'Ignacio', 'Delgado', 'Morales', 39, 997576549, 12),
('160003759', 0, 'Antonella ', 'Banderas', 'Gomez', 38, 964808802, 12),
('163139006', 1, 'Vicente', 'Silva', 'Muñoz', 35, 948321665, 15),
('167093078', 0, 'Valentina ', 'Soto', 'Martinez', 33, 966715842, 5),
('178241761', 0, 'Camila ', 'Fernandez', 'Ortega', 28, 989648473, 7),
('199855816', 0, 'Isabella ', 'Montenegro', 'Sanchez', 22, 976765124, 4),
('206152729', 0, 'Ricardo', 'Montenegro', 'Sanchez', 21, 941267548, 4),
('209616564', 0, 'Tomas', 'Gonzalez', 'Contreras', 21, 989797906, 1),
('21202333-7', 0, 'Felipe', 'Urrutia', 'Cordova', 51, 952834343, 0),
('223493742', 0, 'Felipe ', 'Delgado', 'Banderas', 19, 993090770, 12),
('232939982', 0, 'Juan Carlos ', 'Mendoza', 'Perez', 17, 915648317, 8),
('233337787-2', 0, 'Pedrito', 'Gonzales', 'Munoz', 30, 2390592, 0),
('234777682', 0, 'Alexander', 'Gallardo', 'Cordova', 23, 989797906, 1),
('235238111', 0, 'Daniela ', 'Delgado', 'Banderas', 18, 989795134, 12),
('257587347', 1, 'Valeria ', 'Silva', 'Torres', 10, 965488485, 15),
('259690048', 1, 'Alejandro', 'Montenegro', 'Sanchez', 12, 936751874, 4),
('264517400', 0, 'Paula ', 'Delgado', 'Banderas', 5, 991632437, 12),
('80898541', 0, 'Esteban ', 'Mendoza', 'Vargas', 62, 965486856, 8),
('86627388', 0, 'Mariana ', 'Perez', 'Rodrigues', 61, 946531845, 8);

CREATE TABLE `persona` (
  `Rut` varchar(25) NOT NULL,
  `Nombre` varchar(50) DEFAULT NULL,
  `Apellido` varchar(50) DEFAULT NULL,
  `FechaNacimienti` date DEFAULT NULL,
  `Direccion` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

INSERT INTO `persona` (`Rut`, `Nombre`, `Apellido`, `FechaNacimienti`, `Direccion`) VALUES
('23.337.787-2', 'Alexander Benjamin', 'Gallardo Cordova', '2000-10-07', 'Valdivia 419');

CREATE TABLE `tarea` (
  `IdTarea` int(11) NOT NULL,
  `TipoTarea` varchar(25) NOT NULL,
  `FechaInicio` date NOT NULL,
  `FechaObjetivo` date NOT NULL,
  `IdCasa` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

INSERT INTO `tarea` (`IdTarea`, `TipoTarea`, `FechaInicio`, `FechaObjetivo`, `IdCasa`) VALUES
(1, 'Quitar Agua', '2023-11-15', '2023-11-16', 1),
(2, 'Quitar Barro', '2023-11-15', '2023-11-16', 3),
(3, 'Quitar Muebles', '2023-11-16', '2023-11-17', 4),
(4, 'Quitar Agua', '2023-11-15', '2023-11-16', 9),
(5, 'Ordenar Muebles', '2023-11-18', '2023-11-19', 6);

CREATE TABLE `usuario` (
  `Id` int(11) NOT NULL,
  `NombreUsuario` varchar(15) NOT NULL,
  `Password` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

INSERT INTO `usuario` (`Id`, `NombreUsuario`, `Password`) VALUES
(0, 'Alexander', 'admin'),
(1, 'Judith', '1234');

CREATE TABLE `voluntario` (
  `RutVoluntario` varchar(25) NOT NULL,
  `Activo` int(11) NOT NULL,
  `Nombre` varchar(25) NOT NULL,
  `ApellidoPaterno` varchar(25) NOT NULL,
  `ApellidoMaterno` varchar(25) NOT NULL,
  `Edad` int(11) NOT NULL,
  `Telefono` int(11) NOT NULL,
  `Correo` varchar(25) NOT NULL,
  `Profesion` varchar(25) NOT NULL,
  `Debilidad` varchar(25) NOT NULL,
  `Fortaleza` varchar(25) NOT NULL,
  `Calle` varchar(25) NOT NULL,
  `Numero` int(11) NOT NULL,
  `Region` varchar(25) NOT NULL,
  `IdTarea` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

INSERT INTO `voluntario` (`RutVoluntario`, `Activo`, `Nombre`, `ApellidoPaterno`, `ApellidoMaterno`, `Edad`, `Telefono`, `Correo`, `Profesion`, `Debilidad`, `Fortaleza`, `Calle`, `Numero`, `Region`, `IdTarea`) VALUES
('197436346', 0, 'Isidora', 'Torres', 'Soto', 22, 935784159, 'isidoratorres@gmail.com', 'Camarero', 'Organización', 'Trabajo con Personas', 'El Rocío', 284, 'Valparaiso', 1),
('206128093', 1, 'nonono', 'sisisi', 'zzz', 34, 43143, 'wiwi@gmail.com', 'waaaa', 'aaaa', 'aaav', 'kkdd', 45, 'valpa', 2),
('209795011', 0, 'Mateo', 'Salazar', 'Ramírez', 21, 935784123, 'mateosalazar@gmail.com', 'Camarero', 'Trabajo de Fuerza', 'Trabajo Con Persona', 'Toltén', 164, 'Metropolitana', 2),
('209845672', 0, 'Mariano', 'Sánchez', 'Perez', 21, 96128812, 'marianosanchez@gmail.com', 'Cocinero', 'Trabajo de Fuerza', 'Preparar Comida', 'Milán', 654, 'Valparaiso', 2),
('209874601', 0, 'Valentina', 'Díaz', 'Torres', 21, 935784215, 'valentinadiaz@gmail.com', 'Desempleado', 'Trabajo de Fuerza', 'Trabajo en Equipo', 'Tercera', 572, 'Metropolitana', 2),
('209923833', 0, 'Matías', 'López', 'Ramón', 21, 967637123, 'matiaslopez@gmail.com', 'Mesero', 'Trabajo en Equipo', 'Trabajo con Personas', 'Santiago', 711, 'Metropolitana', 3),
('211011378', 0, 'Santiago', 'Castro', 'López', 20, 935784789, 'santiagocastro@gmail.com', 'Desempleado', 'Ansiedad Social', 'Organización', 'Los Olivos', 134, 'Metropolitana', 3),
('212033166', 0, 'Camila', 'Flores', 'Vargas', 20, 967637234, 'camilaflores@gmail.com', 'Desempleado', 'Trabajo de Fuerza', 'Trabajo en Equipo', 'Serena', 234, 'Metropolitana', 3),
('213638305', 0, 'Antonella', 'Vargas', 'García', 20, 935784456, 'antonellavargas@gmail.com', 'Cajero', 'Comunicación', 'Trabajo de Fuerza', 'O\'Higgins', 866, 'Valparaiso', 4),
('213788825', 0, 'Luciana', 'Ramírez', 'Pérez', 20, 935784371, 'lucianaramirez@gmail.com', 'Mecanico', 'Comunicación', 'Trabajos de Fuerza', 'Yungay', 528, 'Maule', 4),
('217370848', 0, 'Sebastián ', 'Silva', 'Torres', 20, 967637456, 'sebastiansilva@gmail.com', 'Desempleado', 'Trabajo en Equipo', 'Trabajo de Fuerza', 'Miguel De Cervantes', 435, 'Valparaiso', 4),
('21867386', 0, 'Daniel', 'Herrera', 'Varela', 20, 935784482, 'danielherrera@gmail.com', 'Desempleado', 'Trabajo Personal', 'Trabajo con Personas', 'Nueva', 934, 'Valparaiso', 5),
('221022012', 0, 'Emiliano', 'González', 'Silva', 19, 935784268, 'emilianogonzalez@gmail.co', 'Desempleado', 'Trabajo en equipo', 'Trabajo de Fuerza', 'Esmeralda', 857, 'Metropolitana', 5),
('226780626', 0, 'Valeria', 'Rojas', 'Castro', 19, 967637425, 'valeriarojas@gmail.com', 'Desempleado', 'Trabajo Personal', 'Comunicacion', 'Los Maitenes', 657, 'Valparaiso', 5);


ALTER TABLE `albergue`
  ADD PRIMARY KEY (`IdAlbergue`);

ALTER TABLE `casa`
  ADD PRIMARY KEY (`IdCasa`);

ALTER TABLE `familia`
  ADD PRIMARY KEY (`IdFamilia`),
  ADD KEY `IdCasa` (`IdCasa`),
  ADD KEY `IdAlbergue` (`IdAlbergue`);

ALTER TABLE `familiar`
  ADD PRIMARY KEY (`RutFamiliar`),
  ADD KEY `IdFamilia` (`IdFamilia`);

ALTER TABLE `persona`
  ADD PRIMARY KEY (`Rut`);

ALTER TABLE `tarea`
  ADD PRIMARY KEY (`IdTarea`),
  ADD KEY `IdCasa` (`IdCasa`);

ALTER TABLE `usuario`
  ADD PRIMARY KEY (`Id`);

ALTER TABLE `voluntario`
  ADD PRIMARY KEY (`RutVoluntario`),
  ADD KEY `IdTarea` (`IdTarea`);


ALTER TABLE `familia`
  ADD CONSTRAINT `familia_ibfk_1` FOREIGN KEY (`IdCasa`) REFERENCES `casa` (`IdCasa`) ON UPDATE CASCADE,
  ADD CONSTRAINT `familia_ibfk_2` FOREIGN KEY (`IdAlbergue`) REFERENCES `albergue` (`IdAlbergue`) ON UPDATE CASCADE;

ALTER TABLE `familiar`
  ADD CONSTRAINT `familiar_ibfk_1` FOREIGN KEY (`IdFamilia`) REFERENCES `familia` (`IdFamilia`) ON UPDATE CASCADE;

ALTER TABLE `tarea`
  ADD CONSTRAINT `tarea_ibfk_1` FOREIGN KEY (`IdCasa`) REFERENCES `casa` (`IdCasa`) ON UPDATE CASCADE;

ALTER TABLE `voluntario`
  ADD CONSTRAINT `voluntario_ibfk_1` FOREIGN KEY (`IdTarea`) REFERENCES `tarea` (`IdTarea`) ON UPDATE CASCADE;