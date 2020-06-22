-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 22, 2020 at 08:57 AM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `calculator`
--

-- --------------------------------------------------------

--
-- Table structure for table `data`
--

CREATE TABLE `data` (
  `id` int(11) NOT NULL,
  `operation` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `data`
--

INSERT INTO `data` (`id`, `operation`) VALUES
(1, '33.0-2.0=0.0'),
(2, '21.0/2.0=0.0'),
(3, '23.0 -2.0 = 0.0'),
(4, '22.0 -6.0 = 16.00'),
(5, '33.0 - 3.0 = 30.00'),
(6, '66.0 /2.0 = 33.00'),
(7, '100.0 - 2.0 = 98.00'),
(8, '22.2 - 1.1 = 21.10'),
(9, '22.02 - 2.1 = 19.92'),
(10, '88.0 * 2.0 = 176.00'),
(11, '88.0 - 2.0 = 86.00'),
(12, '99.0 - 2.0 = 97.00'),
(13, '99.0 / 2.0 = 49.50'),
(14, '10.0 - 2.0 = 8.00'),
(15, '55.0 * 2.0 = 110.00'),
(16, '55.0 * 2.0 = 110.00'),
(17, '110.0 % 3.0 = 2.00'),
(18, '88.0 / 2.0 = 44.00'),
(19, '99.0 * 2.0 = 198.00'),
(20, '99.1 - 3.2 = 95.90'),
(21, '0.0 null 33.0 = 0.00'),
(22, '22.0 - 3.0 = 19.00'),
(23, '22.0 - 3.0 = 19.00'),
(24, '22.0 - 19.0 = 3.00'),
(25, '22.0 - 3.0 = 19.00'),
(26, '22.0 - 19.0 = 3.00'),
(27, '22.0 - 3.0 = 19.00'),
(28, '22.0 - 19.0 = 3.00'),
(29, '22.0 - 3.0 = 19.00'),
(30, '22.0 - 19.0 = 3.00'),
(31, '22.0 - 3.0 = 19.00'),
(32, '22.0 - 19.0 = 3.00'),
(33, '22.0 - 3.0 = 19.00'),
(34, '22.0 - 19.0 = 3.00'),
(35, '22.0 - 3.0 = 19.00'),
(36, '22.0 - 19.0 = 3.00'),
(37, '77.0 - 3.0 = 74.00'),
(38, '74.0 / 2.0 = 37.00'),
(39, '37.0 + 5.0 = 42.00'),
(40, '42.0 % 3.0 = 0.00'),
(41, '33.0 - 2.0 = 31.00'),
(42, '31.0 - 1.0 = 30.00'),
(43, '30.0055 - 2.0 = 28.01'),
(44, '77.0 - 3.0 = 74.00'),
(45, '77.0 + 2.0 = 79.00'),
(46, '44.0 - 3.0 = 41.00'),
(47, '99.0 - 3.0 = 96.00'),
(48, '993.0 - 3.0 = 990.00');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `data`
--
ALTER TABLE `data`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `data`
--
ALTER TABLE `data`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=49;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
