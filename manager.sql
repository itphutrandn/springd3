-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 30, 2021 at 08:55 PM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.2.34

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `manager`
--

-- --------------------------------------------------------

--
-- Table structure for table `football`
--

CREATE TABLE `football` (
  `id` int(11) NOT NULL,
  `name` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `createdDate` date NOT NULL DEFAULT current_timestamp(),
  `picture` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
  `description` text COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `football`
--

INSERT INTO `football` (`id`, `name`, `createdDate`, `picture`, `description`) VALUES
(1, 'Thái Lan', '2021-03-09', '', 'Đội tuyển bóng đá quốc gia Thái Lan là đội tuyển bóng đá đại diện cho Thái Lan do Hiệp hội bóng đá Thái Lan quản lý. Thái Lan đã có 7 lần tham dự Cúp bóng đá châu Á và thành tích tốt nhất của đội là đạt hạng ba ở vòng chung kết năm 1972, kỳ đầu tiên Thái Lan là chủ nhà đăng cai'),
(2, 'Việt Nam', '2021-03-02', '', 'Đội tuyển bóng đá quốc gia Việt Nam là đội tuyển bóng đá nam quốc gia đại diện cho Việt Nam tham dự các giải đấu môn thể thao bóng đá nam quốc tế và được Liên đoàn bóng đá Việt Nam quản lý.'),
(3, 'Lào', '2021-03-03', '', 'Đội tuyển bóng đá quốc gia Lào là đội tuyển cấp quốc gia của Lào do Liên đoàn bóng đá Lào quản lý. Đội đã tham dự 11 kỳ AFF Cup, tuy nhiên đều không vượt qua được vòng bảng sức không mạnh so với Việt Nam Thái lan và các đội tuyển Đông Nam á khác trừ Đông Timor và các đội tuyển Châu á khác.'),
(4, 'Chelsea', '2021-03-23', '', 'Chelsea ChelseaChelseaChelseaChelseaChelseaChelseaChelseaChelseaChelseaChelseaChelseaChelseaChelseaChelseaChelseaChelsea'),
(8, 'download-1441680444440500.jfif', '2021-03-31', '', 'sdsdsdsd'),
(9, 'Tiáº¿ng Viá»t', '2021-03-31', '', 'sdsd'),
(10, 'Thai Lan', '2021-03-31', 'images-1442271029514800.png', 'sdsd');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `football`
--
ALTER TABLE `football`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `football`
--
ALTER TABLE `football`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
