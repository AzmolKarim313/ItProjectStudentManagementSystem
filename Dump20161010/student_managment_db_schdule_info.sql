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
-- Table structure for table `schdule_info`
--

DROP TABLE IF EXISTS `schdule_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `schdule_info` (
  `sch_id` int(11) NOT NULL AUTO_INCREMENT,
  `course_code` varchar(4) DEFAULT NULL,
  `round` varchar(45) DEFAULT NULL,
  `exam_month` int(11) DEFAULT '1',
  `schdule_type` varchar(45) DEFAULT NULL,
  `sch_date` date DEFAULT NULL,
  `sch_time` date DEFAULT NULL,
  PRIMARY KEY (`sch_id`),
  KEY `course_code_schi_fk_idx` (`course_code`),
  CONSTRAINT `course_code_schi_fk` FOREIGN KEY (`course_code`) REFERENCES `course_info` (`course_code`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `schdule_info`
--

LOCK TABLES `schdule_info` WRITE;
/*!40000 ALTER TABLE `schdule_info` DISABLE KEYS */;
INSERT INTO `schdule_info` VALUES (1,'J2EE','Round - 29',11,'Feedback','2016-10-28',NULL),(2,'C#','Round - 28',0,'External Exam','2016-10-12',NULL),(3,'C#','Round - 28',0,'Feedback','2016-10-27',NULL),(4,'J2EE','Round - 27',0,'Feedback','2016-10-13',NULL),(5,'J2EE','Round - 29',11,'Feedback','2016-10-12',NULL),(6,'J2EE','Round - 27',1,'External Exam','2016-10-05',NULL),(7,'J2EE','Round - 29',11,'Evidance Exam','2016-10-22',NULL),(8,'J2EE','Round - 29',11,'External Exam','2016-10-14',NULL),(9,'J2EE','Round - 29',11,'External Exam','2016-10-12',NULL),(10,'J2EE','Round - 29',11,'External Exam','2016-10-13',NULL),(11,'J2EE','Round - 29',11,'Evidance Exam','2016-10-27',NULL),(12,'J2EE','Round - 29',11,'External Exam','2016-10-25',NULL),(13,'J2EE','Round - 29',13,'Feedback','2016-10-05',NULL);
/*!40000 ALTER TABLE `schdule_info` ENABLE KEYS */;
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
