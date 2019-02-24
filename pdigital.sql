-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 24-02-2019 a las 01:15:56
-- Versión del servidor: 10.1.37-MariaDB
-- Versión de PHP: 7.3.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `pdigital`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `cliente_id` varchar(6) NOT NULL,
  `c_nombres` varchar(45) NOT NULL,
  `c_apellidos` varchar(45) NOT NULL,
  `c_email` varchar(45) NOT NULL,
  `c_direccion` varchar(255) NOT NULL,
  `c_telefono1` varchar(25) NOT NULL,
  `c_telefono2` varchar(25) NOT NULL,
  `c_empresa` varchar(45) NOT NULL,
  `c_trabajo_realizado` varchar(255) NOT NULL,
  `c_notas` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`cliente_id`, `c_nombres`, `c_apellidos`, `c_email`, `c_direccion`, `c_telefono1`, `c_telefono2`, `c_empresa`, `c_trabajo_realizado`, `c_notas`) VALUES
('1', '', 'a', '', '', '', '', '', '', ''),
('2', 'a', 'a', 'a', 'a', '11', '11', 'a', 'a', 'a'),
('3', 'cliente1', 'cliente1', 'cliente1', 'cliente1', '1', '1', 'cliente1', 'aaa', 'aaaaa');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleados`
--

CREATE TABLE `empleados` (
  `empleado_id` varchar(6) NOT NULL,
  `e_nombres` varchar(45) NOT NULL,
  `e_apellidos` varchar(45) NOT NULL,
  `e_email` varchar(45) NOT NULL,
  `e_direccion` varchar(255) NOT NULL,
  `e_telefono1` varchar(25) NOT NULL,
  `e_telefono2` varchar(25) NOT NULL,
  `e_salario` varchar(25) NOT NULL,
  `e_notas` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `empleados`
--

INSERT INTO `empleados` (`empleado_id`, `e_nombres`, `e_apellidos`, `e_email`, `e_direccion`, `e_telefono1`, `e_telefono2`, `e_salario`, `e_notas`) VALUES
('1', 'aaaaaa', '1', '1', '1', '1', '1', '1', ''),
('2', '1', '1', '1', '1', '1', '1', '1', '1');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`cliente_id`);

--
-- Indices de la tabla `empleados`
--
ALTER TABLE `empleados`
  ADD PRIMARY KEY (`empleado_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
