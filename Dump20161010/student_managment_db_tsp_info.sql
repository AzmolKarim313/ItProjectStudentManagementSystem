-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: student_managment_db
-- ------------------------------------------------------
-- Server version	5.7.15-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tsp_info`
--

DROP TABLE IF EXISTS `tsp_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tsp_info` (
  `tsp_code` varchar(4) NOT NULL,
  `tsp_name` varchar(45) DEFAULT NULL,
  `location` varchar(45) DEFAULT NULL,
  `no_lab` int(11) DEFAULT NULL,
  `stu_capacity` int(11) DEFAULT NULL,
  `no_teacher` varchar(45) DEFAULT NULL,
  `course1` varchar(45) DEFAULT NULL,
  `course2` varchar(45) DEFAULT NULL,
  `course3` varchar(45) DEFAULT NULL,
  `course4` varchar(45) DEFAULT NULL,
  `course5` varchar(45) DEFAULT NULL,
  `course6` varchar(45) DEFAULT NULL,
  `course7` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`tsp_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tsp_info`
--

LOCK TABLES `tsp_info` WRITE;
/*!40000 ALTER TABLE `tsp_info` DISABLE KEYS */;
INSERT INTO `tsp_info` VALUES ('APCL','Asia Pacific Communication Ltd','Dhanmondi',3,90,'2','WPSI','J2EE',NULL,NULL,NULL,NULL,NULL),('BITI','Bangladesh IT Institute','Mirpur',2,60,'2','WPSI',NULL,NULL,NULL,NULL,NULL,NULL),('SCSL','Star Computer Systems Limited','Green Road',1,30,'1','ACAD',NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `tsp_info` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-10-10 19:35:35
