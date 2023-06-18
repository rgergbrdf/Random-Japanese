-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: random
-- ------------------------------------------------------
-- Server version	8.0.33

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
-- Table structure for table `vocabulary`
--

DROP TABLE IF EXISTS `vocabulary`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vocabulary` (
  `id` int NOT NULL AUTO_INCREMENT,
  `japanese` varchar(255) DEFAULT NULL,
  `lesson` int DEFAULT NULL,
  `romaji` varchar(255) DEFAULT NULL,
  `viet_nam` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=120 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vocabulary`
--

LOCK TABLES `vocabulary` WRITE;
/*!40000 ALTER TABLE `vocabulary` DISABLE KEYS */;
INSERT INTO `vocabulary` VALUES (1,'りんご',2,'ring go','Quả táo'),(2,'おばさん',2,'o ba san','Cô, dì'),(3,'おじさん',2,'o ji san','Chú, bác'),(4,'ぶか',2,'bu ka','Cấp dưới'),(5,'てがみ',2,'te ga mi','Lá thư'),(6,'おんがく',2,'ong ga ku','Âm nhạc'),(7,'でんき',2,'deng ki','Điện'),(8,'だいがく',2,'dai ga ku','Đại học'),(9,'ぎんこう',2,'ging kou','Ngân hàng'),(10,'かばん',2,'ka ban','Cặp, túi xách'),(11,'かいだん',2,'kai dan','Cầu thang'),(12,'うりば',2,'u ri ba','Quầy hàng'),(13,'おばあさん',2,'o baa san','Bà'),(14,'おじいさん',2,'o jii san','Ông'),(15,'かお',1,'ka o','Khuôn mặt'),(16,'き',1,'ki','Cây'),(17,'くうき',1,'kuu ki','Không khí'),(18,'け',1,'ke','Lông'),(19,'こえ',1,'ko e','Giọng nói'),(20,'あし',1,'a shi','Chân'),(21,'すし',1,'su shi','Món sushi'),(22,'せき',1,'se ki','Chỗ ngồi'),(23,'いす',1,'i su','Cái ghế'),(24,'うそ',1,'u so','Nói dối '),(25,'たき',1,'ta ki','Thác nước'),(26,'くち',1,'ku chi','Cái miệng'),(27,'つち',1,'tsu chi','Đất'),(28,'て',1,'te','Tay'),(29,'とけい',1,'to kee','Đồng hồ'),(30,'なつ',1,'na tsu','Mùa hè '),(31,'あに',1,'a ni','Anh trai của mình '),(32,'おにいさん',1,'o nii san','Anh trai của người khác'),(33,'いぬ',1,'i nu','Con chó'),(34,'ねこ',1,'ne ko','Con mèo'),(35,'のう',1,'noo','Não'),(36,'あおい',1,'aoi','Màu xanh'),(37,'あかい',1,'a kai','Màu đỏ'),(38,'はし',1,'ha shi','Cây cầu / đũa'),(39,'ひと',1,'hi to','Người'),(40,'ふく',1,'fu ku','Quần áo'),(41,'へた',1,'he ta','Yếu kém'),(42,'ほね',1,'ho ne','Xương'),(43,'まち',1,'ma chi','Thành phố / thị trấn / con phố'),(44,'みみ',1,'mì mi','Tai'),(45,'むし',1,'mu shi','Côn trùng'),(46,'め',1,'me','Mắt'),(47,'やま',1,'ya ma','Núi'),(48,'ゆき',1,'yu ki','Tuyết'),(49,'よめ',1,'yo me','Cô dâu'),(50,'そら',1,'so ra','Bầu trời'),(51,'のり',1,'no ri','Rong biển'),(52,'はる',1,'ha ru','Mùa xuân'),(53,'れい',1,'ree','Số 0'),(54,'ろく',1,'ro ku','Số 6'),(55,'わに',1,'wa ni','Cá sấu'),(56,'ゆうき',2,'yuu ki','Dũng cảm'),(57,'ええ',2,'e e','Vâng'),(58,'へや',2,'he ya','Căn phòng'),(59,'へいや',2,'hee ya','Đồng bằng'),(60,'とる',2,'to ru','Lấy'),(61,'とおる',2,'too ru','Đi qua'),(62,'ここ',2,'ko ko','Ở đây'),(63,'こうこう',2,'koo koo','Trường THPT'),(64,'ぶっか',2,'buk ka','Mức giá'),(65,'おっと',2,'ot to','Chồng'),(66,'にっき',2,'nik ki','Nhật ký'),(67,'ざっし',2,'zas shi','Tạp chí'),(68,'きって',2,'kit te','Con tem'),(69,'いっぱい',2,'ip pai','Đầy'),(70,'しんぶｎ',2,'shim bun','Báo'),(71,'えんぴつ',2,'em pi tsu','Bút chì'),(72,'うんめい',2,'um mei','Vận mệnh'),(73,'てんき',2,'teng ki','Thời tiết'),(74,'けんがく',2,'keng ga ku','Tham quan học tập'),(75,'うんどう',2,'un dou','Vận động'),(76,'まんてん',2,'man ten','Điểm tối đa'),(77,'カラオケ',3,'karaoke','Karaoke'),(78,'キー',3,'kii','Chìa khóa'),(79,'クラス',3,'ku ra su','Lớp học'),(80,'ケーキ',3,'kee ki','Bánh'),(81,'コーラー',3,'koo raa','Cocacola'),(82,'サイソ',3,'sai so','Ký tên'),(83,'シー',3,'shii','Biển'),(84,'スカート',3,'su kaa to','Váy'),(85,'セーター',3,'see taa','Áo len'),(86,'ソース',3,'soo su','Nước sốt'),(87,'タクシー',3,'ta ku shii','Taxi'),(88,'チーズ',3,'chii zu','Phô mai'),(89,'テスト',3,'te su to','Kiểm tra'),(90,'トピック',3,'to pik ku','Chủ đề'),(91,'どうぞ',3,'doo zo\'','Xin mời'),(92,'おねがいします',3,'o ne gai shi masu','Vui lòng / làm ơn'),(93,'おさきにしつれいします',3,'o sa ki ni shi tsu ree shi masu','Tôi xin phép về trước'),(94,'おつかれさまです',3,'o tsu ka re sa ma desu ','Anh / chị đã vất vả rồi '),(95,'ナイフ',4,'nai fu','Con dao'),(96,'ニー',4,'nii','Đầu gối'),(97,'ヌードル',4,'nuu do ru','Mì'),(98,'ネクタイ',4,'ne ku tai','Cà vạt'),(99,'ノート',4,'noo to','Giấy note'),(100,'ハンカチ',4,'hang ka chi','Khăn tay'),(101,'ヒート',4,'hii to','Nóng'),(102,'フード',4,'fuu do','Đồ ăn'),(103,'ヘアサロン',4,'he a sa ron','Hair salon'),(104,'ホテル',4,'ho te ru ','Khách sạn'),(105,'マスク',4,'ma su ku','Khẩu trang'),(106,'ミント',4,'min to','Bạc hà / lá bạc hà'),(107,'ムード',4,'muu do','Trạng thái cảm xúc'),(108,'メロン',4,'me ron','Dưa lưới'),(109,'モデル',4,'mo de ru','Model / Người mẫu'),(110,'ヤスリ',4,'ya su ri','Dũa - Cái để dũa móng tay'),(111,'ユニーク',4,'yu nii ku','Duy nhất / Unique'),(112,'ヨーグルト',4,'yoo gu ru to','Sữa chua'),(113,'ラジオ',4,'ra ji o','Radio'),(114,'リモコン',4,'ri mo kon','Điều khiển / remote'),(115,'ルビー',4,'ru bii','Ngọc ruby'),(116,'レモン',4,'re mon','Chanh'),(117,'ロッカー',4,'rok kaa','Tủ locker'),(118,'ワイン',4,'wa in','Rượu vang'),(119,'ワンワン',4,'wan wan','Tiếng chó sủa');
/*!40000 ALTER TABLE `vocabulary` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-06-19  0:31:35
