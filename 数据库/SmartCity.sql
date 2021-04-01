/*
 Navicat MySQL Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50725
 Source Host           : localhost:3306
 Source Schema         : SmartCity

 Target Server Type    : MySQL
 Target Server Version : 50725
 File Encoding         : 65001

 Date: 01/04/2021 16:02:28
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for bus
-- ----------------------------
DROP TABLE IF EXISTS `bus`;
CREATE TABLE `bus` (
  `id` int(11) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `start` varchar(50) DEFAULT NULL,
  `end` varchar(50) DEFAULT NULL,
  `startTime` datetime DEFAULT NULL,
  `endTime` datetime DEFAULT NULL,
  `price` decimal(10,2) DEFAULT NULL,
  `mileage` int(11) DEFAULT NULL,
  `createBy` varchar(50) DEFAULT NULL,
  `createTime` datetime DEFAULT NULL,
  `updateBy` varchar(50) DEFAULT NULL,
  `updateTime` datetime DEFAULT NULL,
  `remark` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for bus_order
-- ----------------------------
DROP TABLE IF EXISTS `bus_order`;
CREATE TABLE `bus_order` (
  `id` int(11) NOT NULL,
  `userId` int(11) DEFAULT NULL,
  `orderNum` varchar(50) DEFAULT NULL,
  `path` varchar(50) DEFAULT NULL,
  `start` varchar(50) DEFAULT NULL,
  `end` varchar(50) DEFAULT NULL,
  `price` decimal(10,2) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `bus_orderToUser` (`userId`),
  CONSTRAINT `bus_orderToUser` FOREIGN KEY (`userId`) REFERENCES `user` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for charge
-- ----------------------------
DROP TABLE IF EXISTS `charge`;
CREATE TABLE `charge` (
  `electrityId` int(11) NOT NULL,
  `userId` int(11) DEFAULT NULL,
  `doorId` int(11) DEFAULT NULL,
  `doorNo` varchar(50) DEFAULT NULL,
  `title` varchar(50) DEFAULT NULL,
  `electricityMoney` decimal(10,0) DEFAULT NULL,
  `chargeUnit` varchar(50) DEFAULT NULL,
  `ownerName` varchar(50) DEFAULT NULL,
  `liveName` varchar(50) DEFAULT NULL,
  `balance` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`electrityId`),
  KEY `chargeToUser` (`userId`),
  CONSTRAINT `chargeToUser` FOREIGN KEY (`userId`) REFERENCES `user` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `deptId` int(11) NOT NULL,
  `orderNum` int(11) DEFAULT NULL,
  `parentId` int(11) DEFAULT NULL,
  `deptName` varchar(50) DEFAULT NULL,
  `leader` varchar(50) DEFAULT NULL,
  `phone` varchar(11) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `createBy` varchar(50) DEFAULT NULL,
  `createTime` datetime DEFAULT NULL,
  `updateBy` varchar(50) DEFAULT NULL,
  `updateTime` datetime DEFAULT NULL,
  `remark` varchar(50) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `delFlag` varchar(50) DEFAULT NULL,
  `ancestor` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`deptId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for first_service
-- ----------------------------
DROP TABLE IF EXISTS `first_service`;
CREATE TABLE `first_service` (
  `dictCode` int(11) NOT NULL,
  `dictLabel` varchar(20) DEFAULT NULL,
  `dictValue` varchar(50) DEFAULT NULL,
  `dictType` varchar(20) DEFAULT NULL,
  `dictSort` int(11) DEFAULT NULL,
  `cssClass` int(11) DEFAULT NULL,
  `listClass` int(11) DEFAULT NULL,
  `isDefault` varchar(20) DEFAULT NULL,
  `default` tinyint(1) DEFAULT NULL,
  `createBy` varchar(50) DEFAULT NULL,
  `createTime` datetime DEFAULT NULL,
  `updateBy` varchar(50) DEFAULT NULL,
  `updateTime` datetime DEFAULT NULL,
  `remark` varchar(50) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `delFlag` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`dictCode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for news
-- ----------------------------
DROP TABLE IF EXISTS `news`;
CREATE TABLE `news` (
  `id` int(11) NOT NULL,
  `userId` int(11) DEFAULT NULL,
  `pressCategory` varchar(10) DEFAULT NULL,
  `title` varchar(50) DEFAULT NULL,
  `content` varchar(1000) DEFAULT NULL,
  `imgUrl` varchar(50) DEFAULT NULL,
  `isRecommend` int(11) DEFAULT NULL,
  `likeNumber` int(11) DEFAULT NULL,
  `viewsNumber` int(11) DEFAULT NULL,
  `createBy` varchar(50) DEFAULT NULL,
  `createTime` datetime DEFAULT NULL,
  `updateBy` varchar(50) DEFAULT NULL,
  `updateTime` datetime DEFAULT NULL,
  `remark` varchar(50) DEFAULT NULL,
  `pressStatus` varchar(255) DEFAULT NULL,
  `delFlag` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `newsToUser` (`userId`),
  CONSTRAINT `newsToUser` FOREIGN KEY (`userId`) REFERENCES `user` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for park
-- ----------------------------
DROP TABLE IF EXISTS `park`;
CREATE TABLE `park` (
  `id` int(11) NOT NULL,
  `parkName` varchar(50) DEFAULT NULL,
  `allPark` int(11) DEFAULT NULL,
  `vacancy` int(11) DEFAULT NULL,
  `priceCaps` decimal(10,0) DEFAULT NULL,
  `imgUrl` varchar(50) DEFAULT NULL,
  `rates` int(11) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `distance` int(11) DEFAULT NULL,
  `createBy` varchar(50) DEFAULT NULL,
  `createTime` datetime DEFAULT NULL,
  `updateBy` varchar(50) DEFAULT NULL,
  `updateTime` datetime DEFAULT NULL,
  `remark` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for park_record
-- ----------------------------
DROP TABLE IF EXISTS `park_record`;
CREATE TABLE `park_record` (
  `id` int(11) NOT NULL,
  `entryTime` datetime DEFAULT NULL,
  `outTime` datetime DEFAULT NULL,
  `plateNumber` int(11) DEFAULT NULL,
  `monetary` varchar(20) DEFAULT NULL,
  `parkName` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for payObject
-- ----------------------------
DROP TABLE IF EXISTS `payObject`;
CREATE TABLE `payObject` (
  `payObjectId` int(11) NOT NULL,
  `userId` int(11) DEFAULT NULL,
  `ownername` varchar(50) DEFAULT NULL,
  `typename` varchar(50) DEFAULT NULL,
  `classifyId` int(11) DEFAULT NULL,
  `livename` varchar(50) DEFAULT NULL,
  `doorNo` varchar(20) DEFAULT NULL,
  `createBy` varchar(50) DEFAULT NULL,
  `createTime` datetime DEFAULT NULL,
  `updateBy` varchar(50) DEFAULT NULL,
  `updateTime` datetime DEFAULT NULL,
  `remark` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`payObjectId`),
  KEY `payObjectToUser` (`userId`),
  CONSTRAINT `payObjectToUser` FOREIGN KEY (`userId`) REFERENCES `user` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for press
-- ----------------------------
DROP TABLE IF EXISTS `press`;
CREATE TABLE `press` (
  `pressed` int(11) NOT NULL,
  `userId` int(11) DEFAULT NULL,
  `content` varchar(1000) DEFAULT NULL,
  `avator` varchar(50) DEFAULT NULL,
  `createBy` varchar(50) DEFAULT NULL,
  `createTime` datetime DEFAULT NULL,
  `updateBy` varchar(50) DEFAULT NULL,
  `updateTime` datetime DEFAULT NULL,
  `remark` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`pressed`),
  KEY `pressToUser` (`userId`),
  CONSTRAINT `pressToUser` FOREIGN KEY (`userId`) REFERENCES `user` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `roleId` int(11) NOT NULL,
  `roleName` varchar(50) DEFAULT NULL,
  `roleKey` varchar(50) DEFAULT NULL,
  `admin` int(11) DEFAULT NULL,
  `roleSort` int(11) DEFAULT NULL,
  `dataScope` int(11) DEFAULT NULL,
  `flag` int(11) DEFAULT NULL,
  `createBy` varchar(50) DEFAULT NULL,
  `createTime` datetime DEFAULT NULL,
  `updateBy` varchar(50) DEFAULT NULL,
  `updateTime` datetime DEFAULT NULL,
  `remark` varchar(50) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `delFlag` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`roleId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for service
-- ----------------------------
DROP TABLE IF EXISTS `service`;
CREATE TABLE `service` (
  `id` int(11) NOT NULL,
  `serviceName` varchar(50) DEFAULT NULL,
  `serviceDesc` varchar(1000) DEFAULT NULL,
  `serviceType` int(11) DEFAULT NULL,
  `imgUrl` varchar(50) DEFAULT NULL,
  `isRecommend` int(255) DEFAULT NULL,
  `link` varchar(50) DEFAULT NULL,
  `createBy` varchar(50) DEFAULT NULL,
  `createTime` datetime DEFAULT NULL,
  `updateBy` varchar(50) DEFAULT NULL,
  `updateTime` datetime DEFAULT NULL,
  `pid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for step
-- ----------------------------
DROP TABLE IF EXISTS `step`;
CREATE TABLE `step` (
  `id` int(11) NOT NULL,
  `linesId` int(11) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `sequence` int(11) DEFAULT NULL,
  `createBy` varchar(50) DEFAULT NULL,
  `createTime` datetime DEFAULT NULL,
  `updateBy` varchar(50) DEFAULT NULL,
  `updateTime` datetime DEFAULT NULL,
  `remark` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for suggestion
-- ----------------------------
DROP TABLE IF EXISTS `suggestion`;
CREATE TABLE `suggestion` (
  `id` int(11) DEFAULT NULL,
  `userId` int(11) DEFAULT NULL,
  `content` varchar(1000) DEFAULT NULL,
  KEY `suggestionToUser` (`userId`),
  CONSTRAINT `suggestionToUser` FOREIGN KEY (`userId`) REFERENCES `user` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userId` int(11) NOT NULL,
  `deptId` int(11) DEFAULT NULL,
  `roleId` int(11) DEFAULT NULL,
  `userName` varchar(50) DEFAULT NULL,
  `nickName` varchar(50) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `phonenumber` int(11) DEFAULT NULL,
  `idCard` varchar(50) DEFAULT NULL,
  `sex` int(11) DEFAULT NULL,
  `file` varchar(50) DEFAULT NULL,
  `avatar` varchar(50) DEFAULT NULL,
  `admin` int(11) DEFAULT NULL,
  `createBy` varchar(50) DEFAULT NULL,
  `createTime` datetime DEFAULT NULL,
  `updateBy` varchar(50) DEFAULT NULL,
  `updateTime` datetime DEFAULT NULL,
  `loginIp` varchar(20) DEFAULT NULL,
  `loginDate` datetime DEFAULT NULL,
  `remark` varchar(100) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `delFlag` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`userId`),
  KEY `UserToDepartment` (`deptId`),
  KEY `UserToRole` (`roleId`),
  CONSTRAINT `UserToDepartment` FOREIGN KEY (`deptId`) REFERENCES `department` (`deptId`),
  CONSTRAINT `UserToRole` FOREIGN KEY (`roleId`) REFERENCES `role` (`roleId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for user_role
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role` (
  `id` int(11) NOT NULL,
  `userid` int(11) DEFAULT NULL,
  `roleid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `user_roleToUser` (`userid`),
  KEY `user_roleToRole` (`roleid`),
  CONSTRAINT `user_roleToRole` FOREIGN KEY (`roleid`) REFERENCES `role` (`roleId`),
  CONSTRAINT `user_roleToUser` FOREIGN KEY (`userid`) REFERENCES `user` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

SET FOREIGN_KEY_CHECKS = 1;
