-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 30, 2018 at 09:15 AM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 7.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `voting_system`
--
CREATE DATABASE IF NOT EXISTS `voting_system` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `voting_system`;

DELIMITER $$
--
-- Procedures
--
DROP PROCEDURE IF EXISTS `votes_tot`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `votes_tot` ()  begin 
TRUNCATE votestot;
insert into votestot (can_id, total_votes)
 select can_id,count(v_id) as total_votes from votes group by can_id order by total_votes desc;
END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `announce`
--

DROP TABLE IF EXISTS `announce`;
CREATE TABLE `announce` (
  `aid` varchar(5) NOT NULL,
  `anno` varchar(500) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `announce`
--

INSERT INTO `announce` (`aid`, `anno`) VALUES
('1', 'Voting strats from jan 2019'),
('qwe23', 'statue opening at mysore on jan 2019');

-- --------------------------------------------------------

--
-- Table structure for table `candidate`
--

DROP TABLE IF EXISTS `candidate`;
CREATE TABLE `candidate` (
  `can_id` varchar(5) NOT NULL,
  `party_id` varchar(5) NOT NULL,
  `cname` varchar(30) DEFAULT NULL,
  `cage` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `candidate`
--

INSERT INTO `candidate` (`can_id`, `party_id`, `cname`, `cage`) VALUES
('aaa11', 'abc11', 'ritwick', 39),
('bbb11', 'cba12', 'rohan', 36),
('bcw12', 'aaa11', 'sharath', 29),
('cba13', 'abc11', 'prashant', 26);

--
-- Triggers `candidate`
--
DROP TRIGGER IF EXISTS `age_trig`;
DELIMITER $$
CREATE TRIGGER `age_trig` BEFORE INSERT ON `candidate` FOR EACH ROW BEGIN
    IF (NEW.cage <25) THEN 
        SIGNAL SQLSTATE '02000' SET MESSAGE_TEXT = 'AGE < 25!';
   END IF;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `manifesto`
--

DROP TABLE IF EXISTS `manifesto`;
CREATE TABLE `manifesto` (
  `mid` varchar(5) NOT NULL,
  `manifesto` varchar(500) DEFAULT NULL,
  `party_id` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `manifesto`
--

INSERT INTO `manifesto` (`mid`, `manifesto`, `party_id`) VALUES
('1', 'drinking water for all', 'abc11'),
('ttt12', 'MANIFESTO', 'abc11');

-- --------------------------------------------------------

--
-- Table structure for table `party`
--

DROP TABLE IF EXISTS `party`;
CREATE TABLE `party` (
  `party_id` varchar(5) NOT NULL,
  `pname` varchar(20) DEFAULT NULL,
  `ploc` varchar(20) DEFAULT NULL,
  `nom` mediumint(9) DEFAULT NULL,
  `plead` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `party`
--

INSERT INTO `party` (`party_id`, `pname`, `ploc`, `nom`, `plead`) VALUES
('abc11', 'rits', 'bangalore', 20, 'ritwick'),
('cba11', 'rohs', 'mysore', 32, 'rohan'),
('ppp12', 'zords', 'bangalore', 34, 'prashant');

-- --------------------------------------------------------

--
-- Table structure for table `polstat`
--

DROP TABLE IF EXISTS `polstat`;
CREATE TABLE `polstat` (
  `pstid` varchar(5) NOT NULL,
  `psname` varchar(100) DEFAULT NULL,
  `psloc` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `polstat`
--

INSERT INTO `polstat` (`pstid`, `psname`, `psloc`) VALUES
('qwe11', 'ser', 'bangalore');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `username` varchar(20) NOT NULL,
  `pass` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`username`, `pass`) VALUES
('ars', 'ars'),
('ase', 'ase'),
('pra', 'pra'),
('rit', 'rit'),
('sra', 'sra');

-- --------------------------------------------------------

--
-- Table structure for table `voter`
--

DROP TABLE IF EXISTS `voter`;
CREATE TABLE `voter` (
  `v_id` varchar(5) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `vage` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `voter`
--

INSERT INTO `voter` (`v_id`, `name`, `address`, `vage`) VALUES
('asd12', 'aseef', 'bangalore', 20),
('qwe11', 'arshad', 'bangalore', 23);

--
-- Triggers `voter`
--
DROP TRIGGER IF EXISTS `age_trig1`;
DELIMITER $$
CREATE TRIGGER `age_trig1` BEFORE INSERT ON `voter` FOR EACH ROW BEGIN
    IF (NEW.vage <18) THEN 
        SIGNAL SQLSTATE '02000' SET MESSAGE_TEXT = 'AGE < 18!';
   END IF;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `votes`
--

DROP TABLE IF EXISTS `votes`;
CREATE TABLE `votes` (
  `v_id` varchar(5) NOT NULL,
  `can_id` varchar(5) NOT NULL,
  `party_id` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `votes`
--

INSERT INTO `votes` (`v_id`, `can_id`, `party_id`) VALUES
('qwe11', 'aaa11', 'abc11'),
('qwe11', 'cba13', 'abc11');

-- --------------------------------------------------------

--
-- Table structure for table `votestot`
--

DROP TABLE IF EXISTS `votestot`;
CREATE TABLE `votestot` (
  `can_id` varchar(5) DEFAULT NULL,
  `total_votes` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `votestot`
--

INSERT INTO `votestot` (`can_id`, `total_votes`) VALUES
('aaa11', 1),
('cba13', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `announce`
--
ALTER TABLE `announce`
  ADD PRIMARY KEY (`aid`);

--
-- Indexes for table `candidate`
--
ALTER TABLE `candidate`
  ADD PRIMARY KEY (`can_id`,`party_id`);

--
-- Indexes for table `manifesto`
--
ALTER TABLE `manifesto`
  ADD PRIMARY KEY (`mid`,`party_id`);

--
-- Indexes for table `party`
--
ALTER TABLE `party`
  ADD PRIMARY KEY (`party_id`);

--
-- Indexes for table `polstat`
--
ALTER TABLE `polstat`
  ADD PRIMARY KEY (`pstid`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `voter`
--
ALTER TABLE `voter`
  ADD PRIMARY KEY (`v_id`);

--
-- Indexes for table `votes`
--
ALTER TABLE `votes`
  ADD PRIMARY KEY (`v_id`,`party_id`,`can_id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
