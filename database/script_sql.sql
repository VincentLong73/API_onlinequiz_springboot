-- MySQL dump 10.13  Distrib 8.0.21, for Win64 (x86_64)
--
-- Host: localhost    Database: quiz_web_db
-- ------------------------------------------------------
-- Server version	8.0.21

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `answer`
--

DROP TABLE IF EXISTS `answer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `answer` (
  `id` int NOT NULL AUTO_INCREMENT,
  `content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=340 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `answer`
--

LOCK TABLES `answer` WRITE;
/*!40000 ALTER TABLE `answer` DISABLE KEYS */;
INSERT INTO `answer` VALUES (37,'bang 145'),(38,'bang 12345'),(39,'bang 1666'),(40,'bang 1123'),(53,'bang 5'),(54,'bang 7'),(55,'bang 9'),(56,'bang 3'),(57,'bang 115'),(58,'bang 24'),(59,'bang 66'),(60,'bang 23'),(61,'bang 199'),(62,'bang 177'),(63,'bang 155'),(64,'bang 133'),(65,'bang 122'),(66,'bang 13333'),(67,'bang 11212'),(68,'bang 1113331'),(69,'bang 1s'),(70,'bang 1r'),(71,'bang 1h'),(72,'bang 1m'),(73,'bang 1h'),(74,'bang 1k'),(75,'bang 1\''),(76,'bang 1\''),(77,'bang 15'),(78,'bang 124'),(79,'bang 166'),(80,'bang 123'),(81,'bang 1eqeqe'),(82,'bang 1sa'),(83,'bang 1aasas'),(84,'bang 1ssas'),(85,'bang 111111'),(86,'bang 122222'),(87,'bang 13333'),(88,'bang 1333444'),(89,'bang 1sa'),(90,'bang 1aas'),(91,'bang 1ssa'),(92,'bang 1asas'),(93,'bang 1df'),(94,'bang 1ffd'),(95,'bang 1assd'),(96,'bang 1fa'),(97,'bang 1kj'),(98,'bang 1hjk'),(99,'bang 1kkj'),(100,'bang 1kjkk'),(101,'bang 1wewe'),(102,'bang 1eweww'),(103,'bang 1wwe'),(104,'bang 1eew'),(105,'bang 1asx'),(106,'bang 1cc'),(107,'bang 1zz'),(108,'bang 1xx'),(109,'bang 1ggg'),(110,'bang 1hhh'),(111,'bang 1ff'),(112,'bang 1fgsa'),(113,'bang 1gfa'),(114,'bang 1haefhj'),(115,'bang 1jgjgj'),(116,'bang 1sjs'),(117,'bang 1112'),(118,'bang 1221'),(119,'bang 1313'),(120,'bang 1313'),(121,'bang 1hggh'),(122,'bang 1hhghg'),(123,'bang 1ghgh'),(124,'bang 1jjj'),(125,'bang 1ghj'),(126,'bang 1ghf'),(127,'bang 1fyj'),(128,'bang 1fjff'),(129,'bang 1888'),(130,'bang 1777'),(131,'bang 18889'),(132,'bang 199'),(133,'bang 1wwqw'),(134,'bang 1wwwqq'),(135,'bang 1qqw'),(136,'bang 1wqwqwqw'),(137,'bang 1124'),(138,'bang 1531'),(139,'bang 1454'),(140,'bang 1661'),(141,'bang 1123'),(142,'bang 144'),(143,'bang 1134'),(144,'bang 1212'),(145,'bang 1332'),(146,'bang 112344'),(147,'bang 1442'),(148,'bang 12132'),(149,'bang 1131'),(150,'bang 1331'),(151,'bang 11321'),(152,'bang 1312312'),(153,'bang 1123234'),(154,'bang 14441'),(155,'bang 144144'),(156,'bang 141'),(157,'bang 1qwer123'),(158,'bang 1rrq'),(159,'bang 1rqer'),(160,'bang 1rqe'),(161,'bang 1r'),(162,'bang 1tewr'),(163,'bang 1rrq'),(164,'bang 1qer'),(165,'bang 1fds'),(166,'bang 1adf'),(167,'bang 1gga'),(168,'bang 1asdf'),(169,'bang 100 aaa'),(170,'bang 1]'),(171,'bang 1;;'),(172,'bang 1oo'),(173,'bang 1dasdfdf1111'),(174,'bang 1fdsa'),(175,'bang 1fasfsdf'),(176,'bang 1ggsd'),(177,'bang 1ssss'),(178,'bang 1dddddddd'),(179,'bang 1ffff'),(180,'bang 1ggggg'),(181,'bang 1t'),(182,'bang 1e'),(183,'bang 1g'),(184,'bang 1v33'),(185,'bang 1hhh'),(186,'bang 1jjjjjj'),(187,'bang 1kkkkkkkkk'),(188,'bang 1lllllll'),(189,'bang 1ggggg'),(190,'bang 1hhg'),(191,'bang 1ghfg'),(192,'bang 1hfghg'),(193,'bang 13131'),(194,'bang 1331'),(195,'bang 1113'),(196,'bang 13133'),(197,'bang 1aaaaaaaa'),(198,'bang 1sssssss'),(199,'bang 1ddddd'),(200,'bang 1ffff'),(201,'bang 1asdfgq1112'),(202,'bang 1hhhdd'),(203,'bang 1dsdfgh'),(204,'bang 1hhhs'),(205,'bang 1rq'),(206,'bang 1qr'),(207,'bang 1rqrrqr'),(208,'bang 1qrr'),(209,'bang 1w'),(210,'bang 1rrr1123'),(211,'bang 1qqq'),(212,'bang 1rqr'),(213,'bang 1r11'),(214,'bang 111r'),(215,'bang 1rrr1'),(216,'bang 1r1r1r'),(217,'bang 1cccc'),(218,'bang 1csss'),(219,'bang 1ssc'),(220,'bang ccC'),(221,'bang 1ccs'),(222,'bang 1sc'),(223,'bang 1cca'),(224,'bang acac'),(225,'bang 1rrr123aaa'),(226,'bang 1tt'),(227,'bang 1rr'),(228,'bang 123'),(229,'bang 1ffq123'),(230,'bang 1qfq'),(231,'bang 1fqfq'),(232,'bang 1qfqf'),(233,'bang 1222aa'),(234,'bang 133'),(235,'bang 1444'),(236,'bang 1'),(237,'bang 1333aa'),(238,'bang 144'),(239,'bang 1555'),(240,'bang 1666'),(241,'bang 1qffqww1'),(242,'bang 1ff'),(243,'bang 1ggg'),(244,'bang 1gg'),(245,'bang 1asffasfasgasg'),(246,'bang 1adsdas'),(247,'bang 1asdasd'),(248,'bang 1asfasf'),(249,'bang 122aaa'),(250,'bang 145434'),(251,'bang 133'),(252,'bang 1434'),(253,'Nam Dinh'),(254,'Ha Noi'),(255,'Ho Chi Minh'),(256,'Hue'),(257,'bang 145'),(258,'bang 12345'),(259,'bang 1666'),(260,'bang 1123'),(261,'True'),(262,'False'),(263,'Dung'),(264,'Sai'),(265,'Very True'),(266,'Bad False'),(267,'Qua Dung'),(268,'Qua Sai'),(269,'Very True'),(270,'Bad False'),(271,'Qua Dung'),(272,'Qua Sai'),(273,'Very True'),(274,'Bad False'),(275,'Qua Dung'),(276,'Qua Sai'),(277,'Very True'),(278,'Bad Fa123lse'),(279,'Qua Du11ng'),(280,'Qua S22ai'),(281,'いちばんめ'),(282,'にばんめ'),(283,'さんばんめ'),(284,'ごばんめ'),(285,'2'),(286,'3'),(287,'5'),(288,'7'),(289,'aaa'),(290,'bbb'),(291,'ccc'),(292,'ddd'),(293,'111aaaaa'),(294,'222aaaa'),(295,'332aaaaa'),(296,'444aaaa'),(297,'21111'),(298,'22222'),(299,'333'),(300,'はは'),(301,'ちち'),(302,'いもうと'),(303,'おとうと'),(304,'はは'),(305,'ちち'),(306,'いもうと'),(307,'おとうと'),(308,'Kyoto'),(309,'Tokyo'),(310,'Osaka'),(311,'Chiba'),(312,'121212'),(313,'211212121'),(314,'212122'),(315,'2221111212'),(316,'mmm'),(317,'nn'),(318,'vv'),(319,'jj'),(320,'111'),(321,'222'),(322,'333'),(323,'1111'),(324,'22211'),(325,'121212'),(326,'2121212'),(327,'22221'),(328,'1111222'),(329,'2222111'),(330,'333112'),(331,'33322112'),(332,'London'),(333,'Paris'),(334,'Berlin'),(335,'Vienchan'),(336,'Rio de Janero'),(337,'Brasilia'),(338,'Sao Paolo'),(339,'Lima');
/*!40000 ALTER TABLE `answer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `assign`
--

DROP TABLE IF EXISTS `assign`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `assign` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(150) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `id_student` int DEFAULT '1',
  `created_by` varchar(255) DEFAULT '1',
  PRIMARY KEY (`id`),
  KEY `fk_assign_student_idx` (`id_student`),
  KEY `fk_assign_teacher_idx` (`created_by`),
  CONSTRAINT `fk_assign_student` FOREIGN KEY (`id_student`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `assign`
--

LOCK TABLES `assign` WRITE;
/*!40000 ALTER TABLE `assign` DISABLE KEYS */;
INSERT INTO `assign` VALUES (11,'Assign Name 2',1,'1'),(12,'Assign Name 3',1,'1'),(13,'Assign Name Test Edit',1,'1'),(14,'Assign Name Test Edit 2',1,'1'),(15,'Assign Name Test Edit 3',1,'1'),(16,'Assign Name Test Edit 33',1,'1'),(17,'Assign Name Test Edit 333',1,'1'),(18,'Assign Name 5',1,'1'),(23,'Assign Name 6',NULL,'1'),(24,'Assign Name 7',1,'1'),(25,'Assign Name 8',1,'1'),(26,'Assign Name 8',1,'1'),(27,'Assign Name 9A',1,'1'),(29,'Assign Name 11',1,NULL);
/*!40000 ALTER TABLE `assign` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `level`
--

DROP TABLE IF EXISTS `level`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `level` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `level`
--

LOCK TABLES `level` WRITE;
/*!40000 ALTER TABLE `level` DISABLE KEYS */;
INSERT INTO `level` VALUES (1,'de'),(2,'trung binh'),(3,'kho');
/*!40000 ALTER TABLE `level` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `question`
--

DROP TABLE IF EXISTS `question`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `question` (
  `id` int NOT NULL AUTO_INCREMENT,
  `content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `id_level` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_question_level_idx` (`id_level`),
  CONSTRAINT `fk_question_level` FOREIGN KEY (`id_level`) REFERENCES `level` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=88 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `question`
--

LOCK TABLES `question` WRITE;
/*!40000 ALTER TABLE `question` DISABLE KEYS */;
INSERT INTO `question` VALUES (15,' 13 + 12 = ?',2),(16,'1 + 91 = ?',1),(17,'1 + 111 = ?',1),(18,'1 + 1 33= ?',1),(19,'1 + 1 = ?o',1),(20,' 3 + 2 = ?',2),(21,'1 + 1 = ?qe',1),(22,'1 + 1 = ?111',1),(23,'1 + 1 = ?as',1),(24,'1 + 1 = ?fdf',1),(25,'1 + 1 = ?kjkj',1),(26,'1 + 1 = ?w',1),(27,'1 + 1 = ?ass',1),(28,'1 + 1 = ?agg',1),(29,'1 + 1 = ?fggfg',1),(30,'1 + 1 = ?123',1),(31,'1 + 1 = ?hghg',1),(32,'1 + 1 = ?jhhj',1),(33,'1 + 1 ',1),(34,'1 + 1 = ?wwqwqwyuan',2),(35,'1 + 1 = ?5656',1),(36,'1 + 1 =123',2),(37,'1 + 1 = ?121232',2),(38,'1 + 1 = 12?',1),(39,'1 + 1 = 123345?a',1),(40,'1 + 1 = ?aaaaaa',1),(41,'1 + 1qwer = ?',1),(42,'1 + 1 =qwewrer ?',1),(43,'1 + 122 = dl',1),(44,'1 + 1 = ?trtrt',1),(45,'1 + 1 = ?www',1),(46,'1 + 1 = ?r',1),(47,'1 + 1 = ?455555',1),(48,'1 + 1 = ?ehg',1),(49,'1 + 1 = ?1233',1),(50,'1 + 1 = ?cxs',1),(51,'1 + 1 =123 ?',1),(52,'1 + 1 = ?rr',1),(53,'1 + 1 = ?aaaaaarr',1),(54,'1 + 1 = ?rer',1),(55,'1 + 1 = ?c',1),(56,'1 + 1 = ?fffff',1),(57,'1 + 1 = ?r2r',1),(58,'1 + 1 = ?fqwf',1),(59,'1 + 112 = ?',2),(60,'1 + 1 12',1),(61,'1 + 1 = ?wwqwqwf',1),(62,'1 + 1 = ?asfasfasfa',1),(63,'1 + 1 = ?434',2),(64,'Thu do cua Viet Nam la gi?',2),(65,'Cau test class convert',2),(66,'Cau test class mapper',3),(67,'Cau test class mapper',2),(68,'Cau test class mapper hahaha',2),(69,'Cau test auth class mapper',3),(70,'一番目',1),(71,'Nha Long co may nguoi?',1),(72,'1234',1),(75,'nha aaaaa',1),(76,'1232434',1),(77,'母',1),(78,'母',1),(79,'Thu do Nhat Ban la gi?',1),(80,'1 + 1 = ?',1),(81,'vbnb',2),(83,'123',1),(84,'1212121212',2),(85,'123456789',1),(86,'Thu do Anh la dau?',1),(87,'Thu do cua Brazil la ?',2);
/*!40000 ALTER TABLE `question` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `question_answer`
--

DROP TABLE IF EXISTS `question_answer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `question_answer` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_question` int DEFAULT NULL,
  `id_answer` int DEFAULT NULL,
  `is_correct` int DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `fk_question_answer_idx` (`id_question`),
  KEY `fk_answer_question_idx` (`id_answer`),
  CONSTRAINT `fk_answer_question` FOREIGN KEY (`id_answer`) REFERENCES `answer` (`id`),
  CONSTRAINT `fk_question_answer` FOREIGN KEY (`id_question`) REFERENCES `question` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=401 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `question_answer`
--

LOCK TABLES `question_answer` WRITE;
/*!40000 ALTER TABLE `question_answer` DISABLE KEYS */;
INSERT INTO `question_answer` VALUES (38,16,61,1),(39,16,62,0),(40,16,63,0),(41,16,64,0),(42,17,65,1),(43,17,66,1),(44,17,67,1),(45,17,68,1),(46,18,69,0),(47,18,70,0),(48,18,71,1),(49,18,72,0),(58,21,81,0),(59,21,82,1),(60,21,83,1),(61,21,84,0),(66,23,89,1),(67,23,90,1),(68,23,91,1),(69,23,92,0),(70,24,93,0),(71,24,94,0),(72,24,95,1),(73,24,96,1),(74,25,97,1),(75,25,98,1),(76,25,99,0),(77,25,100,0),(78,26,101,0),(79,26,102,0),(80,26,103,0),(81,26,104,1),(82,27,105,0),(83,27,106,0),(84,27,107,0),(85,27,108,0),(86,28,109,0),(87,28,110,0),(88,28,111,0),(89,28,112,0),(90,29,113,0),(91,29,114,0),(92,29,115,1),(93,29,116,1),(98,31,121,0),(99,31,122,0),(100,31,123,1),(101,31,124,1),(102,32,125,0),(103,32,126,0),(104,32,127,1),(105,32,128,1),(106,33,129,0),(107,33,130,0),(108,33,131,1),(109,33,132,1),(114,35,137,1),(115,35,138,0),(116,35,139,0),(117,35,140,1),(118,36,141,1),(119,36,142,0),(120,36,143,0),(121,36,144,1),(126,38,149,1),(127,38,150,0),(128,38,151,0),(129,38,152,1),(130,39,153,1),(131,39,154,0),(132,39,155,0),(133,39,156,1),(134,40,157,1),(135,40,158,0),(136,40,159,0),(137,40,160,1),(138,41,161,1),(139,41,162,0),(140,41,163,0),(141,41,164,1),(142,42,165,1),(143,42,166,0),(144,42,167,0),(145,42,168,1),(154,45,177,1),(155,45,178,0),(156,45,179,0),(157,45,180,1),(158,46,181,1),(159,46,182,0),(160,46,183,0),(161,46,184,1),(162,47,185,1),(163,47,186,0),(164,47,187,0),(165,47,188,1),(166,48,189,1),(167,48,190,0),(168,48,191,0),(169,48,192,1),(170,49,193,1),(171,49,194,0),(172,49,195,0),(173,49,196,1),(174,50,197,1),(175,50,198,0),(176,50,199,0),(177,50,200,1),(178,51,201,1),(179,51,202,0),(180,51,203,0),(181,51,204,1),(182,52,205,1),(183,52,206,0),(184,52,207,0),(185,52,208,1),(190,54,213,1),(191,54,214,0),(192,54,215,0),(193,54,216,1),(194,55,217,1),(195,55,218,0),(196,55,219,0),(197,55,220,1),(198,56,221,1),(199,56,222,0),(200,56,223,0),(201,56,224,1),(202,57,225,1),(203,57,226,0),(204,57,227,0),(205,57,228,1),(206,58,229,1),(207,58,230,0),(208,58,231,0),(209,58,232,1),(214,60,237,1),(215,60,238,0),(216,60,239,0),(217,60,240,1),(218,61,241,1),(219,61,242,0),(220,61,243,0),(221,61,244,1),(222,62,245,1),(223,62,246,0),(224,62,247,0),(225,62,248,1),(226,63,249,1),(227,63,250,0),(228,63,251,0),(229,63,252,1),(230,64,253,1),(231,64,254,0),(232,64,255,0),(233,64,256,1),(242,20,77,0),(243,20,78,0),(244,20,79,0),(245,20,80,0),(246,65,261,0),(247,65,262,0),(248,65,263,0),(249,65,264,0),(250,15,57,0),(251,15,58,0),(252,15,59,0),(253,15,60,0),(290,43,169,0),(291,43,170,0),(292,43,171,0),(293,43,172,0),(294,30,117,0),(295,30,118,0),(296,30,119,0),(297,30,120,0),(298,19,73,0),(299,19,74,0),(300,19,75,0),(301,19,76,0),(302,22,85,0),(303,22,86,0),(304,22,87,0),(305,22,88,0),(306,44,173,0),(307,44,174,0),(308,44,175,0),(309,44,176,0),(310,59,233,0),(311,59,234,0),(312,59,235,0),(313,59,236,0),(314,37,145,0),(315,37,146,0),(316,37,147,0),(317,37,148,0),(318,34,133,0),(319,34,134,0),(320,34,135,0),(321,34,136,0),(322,53,209,0),(323,53,210,0),(324,53,211,0),(325,53,212,0),(326,66,265,0),(327,66,266,0),(328,66,267,0),(329,66,268,0),(330,67,269,0),(331,67,270,0),(332,67,271,0),(333,67,272,0),(334,68,273,0),(335,68,274,0),(336,68,275,0),(337,68,276,0),(338,69,277,1),(339,69,278,0),(340,69,279,0),(341,69,280,0),(342,70,281,1),(343,70,282,0),(344,70,283,0),(345,70,284,0),(346,71,285,0),(347,71,286,0),(348,71,287,0),(349,71,288,0),(350,72,289,0),(351,72,290,0),(352,72,291,0),(353,72,292,0),(354,75,293,0),(355,75,294,0),(356,75,295,0),(357,75,296,0),(358,76,297,0),(359,76,298,0),(360,76,299,0),(361,77,300,0),(362,77,301,0),(363,77,302,0),(364,77,303,0),(365,78,304,0),(366,78,305,0),(367,78,306,0),(368,78,307,0),(369,79,308,0),(370,79,309,0),(371,79,310,0),(372,79,311,0),(373,80,312,0),(374,80,313,0),(375,80,314,0),(376,80,315,0),(377,81,316,0),(378,81,317,0),(379,81,318,0),(380,81,319,0),(381,83,320,0),(382,83,321,0),(383,83,322,0),(384,83,323,0),(385,84,324,0),(386,84,325,0),(387,84,326,0),(388,84,327,0),(389,85,328,0),(390,85,329,0),(391,85,330,0),(392,85,331,1),(393,86,332,1),(394,86,333,0),(395,86,334,0),(396,86,335,0),(397,87,336,0),(398,87,337,1),(399,87,338,0),(400,87,339,0);
/*!40000 ALTER TABLE `question_answer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `result`
--

DROP TABLE IF EXISTS `result`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `result` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_test_question` int DEFAULT NULL,
  `choice` varchar(255) DEFAULT NULL,
  `status` int DEFAULT NULL,
  `score` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_result_idx` (`id_test_question`),
  CONSTRAINT `fk_result` FOREIGN KEY (`id_test_question`) REFERENCES `test_question` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=66 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `result`
--

LOCK TABLES `result` WRITE;
/*!40000 ALTER TABLE `result` DISABLE KEYS */;
INSERT INTO `result` VALUES (1,31,NULL,2,0),(2,32,'1,2',0,0),(3,33,'3',1,1),(4,34,'4',1,1),(5,35,'1,3',1,1),(6,36,'2,4',0,0),(7,37,'4',0,0),(8,38,'3',1,1),(9,39,'2',0,0),(12,40,'157,158',1,0),(13,31,'189,190',1,0),(19,121,'189,192',1,1),(20,32,'149,150',0,0),(21,33,'137',0,0),(22,34,'',2,0),(23,38,'141,142,143',0,0),(24,61,'245,246,247,248',0,0),(25,62,'213,214,215',0,0),(26,109,'225,226,227',0,0),(27,110,'203',0,0),(28,111,'126,127,128',0,0),(29,112,'188',0,0),(30,113,'218,219',0,0),(31,114,'',2,0),(32,115,'74,75',0,0),(33,116,'200',0,0),(34,117,'164',0,0),(35,118,'108',0,0),(36,61,'247,248',0,0),(37,62,'215,216',0,0),(38,63,'100',0,0),(39,64,'79,80',0,0),(40,65,'136',0,0),(41,66,'110,111',0,0),(42,67,'59',0,0),(43,68,'146,147',0,0),(44,69,'211',0,0),(45,70,'',2,0),(46,119,'129,130',0,0),(47,120,'216',0,0),(48,121,'191,192',0,0),(49,122,'136',0,0),(50,123,'239,240',0,0),(51,124,'167',0,0),(52,125,'',2,0),(53,126,'84',0,0),(54,127,'116',0,0),(55,128,'264',0,0),(56,109,'228',0,0),(57,110,'204',0,0),(58,111,'126,127',0,0),(59,112,'187',0,0),(60,113,'220',0,0),(61,114,'190,191',0,0),(62,115,'73',0,0),(63,116,'198',0,0),(64,117,'164',0,0),(65,118,'107,108',0,0);
/*!40000 ALTER TABLE `result` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `role` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES (1,'ROLE_STUDENT'),(2,'ROLE_TEACHER'),(3,'ROLE_ADMIN');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `test`
--

DROP TABLE IF EXISTS `test`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `test` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(150) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `id_assign` int DEFAULT '0',
  `mark` int DEFAULT '0',
  `time_out` date DEFAULT NULL,
  `status` int DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `fk_test_assign_idx` (`id_assign`),
  CONSTRAINT `fk_test_assign` FOREIGN KEY (`id_assign`) REFERENCES `assign` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `test`
--

LOCK TABLES `test` WRITE;
/*!40000 ALTER TABLE `test` DISABLE KEYS */;
INSERT INTO `test` VALUES (2,'Test Name A2',29,0,'2020-08-26',2),(3,'Test Name A3',29,0,'2020-08-25',2),(4,'Test Name 4',27,4,'2020-08-25',2),(5,'Test Name 5',27,0,'2020-10-20',2),(6,'Test Name 6',27,0,'2020-10-20',2),(7,'Test Name 7',27,0,'2020-10-20',1),(9,'Test Name 9',NULL,0,'2020-10-20',2),(11,'Test A22',29,0,'2020-10-20',1),(12,'Test A33',29,1,'2020-10-20',1),(13,'Thu do',NULL,0,'2020-11-03',2),(14,'Thu do 123',NULL,0,'2020-10-20',2),(15,'Dao Thi Duyen',NULL,0,'2020-10-20',2),(16,'Duyen_Dao',NULL,0,'2020-11-03',2),(18,'yuanyuan111',NULL,0,'2020-10-20',2),(19,'Duyen123',NULL,0,'2020-11-03',2),(20,'Duyen Dao311',NULL,0,'2020-11-03',2),(21,'Dao Thi Duyen123456',NULL,0,'2020-09-05',2),(23,'Duyen',NULL,0,'2020-11-03',2),(24,'Duye',NULL,0,'2020-11-03',2);
/*!40000 ALTER TABLE `test` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `test_question`
--

DROP TABLE IF EXISTS `test_question`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `test_question` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_test` int DEFAULT NULL,
  `id_question` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_test_question_idx` (`id_test`),
  KEY `fk_question_test_idx` (`id_question`),
  CONSTRAINT `fk_question_test` FOREIGN KEY (`id_question`) REFERENCES `question` (`id`),
  CONSTRAINT `fk_test_question` FOREIGN KEY (`id_test`) REFERENCES `test` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=278 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `test_question`
--

LOCK TABLES `test_question` WRITE;
/*!40000 ALTER TABLE `test_question` DISABLE KEYS */;
INSERT INTO `test_question` VALUES (31,4,48),(32,4,38),(33,4,35),(34,4,34),(35,4,44),(36,4,19),(37,4,58),(38,4,36),(39,4,53),(40,4,40),(41,5,20),(42,5,58),(43,5,55),(44,5,42),(45,5,41),(47,5,43),(48,5,60),(49,5,61),(50,5,25),(51,6,27),(52,6,21),(53,6,29),(54,6,47),(55,6,43),(57,6,45),(58,6,18),(59,6,50),(60,6,55),(61,7,62),(62,7,54),(63,7,25),(64,7,20),(65,7,34),(66,7,28),(67,7,15),(68,7,37),(69,7,53),(70,7,41),(81,9,26),(82,9,35),(83,9,31),(84,9,49),(85,9,38),(87,9,43),(89,9,34),(90,9,48),(109,11,57),(110,11,51),(111,11,32),(112,11,47),(113,11,55),(114,11,48),(115,11,19),(116,11,50),(117,11,41),(118,11,27),(119,12,33),(120,12,54),(121,12,48),(122,12,34),(123,12,60),(124,12,42),(125,12,46),(126,12,21),(127,12,29),(128,12,65),(129,2,31),(130,2,22),(131,2,37),(132,2,36),(133,2,23),(134,2,50),(135,2,62),(136,2,43),(137,2,28),(138,3,61),(139,3,24),(140,3,27),(141,3,21),(142,3,55),(143,3,32),(144,3,19),(145,3,40),(146,3,23),(147,3,60),(148,13,84),(149,13,27),(150,13,46),(151,13,49),(152,13,75),(153,13,16),(154,13,37),(155,13,85),(156,13,31),(157,13,63),(158,14,62),(159,14,22),(160,14,30),(161,14,59),(162,14,20),(163,14,78),(164,14,57),(165,14,72),(166,14,24),(167,14,55),(168,15,51),(169,15,50),(170,15,78),(171,15,16),(172,15,22),(173,15,86),(174,15,32),(175,15,80),(176,15,65),(177,15,37),(178,16,45),(179,16,16),(180,16,34),(181,16,53),(182,16,33),(183,16,38),(184,16,52),(185,16,62),(186,16,18),(187,16,51),(198,18,48),(199,18,39),(200,18,63),(201,18,84),(202,18,68),(203,18,53),(204,18,32),(205,18,65),(206,18,57),(207,18,69),(208,19,22),(209,19,81),(210,19,84),(211,19,47),(212,19,34),(213,19,52),(214,19,21),(215,19,31),(216,19,51),(217,19,25),(218,20,40),(219,20,31),(220,20,38),(221,20,64),(222,20,63),(223,20,42),(224,20,43),(225,20,47),(226,20,62),(227,20,65),(228,21,39),(229,21,63),(230,21,32),(231,21,30),(232,21,26),(233,21,80),(234,21,27),(235,21,19),(236,21,25),(237,21,43),(248,23,86),(249,23,45),(250,23,76),(251,23,71),(252,23,59),(253,23,19),(254,23,57),(255,23,70),(256,23,29),(257,23,72),(258,24,26),(259,24,59),(260,24,87),(261,24,37),(262,24,65),(263,24,78),(264,24,83),(265,24,18),(266,24,80),(267,24,38);
/*!40000 ALTER TABLE `test_question` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_role` int NOT NULL DEFAULT '1',
  `user_name` varchar(100) NOT NULL,
  `password` varchar(45) NOT NULL,
  `first_name` varchar(100) DEFAULT NULL,
  `last_name` varchar(100) DEFAULT NULL,
  `age` int DEFAULT NULL,
  `phone` varchar(11) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `created_date` date DEFAULT NULL,
  `created_by` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_name_UNIQUE` (`user_name`),
  KEY `fk_student_role_idx` (`id_role`),
  CONSTRAINT `fk_student_role` FOREIGN KEY (`id_role`) REFERENCES `role` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,1,'longnv','311','Viet Long','Nguyen',21,NULL,NULL,NULL,NULL),(2,2,'duyendt','311','Thi Duyen','Dao',19,NULL,NULL,NULL,NULL),(8,3,'abc','123','Van A','Nguyen',20,NULL,NULL,NULL,NULL),(10,1,'long123','311',NULL,'Nguyen',22,'0373322113','yuanyuan.com',NULL,NULL),(11,1,'longnguyen','311','Viet Long','Nguyen',21,'0123','longngodaugo',NULL,NULL),(12,2,'lognguyenviet','311',NULL,'Nguyen',21,'311','longngodaugo.1202@gmail.com',NULL,NULL),(13,2,'duyenduyen','311','Thi Duyen','Dao',20,'123','yuanyuan',NULL,NULL),(14,2,'nguyenvana','123','Nguyen Van ','A',22,'123','nguyenvana',NULL,NULL),(15,2,'sun*','kangnam','Nguyen Van','Sun',21,'011233555','sun@Gmail.com','2010-10-03','1'),(16,2,'thaont','2503','Thi Thao','Nguyen',17,'123','thaont','2020-10-03',NULL),(17,2,'hungnv','0209','Viet Hung','Nguyen',21,'123','hungnv','2020-10-03',NULL),(18,2,'chungnv','1970','Viet Chung','Nguyen',50,'123','chungnv','2020-10-03',NULL),(19,2,'sangtt','1978','Thi Sang','Tong',42,'123','sangtt','2020-10-03',NULL),(21,1,'chungnvStudent','1970','Viet Chung','Nguyen',50,'0123','longngodaugo',NULL,NULL),(23,2,'vietnhat','2022',NULL,'Nguyen',25,'311','vietnhat','2020-10-03',NULL),(29,2,'nhatviet','123',NULL,'Nguyen',20,'123456','nhatviet','2020-10-05',NULL);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'quiz_web_db'
--

--
-- Dumping routines for database 'quiz_web_db'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-11-21 10:56:18
