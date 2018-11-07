/*
 Navicat Premium Data Transfer

 Source Server         : lianjia
 Source Server Type    : MySQL
 Source Server Version : 50540
 Source Host           : 115.29.161.170
 Source Database       : ljh5

 Target Server Type    : MySQL
 Target Server Version : 50540
 File Encoding         : utf-8

 Date: 05/16/2018 08:58:15 AM
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `admin`
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `admin_name` varchar(20) NOT NULL,
  `admin_password` varchar(40) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `admin`
-- ----------------------------
BEGIN;
INSERT INTO `admin` VALUES ('1', 'admin', 'f977a8826f3aff0ca45236f48dfce8fb'), ('2', '', 'e'), ('3', '', '33');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
