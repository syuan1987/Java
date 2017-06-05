# Host: 127.0.0.1  (Version 5.5.56)
# Date: 2017-06-04 23:31:16
# Generator: MySQL-Front 6.0  (Build 1.183)


#
# Structure for table "jnshu"
#

DROP TABLE IF EXISTS `jnshu`;
CREATE TABLE `jnshu` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `stu_name` varchar(20) DEFAULT NULL,
  `stu_pwd` varchar(20) DEFAULT NULL,
  `stu_QQ` varchar(20) DEFAULT NULL,
  `course` varchar(20) DEFAULT NULL,
  `stu_date` varchar(20) DEFAULT NULL,
  `school` varchar(20) DEFAULT NULL,
  `stu_ID` bigint(10) DEFAULT NULL,
  `daily_link` varchar(20) DEFAULT '',
  `hope` varchar(20) DEFAULT '',
  `yinjian` varchar(20) DEFAULT NULL,
  `shenhe` varchar(20) DEFAULT NULL,
  `create_at` bigint(20) DEFAULT NULL,
  `update_at` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

#
# Data for table "jnshu"
#

INSERT INTO `jnshu` VALUES (2,'赵三',NULL,'4312543','pm','20170322','北京大学',NULL,NULL,NULL,'高高','邓杰仁',NULL,NULL),(3,'赵四',NULL,'4312546','css','20170323','北京大学',NULL,NULL,NULL,'高高','邓杰仁',NULL,NULL),(4,'赵五',NULL,'431254056','android','20170324','北京大学',NULL,NULL,NULL,'高高','邓杰仁',NULL,NULL),(5,'赵六',NULL,'431254056','ios','20170325','北京大学',NULL,NULL,NULL,'高高','邓杰仁',NULL,NULL),(6,'赵七',NULL,'431254678','java','20170326','北京大学',NULL,NULL,NULL,'高高','邓杰仁',NULL,NULL),(7,'赵八',NULL,'43125467','op','20170327','北京大学',NULL,NULL,NULL,'高高','邓杰仁',NULL,NULL),(8,'赵九',NULL,'431254676','qa','20170328','北京大学',NULL,NULL,NULL,'高高','邓杰仁',NULL,NULL),(9,'赵十',NULL,'4312546486','ui','20170329','北京大学',NULL,NULL,NULL,'高高','邓杰仁',NULL,NULL),(10,'赵十一',NULL,'431222','op','20170330','北京大学',NULL,NULL,NULL,'无','无',NULL,NULL),(11,'赵十一',NULL,'431222','op','20170330','北京大学',NULL,NULL,NULL,'无','无',NULL,NULL),(12,'赵十一',NULL,'431222','op','20170330','北京大学',NULL,NULL,NULL,'无','无',NULL,NULL),(13,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,NULL,1496589006514,NULL),(14,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,NULL,1496589006705,NULL);
