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
-- Table structure for table `student_issue_info`
--

DROP TABLE IF EXISTS `student_issue_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student_issue_info` (
  `stu_issue_id` int(11) NOT NULL AUTO_INCREMENT,
  `batch_id` varchar(45) DEFAULT NULL,
  `student_id` int(11) DEFAULT NULL,
  `purpose` varchar(45) DEFAULT NULL,
  `issue_date` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`stu_issue_id`),
  KEY `batch_id_sii_fk_idx` (`batch_id`),
  KEY `student_id_sii_fk_idx` (`student_id`),
  CONSTRAINT `batch_id_sii_fk` FOREIGN KEY (`batch_id`) REFERENCES `batch_info` (`batch_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `student_id_sii_fk` FOREIGN KEY (`student_id`) REFERENCES `student_table` (`student_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student_issue_info`
--

LOCK TABLES `student_issue_info` WRITE;
/*!40000 ALTER TABLE `student_issue_info` DISABLE KEYS */;
INSERT INTO `student_issue_info` VALUES (1,'ESAD/J2EE/APCL-01M/R29/01',1205892,'Masters Exam','2016-10-12'),(2,'ESAD/J2EE/APCL-01M/R29/01',1205892,'Masters Exam','2016-10-12'),(3,'ESAD/J2EE/APCL-01M/R29/01',1206268,'Leave','2016-10-20');
/*!40000 ALTER TABLE `student_issue_info` ENABLE KEYS */;
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
