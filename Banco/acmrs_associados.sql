-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Tempo de geração: 28-Maio-2020 às 00:01
-- Versão do servidor: 5.7.30-0ubuntu0.18.04.1
-- versão do PHP: 7.2.30-1+ubuntu18.04.1+deb.sury.org+1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `acmrs_associados`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `associados`
--

CREATE TABLE `associados` (
  `id` int(3) NOT NULL,
  `nome` varchar(70) NOT NULL,
  `data_nascimento` varchar(10) NOT NULL,
  `rg` varchar(13) NOT NULL,
  `cpf` varchar(14) NOT NULL,
  `email` varchar(50) DEFAULT NULL,
  `qto_filhos` int(2) DEFAULT NULL,
  `nome_pai` varchar(40) DEFAULT NULL,
  `nome_mae` varchar(70) DEFAULT NULL,
  `empregado` varchar(3) DEFAULT NULL,
  `telefone` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `associados`
--
ALTER TABLE `associados`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `cpf` (`cpf`),
  ADD UNIQUE KEY `rg` (`rg`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `associados`
--
ALTER TABLE `associados`
  MODIFY `id` int(3) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
