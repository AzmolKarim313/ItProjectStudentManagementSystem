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
-- Table structure for table `consultant_info`
--

DROP TABLE IF EXISTS `consultant_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `consultant_info` (
  `cons_id` varchar(10) NOT NULL,
  `cons_name` varchar(45) DEFAULT NULL,
  `cons_pass` varchar(45) DEFAULT '1234',
  `consultIng_fram` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `contact` varchar(45) DEFAULT NULL,
  `course1` varchar(45) DEFAULT NULL,
  `course2` varchar(45) DEFAULT NULL,
  `img` blob,
  PRIMARY KEY (`cons_id`),
  KEY `course_code_ci_fk_idx` (`course1`),
  KEY `course_code2_ci_fk_idx` (`course2`),
  CONSTRAINT `course_code2_ci_fk` FOREIGN KEY (`course2`) REFERENCES `course_info` (`course_code`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `course_code_ci_fk` FOREIGN KEY (`course1`) REFERENCES `course_info` (`course_code`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `consultant_info`
--

LOCK TABLES `consultant_info` WRITE;
/*!40000 ALTER TABLE `consultant_info` DISABLE KEYS */;
INSERT INTO `consultant_info` VALUES ('c#01','Mohammad Zahidul Hossain','idbc#','ABC Consulting LTD','test@test.com','0123456789','C#',NULL,'�PNG\r\n\Z\n\0\0\0\rIHDR\0\0\0\�\0\0\0\�\0\0\0�X��\0\0\0sBIT|d�\0\0\0	pHYs\0\0\0\0\0��\0\0\n IDATx�\�\�[�]U\��/3;v:��Bi/� �Jb\�*�F\r\��TĠ\��\�6\�\'b�hH&�^�>h�pA\�B����\\J�8��\�B\�qڴC\�)>�3\�Ng欽\�Z�\�^�O�^\�\�\�o-\��\�}�em�:8\�:@�\�NN�9�\�\�\�\�F�!`�/\�O�S\��\�Y�j`�J\��p��\�\�\"Q\�\0VOR�(�j�>	tV\���V\0\��0&�����I�e��]\�/��\�v`a�)m9�\"\�\�x\�\n|(z/EJ�\Z8�]q��1\�+��*R\�u\�\�\����=�t-�\�0U�&b�E���\"h\�.�\�{�i�\r��\0��}��\�@dR\�\0�����\�?�\�(#!2����E\�\r1Bd�e�\�\�ܢmXa<D�7\�\'{\�vo��y\���䭶3���H\�ﰟ୶[���p<\�8\�z��\�^\��\�\���K�\�x���u�T\�\�xUγP����I�\�\r3���\�\�\�	 \�\�\�ϻ�Oq\0�\����S�DP\�>��s�u�\�ا\�T ~��Dp�u��@��Z�`�u��@��X�`v�\n\�\�~\�\0\����\�\�\"\�e *?;�DP\�>���:@�\�R��\�:@u\�Sp*?�Z���}C��#T{\"�\�Ԗ� �\��<w���\n\�\�\�\��\�:�\�O\'\�hևG��:���F{c���C�\�:�\�W\�\n��^�lێ\��*D{�bv\0?�т\�S\�\�f���\0��\�m\�\�c\�\�\�V`?ዶs���\�~����m\�G\Z�)u�a?����p�ŉT����eX��\"N��}1Ll\�\'D췈��g�/���\�a���c_�\�F\�H)3�\�a�1\�[�{\�D\�\�R\��+��瘝g\"�t�ÝI��[c%�eH\�	\\�!\��\0\0.B�!5\�\\�\Z؆Ql\�=��E`Q\�3�账�&�s\�â\�VY���;�^\�H�\r\����\��\0p)�]\�2���^\�\�7�n\�\��<�,#�lk�\�\�\�\�\����y(�8\�0ײ)r=\�5\�%�G�S�w\�&kU\�K�w�?]a&\�P� �?�\��\�]��gq\�@|�<\0̊�E��\�)wjv/p\��I-d8	w&\�7�m�\�r�\�\�Mg����B�m\��-��4\�L\�\�k�Gߍ�Ͱx3\�\�Ӂ����ոb	\�\�Ļ\Znվt�$[\�p\��\'t\�83\�8I��6c?�c�\�p��EJ��I�\�l�$+�a?y�j�3d��7�ڭ\Z9�a܍�\"^\�\�~\�V\�n2rR{\�~�Z����\�X7\��D�j\����i�۳\�\�U�+׹z+p�uiO}��\�\�\�\�m�\��Uڃ�\�hb����ui/��=\�{�Kۅ��w�z\�md6�U\�\�@���ê\��PS\�v\�.�f�\�6\�A\�H*�#\�\�\�n#\� \�\�\�\�3d~���d9y_�h\�m��CXʽ@B=B[g�[���\�؊[Q�6\n���9;9\�A.D\�\���:���\�\"\�\0	�\�:��\\�z�\�h\�k�\�\�\� U\�ur*�\"�\��lV��a\�\0	Zn�B�b�{��\\��m\��d\��G�}o\�n9Ԭ\�\�\�q�G��;�CT-\�y�u��e7v9ȩ\��\�:@\�r,�\�\0	�P�d�u��e�\n\�D\�Z���:@\�r,�n\�\0	\�nQ�D����\�\�\�X /[HXvc�c�[HXvc�c�<o a/X�Z��u��=i�j9\�?�$\�\�\0U\��7\�VR�\��\�\�0+\�=\�&\�\�	��\�Y \0\�[H�\�,#G�Q|)\�K�7\�\�\��\�r\�,)�2�N��\�յ�୶��|~3n�w\�\�b`=\�O�\����ϯl�\�\�%��|���\�>�z~&{=�u9Y�\�\�փ\Z�m\�Mܪ\�5��\�\�F\�_��\�Ɵ�K��.\�t\��O�0�)�_`?�[m?��_�i���\�M�ƽ\�O�Vۚ\�Rc��\�-�O#g %*�b\�7�H۫C*�)f�u�\0\�YHI��b�5\�o\"�N\�u�h\�Nϲg�lyY*�\�\�i\\O*u:$�S_�R���\�\��}\�R�\��:p�\0H\�+\�ћ\�\�A\��\�;j %*�bvZ�}��\n��\�\��C*�)\�%\�\0�@\nP��\�:@\0���DR̐u�\0���DR̐u�\0���DR\�:\�\0<m %�PX\�<`�u�\r�X�H�� \�\�$\�\�\�7�\�(DR\�Z\�\0-H9�	Hq�Ђ���P���$�\�:@j�#����\�R{>�%܊&z�\0\�A�;@�kKݍ��0H9��P\�$s���_�p��\�\�.`V���9\�A\�!\�^d=�!\�vo�D\�n\�@\��i�m>�3\�vcd͂\n��?��\��b\�c��oS\�\�\�	�[a)\�\rP!���h�i�$\�D\�]c\��h�OP�\�$A� \�d�\�m\�h��\�c��\�\��d^q\��.��\�\"�U���\�\�a\�_/���ge��\�\�W�R.�\�\�QfB��d{_/��1\�\��i\�*�O\�A&�\�L���z�vE���r5\�[\�g2�gL���4>㳭�8$\�\�͝nB\�\��\�\�Gp�RM�������@$�Y�C�\�9|2\�~�X`[\'\0�\�Ƚɣ�\�\���\�S\�\�ހ;\Z��*�3q�Ձ[\�QQ�����������������������\�\��\�b�oW�U\0\0\0\0IEND�B`�'),('j2ee01','Mohammad Mosadul Islam','idbjava','Show & Tell Consulting LTD','testjava@test.com','0147852369','J2EE','WPSI','�PNG\r\n\Z\n\0\0\0\rIHDR\0\0\0\�\0\0\0\�\0\0\0�X��\0\0\0sBIT|d�\0\0\0	pHYs\0\0\0\0\0��\0\0\n IDATx�\�\�[�]U\��/3;v:��Bi/� �Jb\�*�F\r\��TĠ\��\�6\�\'b�hH&�^�>h�pA\�B����\\J�8��\�B\�qڴC\�)>�3\�Ng欽\�Z�\�^�O�^\�\�\�o-\��\�}�em�:8\�:@�\�NN�9�\�\�\�\�F�!`�/\�O�S\��\�Y�j`�J\��p��\�\�\"Q\�\0VOR�(�j�>	tV\���V\0\��0&�����I�e��]\�/��\�v`a�)m9�\"\�\�x\�\n|(z/EJ�\Z8�]q��1\�+��*R\�u\�\�\����=�t-�\�0U�&b�E���\"h\�.�\�{�i�\r��\0��}��\�@dR\�\0�����\�?�\�(#!2����E\�\r1Bd�e�\�\�ܢmXa<D�7\�\'{\�vo��y\���䭶3���H\�ﰟ୶[���p<\�8\�z��\�^\��\�\���K�\�x���u�T\�\�xUγP����I�\�\r3���\�\�\�	 \�\�\�ϻ�Oq\0�\����S�DP\�>��s�u�\�ا\�T ~��Dp�u��@��Z�`�u��@��X�`v�\n\�\�~\�\0\����\�\�\"\�e *?;�DP\�>���:@�\�R��\�:@u\�Sp*?�Z���}C��#T{\"�\�Ԗ� �\��<w���\n\�\�\�\��\�:�\�O\'\�hևG��:���F{c���C�\�:�\�W\�\n��^�lێ\��*D{�bv\0?�т\�S\�\�f���\0��\�m\�\�c\�\�\�V`?ዶs���\�~����m\�G\Z�)u�a?����p�ŉT����eX��\"N��}1Ll\�\'D췈��g�/���\�a���c_�\�F\�H)3�\�a�1\�[�{\�D\�\�R\��+��瘝g\"�t�ÝI��[c%�eH\�	\\�!\��\0\0.B�!5\�\\�\Z؆Ql\�=��E`Q\�3�账�&�s\�â\�VY���;�^\�H�\r\����\��\0p)�]\�2���^\�\�7�n\�\��<�,#�lk�\�\�\�\�\����y(�8\�0ײ)r=\�5\�%�G�S�w\�&kU\�K�w�?]a&\�P� �?�\��\�]��gq\�@|�<\0̊�E��\�)wjv/p\��I-d8	w&\�7�m�\�r�\�\�Mg����B�m\��-��4\�L\�\�k�Gߍ�Ͱx3\�\�Ӂ����ոb	\�\�Ļ\Znվt�$[\�p\��\'t\�83\�8I��6c?�c�\�p��EJ��I�\�l�$+�a?y�j�3d��7�ڭ\Z9�a܍�\"^\�\�~\�V\�n2rR{\�~�Z����\�X7\��D�j\����i�۳\�\�U�+׹z+p�uiO}��\�\�\�\�m�\��Uڃ�\�hb����ui/��=\�{�Kۅ��w�z\�md6�U\�\�@���ê\��PS\�v\�.�f�\�6\�A\�H*�#\�\�\�n#\� \�\�\�\�3d~���d9y_�h\�m��CXʽ@B=B[g�[���\�؊[Q�6\n���9;9\�A.D\�\���:���\�\"\�\0	�\�:��\\�z�\�h\�k�\�\�\� U\�ur*�\"�\��lV��a\�\0	Zn�B�b�{��\\��m\��d\��G�}o\�n9Ԭ\�\�\�q�G��;�CT-\�y�u��e7v9ȩ\��\�:@\�r,�\�\0	�P�d�u��e�\n\�D\�Z���:@\�r,�n\�\0	\�nQ�D����\�\�\�X /[HXvc�c�[HXvc�c�<o a/X�Z��u��=i�j9\�?�$\�\�\0U\��7\�VR�\��\�\�0+\�=\�&\�\�	��\�Y \0\�[H�\�,#G�Q|)\�K�7\�\�\��\�r\�,)�2�N��\�յ�୶��|~3n�w\�\�b`=\�O�\����ϯl�\�\�%��|���\�>�z~&{=�u9Y�\�\�փ\Z�m\�Mܪ\�5��\�\�F\�_��\�Ɵ�K��.\�t\��O�0�)�_`?�[m?��_�i���\�M�ƽ\�O�Vۚ\�Rc��\�-�O#g %*�b\�7�H۫C*�)f�u�\0\�YHI��b�5\�o\"�N\�u�h\�Nϲg�lyY*�\�\�i\\O*u:$�S_�R���\�\��}\�R�\��:p�\0H\�+\�ћ\�\�A\��\�;j %*�bvZ�}��\n��\�\��C*�)\�%\�\0�@\nP��\�:@\0���DR̐u�\0���DR̐u�\0���DR\�:\�\0<m %�PX\�<`�u�\r�X�H�� \�\�$\�\�\�7�\�(DR\�Z\�\0-H9�	Hq�Ђ���P���$�\�:@j�#����\�R{>�%܊&z�\0\�A�;@�kKݍ��0H9��P\�$s���_�p��\�\�.`V���9\�A\�!\�^d=�!\�vo�D\�n\�@\��i�m>�3\�vcd͂\n��?��\��b\�c��oS\�\�\�	�[a)\�\rP!���h�i�$\�D\�]c\��h�OP�\�$A� \�d�\�m\�h��\�c��\�\��d^q\��.��\�\"�U���\�\�a\�_/���ge��\�\�W�R.�\�\�QfB��d{_/��1\�\��i\�*�O\�A&�\�L���z�vE���r5\�[\�g2�gL���4>㳭�8$\�\�͝nB\�\��\�\�Gp�RM�������@$�Y�C�\�9|2\�~�X`[\'\0�\�Ƚɣ�\�\���\�S\�\�ހ;\Z��*�3q�Ձ[\�QQ�����������������������\�\��\�b�oW�U\0\0\0\0IEND�B`�');
/*!40000 ALTER TABLE `consultant_info` ENABLE KEYS */;
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
