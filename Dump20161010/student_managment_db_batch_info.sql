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
-- Table structure for table `batch_info`
--

DROP TABLE IF EXISTS `batch_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `batch_info` (
  `batch_id` varchar(50) NOT NULL,
  `round` varchar(45) DEFAULT NULL,
  `course_code` varchar(4) DEFAULT NULL,
  `strat_month` date DEFAULT NULL,
  `end_month` date DEFAULT NULL,
  `tsp_code` varchar(4) DEFAULT NULL,
  `shift` varchar(11) DEFAULT NULL,
  `teacher_id` int(11) DEFAULT NULL,
  `status` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`batch_id`),
  KEY `course_code_bi_fk_idx` (`course_code`),
  KEY `tsp_code_bi_fk_idx` (`tsp_code`),
  KEY `teacher_id_bi_fk_idx` (`teacher_id`),
  CONSTRAINT `course_code_bi_fk` FOREIGN KEY (`course_code`) REFERENCES `course_info` (`course_code`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `teacher_id_bi_fk` FOREIGN KEY (`teacher_id`) REFERENCES `teacher_info` (`teacher_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `tsp_code_bi_fk` FOREIGN KEY (`tsp_code`) REFERENCES `tsp_info` (`tsp_code`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `batch_info`
--

LOCK TABLES `batch_info` WRITE;
/*!40000 ALTER TABLE `batch_info` DISABLE KEYS */;
INSERT INTO `batch_info` VALUES ('ESAD/C#/APCL-01A/R28/01','Round - 28','C#','2016-03-01','2017-02-01','APCL','Afternoon',1,'Active'),('ESAD/C#/APCL-01M/R28/01','Round - 28','C#','2016-03-01','2017-02-01','APCL','Morning',1,'Active'),('ESAD/J2EE/APCL-01A/R27/01','Round - 27','J2EE','2016-03-01','2017-02-01','APCL','Afternoon',1,'Complete'),('ESAD/J2EE/APCL-01M/R27/01','Round - 27','J2EE','2016-03-01','2017-02-01','APCL','Morning',1,'Complete'),('ESAD/J2EE/APCL-01M/R29/01','Round - 29','J2EE','2016-03-01','2017-02-01','APCL','Morning',1,'Active'),('ESAD/J2EE/APCL-02M/R29/01','Round - 29','J2EE','2016-03-01','2017-02-01','APCL','Morning',1,'Active'),('ESAD/WPSI/APCL-01A/R28/01','Round - 28','WPSI','2016-03-01','2017-02-01','APCL','Afternoon',1,'Active'),('ESAD/WPSI/APCL-01A/R30/01','Round - 30','WPSI','2016-03-01','2017-02-01','APCL','Afternoon',1,'Active');
/*!40000 ALTER TABLE `batch_info` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-10-10 19:35:34
