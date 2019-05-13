-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 13, 2019 at 09:38 AM
-- Server version: 10.1.36-MariaDB
-- PHP Version: 7.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `lms`
--

-- --------------------------------------------------------

--
-- Table structure for table `addbook`
--

CREATE TABLE `addbook` (
  `bookId` varchar(255) NOT NULL,
  `aname` varchar(255) DEFAULT NULL,
  `bName` varchar(255) DEFAULT NULL,
  `quantity` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `addbook`
--

INSERT INTO `addbook` (`bookId`, `aname`, `bName`, `quantity`) VALUES
('1002', 'C.Tindell', 'Engineering Mathematics', '6'),
('1003', 'Ali.RFijal', 'Foundation of Physics', '3'),
('1004', 'Dr.Waseef', 'Concepts of Electric Circuits', '5'),
('1005', 'Dr.Rohit Kumar', 'Software Engineering ', '6'),
('1006', 'Er.Rohit Kumar', 'Concepts of JAVA', '4'),
('1007', 'Dr.Vatsal Uppal', 'Object Oriented Programming', '5'),
('1008', 'Er.Rohit Kumar', 'Data Structures', '5'),
('1009', 'Dr.Bhondu Aggarwal', 'Engineering Drawing', '4'),
('1010', 'Dr.Murtaz', 'Concepts of Web ', '6'),
('1322', 'R.S. Grewal', 'CN', '10');

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `uname` varchar(255) NOT NULL,
  `pwd` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`uname`, `pwd`) VALUES
('1211981313', 'admin'),
('1311981313', 'librarian');

-- --------------------------------------------------------

--
-- Table structure for table `issue`
--

CREATE TABLE `issue` (
  `bid` varchar(255) NOT NULL,
  `branch` varchar(255) DEFAULT NULL,
  `bt` varchar(255) DEFAULT NULL,
  `Issue_Date` date DEFAULT NULL,
  `Return_Date` date DEFAULT NULL,
  `sid` varchar(255) DEFAULT NULL,
  `sname` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `issue`
--

INSERT INTO `issue` (`bid`, `branch`, `bt`, `Issue_Date`, `Return_Date`, `sid`, `sname`) VALUES
('1001', 'CSE', 'mathematics', '2019-04-11', '2019-05-01', '1611981313', 'Rohit Kumar'),
('1005', 'cse', 'Software Engineering', '2019-04-14', '2019-05-04', '1611981231', 'Mukul Chauhan'),
('1008', 'CSE', 'Data Structures', '2019-04-14', '2019-05-04', '1611981313', 'Rohit Kumar');

-- --------------------------------------------------------

--
-- Table structure for table `lib`
--

CREATE TABLE `lib` (
  `uname` varchar(20) NOT NULL,
  `pwd` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `lib`
--

INSERT INTO `lib` (`uname`, `pwd`) VALUES
('123456789', '123456789');

-- --------------------------------------------------------

--
-- Table structure for table `library`
--

CREATE TABLE `library` (
  `uname` varchar(255) NOT NULL,
  `pwd` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `library`
--

INSERT INTO `library` (`uname`, `pwd`) VALUES
('123456789', '123456789');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `sid` varchar(255) NOT NULL,
  `branch` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `sname` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`sid`, `branch`, `email`, `sname`) VALUES
('1611980995', 'ECE', 'nk@gmail.com', 'Neha Kakkar'),
('1611981231', 'CSE', 'mk@gmail.com', 'Mukul Chauhan'),
('1611981240', 'CSE', 'nb@gmail.com', 'Neeraj Bhatia'),
('1611981298', 'Mech', 'ram@gmail.com', 'ramu'),
('1611981303', 'ECE', 'rd@gmail.com', 'Rishabh Dhiman'),
('1611981313', 'CSE', 'rk7944702@gmail.com', 'Rohit Kumar'),
('1611981322', 'CSE', 'abc@gmail.com', 'Sahil Aggarwal'),
('1611981407', 'CSE', 'vuppal@gmail.com', 'Vatsal Uppal'),
('1611981470', 'CSE', 'mr@gmail.com', 'Murtaz Raina');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `uname` varchar(255) NOT NULL,
  `pwd` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `addbook`
--
ALTER TABLE `addbook`
  ADD PRIMARY KEY (`bookId`);

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`uname`);

--
-- Indexes for table `issue`
--
ALTER TABLE `issue`
  ADD PRIMARY KEY (`bid`);

--
-- Indexes for table `library`
--
ALTER TABLE `library`
  ADD PRIMARY KEY (`uname`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`sid`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`uname`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
