/*
SQLyog Enterprise - MySQL GUI v6.13
MySQL - 5.1.52-community : Database - cseb
*********************************************************************
*/
/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

create database if not exists `cseb`;

USE `cseb`;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

/*Table structure for table `bills` */

DROP TABLE IF EXISTS `bills`;

CREATE TABLE `bills` (
  `billid` varchar(50) NOT NULL,
  `customerid` varchar(50) DEFAULT NULL,
  `datefrom` date DEFAULT NULL,
  `dateto` date DEFAULT NULL,
  `units` int(11) DEFAULT NULL,
  `maxunit` int(11) DEFAULT NULL,
  `minunit` int(11) DEFAULT NULL,
  `maxcharge` decimal(15,2) DEFAULT NULL,
  `mincharge` decimal(15,2) DEFAULT NULL,
  `status` int(11) DEFAULT '0',
  `total` decimal(15,2),
  PRIMARY KEY (`billid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Trigger structure for table `bills` */

DELIMITER $$

/*!50003 DROP TRIGGER*//*!50032 IF EXISTS */ /*!50003 `billentry_delete` */$$

/*!50003 CREATE TRIGGER `billentry_delete` BEFORE UPDATE ON `bills` FOR EACH ROW BEGIN
insert into bills_pays values(billid,customerid,datefrom,dateto,units,maxunit,minunit,maxcharge,mincharge,status,CURRENT_DATE);
END */$$


DELIMITER ;

/*Table structure for table `bills_olddata` */

DROP TABLE IF EXISTS `bills_olddata`;

CREATE TABLE `bills_olddata` (
  `billid` varchar(50) DEFAULT NULL,
  `customerid` varchar(50) DEFAULT NULL,
  `datefrom` date DEFAULT NULL,
  `dateto` date DEFAULT NULL,
  `units` int(11) DEFAULT NULL,
  `maxunit` int(11) DEFAULT NULL,
  `minunit` int(11) DEFAULT NULL,
  `maxcharge` decimal(15,2) DEFAULT NULL,
  `mincharge` decimal(15,2) DEFAULT NULL,
  `status` int(11) DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Table structure for table `bills_pays` */

DROP TABLE IF EXISTS `bills_pays`;

CREATE TABLE `bills_pays` (
  `billid` varchar(50) NOT NULL,
  `customerid` varchar(50) DEFAULT NULL,
  `datefrom` date DEFAULT NULL,
  `dateto` date DEFAULT NULL,
  `paydate` date DEFAULT NULL,
  `billamt` decimal(15,2) DEFAULT '0.00'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Table structure for table `connectionrates` */

DROP TABLE IF EXISTS `connectionrates`;

CREATE TABLE `connectionrates` (
  `connectionid` varchar(50) NOT NULL,
  `connectiontype` varchar(50) DEFAULT NULL,
  `unitrate` decimal(15,2) DEFAULT '0.00',
  `maxunit` int(11) DEFAULT '0',
  `maxunitrate` decimal(15,2) DEFAULT '0.00',
  PRIMARY KEY (`connectionid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Table structure for table `customermaster` */

DROP TABLE IF EXISTS `customermaster`;

CREATE TABLE `customermaster` (
  `customerid` varchar(50) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `fname` varchar(50) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `address1` varchar(200) DEFAULT NULL,
  `city1` varchar(50) DEFAULT NULL,
  `district1` varchar(50) DEFAULT NULL,
  `state1` varchar(50) DEFAULT NULL,
  `address2` varchar(50) DEFAULT NULL,
  `city2` varchar(50) DEFAULT NULL,
  `district2` varchar(50) DEFAULT NULL,
  `contectno` varchar(50) DEFAULT NULL,
  `connectiontype` varchar(50) DEFAULT NULL,
  `usertype` varchar(50) DEFAULT NULL,
  `regdate` date DEFAULT NULL,
  `status` int(11) DEFAULT '1',
  PRIMARY KEY (`customerid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Trigger structure for table `customermaster` */

DELIMITER $$

/*!50003 DROP TRIGGER*//*!50032 IF EXISTS */ /*!50003 `updateentry` */$$

/*!50003 CREATE TRIGGER `updateentry` BEFORE UPDATE ON `customermaster` FOR EACH ROW BEGIN
insert into customermaster_olddata values(old.customerid,old.name,old.fname,old.dob,old.gender,old.address1,old.city1,old.district1,old.state1,old.address2,old.city2,old.district2,old.contectno,old.connectiontype,old.usertype,old.regdate,old.status,CURRENT_DATE);
END */$$


DELIMITER ;

/*Table structure for table `customermaster_delete` */

DROP TABLE IF EXISTS `customermaster_delete`;

CREATE TABLE `customermaster_delete` (
  `customerid` varchar(50) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `fname` varchar(50) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `address1` varchar(200) DEFAULT NULL,
  `city1` varchar(50) DEFAULT NULL,
  `district1` varchar(50) DEFAULT NULL,
  `state1` varchar(50) DEFAULT NULL,
  `address2` varchar(50) DEFAULT NULL,
  `city2` varchar(50) DEFAULT NULL,
  `district2` varchar(50) DEFAULT NULL,
  `contectno` varchar(50) DEFAULT NULL,
  `connectiontype` varchar(50) DEFAULT NULL,
  `usertype` varchar(50) DEFAULT NULL,
  `regdate` date DEFAULT NULL,
  `status` int(11) DEFAULT '1',
  `deletedate` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Table structure for table `customermaster_olddata` */

DROP TABLE IF EXISTS `customermaster_olddata`;

CREATE TABLE `customermaster_olddata` (
  `customerid` varchar(50) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `fname` varchar(50) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `address1` varchar(200) DEFAULT NULL,
  `city1` varchar(50) DEFAULT NULL,
  `district1` varchar(50) DEFAULT NULL,
  `state1` varchar(50) DEFAULT NULL,
  `address2` varchar(50) DEFAULT NULL,
  `city2` varchar(50) DEFAULT NULL,
  `district2` varchar(50) DEFAULT NULL,
  `contectno` varchar(50) DEFAULT NULL,
  `connectiontype` varchar(50) DEFAULT NULL,
  `usertype` varchar(50) DEFAULT NULL,
  `regdate` date DEFAULT NULL,
  `status` int(11) DEFAULT '1',
  `updatedate` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Table structure for table `userlogin` */

DROP TABLE IF EXISTS `userlogin`;

CREATE TABLE `userlogin` (
  `uname` varchar(50) NOT NULL,
  `password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`uname`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
