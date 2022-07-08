-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: localhost    Database: online_gaming_site
-- ------------------------------------------------------
-- Server version	8.0.26

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
-- Table structure for table `my_game`
--

DROP TABLE IF EXISTS `my_game`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `my_game` (
  `mg_id` int NOT NULL AUTO_INCREMENT,
  `cus_id` int NOT NULL,
  `game_id` int NOT NULL,
  `game_name` varchar(100) NOT NULL,
  `game_username` varchar(20) DEFAULT NULL,
  `game_pass` varchar(45) DEFAULT NULL,
  `game_points` int DEFAULT NULL,
  `language` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`mg_id`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `my_game`
--

LOCK TABLES `my_game` WRITE;
/*!40000 ALTER TABLE `my_game` DISABLE KEYS */;
INSERT INTO `my_game` VALUES (2,2,3,'IGI','kamal','123',100,'French'),(4,2,3,'NFS','nimal','1234',102,'Engilsh'),(5,2,2,'2','2','3',2,'English'),(6,2,2,'asd','asd','asd',2,'Chinese'),(19,1,2,'PUBG: BATTLEGROUNDS','it20651756','123',123,'English'),(21,1,5,'ASTRONEER','it20651756','123456',123456,'English'),(22,1,1,'NERO','it20651756','4234',1234,'French'),(27,3,5,'ASTRONEER','pzoniastor','adas',100,'English'),(28,3,2,'PUBG: BATTLEGROUNDS','pzoniastor','aasda',100,'French'),(30,5,2,'PUBG: BATTLEGROUNDS','it20651756','123465',80,'English'),(31,5,2,'PUBG: BATTLEGROUNDS','dasd','23',10,'Chinese');
/*!40000 ALTER TABLE `my_game` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-10-14  5:14:06
