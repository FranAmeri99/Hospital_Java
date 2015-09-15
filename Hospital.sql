-- phpMyAdmin SQL Dump
-- version 4.0.10deb1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 08-09-2015 a las 09:04:56
-- Versión del servidor: 5.5.44-0ubuntu0.14.04.1
-- Versión de PHP: 5.5.9-1ubuntu4.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `Hospital`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `doctores`
--

CREATE TABLE IF NOT EXISTS `doctores` (
  `IDdoctor` int(11) NOT NULL AUTO_INCREMENT,
  `doc_Nombre` varchar(30) NOT NULL,
  `doc_Cedula` varchar(30) NOT NULL,
  `doc_Turno` varchar(30) NOT NULL,
  PRIMARY KEY (`IDdoctor`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Volcado de datos para la tabla `doctores`
--

INSERT INTO `doctores` (`IDdoctor`, `doc_Nombre`, `doc_Cedula`, `doc_Turno`) VALUES
(2, 'b', 'b', 'b');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `medicinas`
--

CREATE TABLE IF NOT EXISTS `medicinas` (
  `IDmedicina` int(11) NOT NULL AUTO_INCREMENT,
  `med_Nombre` varchar(30) NOT NULL,
  `med_Presentacion` varchar(30) NOT NULL,
  `med_Detalles` varchar(30) NOT NULL,
  PRIMARY KEY (`IDmedicina`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pacientes`
--

CREATE TABLE IF NOT EXISTS `pacientes` (
  `IDpaciente` int(11) NOT NULL AUTO_INCREMENT,
  `p_Nombre` varchar(30) NOT NULL,
  `p_Enfermedad_problema` varchar(30) NOT NULL,
  `doc_Nombre` varchar(30) NOT NULL,
  `p_PersonalCargo` varchar(30) NOT NULL,
  `p_Suministro` varchar(30) NOT NULL,
  PRIMARY KEY (`IDpaciente`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Volcado de datos para la tabla `pacientes`
--

INSERT INTO `pacientes` (`IDpaciente`, `p_Nombre`, `p_Enfermedad_problema`, `doc_Nombre`, `p_PersonalCargo`, `p_Suministro`) VALUES
(1, 'a', 'a', 'a', 'a', 'a'),
(2, 'c', 'c', 'c', 'c', 'dg'),
(3, 'c', 'c', 'c', 'c', 'c'),
(4, 'b', 'b', 'b', 'b', 'bvb');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `personal`
--

CREATE TABLE IF NOT EXISTS `personal` (
  `IDpersonal` int(11) NOT NULL AUTO_INCREMENT,
  `per_Tipo` varchar(30) NOT NULL,
  `per_PisoCargo` varchar(30) NOT NULL,
  PRIMARY KEY (`IDpersonal`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
