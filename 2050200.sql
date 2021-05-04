-- MySQL dump 10.13  Distrib 5.7.24, for Win64 (x86_64)
--
-- Host: localhost    Database: course_management_system
-- ------------------------------------------------------
-- Server version	5.7.24

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
-- Table structure for table `combine_course`
--

DROP TABLE IF EXISTS `combine_course`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `combine_course` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `module_name` varchar(80) NOT NULL,
  `module_code` varchar(12) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `combine_course`
--

LOCK TABLES `combine_course` WRITE;
/*!40000 ALTER TABLE `combine_course` DISABLE KEYS */;
INSERT INTO `combine_course` VALUES (1,'Computing Mathematics','002'),(2,'Introduction to C programming','003'),(3,'Introduction to Web Programming','004'),(4,'Computer Architecture and OS','205');
/*!40000 ALTER TABLE `combine_course` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `instructor`
--

DROP TABLE IF EXISTS `instructor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `instructor` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fname` varchar(18) DEFAULT NULL,
  `lname` varchar(18) DEFAULT NULL,
  `address` varchar(20) NOT NULL,
  `dob` date NOT NULL,
  `username` varchar(38) NOT NULL,
  `password` varchar(12) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `instructor`
--

LOCK TABLES `instructor` WRITE;
/*!40000 ALTER TABLE `instructor` DISABLE KEYS */;
INSERT INTO `instructor` VALUES (2,'Hari','Ram','Kathmandu','1990-05-08','np1108@gmail.com','pass'),(3,'Gautam','hresthaS','Kathamndu','1996-03-24','np1113@gmail.com','word'),(4,'Juju','Kaji','Bhaktapur','1974-12-04','np1142@gmail.com','rat'),(5,'Himal','Panta','Pokhara','1983-05-01','np1162@gmail.com','nepali'),(6,'Betty','Chooper','Riverdale','2000-04-02','np1192@gmail.com','jughead'),(7,'Hero','Maharjan','Dhalku','1997-03-05','np1132@gmail.com','tiger'),(8,'yoyo','Salvator','VampireDairy','2000-02-01','np1207@gmail.com','elena');
/*!40000 ALTER TABLE `instructor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `level_five`
--

DROP TABLE IF EXISTS `level_five`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `level_five` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `model_name` varchar(80) NOT NULL,
  `model_code` varchar(12) NOT NULL,
  `running` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `level_five`
--

LOCK TABLES `level_five` WRITE;
/*!40000 ALTER TABLE `level_five` DISABLE KEYS */;
INSERT INTO `level_five` VALUES (1,'Numeric Method and Concurrency','801',1),(2,'Introduction to OOP using JAVA','812',1),(3,'Concept and Technologies of AI','413',1),(4,'Human-Computer Interaction','894',1),(5,'Distribution and Cloud Systems Programming','915',1),(6,'Collaboration Dvelopment','784',1),(7,'System Analysis and Design Methods','914',1),(8,'Introductory Computer Networking and IT security','163',1),(9,'smth','324',0),(10,'dfs','724',0),(11,'shshs','gr',0);
/*!40000 ALTER TABLE `level_five` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `level_four`
--

DROP TABLE IF EXISTS `level_four`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `level_four` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `model_name` varchar(80) NOT NULL,
  `model_code` varchar(12) NOT NULL,
  `running` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `level_four`
--

LOCK TABLES `level_four` WRITE;
/*!40000 ALTER TABLE `level_four` DISABLE KEYS */;
INSERT INTO `level_four` VALUES (1,'Personal Development Skill','010',1),(2,'Computing Mathematics','002',1),(3,'Introduction to C programming','003',1),(4,'Introduction to Web Programming','004',1),(5,'Computer Architecture and OS','205',1),(6,'Introduction to database','284',1),(7,'Introduction to Programming II','234',1),(8,'Data Structure and Algorithm','163',1);
/*!40000 ALTER TABLE `level_four` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `level_six`
--

DROP TABLE IF EXISTS `level_six`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `level_six` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `model_name` varchar(80) NOT NULL,
  `model_code` varchar(12) NOT NULL,
  `running` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `level_six`
--

LOCK TABLES `level_six` WRITE;
/*!40000 ALTER TABLE `level_six` DISABLE KEYS */;
INSERT INTO `level_six` VALUES (1,'Deep Learning','501',1),(2,'Introduction to Discrete Mathematics','499',1),(3,'Big data','993',1),(4,'Cyber Security','194',1),(5,'Block Chain','567',1),(6,'Machine Learning','584',1),(7,'Project and Professionalism','555',0),(8,'High Performance Computing','900',0),(9,'Introduction to the programming III','823',0),(10,'Game Development','299',0),(11,'IOS app Development','993',0),(12,'High Performance Computing','100',0);
/*!40000 ALTER TABLE `level_six` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `routine`
--

DROP TABLE IF EXISTS `routine`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `routine` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fname` varchar(18) DEFAULT NULL,
  `lname` varchar(18) DEFAULT NULL,
  `course` varchar(80) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `routine`
--

LOCK TABLES `routine` WRITE;
/*!40000 ALTER TABLE `routine` DISABLE KEYS */;
INSERT INTO `routine` VALUES (1,'Hari','Ram',' Personal Development Skill'),(2,'Gautam','Shrestha','Introduction to OOP using JAVA'),(3,'Himal','Panta','Deep Learning'),(4,'Himal','Panta','Concept and Technologies of AI'),(5,'Himal','Panta','Computing Mathematics'),(6,'Gautam','Shrestha','High Performance Computing'),(7,'Gautam','Shrestha','Introduction to Web Programming'),(8,'Gautam','Shrestha','Introduction to C programming'),(9,'Hari','Ram',' Computer Architecture and OS'),(10,'Hari','Ram','  Introduction to database'),(11,'Hari','Ram',' Introduction to Programming II'),(12,'Juju','Kaji','Numeric Method and Concurrency'),(13,'Juju','Kaji',' Human-Computer Interaction'),(14,'Juju','Kaji','Distribution and Cloud Systems Programming'),(15,'Juju','Kaji','Collaboration Dvelopment'),(16,'Betty','Chooper','System Analysis and Design Methods'),(17,'Betty','Chooper','System Analysis and Design Methods'),(18,'Betty','Chooper','Introductory Computer Networking and IT security'),(19,'Betty','Chooper','Introduction to Discrete Mathematics'),(20,'Hero','Maharjan','Cyber Security'),(21,'Hero','Maharjan','Block Chain'),(22,'Hero','Maharjan',' Machine Learning'),(23,'Hero','Maharjan',' High Performance Computing'),(24,'yoyo','Salvator','IOS app Development '),(25,'yoyo','Salvator','IOS app Development '),(26,'yoyo','Salvator','Introduction to the programming III ');
/*!40000 ALTER TABLE `routine` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fname` varchar(18) DEFAULT NULL,
  `lname` varchar(18) DEFAULT NULL,
  `address` varchar(20) NOT NULL,
  `dob` date NOT NULL,
  `gender` varchar(26) NOT NULL,
  `guardian_name` varchar(26) DEFAULT NULL,
  `username` varchar(38) NOT NULL,
  `password` varchar(12) NOT NULL,
  `level` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (1,'Sulash','Manandhar','kathmandu','2001-11-15','Male','sabita Manandhar','np1189@gmail.com','pa55word',4),(2,'Sachin','Serchan','Balaju','2001-01-26','Male','Ram serchan','np1178@gmail.com','Passass',4),(3,'Ayushma','Shrestha','balaju','2000-01-08','Female','Mami','np1165@gmail.com','suyash',4),(4,'Shreeshant','Poudle ','Kathmandu','1998-05-05','Male','Hari poudle','np1117@gmail.com','itsMe',5),(5,'smth','smth','smth','1997-03-01','Male','smth','np1140@gmail.com','smth',6),(6,'hfd','sdf','sadf','2001-03-03','Male','sf','np1135@gmail.com','dsfs',6),(7,'dsf','fsd','sf','2000-02-02','Male','df','np1185@gmail.com','fsds',6),(8,'Akin','Shrestha','bafal','2001-04-05','Male','anisha','np1179@gmail.com','huioyr',5),(9,'Rishab','Sharma','Bafal','2001-10-17','Male','Keshav sharma','np1158@gmail.com','meeee',4),(10,'Cezeen','Ranjit','Bafal','2000-01-01','Male','Rajin Ranjit','np1137@gmail.com','you',4),(11,'Hero','lal','Pokhara','1999-04-07','Male','Himan','np1173@gmail.com','queen',6);
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student_profile`
--

DROP TABLE IF EXISTS `student_profile`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student_profile` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `std_fname` varchar(18) NOT NULL,
  `std_lname` varchar(18) NOT NULL,
  `sub1` varchar(80) NOT NULL,
  `sub2` varchar(80) NOT NULL,
  `sub3` varchar(80) NOT NULL,
  `sub4` varchar(80) NOT NULL,
  `sub5` varchar(80) NOT NULL,
  `sub6` varchar(80) NOT NULL,
  `sub7` varchar(80) NOT NULL,
  `sub8` varchar(80) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student_profile`
--

LOCK TABLES `student_profile` WRITE;
/*!40000 ALTER TABLE `student_profile` DISABLE KEYS */;
INSERT INTO `student_profile` VALUES (1,'Cezeen','Ranjit','Personal Development Skill','Computing Mathematics','Introduction to C programming','Introduction to Web Programming','Computer Architecture and OS','Introduction to database','Introduction to Programming II','Data Structure and Algorithm'),(2,'Hero','lal','Deep Learning','Introduction to Discrete Mathematics','Big data','Cyber Security','Block Chain','Machine Learning','High Performance Computing','High Performance Computing');
/*!40000 ALTER TABLE `student_profile` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-02-16 19:32:44
