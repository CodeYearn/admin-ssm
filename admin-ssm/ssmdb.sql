/*
 Navicat Premium Data Transfer

 Source Server         : local_mysql
 Source Server Type    : MySQL
 Source Server Version : 80016
 Source Host           : localhost:3306
 Source Schema         : ssmdb

 Target Server Type    : MySQL
 Target Server Version : 80016
 File Encoding         : 65001

 Date: 10/05/2019 21:37:14
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_authority
-- ----------------------------
DROP TABLE IF EXISTS `tb_authority`;
CREATE TABLE `tb_authority`  (
  `authorityID` int(11) NOT NULL AUTO_INCREMENT,
  `authorityName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `authorityURL` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`authorityID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 83 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_authority
-- ----------------------------
INSERT INTO `tb_authority` VALUES (1, '根据userID获取用户', '/user/getUserByUserID');
INSERT INTO `tb_authority` VALUES (2, '获取所有用户', '/user/getAllUser');
INSERT INTO `tb_authority` VALUES (83, '测试用的', '一点用都没有');

-- ----------------------------
-- Table structure for tb_log
-- ----------------------------
DROP TABLE IF EXISTS `tb_log`;
CREATE TABLE `tb_log`  (
  `logID` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ip` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `method` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `visitTime` timestamp(0) NULL DEFAULT NULL,
  `executionTime` bigint(11) NULL DEFAULT NULL,
  PRIMARY KEY (`logID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_log
-- ----------------------------
INSERT INTO `tb_log` VALUES (1, 'CaiYu', '0:0:0:0:0:0:0:1', '/role/getAllRole.do', '[类名 ]com.codeyearn.controller.RoleController[方法名] getAllRole', '2019-05-10 12:53:45', 19688);
INSERT INTO `tb_log` VALUES (2, 'CaiYu', '0:0:0:0:0:0:0:1', '/product/getAllProduct.do', '[类名 ]com.codeyearn.controller.ProductController[方法名] getAllProduct', '2019-05-10 12:54:55', 38);
INSERT INTO `tb_log` VALUES (3, 'CaiYu', '0:0:0:0:0:0:0:1', '/order/getAllProduct.do', '[类名 ]com.codeyearn.controller.OrderController[方法名] getAllProduct', '2019-05-10 12:55:01', 0);
INSERT INTO `tb_log` VALUES (4, 'CaiYu', '0:0:0:0:0:0:0:1', '/product/getAllProduct.do', '[类名 ]com.codeyearn.controller.ProductController[方法名] getAllProduct', '2019-05-10 12:55:20', 26);
INSERT INTO `tb_log` VALUES (5, 'CaiYu', '0:0:0:0:0:0:0:1', '/role/getAllRole.do', '[类名 ]com.codeyearn.controller.RoleController[方法名] getAllRole', '2019-05-10 12:55:23', 49);
INSERT INTO `tb_log` VALUES (6, 'CaiYu', '0:0:0:0:0:0:0:1', '/role/getAllRole.do', '[类名 ]com.codeyearn.controller.RoleController[方法名] getAllRole', '2019-05-10 13:04:09', 70);
INSERT INTO `tb_log` VALUES (7, 'CaiYu', '0:0:0:0:0:0:0:1', '/authority/getAllAuthority.do', '[类名 ]com.codeyearn.controller.AuthorityController[方法名] getAllAuthority', '2019-05-10 13:04:12', 27);
INSERT INTO `tb_log` VALUES (8, 'CaiYu', '0:0:0:0:0:0:0:1', '/authority/getAllAuthority.do', '[类名 ]com.codeyearn.controller.AuthorityController[方法名] getAllAuthority', '2019-05-10 13:04:16', 9);
INSERT INTO `tb_log` VALUES (9, 'CaiYu', '0:0:0:0:0:0:0:1', '/systemLog/getAllLog.do', '[类名 ]com.codeyearn.controller.SystemLogController[方法名] getAllLog', '2019-05-10 13:15:43', 34);
INSERT INTO `tb_log` VALUES (10, 'CaiYu', '0:0:0:0:0:0:0:1', '/systemLog/getAllLog.do', '[类名 ]com.codeyearn.controller.SystemLogController[方法名] getAllLog', '2019-05-10 13:15:57', 17);
INSERT INTO `tb_log` VALUES (11, 'CaiYu', '0:0:0:0:0:0:0:1', '/product/getAllProduct.do', '[类名 ]com.codeyearn.controller.ProductController[方法名] getAllProduct', '2019-05-10 13:16:09', 38);
INSERT INTO `tb_log` VALUES (12, 'CaiYu', '0:0:0:0:0:0:0:1', '/order/getAllProduct.do', '[类名 ]com.codeyearn.controller.OrderController[方法名] getAllProduct', '2019-05-10 13:16:12', 156);
INSERT INTO `tb_log` VALUES (13, 'CaiYu', '0:0:0:0:0:0:0:1', '/order/getAllProduct.do', '[类名 ]com.codeyearn.controller.OrderController[方法名] getAllProduct', '2019-05-10 13:16:14', 18);
INSERT INTO `tb_log` VALUES (14, 'CaiYu', '0:0:0:0:0:0:0:1', '/order/getAllProduct.do', '[类名 ]com.codeyearn.controller.OrderController[方法名] getAllProduct', '2019-05-10 13:16:15', 17);
INSERT INTO `tb_log` VALUES (15, 'CaiYu', '0:0:0:0:0:0:0:1', '/order/getAllProduct.do', '[类名 ]com.codeyearn.controller.OrderController[方法名] getAllProduct', '2019-05-10 13:16:15', 16);

-- ----------------------------
-- Table structure for tb_member
-- ----------------------------
DROP TABLE IF EXISTS `tb_member`;
CREATE TABLE `tb_member`  (
  `memberID` int(11) NOT NULL AUTO_INCREMENT,
  `memberName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `memberNickname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `memberPhone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `memberEmail` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`memberID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_member
-- ----------------------------
INSERT INTO `tb_member` VALUES (1, 'CaiYu', '蔡余', '15344462050', 'javaprogrammer@qq.com');

-- ----------------------------
-- Table structure for tb_order
-- ----------------------------
DROP TABLE IF EXISTS `tb_order`;
CREATE TABLE `tb_order`  (
  `orderID` int(11) NOT NULL AUTO_INCREMENT,
  `orderCreateTime` timestamp(0) NULL DEFAULT NULL,
  `orderPeopleCount` int(255) NULL DEFAULT NULL,
  `orderDescription` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `orderPayType` int(255) NULL DEFAULT NULL,
  `orderStatus` int(255) NULL DEFAULT NULL,
  `productID` int(11) NULL DEFAULT NULL,
  `memberID` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`orderID`) USING BTREE,
  INDEX `order_product`(`productID`) USING BTREE,
  INDEX `order_member`(`memberID`) USING BTREE,
  CONSTRAINT `order_member` FOREIGN KEY (`memberID`) REFERENCES `tb_member` (`memberID`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `order_product` FOREIGN KEY (`productID`) REFERENCES `tb_product` (`productID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 26 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_order
-- ----------------------------
INSERT INTO `tb_order` VALUES (1, '2019-05-07 10:53:22', 3, '人数3个', 1, 1, 1, 1);
INSERT INTO `tb_order` VALUES (2, '2019-05-07 21:18:59', 3, '人数3个', 1, 1, 1, 1);
INSERT INTO `tb_order` VALUES (3, '2019-05-07 21:19:55', 3, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `tb_order` VALUES (4, '2019-05-07 10:53:22', 3, '人数3个', 1, 1, 1, 1);
INSERT INTO `tb_order` VALUES (5, '2019-05-07 10:53:22', 3, '人数3个', 1, 1, 1, 1);
INSERT INTO `tb_order` VALUES (6, '2019-05-07 10:53:22', 3, '人数3个', 1, 1, 1, 1);
INSERT INTO `tb_order` VALUES (7, '2019-05-07 10:53:22', 3, '人数3个', 1, 1, 1, 1);
INSERT INTO `tb_order` VALUES (8, '2019-05-07 10:53:22', 3, '人数3个', 1, 1, 1, 1);
INSERT INTO `tb_order` VALUES (9, '2019-05-07 10:53:22', 3, '人数3个', 1, 1, 1, 1);
INSERT INTO `tb_order` VALUES (10, '2019-05-07 10:53:22', 3, '人数3个', 1, 1, 1, 1);
INSERT INTO `tb_order` VALUES (11, '2019-05-07 10:53:22', 3, '人数3个', 1, 1, 1, 1);
INSERT INTO `tb_order` VALUES (12, '2019-05-07 10:53:22', 3, '人数3个', 1, 1, 1, 1);
INSERT INTO `tb_order` VALUES (13, '2019-05-07 10:53:22', 3, '人数3个', 1, 1, 1, 1);
INSERT INTO `tb_order` VALUES (14, '2019-05-07 10:53:22', 3, '人数3个', 1, 1, 1, 1);
INSERT INTO `tb_order` VALUES (15, '2019-05-07 10:53:22', 3, '人数3个', 1, 1, 1, 1);
INSERT INTO `tb_order` VALUES (16, '2019-05-07 10:53:22', 3, '人数3个', 1, 1, 1, 1);
INSERT INTO `tb_order` VALUES (17, '2019-05-07 10:53:22', 3, '人数3个', 1, 1, 1, 1);
INSERT INTO `tb_order` VALUES (18, '2019-05-07 10:53:22', 3, '人数3个', 1, 1, 1, 1);
INSERT INTO `tb_order` VALUES (19, '2019-05-07 10:53:22', 3, '人数3个', 1, 1, 1, 1);
INSERT INTO `tb_order` VALUES (20, '2019-05-07 10:53:22', 3, '人数3个', 1, 1, 1, 1);
INSERT INTO `tb_order` VALUES (21, '2019-05-07 10:53:22', 3, '人数3个', 1, 1, 1, 1);
INSERT INTO `tb_order` VALUES (22, '2019-05-07 10:53:22', 3, '人数3个', 1, 1, 1, 1);
INSERT INTO `tb_order` VALUES (23, '2019-05-07 10:53:22', 3, '人数3个', 1, 1, 1, 1);
INSERT INTO `tb_order` VALUES (24, '2019-05-07 10:53:22', 3, '人数3个', 1, 1, 1, 1);
INSERT INTO `tb_order` VALUES (25, '2019-05-07 10:53:22', 3, '人数3个', 1, 1, 1, 1);
INSERT INTO `tb_order` VALUES (26, '2019-05-07 10:53:22', 3, '人数3个', 1, 1, 1, 1);

-- ----------------------------
-- Table structure for tb_order_tourist
-- ----------------------------
DROP TABLE IF EXISTS `tb_order_tourist`;
CREATE TABLE `tb_order_tourist`  (
  `orderID` int(11) NOT NULL,
  `touristID` int(11) NULL DEFAULT NULL,
  INDEX `order_tourist_order`(`orderID`) USING BTREE,
  INDEX `order_tourist_tourist`(`touristID`) USING BTREE,
  CONSTRAINT `order_tourist_order` FOREIGN KEY (`orderID`) REFERENCES `tb_order` (`orderID`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `order_tourist_tourist` FOREIGN KEY (`touristID`) REFERENCES `tb_tourist` (`touristID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_order_tourist
-- ----------------------------
INSERT INTO `tb_order_tourist` VALUES (1, 1);
INSERT INTO `tb_order_tourist` VALUES (1, 2);

-- ----------------------------
-- Table structure for tb_product
-- ----------------------------
DROP TABLE IF EXISTS `tb_product`;
CREATE TABLE `tb_product`  (
  `productID` int(11) NOT NULL AUTO_INCREMENT,
  `productName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `city` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `time` timestamp(0) NULL DEFAULT NULL,
  `productPrice` double(10, 2) NULL DEFAULT NULL,
  `productDescription` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `productStatus` int(255) NULL DEFAULT NULL,
  PRIMARY KEY (`productID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_product
-- ----------------------------
INSERT INTO `tb_product` VALUES (1, '魅力永州', '永州', '2019-05-07 10:51:33', 299.00, '永州血鸭', 1);
INSERT INTO `tb_product` VALUES (2, '哈哈', '哈哈哈', NULL, 199.00, '哈哈哈哈', 1);
INSERT INTO `tb_product` VALUES (3, 'retreat', '二问题', '2019-05-07 01:50:00', 111.00, '供奉的是', 0);
INSERT INTO `tb_product` VALUES (4, 'retreat', '二问题', NULL, 11.00, '哦哦哦', 0);
INSERT INTO `tb_product` VALUES (5, 'retreat', '二问题', '2019-05-07 08:58:00', 111.00, 'u语言', 0);
INSERT INTO `tb_product` VALUES (6, 'retreat', '二问题', '2019-05-06 21:25:00', 1111.00, '发士大夫大师傅就', 1);
INSERT INTO `tb_product` VALUES (7, '手动阀阿三的', '啊手动阀', '2019-05-07 10:41:00', 999.00, '发生发射点发射点', 0);
INSERT INTO `tb_product` VALUES (8, '手动阀阿三的', '啊手动阀', '2019-05-07 10:41:00', 1111.00, '啊的撒范德萨', 1);
INSERT INTO `tb_product` VALUES (9, '9', '9', '2019-05-07 10:41:00', 9.00, '9', 1);
INSERT INTO `tb_product` VALUES (10, '10', '10', '2019-05-07 10:42:00', 10.00, '10', 0);
INSERT INTO `tb_product` VALUES (11, '11', '11', '2019-05-07 10:42:00', 11.00, '11', 0);

-- ----------------------------
-- Table structure for tb_role
-- ----------------------------
DROP TABLE IF EXISTS `tb_role`;
CREATE TABLE `tb_role`  (
  `roleID` int(11) NOT NULL AUTO_INCREMENT,
  `roleName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `roleDescription` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`roleID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_role
-- ----------------------------
INSERT INTO `tb_role` VALUES (1, 'ADMIN', '拥有所有权限，谨慎操作！');
INSERT INTO `tb_role` VALUES (3, 'GENERAL', '普通用户');
INSERT INTO `tb_role` VALUES (4, '测试角色', '没一点用');
INSERT INTO `tb_role` VALUES (5, 'VIP', '嘿嘿嘿');
INSERT INTO `tb_role` VALUES (6, 'USER', 'sdjfajsd;fljdsa;fkl');

-- ----------------------------
-- Table structure for tb_role_authority
-- ----------------------------
DROP TABLE IF EXISTS `tb_role_authority`;
CREATE TABLE `tb_role_authority`  (
  `roleID` int(11) NULL DEFAULT NULL,
  `authorityID` int(11) NULL DEFAULT NULL,
  INDEX `role_authority_role`(`roleID`) USING BTREE,
  INDEX `role_authority_authority`(`authorityID`) USING BTREE,
  CONSTRAINT `role_authority_authority` FOREIGN KEY (`authorityID`) REFERENCES `tb_authority` (`authorityID`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `role_authority_role` FOREIGN KEY (`roleID`) REFERENCES `tb_role` (`roleID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_role_authority
-- ----------------------------
INSERT INTO `tb_role_authority` VALUES (1, 1);
INSERT INTO `tb_role_authority` VALUES (1, 2);
INSERT INTO `tb_role_authority` VALUES (3, 1);
INSERT INTO `tb_role_authority` VALUES (3, 2);
INSERT INTO `tb_role_authority` VALUES (1, 83);
INSERT INTO `tb_role_authority` VALUES (3, 83);
INSERT INTO `tb_role_authority` VALUES (4, 83);
INSERT INTO `tb_role_authority` VALUES (5, 83);

-- ----------------------------
-- Table structure for tb_tourist
-- ----------------------------
DROP TABLE IF EXISTS `tb_tourist`;
CREATE TABLE `tb_tourist`  (
  `touristID` int(11) NOT NULL AUTO_INCREMENT,
  `touristName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `touristSex` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `touristPhone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `touristCredentialsType` int(255) NULL DEFAULT NULL,
  `touristCredentialsNumber` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `touristType` int(255) NULL DEFAULT NULL,
  PRIMARY KEY (`touristID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_tourist
-- ----------------------------
INSERT INTO `tb_tourist` VALUES (1, '蔡余', '男', '15344462050', 1, '431122199808163618', 1);
INSERT INTO `tb_tourist` VALUES (2, '小宝', '男', '1', 1, '4', 0);

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user`  (
  `userID` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `userPhone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `userEmail` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `userStatus` int(255) NULL DEFAULT NULL,
  PRIMARY KEY (`userID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES (2, 'XiaoBao', 'XiaoBao', '1', 'c', 0);
INSERT INTO `tb_user` VALUES (3, 'qwe', '$2a$10$3i/4fs3e7u.raTB8huN02e2K.QNVyqj9tFi5cAidrkRHZWt7izPyG', '1', 'qwe@qq.com', 1);
INSERT INTO `tb_user` VALUES (4, 'qqq', '$2a$10$03FF4DZl50xicv43bhq4WeXJW6BVsjjJ8JYoqLAvfOMg724rXK1P6', '1', 'qwe@qq.com', 1);
INSERT INTO `tb_user` VALUES (5, 'www', '$2a$10$8USu/VkTZMJJU5Cz984lteIFnMNvZkzcgOfrsyYHCPtyViEgG4yXW', '1', 'qwe@qq.com', 0);
INSERT INTO `tb_user` VALUES (6, 'eee', '$2a$10$kmW6eL6xQQywsadIzPYJ5Oi6pNewvCANIvHgXuL8ud5OhMUKECXRO', '1', 'qwe@qq.com', 1);
INSERT INTO `tb_user` VALUES (7, 'CaiYu', '$2a$10$e1dNLX.oYM5cDHzrNs63IuGaKwTzJyqqy9HAeeN6I/hPcqqp2Zl7i', '1', 'qwe@qq.com', 1);
INSERT INTO `tb_user` VALUES (8, 'aaa', '$2a$10$eqkJC/J6byWyf67cHQW0N.hdPawK/30bGW4aeSmCzDkHaLoZLJRjG', 'aaaa', 'aaaaaa', 1);

-- ----------------------------
-- Table structure for tb_user_role
-- ----------------------------
DROP TABLE IF EXISTS `tb_user_role`;
CREATE TABLE `tb_user_role`  (
  `userID` int(11) NULL DEFAULT NULL,
  `roleID` int(11) NULL DEFAULT NULL,
  INDEX `user_role_user`(`userID`) USING BTREE,
  INDEX `user_role_role`(`roleID`) USING BTREE,
  CONSTRAINT `user_role_role` FOREIGN KEY (`roleID`) REFERENCES `tb_role` (`roleID`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `user_role_user` FOREIGN KEY (`userID`) REFERENCES `tb_user` (`userID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_user_role
-- ----------------------------
INSERT INTO `tb_user_role` VALUES (3, 1);
INSERT INTO `tb_user_role` VALUES (2, 1);
INSERT INTO `tb_user_role` VALUES (6, 1);
INSERT INTO `tb_user_role` VALUES (5, 1);
INSERT INTO `tb_user_role` VALUES (7, 1);
INSERT INTO `tb_user_role` VALUES (7, 3);
INSERT INTO `tb_user_role` VALUES (3, 3);
INSERT INTO `tb_user_role` VALUES (7, 4);
INSERT INTO `tb_user_role` VALUES (7, 5);
INSERT INTO `tb_user_role` VALUES (4, 1);
INSERT INTO `tb_user_role` VALUES (4, 3);
INSERT INTO `tb_user_role` VALUES (4, 4);
INSERT INTO `tb_user_role` VALUES (4, 5);
INSERT INTO `tb_user_role` VALUES (5, 3);
INSERT INTO `tb_user_role` VALUES (5, 4);
INSERT INTO `tb_user_role` VALUES (5, 5);
INSERT INTO `tb_user_role` VALUES (2, 3);
INSERT INTO `tb_user_role` VALUES (2, 4);
INSERT INTO `tb_user_role` VALUES (2, 5);
INSERT INTO `tb_user_role` VALUES (8, 4);
INSERT INTO `tb_user_role` VALUES (8, 6);

SET FOREIGN_KEY_CHECKS = 1;
