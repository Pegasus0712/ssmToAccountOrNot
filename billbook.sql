/*
Navicat MySQL Data Transfer

Source Server         : mysql5.7
Source Server Version : 50719
Source Host           : localhost:3306
Source Database       : billbook

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2018-03-23 11:12:18
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for bb_bill
-- ----------------------------
DROP TABLE IF EXISTS `bb_bill`;
CREATE TABLE `bb_bill` (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `cost` float(10,2) NOT NULL,
  `content` varchar(255) DEFAULT NULL,
  `userId` int(8) NOT NULL,
  `payId` int(8) DEFAULT NULL,
  `sortId` int(8) NOT NULL,
  `crDate` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `income` tinyint(1) NOT NULL DEFAULT '1',
  `version` int(2) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `fk_bill_user` (`userId`),
  KEY `fk_bill_sort` (`sortId`) USING BTREE,
  KEY `fk_bill_pay` (`payId`),
  CONSTRAINT `fk_bill_pay` FOREIGN KEY (`payId`) REFERENCES `bb_pay` (`id`),
  CONSTRAINT `fk_bill_sort` FOREIGN KEY (`sortId`) REFERENCES `bb_sort` (`id`),
  CONSTRAINT `fk_bill_user` FOREIGN KEY (`userId`) REFERENCES `bb_user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=85 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bb_bill
-- ----------------------------
INSERT INTO `bb_bill` VALUES ('2', '100.00', null, '1', '1', '39', '2017-12-06 20:58:27', '1', '0');
INSERT INTO `bb_bill` VALUES ('4', '100.00', null, '1', '1', '1', '2017-12-05 13:13:23', '0', '0');
INSERT INTO `bb_bill` VALUES ('5', '100.00', null, '1', '1', '2', '2017-12-06 20:48:08', '0', '0');
INSERT INTO `bb_bill` VALUES ('57', '50.00', 'null', '1', '1', '1', '2017-12-05 13:13:26', '0', '0');
INSERT INTO `bb_bill` VALUES ('58', '250.00', 'null', '1', '1', '3', '2017-12-06 20:48:12', '0', '0');
INSERT INTO `bb_bill` VALUES ('59', '200.00', 'null', '1', '1', '1', '2017-12-05 13:13:27', '0', '0');
INSERT INTO `bb_bill` VALUES ('71', '100.00', 'test', '1', '1', '41', '2017-12-06 20:58:38', '1', '0');
INSERT INTO `bb_bill` VALUES ('72', '100.00', 'test', '1', '1', '1', '2017-12-05 13:13:29', '0', '0');
INSERT INTO `bb_bill` VALUES ('73', '100.00', 'test', '1', '1', '1', '2017-12-05 13:13:32', '0', '0');
INSERT INTO `bb_bill` VALUES ('74', '100.00', 'test', '1', '5', '41', '2017-12-06 20:58:41', '1', '0');
INSERT INTO `bb_bill` VALUES ('75', '100.00', 'test', '1', '5', '40', '2017-12-06 20:58:45', '1', '0');
INSERT INTO `bb_bill` VALUES ('76', '555.00', 'test', '1', '3', '2', '2017-12-27 20:58:27', '0', '0');
INSERT INTO `bb_bill` VALUES ('77', '555.00', 'test', '1', '3', '2', '2017-12-27 20:58:27', '0', '0');
INSERT INTO `bb_bill` VALUES ('78', '555.00', 'test', '1', '3', '2', '2017-12-27 20:58:27', '0', '0');
INSERT INTO `bb_bill` VALUES ('79', '1.00', 'test', '1', '3', '2', '2017-12-27 20:58:27', '0', '2');

-- ----------------------------
-- Table structure for bb_pay
-- ----------------------------
DROP TABLE IF EXISTS `bb_pay`;
CREATE TABLE `bb_pay` (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `uid` int(8) DEFAULT NULL,
  `pay_name` varchar(32) DEFAULT NULL,
  `pay_img` varchar(255) DEFAULT NULL,
  `pay_num` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bb_pay
-- ----------------------------
INSERT INTO `bb_pay` VALUES ('1', '0', '??????', 'cash@2x.png', null);
INSERT INTO `bb_pay` VALUES ('2', '0', '?????????', 'account@2x.png', null);
INSERT INTO `bb_pay` VALUES ('3', '0', '??????', 'account@2x.png', null);
INSERT INTO `bb_pay` VALUES ('4', '1', '?????????', 'bank@2x.png', '??????5467');
INSERT INTO `bb_pay` VALUES ('5', '1', '?????????', 'bank@2x.png', '??????4563');

-- ----------------------------
-- Table structure for bb_sort
-- ----------------------------
DROP TABLE IF EXISTS `bb_sort`;
CREATE TABLE `bb_sort` (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `uid` int(8) unsigned zerofill DEFAULT NULL,
  `sort_name` varchar(255) DEFAULT NULL,
  `sort_img` varchar(255) DEFAULT NULL,
  `priority` int(3) DEFAULT NULL,
  `income` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bb_sort
-- ----------------------------
INSERT INTO `bb_sort` VALUES ('1', '00000000', '????????????', 'changhuanfeiyong@2x.png', '0', '0');
INSERT INTO `bb_sort` VALUES ('2', '00000000', '?????????', 'shouxufei@2x.png', null, '0');
INSERT INTO `bb_sort` VALUES ('3', '00000000', '????????????', 'shangchengxiaofei@2x.png', null, '0');
INSERT INTO `bb_sort` VALUES ('4', '00000000', '?????????', 'weiyuejin@2x.png', null, '0');
INSERT INTO `bb_sort` VALUES ('5', '00000000', '??????', 'zhufang@2x.png', null, '0');
INSERT INTO `bb_sort` VALUES ('6', '00000000', '??????', 'bangong@2x.png', null, '0');
INSERT INTO `bb_sort` VALUES ('7', '00000000', '??????', 'canyin@2x.png', null, '0');
INSERT INTO `bb_sort` VALUES ('8', '00000000', '??????', 'yiliao@2x.png', null, '0');
INSERT INTO `bb_sort` VALUES ('9', '00000010', '??????', 'tongxun@2x.png', null, '0');
INSERT INTO `bb_sort` VALUES ('10', '00000000', '??????', 'yundong@2x.png', null, '0');
INSERT INTO `bb_sort` VALUES ('11', '00000000', '??????', 'yule@2x.png', null, '0');
INSERT INTO `bb_sort` VALUES ('12', '00000000', '??????', 'jujia@2x.png', null, '0');
INSERT INTO `bb_sort` VALUES ('13', '00000000', '??????', 'chongwu@2x.png', null, '0');
INSERT INTO `bb_sort` VALUES ('14', '00000000', '??????', 'shuma@2x.png', null, '0');
INSERT INTO `bb_sort` VALUES ('15', '00000000', '??????', 'juanzeng@2x.png', null, '0');
INSERT INTO `bb_sort` VALUES ('16', '00000000', '??????', 'lingshi@2x.png', null, '0');
INSERT INTO `bb_sort` VALUES ('17', '00000000', '??????', 'haizi@2x.png', null, '0');
INSERT INTO `bb_sort` VALUES ('18', '00000000', '??????', 'zhangbei@2x.png', null, '0');
INSERT INTO `bb_sort` VALUES ('19', '00000000', '??????', 'liwu@2x.png', null, '0');
INSERT INTO `bb_sort` VALUES ('20', '00000000', '??????', 'xuexi@2x.png', null, '0');
INSERT INTO `bb_sort` VALUES ('21', '00000000', '??????', 'shuiguo@2x.png', null, '0');
INSERT INTO `bb_sort` VALUES ('22', '00000000', '??????', 'meirong@2x.png', null, '0');
INSERT INTO `bb_sort` VALUES ('23', '00000000', '??????', 'weixiu@2x.png', null, '0');
INSERT INTO `bb_sort` VALUES ('24', '00000000', '??????', 'lvxing@2x.png', null, '0');
INSERT INTO `bb_sort` VALUES ('25', '00000000', '??????', 'jiaotong@2x.png', null, '0');
INSERT INTO `bb_sort` VALUES ('26', '00000000', '??????', 'jiushuiyinliao@2x.png', null, '0');
INSERT INTO `bb_sort` VALUES ('27', '00000000', '??????', 'lijin@2x.png', null, '0');
INSERT INTO `bb_sort` VALUES ('28', '00000001', '??????', 'tianjiade@2x.png', null, '0');
INSERT INTO `bb_sort` VALUES ('29', '00000001', 'xxx', 'tianjiade@2x.png', null, '0');
INSERT INTO `bb_sort` VALUES ('30', '00000001', '??????', 'tianjiade@2x.png', null, '0');
INSERT INTO `bb_sort` VALUES ('31', '00000001', '????????????', 'tianjiade@2x.png', null, '0');
INSERT INTO `bb_sort` VALUES ('32', '00000001', '?????????', 'tianjiade@2x.png', null, '0');
INSERT INTO `bb_sort` VALUES ('33', '00000000', '??????', 'tianjia@2x.png', null, '0');
INSERT INTO `bb_sort` VALUES ('34', '00000000', '??????', 'lijin@2x.png', null, '1');
INSERT INTO `bb_sort` VALUES ('35', '00000000', '??????', 'jiaxi@2x.png', null, '1');
INSERT INTO `bb_sort` VALUES ('36', '00000000', '????????????', 'yongjinjiangli@2x.png', null, '1');
INSERT INTO `bb_sort` VALUES ('37', '00000000', '????????????', 'ewaishouyi@2x.png', null, '1');
INSERT INTO `bb_sort` VALUES ('38', '00000000', '????????????', 'zijinbuchang@2x.png', null, '1');
INSERT INTO `bb_sort` VALUES ('39', '00000000', '??????', 'lixi@2x.png', null, '1');
INSERT INTO `bb_sort` VALUES ('40', '00000000', '??????', 'fanxian@2x.png', null, '1');
INSERT INTO `bb_sort` VALUES ('41', '00000000', '??????', 'jianzhi@2x.png', null, '1');
INSERT INTO `bb_sort` VALUES ('42', '00000001', '??????', 'tianjiade@2x.png', null, '1');
INSERT INTO `bb_sort` VALUES ('43', '00000001', '??????3', 'tianjiade@2x.png', null, '1');
INSERT INTO `bb_sort` VALUES ('44', '00000001', '??????', 'tianjiade@2x.png', null, '1');
INSERT INTO `bb_sort` VALUES ('45', '00000000', '??????', 'tianjia@2x.png', null, '1');

-- ----------------------------
-- Table structure for bb_user
-- ----------------------------
DROP TABLE IF EXISTS `bb_user`;
CREATE TABLE `bb_user` (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `username` varchar(11) NOT NULL,
  `password` varchar(32) NOT NULL,
  `gender` char(1) DEFAULT NULL,
  `phone` varchar(11) DEFAULT NULL,
  `mail` varchar(32) DEFAULT NULL,
  `state` int(1) unsigned zerofill DEFAULT '0',
  `mailcode` varchar(64) DEFAULT NULL,
  `phonecode` varchar(6) DEFAULT NULL,
  `image` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bb_user
-- ----------------------------
INSERT INTO `bb_user` VALUES ('1', 'admin', '3E3E6B0E5C1C68644FC5CE3CF060211D', 'M', '15922646438', '375027533@qq.com', '0', null, null, null);
INSERT INTO `bb_user` VALUES ('7', 'user02', 'C1898DE4A655382952DC4A93688E211D', null, null, '375027533@qq.com', '1', 'ecbd72af2fc24585926627ec71354684c11da4bacde64b9796568ecdd99e79bc', null, null);
