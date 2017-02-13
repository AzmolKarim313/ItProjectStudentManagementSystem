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
-- Table structure for table `syllabus_info`
--

DROP TABLE IF EXISTS `syllabus_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `syllabus_info` (
  `syll_id` int(11) NOT NULL AUTO_INCREMENT,
  `course_code` varchar(4) DEFAULT NULL,
  `idx_month` int(11) DEFAULT NULL,
  `topics_name` varchar(100) DEFAULT NULL,
  `hour` int(11) DEFAULT NULL,
  PRIMARY KEY (`syll_id`),
  KEY `course_code_syl_fk_idx` (`course_code`),
  CONSTRAINT `course_code_syl_fk` FOREIGN KEY (`course_code`) REFERENCES `course_info` (`course_code`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `syllabus_info`
--

LOCK TABLES `syllabus_info` WRITE;
/*!40000 ALTER TABLE `syllabus_info` DISABLE KEYS */;
INSERT INTO `syllabus_info` VALUES (1,'J2EE',1,'Web Publishing',68),(2,'J2EE',2,'Web Publishing',64),(3,'J2EE',3,'Database Development using Oracle 10g',120),(4,'J2EE',4,'Object Oriented Programming using JAVA',120),(5,'J2EE',5,'Software Development using JAVA and XML',80),(6,'J2EE',6,'O-O System Analysis and Design using UML',60),(7,'J2EE',7,'Server Side Programming using Servlets , JSP, JSTL',86),(8,'J2EE',8,'Hibernate, Primeface, Angular JS',86),(9,'J2EE',9,'Struts2.0, Spring',52),(10,'J2EE',10,'Struts2.0, Spring',52),(11,'J2EE',11,'Jasper Report , Project & Oracle Certified Java Programmer',80),(12,'J2EE',12,'Mobile Application using Android',72),(14,'J2EE',13,'sad',12);
/*!40000 ALTER TABLE `syllabus_info` ENABLE KEYS */;
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
