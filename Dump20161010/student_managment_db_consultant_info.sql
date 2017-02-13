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
INSERT INTO `consultant_info` VALUES ('c#01','Mohammad Zahidul Hossain','idbc#','ABC Consulting LTD','test@test.com','0123456789','C#',NULL,'‰PNG\r\n\Z\n\0\0\0\rIHDR\0\0\0\È\0\0\0\È\0\0\0­X®ž\0\0\0sBIT|dˆ\0\0\0	pHYs\0\0\0\0\0šœ\0\0\n IDATxœ\í\Ý[Œ]U\Çñ/3;v:¥Bi/£ —Jb\Ð*‹F\r\Ø‰TÄ \ÔŠ\Å6\Ñ\'bŒhH&¤^ƒ>hÀpA\ÑBˆŠ¹¨\\J§8¥…\ÖB\ÛqÚ´C\Û)>¬3\ÐNgæ¬½\ÏZû\Ö^¿O²^\Ú\Ã\îo-\Öÿ\ì}öem‘:8\Ê:@¦\ïNN€9À\ì\Æ\ß\ïF€!`ð/\àOÀS\ç©\ÌYÀj`ðJ\Éöp°´\â\ì\"Q\Ì\0VOR¾(¦jÿ>	tV\Ö‘€V\0\Ï¾0&¶õÀùõI¤eýÀ]\Ä/Œ‰\ív`aý)m9ð\"\Õ\Çx\Û\n|(z/EJ¸\Z8ˆ]qŒ·1\à+‘û*R\Èu\Ø\Æ\Äö¨=ñt-ö\Å0U»&b¿Ešºû\"h\Ö.\Ö{‘iœ\rÀ¾\0šµ}À‘\Æ@dR\Ç\0›±Ÿü¾\í?À\Ü(#!2‰±ŸôE\Û\r1Bd¢e´\Ç\éÜ¢mXa<Dó7\ì\'{\Ùvo„ñy\Õ±Ÿä­¶3ƒŠH\Ãï°Ÿà­¶[‚Šp<\î8\Þz‚·\Ú^\æ›\Ú\ê°K¨\Çx½ø¸uˆT\Ô\áxUÎ³Pú•žI÷\Ó\r3­ƒ²\è\Ã\Ý	 \Ó\Ð\ÄÏ»©Oq\0ô\ï°‘ˆŸS­DP\Ç>§ñs²u€\êØ§\àT ~ú­Dp¼u€¨@üôZˆ`Žu€¨@üôXˆ`vóˆ\n\Ä\Ï~\ë\0\ì³ˆŸ\Ý\Ö\"\Øe *?;­DP\Ç>§ñ³Á:@ƒ\ÖR ñ³\Î:@u\ìSp*?Zˆ Ž}C±–#T{\"ð\ØÔ–ö þ\êô<wú•\n\Ä\ß\Í\Öº\É:€\ÔO\'\îhÖ‡G­¶:ž‘‹F{cÀ¬C°\Ú:€\ÔW\î\n´õ^ lÛŽ\îÁ*D{bv\0?°Ñ‚\ïS\Ï\Ûf¤ô\0›°\ßm\ë©\×c\Ã\Ò\ÆV`?á‹¶s£Œ„\È~Œý¤÷m\×G\Z‘)ua?ù›µ‡p‹Å‰T®Ÿö¾eX­÷\"Nþ‹}1Ll\Ï\'Dì·ˆ·g±/Šñ¶ˆ\Ùa‘¢÷c_÷\ÇF\î«H)3€\ïaóŠ¶1\à[¸{\ÆD\Ú\ÚR\àª+Ž¿ïª¤g\"tŸÃIŠù[c%ºeH\Ö	\\¬!\Ìª\0\0.B…!5\Ó\\ü\ZØ†Ql\Ã=°õE`Q\å©3¦è´¦ø&ðs\ÜÃ¢\àVYÀ­•;¾^\îH£\r\á£¶•\Øö\0p)ð]\ê¹2¤´¹^\à\Ü7ün\Ï\Ð‡<¸,#¸lk¨\ç\â\Û\Ò\Æú€µy(´8\Û0×²)r=\Ì5\Ì%™GóS¸w\ã&kU\ÞKów¸?]a&\ÉPð þ?®\×—\ç]½Àgq\×@|ó<\0ÌŠE„À\ï)wjv/p\î·ÁI-d8	w&\ë7m–\Érº\Ú\îMg±üýøB m\íÀ-ýù4\îL\Õ\Ük¦GßûÍ°x3\îŽ\áÓùþýÕ¸b	\â\ËÄ»\ZnÕ¾t„$[\Ëp\×¬\'t\è¶83\à8I†Ž6c?™cµ\çp§¬EJ¹ûI»\Ýl´$+—a?y«jŸ3d’‹7ñÚ­\Z9´aÜ”\"^\î\Ä~\ÒV\Ýn2rR{\Ã~²ZµóŒŸ\ÔX7\îÂõDµj\Ðú½‡i‡Û³\Û\ÉU¸+×¹z+p¥uiO}¸«\Ö\ß\â\Ömº\ë÷UÚƒ¼\æhb€»•ui/‹€=\Ø{·KÛ…Ÿ´wðz\ëmd6ðU\ë\í@·»»Ãª\çˆóPS\Êv\â.˜fý\Ê6\íA\ÜH*Ž#\Í\Ã\Ýn#\ë \ï\ë\Í\Ú3d~”‘ûd9y_÷h\æmÀ¬CXÊ½@B=B[g—[°”ó\î³ØŠ[Q¦6\n‡»»9;9\ïA.D\Å\á£¸À:„•œ\ä\"\ë\0	¹\Ø:€•\\±z\íh\âk·\ä\Ð\ë U\Ëur*Ž\"º\ÉôlV®òa\ë\0	ZnÀB®b¹{ªª\\Œ»m\äød\î÷GŽ}o\Ån9Ô¬\î\Í\Êq²GÀ;­CT-\Çy»u€„e7v9È©\Ö¶\Ø:@\Õr,\ë\0	°Pµd¡u€„e÷\n\êD\ÏZ—·À:@\Õr,n\ë\0	\ËnQ¹D·˜”—\Ý\Ø\åX /[HXvc—c[HXvc—c<o a/X¨ZŽò”u€„=i j9\È?¬$\ì\ë\0U\Ëñ¦½7\âVR”\âú\É\ì0+\Ç=\È&\à\ë	ú™\äY \0\×[H\Æ,#G÷Q|)\ÎKü7\í\Ö\Êô\ážr\Ã,)À2øN’Ÿ\àÕµžà­¶³€|~3n•w\É\Ðb`=\ÓO\íÀ¥Ï¯lò\Ù\Ú%¾|÷Šƒ\é>ûz~&{=Àu9Y¶\×\âÖƒ\Z÷m\âMÜª\Ú5‡ô\ç\ØF\ß_œð™\áÆŸ÷K©±.\àt\ÜúO§0ù)ð_`?Á[m?›¤_Ài¸õÂ–\áM‰Æ½\ØOðVÛš\à£Rc¹ž\æ-«O#g %*b\æ7ÿHÛ«C*£)f®u€\0\æYHIŽ÷b•5\Øo\"N\à uˆh\â¯NÏ²g÷lyY*\Ö\Òi\\O*u:$©S_¢Rø«\Ë\ï€}\ÖR¡\éþ:p¯\0H\Ý+\è‹Ñ›\Ê\ßA\êñ\Í;j %*bvZ }¨Œ\n¤˜\í\Ö¨C*£)\æ%\ë\0¨@\nP³\Ù:@\0›¬¤DRÌu€\0†¬¤DRÌu€\0†¬¤DR\Ì:\ë\0<m %ºPX\Ì<`‡uˆ\rŒX‡H…ö \Å\ì$\í\Õ\á7¢\â(DR\ÜZ\ë\0-H9»	HqµÐ‚”³›P—ò$»\ß:@jô#½¸¸…\ÖR{>ý%ÜŠ&z¤\0\íAŠ;@škKÝŠ£0H9¿µPÂ\Ö$s€½„_õp£…\Þ\î.`V”‘¨9\íA\Ê!\Î^d=°!\ÂvoöD\Øn\í©@\Êûi„m>ü3\ÂvcdÍ‚\n¤¼?þ•\Òþb\ÞcÀŸoS\Ä\Ë\ç	û[a)\î\rP!·ù©h½i¢$\ÌD\Æ]c\éþh›OP¯\ï$AŸ \Ìd¾\ém\Þh›\Òc‘‚\Ö\Ðúd^q\Èö.°½\Û\"õU¤°·\Ð\Úa\Ñ_/·«ñge··\è\ÔW‘R.À\Ý\ÊQfB¯šd{_/¹­1\à\Üýi\Ù*ŠO\èA&µ\ÂLš¿¢z²vE”ž‰r5\î[\Üg2gL³­÷4>ã³­¨8$\ç\àÍnB\ï\Îó\Ø\ÖGp÷RM·­Àû‚ö@$²Y¸C®\Ç9|2\ï~œX`[\'\0¿\äÈ½É£À\×\Ð£¢\ÑS\Õ\èÞ€;\Z¤ü*ñ3q…Õ[\åQQ‹ˆˆˆˆˆˆˆˆˆˆˆˆˆˆˆˆˆˆˆˆˆˆ\ä\çÿ\Øb”oWÀU\0\0\0\0IEND®B`‚'),('j2ee01','Mohammad Mosadul Islam','idbjava','Show & Tell Consulting LTD','testjava@test.com','0147852369','J2EE','WPSI','‰PNG\r\n\Z\n\0\0\0\rIHDR\0\0\0\È\0\0\0\È\0\0\0­X®ž\0\0\0sBIT|dˆ\0\0\0	pHYs\0\0\0\0\0šœ\0\0\n IDATxœ\í\Ý[Œ]U\Çñ/3;v:¥Bi/£ —Jb\Ð*‹F\r\Ø‰TÄ \ÔŠ\Å6\Ñ\'bŒhH&¤^ƒ>hÀpA\ÑBˆŠ¹¨\\J§8¥…\ÖB\ÛqÚ´C\Û)>¬3\ÐNgæ¬½\ÏZû\Ö^¿O²^\Ú\Ã\îo-\Öÿ\ì}öem‘:8\Ê:@¦\ïNN€9À\ì\Æ\ß\ïF€!`ð/\àOÀS\ç©\ÌYÀj`ðJ\Éöp°´\â\ì\"Q\Ì\0VOR¾(¦jÿ>	tV\Ö‘€V\0\Ï¾0&¶õÀùõI¤eýÀ]\Ä/Œ‰\ív`aý)m9ð\"\Õ\Çx\Û\n|(z/EJ¸\Z8ˆ]qŒ·1\à+‘û*R\Èu\Ø\Æ\Äö¨=ñt-ö\Å0U»&b¿Ešºû\"h\Ö.\Ö{‘iœ\rÀ¾\0šµ}À‘\Æ@dR\Ç\0›±Ÿü¾\í?À\Ü(#!2‰±ŸôE\Û\r1Bd¢e´\Ç\éÜ¢mXa<Dó7\ì\'{\Ùvo„ñy\Õ±Ÿä­¶3ƒŠH\Ãï°Ÿà­¶[‚Šp<\î8\Þz‚·\Ú^\æ›\Ú\ê°K¨\Çx½ø¸uˆT\Ô\áxUÎ³Pú•žI÷\Ó\r3­ƒ²\è\Ã\Ý	 \Ó\Ð\ÄÏ»©Oq\0ô\ï°‘ˆŸS­DP\Ç>§ñs²u€\êØ§\àT ~ú­Dp¼u€¨@üôZˆ`Žu€¨@üôXˆ`vóˆ\n\Ä\Ï~\ë\0\ì³ˆŸ\Ý\Ö\"\Øe *?;­DP\Ç>§ñ³Á:@ƒ\ÖR ñ³\Î:@u\ìSp*?Zˆ Ž}C±–#T{\"ð\ØÔ–ö þ\êô<wú•\n\Ä\ß\Í\Öº\É:€\ÔO\'\îhÖ‡G­¶:ž‘‹F{cÀ¬C°\Ú:€\ÔW\î\n´õ^ lÛŽ\îÁ*D{bv\0?°Ñ‚\ïS\Ï\Ûf¤ô\0›°\ßm\ë©\×c\Ã\Ò\ÆV`?á‹¶s£Œ„\È~Œý¤÷m\×G\Z‘)ua?ù›µ‡p‹Å‰T®Ÿö¾eX­÷\"Nþ‹}1Ll\Ï\'Dì·ˆ·g±/Šñ¶ˆ\Ùa‘¢÷c_÷\ÇF\î«H)3€\ïaóŠ¶1\à[¸{\ÆD\Ú\ÚR\àª+Ž¿ïª¤g\"tŸÃIŠù[c%ºeH\Ö	\\¬!\Ìª\0\0.B…!5\Ó\\ü\ZØ†Ql\Ã=°õE`Q\å©3¦è´¦ø&ðs\ÜÃ¢\àVYÀ­•;¾^\îH£\r\á£¶•\Øö\0p)ð]\ê¹2¤´¹^\à\Ü7ün\Ï\Ð‡<¸,#¸lk¨\ç\â\Û\Ò\Æú€µy(´8\Û0×²)r=\Ì5\Ì%™GóS¸w\ã&kU\ÞKów¸?]a&\ÉPð þ?®\×—\ç]½Àgq\×@|ó<\0ÌŠE„À\ï)wjv/p\î·ÁI-d8	w&\ë7m–\Érº\Ú\îMg±üýøB m\íÀ-ýù4\îL\Õ\Ük¦GßûÍ°x3\îŽ\áÓùþýÕ¸b	\â\ËÄ»\ZnÕ¾t„$[\Ëp\×¬\'t\è¶83\à8I†Ž6c?™cµ\çp§¬EJ¹ûI»\Ýl´$+—a?y«jŸ3d’‹7ñÚ­\Z9´aÜ”\"^\î\Ä~\ÒV\Ýn2rR{\Ã~²ZµóŒŸ\ÔX7\îÂõDµj\Ðú½‡i‡Û³\Û\ÉU¸+×¹z+p¥uiO}¸«\Ö\ß\â\Ömº\ë÷UÚƒ¼\æhb€»•ui/‹€=\Ø{·KÛ…Ÿ´wðz\ëmd6ðU\ë\í@·»»Ãª\çˆóPS\Êv\â.˜fý\Ê6\íA\ÜH*Ž#\Í\Ã\Ýn#\ë \ï\ë\Í\Ú3d~”‘ûd9y_÷h\æmÀ¬CXÊ½@B=B[g—[°”ó\î³ØŠ[Q¦6\n‡»»9;9\ïA.D\Å\á£¸À:„•œ\ä\"\ë\0	¹\Ø:€•\\±z\íh\âk·\ä\Ð\ë U\Ëur*Ž\"º\ÉôlV®òa\ë\0	ZnÀB®b¹{ªª\\Œ»m\äød\î÷GŽ}o\Ån9Ô¬\î\Í\Êq²GÀ;­CT-\Çy»u€„e7v9È©\Ö¶\Ø:@\Õr,\ë\0	°Pµd¡u€„e÷\n\êD\ÏZ—·À:@\Õr,n\ë\0	\ËnQ¹D·˜”—\Ý\Ø\åX /[HXvc—c[HXvc—c<o a/X¨ZŽò”u€„=i j9\È?¬$\ì\ë\0U\Ëñ¦½7\âVR”\âú\É\ì0+\Ç=\È&\à\ë	ú™\äY \0\×[H\Æ,#G÷Q|)\ÎKü7\í\Ö\Êô\ážr\Ã,)À2øN’Ÿ\àÕµžà­¶³€|~3n•w\É\Ðb`=\ÓO\íÀ¥Ï¯lò\Ù\Ú%¾|÷Šƒ\é>ûz~&{=Àu9Y¶\×\âÖƒ\Z÷m\âMÜª\Ú5‡ô\ç\ØF\ß_œð™\áÆŸ÷K©±.\àt\ÜúO§0ù)ð_`?Á[m?›¤_Ài¸õÂ–\áM‰Æ½\ØOðVÛš\à£Rc¹ž\æ-«O#g %*b\æ7ÿHÛ«C*£)f®u€\0\æYHIŽ÷b•5\Øo\"N\à uˆh\â¯NÏ²g÷lyY*\Ö\Òi\\O*u:$©S_¢Rø«\Ë\ï€}\ÖR¡\éþ:p¯\0H\Ý+\è‹Ñ›\Ê\ßA\êñ\Í;j %*bvZ }¨Œ\n¤˜\í\Ö¨C*£)\æ%\ë\0¨@\nP³\Ù:@\0›¬¤DRÌu€\0†¬¤DRÌu€\0†¬¤DR\Ì:\ë\0<m %ºPX\Ì<`‡uˆ\rŒX‡H…ö \Å\ì$\í\Õ\á7¢\â(DR\ÜZ\ë\0-H9»	HqµÐ‚”³›P—ò$»\ß:@jô#½¸¸…\ÖR{>ý%ÜŠ&z¤\0\íAŠ;@škKÝŠ£0H9¿µPÂ\Ö$s€½„_õp£…\Þ\î.`V”‘¨9\íA\Ê!\Î^d=°!\ÂvoöD\Øn\í©@\Êûi„m>ü3\ÂvcdÍ‚\n¤¼?þ•\Òþb\ÞcÀŸoS\Ä\Ë\ç	û[a)\î\rP!·ù©h½i¢$\ÌD\Æ]c\éþh›OP¯\ï$AŸ \Ìd¾\ém\Þh›\Òc‘‚\Ö\Ðúd^q\Èö.°½\Û\"õU¤°·\Ð\Úa\Ñ_/·«ñge··\è\ÔW‘R.À\Ý\ÊQfB¯šd{_/¹­1\à\Üýi\Ù*ŠO\èA&µ\ÂLš¿¢z²vE”ž‰r5\î[\Üg2gL³­÷4>ã³­¨8$\ç\àÍnB\ï\Îó\Ø\ÖGp÷RM·­Àû‚ö@$²Y¸C®\Ç9|2\ï~œX`[\'\0¿\äÈ½É£À\×\Ð£¢\ÑS\Õ\èÞ€;\Z¤ü*ñ3q…Õ[\åQQ‹ˆˆˆˆˆˆˆˆˆˆˆˆˆˆˆˆˆˆˆˆˆˆ\ä\çÿ\Øb”oWÀU\0\0\0\0IEND®B`‚');
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
