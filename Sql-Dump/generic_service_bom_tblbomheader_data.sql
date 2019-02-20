CREATE DATABASE  IF NOT EXISTS `generic_service_bom` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;
USE `generic_service_bom`;
-- MySQL dump 10.13  Distrib 8.0.13, for Win64 (x86_64)
--
-- Host: localhost    Database: generic_service_bom
-- ------------------------------------------------------
-- Server version	8.0.13

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tblbomheader_data`
--

DROP TABLE IF EXISTS `tblbomheader_data`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tblbomheader_data` (
  `bom_id` int(11) NOT NULL,
  `bom_group_desc` varchar(255) DEFAULT NULL,
  `bom_group_id` int(11) NOT NULL,
  `bom_type` varchar(255) DEFAULT NULL,
  `bom_usage` varchar(255) DEFAULT NULL,
  `end_date` datetime DEFAULT NULL,
  `plant_desc` varchar(255) DEFAULT NULL,
  `plant_id` int(11) NOT NULL,
  `start_date` datetime DEFAULT NULL,
  PRIMARY KEY (`bom_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblbomheader_data`
--

LOCK TABLES `tblbomheader_data` WRITE;
/*!40000 ALTER TABLE `tblbomheader_data` DISABLE KEYS */;
INSERT INTO `tblbomheader_data` VALUES (1001,'Production BOM Group',100,'Production','Production BOM','9999-12-31 05:30:00','Mumbai Plant',1000,'2019-02-02 05:30:00'),(1002,'Production BOM Group',100,'Production','Production BOM','9999-12-31 05:30:00','Mumbai Plant',1000,'2019-02-02 05:30:00');
/*!40000 ALTER TABLE `tblbomheader_data` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-02-20 11:46:48
