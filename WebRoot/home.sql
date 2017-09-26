/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50067
Source Host           : localhost:3306
Source Database       : home

Target Server Type    : MYSQL
Target Server Version : 50067
File Encoding         : 65001

Date: 2017-06-15 09:28:27
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `ad`
-- ----------------------------
DROP TABLE IF EXISTS `ad`;
CREATE TABLE `ad` (
  `id` int(11) NOT NULL,
  `title` varchar(255) character set utf8 default NULL,
  `content` varchar(255) character set utf8 default NULL,
  `img` varchar(255) character set utf8 default NULL,
  `url` varchar(255) character set utf8 default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of ad
-- ----------------------------
INSERT INTO `ad` VALUES ('1', '超好玩的游戏1', '开局一条狗，装备全靠捡，赶快行动吧', '/upload/img/2017-05-08/30101554533102.PNG', 'http://ai.taobao.com/');
INSERT INTO `ad` VALUES ('2', '超好玩的游戏2', '开局一条狗，装备全靠捡,666666', '/upload/img/2017-05-15/36092043228571.PNG', 'https://github.com/luqinmao');
INSERT INTO `ad` VALUES ('3', '超好玩的游戏3', '开局一条狗，装备全靠捡，3333', '/upload/img/2017-05-08/30101554533102.PNG', 'http://ai.taobao.com/');
INSERT INTO `ad` VALUES ('4', '超好玩的游戏4', '开局一条狗，装备全靠捡44444', '/upload/img/2017-05-08/30101554533102.PNG', 'http://ai.taobao.com/');
INSERT INTO `ad` VALUES ('5', '超好玩的游戏5', '开局一条狗，装备全靠捡5555', '/upload/img/2017-05-08/30101554533102.PNG', 'http://ai.taobao.com/');

-- ----------------------------
-- Table structure for `comment`
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment` (
  `id` int(11) NOT NULL auto_increment,
  `postid` int(11) default NULL,
  `useraccount` varchar(255) default NULL,
  `userid` int(11) default NULL,
  `username` varchar(255) default NULL,
  `userphoto` varchar(255) default NULL,
  `content` varchar(1000) default NULL,
  `content_img` varchar(255) default NULL,
  `floor` int(11) default NULL,
  `create_time` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=221 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of comment
-- ----------------------------
INSERT INTO `comment` VALUES ('155', '90', 'lqm', '18', '卢勤毛', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zNzA2MjQ5MjlfMTQ5Mjc1MTI3NjM3Ml85Zjk5OTIyMC0xN2IwLTQxYTItOGI1Ni1kOWUyYTk1NWRhNzQ=', 'ft', null, '12', '2017-04-28 15:01:32');
INSERT INTO `comment` VALUES ('156', '87', 'qqq', '3', '大王哈', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zNzA2MjQ5MjlfMTQ5Mjc1MTI3NjM3Ml9kMGQ2NGM4OS0xNTU2LTQzNDYtYmVmOC01MTUxY2IzZTc0MzM=', '', '[{\"id\":1,\"path\":\"/upload/img/2017-04-24/23326155086684.png\"}]', '2', '2017-04-28 15:24:34');
INSERT INTO `comment` VALUES ('157', '91', 'ppp', '20', '噢噢', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zNzA2MjQ5MjlfMTQ5MzI3NzY5OTQ5NF8yNjM3MjU0Ny03OWZkLTQxZjEtOGYwNC02YWMwNjcwNWQ3OTY=', '吧', null, '1', '2017-04-28 15:31:37');
INSERT INTO `comment` VALUES ('158', '1', 'ppp', '20', '噢噢', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zNzA2MjQ5MjlfMTQ5MzI3NzY5OTQ5NF8yNjM3MjU0Ny03OWZkLTQxZjEtOGYwNC02YWMwNjcwNWQ3OTY=', '', null, '31', '2017-04-28 17:55:57');
INSERT INTO `comment` VALUES ('159', '85', 'ppp', '20', '噢噢东', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zNzA2MjQ5MjlfMTQ5MzI3NzY5OTQ5NF8yNjM3MjU0Ny03OWZkLTQxZjEtOGYwNC02YWMwNjcwNWQ3OTY=', '', null, '4', '2017-05-01 10:58:08');
INSERT INTO `comment` VALUES ('160', '94', 'ppp', '20', '噢噢东', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zNzA2MjQ5MjlfMTQ5MzI3NzY5OTQ5NF8yNjM3MjU0Ny03OWZkLTQxZjEtOGYwNC02YWMwNjcwNWQ3OTY=', '是是是', null, '1', '2017-05-02 17:33:38');
INSERT INTO `comment` VALUES ('161', '94', 'ooo', '22', '我是ooo', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zOTA1NjEyNzlfMTQ5MzcxNzI5NzYwMl82YWQxN2EzMi1jNWZkLTQ4NDEtODViMS00OWQ4MTExNmJiMWU=', '', null, '2', '2017-05-02 17:33:43');
INSERT INTO `comment` VALUES ('162', '94', 'ooo', '22', '我是ooo', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zOTA1NjEyNzlfMTQ5MzcxNzI5NzYwMl82YWQxN2EzMi1jNWZkLTQ4NDEtODViMS00OWQ4MTExNmJiMWU=', '', null, '3', '2017-05-02 17:34:04');
INSERT INTO `comment` VALUES ('163', '94', 'ppp', '20', '噢噢东', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zNzA2MjQ5MjlfMTQ5MzI3NzY5OTQ5NF8yNjM3MjU0Ny03OWZkLTQxZjEtOGYwNC02YWMwNjcwNWQ3OTY=', '', null, '4', '2017-05-02 17:34:09');
INSERT INTO `comment` VALUES ('164', '94', 'ppp', '20', '噢噢东', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zNzA2MjQ5MjlfMTQ5MzI3NzY5OTQ5NF8yNjM3MjU0Ny03OWZkLTQxZjEtOGYwNC02YWMwNjcwNWQ3OTY=', '', null, '5', '2017-05-02 18:06:06');
INSERT INTO `comment` VALUES ('165', '94', 'ppp', '20', '噢噢东', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zNzA2MjQ5MjlfMTQ5MzI3NzY5OTQ5NF8yNjM3MjU0Ny03OWZkLTQxZjEtOGYwNC02YWMwNjcwNWQ3OTY=', '', null, '6', '2017-05-02 18:12:02');
INSERT INTO `comment` VALUES ('166', '94', 'ppp', '20', '噢噢东', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zNzA2MjQ5MjlfMTQ5MzI3NzY5OTQ5NF8yNjM3MjU0Ny03OWZkLTQxZjEtOGYwNC02YWMwNjcwNWQ3OTY=', '', null, '7', '2017-05-02 18:12:50');
INSERT INTO `comment` VALUES ('167', '94', 'lqm', '18', '卢勤毛', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zNzA2MjQ5MjlfMTQ5Mjc1MTI3NjM3Ml85Zjk5OTIyMC0xN2IwLTQxYTItOGI1Ni1kOWUyYTk1NWRhNzQ=', '', null, '8', '2017-05-03 10:15:17');
INSERT INTO `comment` VALUES ('168', '94', 'lqm', '18', '卢勤毛', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zNzA2MjQ5MjlfMTQ5Mjc1MTI3NjM3Ml85Zjk5OTIyMC0xN2IwLTQxYTItOGI1Ni1kOWUyYTk1NWRhNzQ=', '', null, '9', '2017-05-03 10:15:32');
INSERT INTO `comment` VALUES ('169', '94', 'lqm', '18', '卢勤毛', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zNzA2MjQ5MjlfMTQ5Mjc1MTI3NjM3Ml85Zjk5OTIyMC0xN2IwLTQxYTItOGI1Ni1kOWUyYTk1NWRhNzQ=', '', null, '10', '2017-05-03 10:15:38');
INSERT INTO `comment` VALUES ('170', '94', 'lqm', '18', '卢勤毛', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zNzA2MjQ5MjlfMTQ5Mjc1MTI3NjM3Ml85Zjk5OTIyMC0xN2IwLTQxYTItOGI1Ni1kOWUyYTk1NWRhNzQ=', 'sss', null, '11', '2017-05-03 10:15:45');
INSERT INTO `comment` VALUES ('171', '94', 'lqm', '18', '卢勤毛', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zNzA2MjQ5MjlfMTQ5Mjc1MTI3NjM3Ml85Zjk5OTIyMC0xN2IwLTQxYTItOGI1Ni1kOWUyYTk1NWRhNzQ=', '', null, '12', '2017-05-03 10:15:48');
INSERT INTO `comment` VALUES ('172', '93', 'lqm', '18', '卢勤毛', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zNzA2MjQ5MjlfMTQ5Mjc1MTI3NjM3Ml85Zjk5OTIyMC0xN2IwLTQxYTItOGI1Ni1kOWUyYTk1NWRhNzQ=', '', null, '1', '2017-05-03 10:17:03');
INSERT INTO `comment` VALUES ('173', '95', 'kkk', '21', '安卓机辣鸡', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zODM0MTUwNTRfMTQ5MzcxNzQxNTQ0MF85YTg0MWMzZC03NmExLTRiYWUtYjE2NC1lY2ViMDY3NTgzMDg=', '是是是', null, '1', '2017-05-03 10:50:53');
INSERT INTO `comment` VALUES ('174', '95', 'kkk', '21', '安卓机辣鸡', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zODM0MTUwNTRfMTQ5MzcxNzQxNTQ0MF85YTg0MWMzZC03NmExLTRiYWUtYjE2NC1lY2ViMDY3NTgzMDg=', '', null, '2', '2017-05-03 10:50:58');
INSERT INTO `comment` VALUES ('175', '95', 'kkk', '21', '安卓机辣鸡', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zODM0MTUwNTRfMTQ5MzcxNzQxNTQ0MF85YTg0MWMzZC03NmExLTRiYWUtYjE2NC1lY2ViMDY3NTgzMDg=', '', null, '3', '2017-05-03 10:51:06');
INSERT INTO `comment` VALUES ('176', '94', 'kkk', '21', '安卓机辣鸡', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zODM0MTUwNTRfMTQ5MzcxNzQxNTQ0MF85YTg0MWMzZC03NmExLTRiYWUtYjE2NC1lY2ViMDY3NTgzMDg=', '', null, '13', '2017-05-03 10:51:13');
INSERT INTO `comment` VALUES ('177', '95', 'kkk', '21', '安卓机辣鸡', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zODM0MTUwNTRfMTQ5MzcxNzQxNTQ0MF85YTg0MWMzZC03NmExLTRiYWUtYjE2NC1lY2ViMDY3NTgzMDg=', '', null, '4', '2017-05-03 10:51:29');
INSERT INTO `comment` VALUES ('178', '93', 'kkk', '21', '安卓机辣鸡', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zODM0MTUwNTRfMTQ5MzcxNzQxNTQ0MF85YTg0MWMzZC03NmExLTRiYWUtYjE2NC1lY2ViMDY3NTgzMDg=', '', null, '2', '2017-05-03 10:52:24');
INSERT INTO `comment` VALUES ('179', '95', 'kkk', '21', '安卓机辣鸡', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zODM0MTUwNTRfMTQ5MzcxNzQxNTQ0MF85YTg0MWMzZC03NmExLTRiYWUtYjE2NC1lY2ViMDY3NTgzMDg=', '', null, '5', '2017-05-03 10:52:58');
INSERT INTO `comment` VALUES ('180', '94', 'kkk', '21', '安卓机辣鸡', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zODM0MTUwNTRfMTQ5MzcxNzQxNTQ0MF85YTg0MWMzZC03NmExLTRiYWUtYjE2NC1lY2ViMDY3NTgzMDg=', '', null, '14', '2017-05-03 10:55:34');
INSERT INTO `comment` VALUES ('181', '93', 'kkk', '21', '安卓机辣鸡', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zODM0MTUwNTRfMTQ5MzcxNzQxNTQ0MF85YTg0MWMzZC03NmExLTRiYWUtYjE2NC1lY2ViMDY3NTgzMDg=', '', null, '3', '2017-05-03 10:55:40');
INSERT INTO `comment` VALUES ('182', '95', 'kkk', '21', '安卓机辣鸡', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zODM0MTUwNTRfMTQ5MzcxNzQxNTQ0MF85YTg0MWMzZC03NmExLTRiYWUtYjE2NC1lY2ViMDY3NTgzMDg=', '', null, '6', '2017-05-03 11:05:02');
INSERT INTO `comment` VALUES ('183', '95', 'kkk', '21', '安卓机辣鸡', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zODM0MTUwNTRfMTQ5MzcxNzQxNTQ0MF85YTg0MWMzZC03NmExLTRiYWUtYjE2NC1lY2ViMDY3NTgzMDg=', '', null, '7', '2017-05-03 11:05:27');
INSERT INTO `comment` VALUES ('184', '95', 'kkk', '21', '安卓机辣鸡', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zODM0MTUwNTRfMTQ5MzcxNzQxNTQ0MF85YTg0MWMzZC03NmExLTRiYWUtYjE2NC1lY2ViMDY3NTgzMDg=', '', null, '8', '2017-05-03 11:05:34');
INSERT INTO `comment` VALUES ('185', '95', 'kkk', '21', '安卓机辣鸡', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zODM0MTUwNTRfMTQ5MzcxNzQxNTQ0MF85YTg0MWMzZC03NmExLTRiYWUtYjE2NC1lY2ViMDY3NTgzMDg=', '', null, '9', '2017-05-03 11:07:50');
INSERT INTO `comment` VALUES ('186', '87', 'kkk', '21', '安卓机辣鸡', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zODM0MTUwNTRfMTQ5MzcxNzQxNTQ0MF85YTg0MWMzZC03NmExLTRiYWUtYjE2NC1lY2ViMDY3NTgzMDg=', '', null, '3', '2017-05-03 11:10:36');
INSERT INTO `comment` VALUES ('187', '87', 'kkk', '21', '安卓机辣鸡', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zODM0MTUwNTRfMTQ5MzcxNzQxNTQ0MF85YTg0MWMzZC03NmExLTRiYWUtYjE2NC1lY2ViMDY3NTgzMDg=', '', null, '4', '2017-05-03 11:11:01');
INSERT INTO `comment` VALUES ('188', '82', 'kkk', '21', '安卓机辣鸡', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zODM0MTUwNTRfMTQ5MzcxNzQxNTQ0MF85YTg0MWMzZC03NmExLTRiYWUtYjE2NC1lY2ViMDY3NTgzMDg=', 'hh', null, '2', '2017-05-03 11:15:13');
INSERT INTO `comment` VALUES ('189', '82', 'kkk', '21', '安卓机辣鸡', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zODM0MTUwNTRfMTQ5MzcxNzQxNTQ0MF85YTg0MWMzZC03NmExLTRiYWUtYjE2NC1lY2ViMDY3NTgzMDg=', 'sssss', null, '3', '2017-05-03 11:15:20');
INSERT INTO `comment` VALUES ('190', '97', 'ooo', '22', '我是ooo', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zOTA1NjEyNzlfMTQ5MzcxNzI5NzYwMl82YWQxN2EzMi1jNWZkLTQ4NDEtODViMS00OWQ4MTExNmJiMWU=', '123456是是是是多所', null, '1', '2017-05-03 19:34:40');
INSERT INTO `comment` VALUES ('191', '97', 'ooo', '22', '我是ooo', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zOTA1NjEyNzlfMTQ5MzcxNzI5NzYwMl82YWQxN2EzMi1jNWZkLTQ4NDEtODViMS00OWQ4MTExNmJiMWU=', '速度速度速度', null, '2', '2017-05-03 19:34:53');
INSERT INTO `comment` VALUES ('192', '95', 'ppp', '20', '噢噢东', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zNzA2MjQ5MjlfMTQ5MzI3NzY5OTQ5NF8yNjM3MjU0Ny03OWZkLTQxZjEtOGYwNC02YWMwNjcwNWQ3OTY=', '我走路了', null, '10', '2017-05-15 21:24:12');
INSERT INTO `comment` VALUES ('193', '95', 'ppp', '20', '噢噢东', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zNzA2MjQ5MjlfMTQ5MzI3NzY5OTQ5NF8yNjM3MjU0Ny03OWZkLTQxZjEtOGYwNC02YWMwNjcwNWQ3OTY=', '我', '[{\"id\":1,\"path\":\"/upload/img/2017-05-15/3553284197877.jpg\"}]', '11', '2017-05-15 21:24:28');
INSERT INTO `comment` VALUES ('194', '71', 'ppp', '20', '噢噢东', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zNzA2MjQ5MjlfMTQ5MzI3NzY5OTQ5NF8yNjM3MjU0Ny03OWZkLTQxZjEtOGYwNC02YWMwNjcwNWQ3OTY=', '不错嘛', null, '1', '2017-05-17 19:03:18');
INSERT INTO `comment` VALUES ('195', '99', 'ppp', '20', '噢噢东', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zODM0MTUwNTRfMTQ5MzcxNzQxNTQ0MF8yMTc3ZjYxZS02OGQ2LTQzZWYtOGE4ZS03MzU2YmM5YTk5MGM=', 'ss', '[{\"id\":1,\"path\":\"/upload/img/2017-05-15/37511586541619.PNG\"},{\"id\":2,\"path\":\"/upload/img/2017-05-15/37511784569277.png\"},{\"id\":3,\"path\":\"/upload/img/2017-05-15/37511786596727.PNG\"}]', '1', '2017-05-17 19:30:57');
INSERT INTO `comment` VALUES ('196', '101', 'ppp', '20', '噢噢东', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zNzA2MjQ5MjlfMTQ5MzI3NzY5OTQ5M185NzA0ZGI2OS02YWYyLTQ5M2YtOTc1Ny1hOTk5N2U5OGUwNzM=', 'fff', '[{\"id\":1,\"path\":\"/upload/img/2017-05-15/3041638882265.jpg\"}]', '1', '2017-05-20 09:56:08');
INSERT INTO `comment` VALUES ('197', '101', 'ppp', '20', '噢噢东', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zNzA2MjQ5MjlfMTQ5MzI3NzY5OTQ5M185NzA0ZGI2OS02YWYyLTQ5M2YtOTc1Ny1hOTk5N2U5OGUwNzM=', 'uuu', '[{\"id\":1,\"path\":\"/upload/img/2017-05-15/3253234416350.png\"}]', '2', '2017-05-20 09:59:40');
INSERT INTO `comment` VALUES ('198', '101', 'ppp', '20', '噢噢东', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zNzA2MjQ5MjlfMTQ5MzI3NzY5OTQ5M185NzA0ZGI2OS02YWYyLTQ5M2YtOTc1Ny1hOTk5N2U5OGUwNzM=', 'bb', '[{\"id\":1,\"path\":\"/upload/img/2017-05-15/3381636805472.jpg\"}]', '3', '2017-05-20 10:01:48');
INSERT INTO `comment` VALUES ('199', '101', 'ppp', '20', '噢噢东', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zNzA2MjQ5MjlfMTQ5MzI3NzY5OTQ5M185NzA0ZGI2OS02YWYyLTQ5M2YtOTc1Ny1hOTk5N2U5OGUwNzM=', 'dsd', '[{\"id\":1,\"path\":\"/upload/img/2017-05-15/24890728675857.jpg\"}]', '4', '2017-05-20 16:00:17');
INSERT INTO `comment` VALUES ('200', '101', 'ppp', '20', '噢噢东', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zNzA2MjQ5MjlfMTQ5MzI3NzY5OTQ5M185NzA0ZGI2OS02YWYyLTQ5M2YtOTc1Ny1hOTk5N2U5OGUwNzM=', 'yh', '[{\"id\":1,\"path\":\"/upload/img/2017-05-15/25153224439767.jpg\"}]', '5', '2017-05-20 16:04:40');
INSERT INTO `comment` VALUES ('201', '101', 'ppp', '20', '噢噢东', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zNzA2MjQ5MjlfMTQ5MzI3NzY5OTQ5M185NzA0ZGI2OS02YWYyLTQ5M2YtOTc1Ny1hOTk5N2U5OGUwNzM=', 'ss', '[{\"id\":1,\"path\":\"/upload/img/2017-05-15/25436941667008.jpg\"}]', '6', '2017-05-20 16:09:24');
INSERT INTO `comment` VALUES ('202', '101', 'ppp', '20', '噢噢东', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zNzA2MjQ5MjlfMTQ5MzI3NzY5OTQ5M185NzA0ZGI2OS02YWYyLTQ5M2YtOTc1Ny1hOTk5N2U5OGUwNzM=', 'hh', null, '7', '2017-05-20 16:09:54');
INSERT INTO `comment` VALUES ('203', '101', 'ppp', '20', '噢噢东', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zNzA2MjQ5MjlfMTQ5MzI3NzY5OTQ5M185NzA0ZGI2OS02YWYyLTQ5M2YtOTc1Ny1hOTk5N2U5OGUwNzM=', 'hh', '[{\"id\":1,\"path\":\"/upload/img/2017-05-15/25760607669964.jpeg\"}]', '8', '2017-05-20 16:14:47');
INSERT INTO `comment` VALUES ('204', '101', 'ppp', '20', '噢噢东', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zNzA2MjQ5MjlfMTQ5MzI3NzY5OTQ5M185NzA0ZGI2OS02YWYyLTQ5M2YtOTc1Ny1hOTk5N2U5OGUwNzM=', 'hh', '[{\"id\":1,\"path\":\"/upload/img/2017-05-15/25789018924046.jpeg\"}]', '9', '2017-05-20 16:15:16');
INSERT INTO `comment` VALUES ('205', '97', 'ppp', '20', '噢噢东', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zNzA2MjQ5MjlfMTQ5MzI3NzY5OTQ5M185NzA0ZGI2OS02YWYyLTQ5M2YtOTc1Ny1hOTk5N2U5OGUwNzM=', 'dd', '[{\"id\":1,\"path\":\"/upload/img/2017-05-15/26144842140790.gif\"}]', '3', '2017-05-20 16:21:11');
INSERT INTO `comment` VALUES ('206', '97', 'ppp', '20', '噢噢东', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zNzA2MjQ5MjlfMTQ5MzI3NzY5OTQ5M185NzA0ZGI2OS02YWYyLTQ5M2YtOTc1Ny1hOTk5N2U5OGUwNzM=', 'bbvvvvvcjjnvjvjcj了了咯了咯了瞳孔婆婆吼吼吼头目欧诺婆婆头目欧诺婆婆婆评论破手机', null, '4', '2017-05-20 17:48:29');
INSERT INTO `comment` VALUES ('207', '96', 'ppp', '20', '噢噢东', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zNzA2MjQ5MjlfMTQ5MzI3NzY5OTQ5M185NzA0ZGI2OS02YWYyLTQ5M2YtOTc1Ny1hOTk5N2U5OGUwNzM=', '具体', null, '1', '2017-05-20 17:49:51');
INSERT INTO `comment` VALUES ('208', '86', 'lqm', '18', '卢勤毛', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zODM0MTUwNTRfMTQ5MzcxNzQxNTQ0MF8yMmU2MzEzZi1iNjQ2LTRhMDQtOTZiZS1iMmM1NjA1ZDRmNTY=', 'sss', '[{\"id\":1,\"path\":\"/upload/img/2017-05-22/18919378937183.PNG\"}]', '3', '2017-05-21 14:14:25');
INSERT INTO `comment` VALUES ('209', '93', 'ppp', '20', '噢噢东', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zNzA2MjQ5MjlfMTQ5MzI3NzY5OTQ5M185NzA0ZGI2OS02YWYyLTQ5M2YtOTc1Ny1hOTk5N2U5OGUwNzM=', 'jjd', '[{\"id\":1,\"path\":\"/upload/img/2017-05-22/27416001539918.jpg\"}]', '4', '2017-05-21 16:36:02');
INSERT INTO `comment` VALUES ('210', '97', 'ppp', '20', '噢噢东', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zNzA2MjQ5MjlfMTQ5MzI3NzY5OTQ5M185NzA0ZGI2OS02YWYyLTQ5M2YtOTc1Ny1hOTk5N2U5OGUwNzM=', 'w', '[{\"id\":1,\"path\":\"/upload/img/2017-05-22/27943321641242.gif\"}]', '5', '2017-05-21 16:44:49');
INSERT INTO `comment` VALUES ('211', '101', 'ppp', '20', '噢噢东', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zODM0MTUwNTRfMTQ5NTM1NjQxNDY2N183MTcxNGY3Ny05ODU0LTQ5NjEtYThlMy02NzdkNGY2NzdlYjg=', 'kk', '[{\"id\":1,\"path\":\"/upload/img/2017-05-22/32029298923399.jpg\"}]', '10', '2017-05-21 17:52:55');
INSERT INTO `comment` VALUES ('212', '98', 'ppp', '20', '噢噢东', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zODM0MTUwNTRfMTQ5NTM1NjQxNDY2N183MTcxNGY3Ny05ODU0LTQ5NjEtYThlMy02NzdkNGY2NzdlYjg=', '是是是', null, '1', '2017-05-25 23:11:14');
INSERT INTO `comment` VALUES ('213', '101', 'ppp', '20', '噢噢东', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zODM0MTUwNTRfMTQ5NTM1NjQxNDY2N183MTcxNGY3Ny05ODU0LTQ5NjEtYThlMy02NzdkNGY2NzdlYjg=', 'nnnn', null, '11', '2017-05-27 16:28:02');
INSERT INTO `comment` VALUES ('214', '101', 'ppp', '20', '噢噢东', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zODM0MTUwNTRfMTQ5NTM1NjQxNDY2N183MTcxNGY3Ny05ODU0LTQ5NjEtYThlMy02NzdkNGY2NzdlYjg=', 'jjjj', '[{\"id\":1,\"path\":\"/upload/img/2017-05-22/27108293684701.jpg\"}]', '12', '2017-05-27 16:28:12');
INSERT INTO `comment` VALUES ('215', '71', 'ooo', '22', '我是ooo', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zNzA2MjQ5MjlfMTQ5MzI3NzY5OTQ5M18xNDMzMWMwMC1mMzAxLTRhZGItOGNiYS1hZDZlZDBlNWJjODE=', '弄', null, '2', '2017-05-27 19:24:55');
INSERT INTO `comment` VALUES ('216', '104', 'ppp', '20', '噢噢东', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zODM0MTUwNTRfMTQ5NTM1NjQxNDY2N183MTcxNGY3Ny05ODU0LTQ5NjEtYThlMy02NzdkNGY2NzdlYjg=', '啦啦啦', null, '1', '2017-06-09 18:30:41');
INSERT INTO `comment` VALUES ('217', '104', 'ppp', '20', '噢噢东', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zODM0MTUwNTRfMTQ5NTM1NjQxNDY2N183MTcxNGY3Ny05ODU0LTQ5NjEtYThlMy02NzdkNGY2NzdlYjg=', '额额额', null, '2', '2017-06-09 18:30:45');
INSERT INTO `comment` VALUES ('218', '104', 'ppp', '20', '噢噢东', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zODM0MTUwNTRfMTQ5NTM1NjQxNDY2N183MTcxNGY3Ny05ODU0LTQ5NjEtYThlMy02NzdkNGY2NzdlYjg=', '啦啦啦', null, '3', '2017-06-09 18:31:40');
INSERT INTO `comment` VALUES ('219', '103', 'ppp', '20', '噢噢东', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zODM0MTUwNTRfMTQ5NTM1NjQxNDY2N183MTcxNGY3Ny05ODU0LTQ5NjEtYThlMy02NzdkNGY2NzdlYjg=', '噢噢', '[{\"id\":1,\"path\":\"/upload/img/2017-06-05/26469524836861.png\"}]', '1', '2017-06-09 18:33:23');
INSERT INTO `comment` VALUES ('220', '104', 'ppp', '20', '噢噢东', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zODM0MTUwNTRfMTQ5NTM1NjQxNDY2N183MTcxNGY3Ny05ODU0LTQ5NjEtYThlMy02NzdkNGY2NzdlYjg=', '噢噢', null, '4', '2017-06-09 20:39:39');

-- ----------------------------
-- Table structure for `feedback`
-- ----------------------------
DROP TABLE IF EXISTS `feedback`;
CREATE TABLE `feedback` (
  `id` int(11) unsigned zerofill NOT NULL auto_increment,
  `content` varchar(255) character set utf8 default '',
  `userid` int(11) default NULL,
  `username` varchar(255) character set utf8 default NULL,
  `user_contact` varchar(255) character set utf8 default NULL,
  `create_time` varchar(255) character set utf8 default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of feedback
-- ----------------------------
INSERT INTO `feedback` VALUES ('00000000001', 'asdasd', '1', 'qqq', '1002438809', '2016-01-06 02:37:00');
INSERT INTO `feedback` VALUES ('00000000002', 'hhhhhh', '1', 'ppp', '13927900786', '2017-04-28 16:39:47');
INSERT INTO `feedback` VALUES ('00000000003', 'nnnq', '1', 'ppp', '123', '2017-04-28 17:00:42');
INSERT INTO `feedback` VALUES ('00000000004', 'jdkdjdjdbdbd', '1', 'ppp', '123', '2017-04-28 17:01:14');
INSERT INTO `feedback` VALUES ('00000000005', 'gvvcc哦空间', '1', 'ppp', '5555', '2017-04-28 17:06:20');
INSERT INTO `feedback` VALUES ('00000000006', '同一张图', '1', 'ppp', '123456', '2017-04-28 17:11:36');
INSERT INTO `feedback` VALUES ('00000000007', 'hhh', '1', 'ppp', 'bbv', '2017-04-28 17:15:14');
INSERT INTO `feedback` VALUES ('00000000008', 'ggg', '1', 'ppp', 'ggg', '2017-04-28 17:16:43');
INSERT INTO `feedback` VALUES ('00000000009', '钢甲卡卡龙', '1', 'ppp', '164849464', '2017-05-15 21:20:12');

-- ----------------------------
-- Table structure for `friend`
-- ----------------------------
DROP TABLE IF EXISTS `friend`;
CREATE TABLE `friend` (
  `id` int(11) NOT NULL,
  `ownid` int(11) NOT NULL COMMENT '自己的id',
  `friendid` int(11) NOT NULL COMMENT '好友的id',
  `create_time` varchar(255) NOT NULL,
  `update_time` varchar(255) default NULL,
  `state` int(11) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of friend
-- ----------------------------
INSERT INTO `friend` VALUES ('1', '2', '3', '2017-01-10 21:33:54', '2017-01-10 21:33:54', '1');
INSERT INTO `friend` VALUES ('2', '2', '5', '2017-01-10 21:33:54', '2017-01-10 21:33:54', '1');

-- ----------------------------
-- Table structure for `new`
-- ----------------------------
DROP TABLE IF EXISTS `new`;
CREATE TABLE `new` (
  `id` int(11) NOT NULL,
  `title` varchar(255) default NULL,
  `content` varchar(255) default NULL,
  `post_time` varchar(255) default NULL,
  `from` varchar(255) default NULL,
  `url` varchar(255) default NULL,
  `category` varchar(255) default NULL COMMENT '类别',
  `content_img` varchar(255) default NULL,
  `create_time` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of new
-- ----------------------------

-- ----------------------------
-- Table structure for `note`
-- ----------------------------
DROP TABLE IF EXISTS `note`;
CREATE TABLE `note` (
  `id` int(11) NOT NULL,
  `title` varchar(255) default NULL,
  `content` varchar(255) default NULL,
  `userid` int(11) NOT NULL,
  `update_time` varchar(255) default NULL,
  `create_time` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of note
-- ----------------------------
INSERT INTO `note` VALUES ('1', 'title', 'comtent', '1', '2016-12-20 22:31:17', '2017-01-18 22:31:21');

-- ----------------------------
-- Table structure for `post`
-- ----------------------------
DROP TABLE IF EXISTS `post`;
CREATE TABLE `post` (
  `id` int(11) NOT NULL auto_increment,
  `useraccount` varchar(255) default NULL,
  `username` varchar(255) default NULL,
  `userphoto` varchar(255) default NULL,
  `title` varchar(1500) default NULL,
  `content` varchar(1500) default NULL,
  `content_img` varchar(1500) default NULL,
  `current_position` varchar(255) default NULL COMMENT '发帖人的位置',
  `create_time` varchar(255) default NULL,
  `comment_num` varchar(255) default NULL,
  `village_id` int(11) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=105 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of post
-- ----------------------------
INSERT INTO `post` VALUES ('1', 'qqq', '勾践', 'http://img0.imgtn.bdimg.com/it/u=2171073523,1991282945&fm=23&gp=0.jpg', '哇哈哈', '好开心，哇哈哈哈哈哈啊哈哈哈哈啊哈哈哈', '[{\"id\":1,\"path\":\"/upload/img/2017-01-09/15938585475738.jpg\"},{\"id\":2,\"path\":\"/upload/img/2017-01-09/15938597508497.png\"}]', '广东省大运体育馆', '2016-06-06 15:28:05', '31', '1');
INSERT INTO `post` VALUES ('62', 'qqq', '名字', 'http://img2.imgtn.bdimg.com/it/u=2068189867,652372891&fm=23&gp=0.jpg', '巴拉拉', '楼梯', null, '', '2017-01-14 17:18:12', '0', '1');
INSERT INTO `post` VALUES ('63', 'qqq', '名字', 'http://img2.imgtn.bdimg.com/it/u=2068189867,652372891&fm=23&gp=0.jpg', '您最好了', '哦具体', '[{\"id\":1,\"path\":\"/upload/img/2017-01-09/29063500776669.png\"},{\"id\":2,\"path\":\"/upload/img/2017-01-09/29063513339578.jpg\"}]', '', '2017-01-14 17:18:56', '0', '1');
INSERT INTO `post` VALUES ('64', 'qqq', '名字', 'http://img2.imgtn.bdimg.com/it/u=2068189867,652372891&fm=23&gp=0.jpg', '新人报道', '大家好啊，我是新人，请多多关照，\n献上我的丑照', '[{\"id\":1,\"path\":\"/upload/img/2017-01-09/33093461505393.jpg\"}]', '获取的位置大运中心', '2017-01-14 18:26:06', '6', '1');
INSERT INTO `post` VALUES ('65', 'qqq', '名字', 'http://img2.imgtn.bdimg.com/it/u=2068189867,652372891&fm=23&gp=0.jpg', '', '我真是太帅了', '[{\"id\":1,\"path\":\"/upload/img/2017-01-09/33162220399794.jpg\"},{\"id\":2,\"path\":\"/upload/img/2017-01-09/33162221550095.jpg\"},{\"id\":3,\"path\":\"/upload/img/2017-01-09/33162222517626.jpg\"}]', '', '2017-01-14 18:27:15', '3', '1');
INSERT INTO `post` VALUES ('66', 'qqq', '名字', 'http://img2.imgtn.bdimg.com/it/u=2068189867,652372891&fm=23&gp=0.jpg', '', '', '[{\"id\":1,\"path\":\"/upload/img/2017-01-09/35255460974060.jpg\"}]', '', '2017-01-14 19:02:08', '0', '1');
INSERT INTO `post` VALUES ('67', 'qqq', '名字', 'http://img2.imgtn.bdimg.com/it/u=2068189867,652372891&fm=23&gp=0.jpg', 'yhffh', 'gkjvfgu', null, '获取的位置大运中心', '2017-01-14 19:31:17', '5', '1');
INSERT INTO `post` VALUES ('68', 'qqq', '名字', 'http://cdn.duitang.com/uploads/item/201512/19/20151219192846_jnKGh.jpeg', 'yyy', 'tttt', null, '', '2017-01-14 19:32:57', '0', '1');
INSERT INTO `post` VALUES ('69', 'qqq', '名字', 'http://cdn.duitang.com/uploads/item/201512/19/20151219192846_jnKGh.jpeg', 'ttt', 'ppp', null, '', '2017-01-14 19:49:07', '0', '1');
INSERT INTO `post` VALUES ('70', null, '名字', 'http://cdn.duitang.com/uploads/item/201512/19/20151219192846_jnKGh.jpeg', '', '', '[{\"id\":1,\"path\":\"/upload/img/2017-01-09/5366763313677.png\"},{\"id\":2,\"path\":\"/upload/img/2017-01-09/5366764677158.jpg\"}]', '获取的位置大运中心', '2017-01-14 23:30:16', '2', '1');
INSERT INTO `post` VALUES ('71', null, '名字', 'http://cdn.duitang.com/uploads/item/201512/19/20151219192846_jnKGh.jpeg', '小的时候', '你有病吗', '[{\"id\":1,\"path\":\"/upload/img/2017-01-16/1141061388858.jpg\"},{\"id\":2,\"path\":\"/upload/img/2017-01-16/1141087982248.jpg\"}]', '获取的位置大运中心', '2017-01-15 10:21:18', '2', '2');
INSERT INTO `post` VALUES ('72', null, '名字', 'http://cdn.duitang.com/uploads/item/201512/19/20151219192846_jnKGh.jpeg', '把考虑考虑图', '啊就考虑噜啦噜啦', '[{\"id\":1,\"path\":\"/upload/img/2017-01-16/4175753110923.jpg\"}]', '获取的位置大运中心', '2017-01-17 09:51:32', '0', '1');
INSERT INTO `post` VALUES ('73', null, '名字', 'http://cdn.duitang.com/uploads/item/201512/19/20151219192846_jnKGh.jpeg', '', '', '[{\"id\":1,\"path\":\"/upload/img/2017-01-16/4295473087349.jpg\"}]', '', '2017-01-17 09:53:31', '2', '1');
INSERT INTO `post` VALUES ('74', null, '名字', 'img', 'cgnvx', 'gfddff', null, '获取的位置大运中心', '2013-01-01 15:03:39', '0', '0');
INSERT INTO `post` VALUES ('75', null, '名字', 'img', '默默', '啦啦啦', '[{\"id\":1,\"path\":\"/upload/img/2012-12-31/3934027824720.jpg\"}]', '', '2013-01-01 15:12:27', '0', '0');
INSERT INTO `post` VALUES ('76', null, '名字', 'http://cdn.duitang.com/uploads/item/201512/19/20151219192846_jnKGh.jpeg', '我又来了', '哦哦哦', '[{\"id\":1,\"path\":\"/upload/img/2017-03-27/5756123854100.jpg\"}]', '获取的位置大运中心', '2017-03-26 21:56:16', '2', '1');
INSERT INTO `post` VALUES ('77', null, '名字', 'http://cdn.duitang.com/uploads/item/201512/19/20151219192846_jnKGh.jpeg', '额额', '看看', null, '', '2017-03-26 22:13:39', '0', '1');
INSERT INTO `post` VALUES ('78', null, 'xiaoer', 'http://cdn.duitang.com/uploads/item/201512/19/20151219192846_jnKGh.jpeg', '辣鸡辣鸡', '哦下午', null, '', '2017-03-26 22:23:54', '2', '1');
INSERT INTO `post` VALUES ('79', null, 'xiaoer', 'http://cdn.duitang.com/uploads/item/201512/19/20151219192846_jnKGh.jpeg', '新的', '兔猪头', null, '', '2017-04-10 19:09:13', '10', '1');
INSERT INTO `post` VALUES ('80', null, 'xiaoer', 'http://cdn.duitang.com/uploads/item/201512/19/20151219192846_jnKGh.jpeg', '', '', null, '', '2017-04-10 19:28:02', '3', '1');
INSERT INTO `post` VALUES ('81', null, 'xiaoer', 'http://cdn.duitang.com/uploads/item/201512/19/20151219192846_jnKGh.jpeg', 'dfe', 'fgvfs', null, '', '2017-04-21 17:32:42', '1', '1');
INSERT INTO `post` VALUES ('82', null, 'xiaoer', 'http://cdn.duitang.com/uploads/item/201512/19/20151219192846_jnKGh.jpeg', 'hgg', 'gggg', null, '', '2017-04-21 22:22:33', '3', '1');
INSERT INTO `post` VALUES ('83', null, 'lqm', '/upload/img/2017-04-24/32471066674930.PNG', 'hhh', 'ggg', '[{\"id\":1,\"path\":\"/upload/img/2017-04-24/33204996193838.gif\"}]', '', '2017-04-26 18:18:45', '1', '1');
INSERT INTO `post` VALUES ('84', null, 'qqq', 'http://cdn.duitang.com/uploads/item/201512/19/20151219192846_jnKGh.jpeg', 'rr', 'rr', null, '', '2017-04-27 14:18:27', '2', '1');
INSERT INTO `post` VALUES ('85', null, '大王哈', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zNzA2MjQ5MjlfMTQ5Mjc1MTI3NjM3Ml9kMGQ2NGM4OS0xNTU2LTQzNDYtYmVmOC01MTUxY2IzZTc0MzM=', 'frr', 'dddd', '[{\"id\":1,\"path\":\"/upload/img/2017-04-24/6071958295798.jpg\"}]', '', '2017-04-28 10:37:00', '4', '1');
INSERT INTO `post` VALUES ('86', 'qq', '大王哈', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zNzA2MjQ5MjlfMTQ5Mjc1MTI3NjM3Ml9kMGQ2NGM4OS0xNTU2LTQzNDYtYmVmOC01MTUxY2IzZTc0MzM=', 'ffff', 'lll', '[{\"id\":1,\"path\":\"/upload/img/2017-04-24/6382584462001.png\"}]', '', '2017-04-28 10:42:10', '3', '1');
INSERT INTO `post` VALUES ('87', 'qqq', '卢勤毛', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zNzA2MjQ5MjlfMTQ5Mjc1MTI3NjM3Ml85Zjk5OTIyMC0xN2IwLTQxYTItOGI1Ni1kOWUyYTk1NWRhNzQ=', 'ggg', 'hgh', null, '', '2017-04-28 10:51:40', '4', '1');
INSERT INTO `post` VALUES ('88', 'qqq', '大王哈', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zNzA2MjQ5MjlfMTQ5Mjc1MTI3NjM3Ml9kMGQ2NGM4OS0xNTU2LTQzNDYtYmVmOC01MTUxY2IzZTc0MzM=', 'pp', 'pp', null, '', '2017-04-28 11:34:32', '2', '1');
INSERT INTO `post` VALUES ('89', 'qqq', '大王哈', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zNzA2MjQ5MjlfMTQ5Mjc1MTI3NjM3Ml9kMGQ2NGM4OS0xNTU2LTQzNDYtYmVmOC01MTUxY2IzZTc0MzM=', '', '', '[{\"id\":1,\"path\":\"/upload/img/2017-04-24/9930124732455.jpg\"},{\"id\":2,\"path\":\"/upload/img/2017-04-24/9930126149622.jpg\"},{\"id\":3,\"path\":\"/upload/img/2017-04-24/9930127808380.jpg\"}]', '', '2017-04-28 11:41:18', '1', '1');
INSERT INTO `post` VALUES ('90', 'lqm', '卢勤毛', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zNzA2MjQ5MjlfMTQ5Mjc1MTI3NjM3Ml85Zjk5OTIyMC0xN2IwLTQxYTItOGI1Ni1kOWUyYTk1NWRhNzQ=', 'ghgg', 'gggg', null, '', '2017-04-28 14:37:46', '12', '1');
INSERT INTO `post` VALUES ('91', 'ppp', '噢噢', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zNzA2MjQ5MjlfMTQ5MzI3NzY5OTQ5NF8yNjM3MjU0Ny03OWZkLTQxZjEtOGYwNC02YWMwNjcwNWQ3OTY=', '啦啦啦', '啦啦啦', null, '', '2017-04-28 15:31:17', '1', '1');
INSERT INTO `post` VALUES ('92', 'kkk', '安卓机辣鸡', '', '默默', '啦啦啦', null, '', '2017-04-28 17:24:49', '0', '1');
INSERT INTO `post` VALUES ('93', 'kkk', '安卓机辣鸡', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zNzA2MjQ5MjlfMTQ5MzI3NzY5OTQ5NF9kYTBlOTk4OS1jYWQ3LTRmZmMtOTYwOS1kNmVmZTBhNDJiYjA=', '啦啦啦', '啦啦啦', null, '', '2017-04-28 17:25:40', '4', '1');
INSERT INTO `post` VALUES ('94', 'ooo', '我是ooo', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zOTA1NjEyNzlfMTQ5MzcxNzI5NzYwMl82YWQxN2EzMi1jNWZkLTQ4NDEtODViMS00OWQ4MTExNmJiMWU=', '啊实打实的', '啊实打实的', null, '', '2017-05-02 17:33:31', '14', '1');
INSERT INTO `post` VALUES ('95', 'kkk', '安卓机辣鸡', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zODM0MTUwNTRfMTQ5MzcxNzQxNTQ0MF80Yzg5MGFlZi1hYmZhLTQzMzItOGVmNC1lM2EzNzA2ODU4MGE=', '速度速度速度', '速度速度速度', null, '', '2017-05-03 10:50:27', '11', '1');
INSERT INTO `post` VALUES ('96', 'qqq', '大王哈', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zNzA2MjQ5MjlfMTQ5Mjc1MTI3NjM3Ml9kMGQ2NGM4OS0xNTU2LTQzNDYtYmVmOC01MTUxY2IzZTc0MzM=', '我的天啊', '写好了吗', '[{\"id\":1,\"path\":\"/upload/img/2017-05-01/24620307287657.PNG\"}]', '获取的位置大运中心', '2017-05-03 15:52:34', '1', '1');
INSERT INTO `post` VALUES ('97', 'qqq', '大王哈', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zNzA2MjQ5MjlfMTQ5Mjc1MTI3NjM3Ml9kMGQ2NGM4OS0xNTU2LTQzNDYtYmVmOC01MTUxY2IzZTc0MzM=', '搜索', '搜索搜索', null, '', '2017-05-03 15:52:49', '5', '1');
INSERT INTO `post` VALUES ('98', 'ppp', '噢噢东', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zNzA2MjQ5MjlfMTQ5MzI3NzY5OTQ5NF8yNjM3MjU0Ny03OWZkLTQxZjEtOGYwNC02YWMwNjcwNWQ3OTY=', '速度速度速度', '速度速度速度所', null, '获取的位置大运中心', '2017-05-17 19:03:11', '1', '2');
INSERT INTO `post` VALUES ('99', 'ppp', '噢噢东', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zNzA2MjQ5MjlfMTQ5MzI3NzY5OTQ5NF8yNjM3MjU0Ny03OWZkLTQxZjEtOGYwNC02YWMwNjcwNWQ3OTY=', '是是是', '我是主人', null, '', '2017-05-17 19:07:42', '1', '4');
INSERT INTO `post` VALUES ('100', 'ppp', '噢噢东', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zODM0MTUwNTRfMTQ5MzcxNzQxNTQ0MF8yMTc3ZjYxZS02OGQ2LTQzZWYtOGE4ZS03MzU2YmM5YTk5MGM=', 'hhhjj', '叽叽叽叽叽', null, '', '2017-05-19 15:30:06', '0', '3');
INSERT INTO `post` VALUES ('101', 'ppp', '噢噢东', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zNzA2MjQ5MjlfMTQ5MzI3NzY5OTQ5M182NDA1OWUyYy1hMmY5LTQ1MzEtYmQzNC00ODc2MjVjYTI5OTA=', 'xxx', 'xxxs', '[{\"id\":1,\"path\":\"/upload/img/2017-05-15/10978548390942.jpg\"},{\"id\":2,\"path\":\"/upload/img/2017-05-15/10978664502361.jpg\"}]', '', '2017-05-19 19:56:46', '12', '1');
INSERT INTO `post` VALUES ('102', 'ppp', '噢噢东', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zNzA2MjQ5MjlfMTQ5MzI3NzY5OTQ5M185NzA0ZGI2OS02YWYyLTQ5M2YtOTc1Ny1hOTk5N2U5OGUwNzM=', '搜索', '搜索', null, '', '2017-05-21 13:43:24', '0', '4');
INSERT INTO `post` VALUES ('103', 'ppp', '噢噢东', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zODM0MTUwNTRfMTQ5NTM1NjQxNDY2N183MTcxNGY3Ny05ODU0LTQ5NjEtYThlMy02NzdkNGY2NzdlYjg=', '', '', null, '', '2017-06-09 18:26:04', '1', '1');
INSERT INTO `post` VALUES ('104', 'ppp', '噢噢东', 'http://nim.nos.netease.com/NDA2MTI2NQ==/bmltYV8zODM0MTUwNTRfMTQ5NTM1NjQxNDY2N183MTcxNGY3Ny05ODU0LTQ5NjEtYThlMy02NzdkNGY2NzdlYjg=', '嗯', '', '[{\"id\":1,\"path\":\"/upload/img/2017-06-05/26292718752158.png\"},{\"id\":2,\"path\":\"/upload/img/2017-06-05/26292750927160.png\"},{\"id\":3,\"path\":\"/upload/img/2017-06-05/26292753380905.png\"},{\"id\":4,\"path\":\"/upload/img/2017-06-05/26292755626618.png\"},{\"id\":5,\"path\":\"/upload/img/2017-06-05/26292757986018.png\"}]', '', '2017-06-09 18:30:26', '4', '1');

-- ----------------------------
-- Table structure for `public`
-- ----------------------------
DROP TABLE IF EXISTS `public`;
CREATE TABLE `public` (
  `id` int(11) NOT NULL default '0',
  `publickey` varchar(255) character set utf8 default '',
  `name` varchar(255) character set utf8 default '',
  `icon` varchar(255) character set utf8 default '',
  `publicdesc` varchar(255) character set utf8 default '',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of public
-- ----------------------------
INSERT INTO `public` VALUES ('0', 'AndroidChinaNet', 'Android开发中文站', '/upload/img/2017-04-24/17334922099997.PNG', 'Android开发中文站的公众号');
INSERT INTO `public` VALUES ('1', 'lufengdatang', '陆丰大塘', '/upload/img/2017-04-24/17334922099997.PNG', '陆丰市大塘村的公众号');

-- ----------------------------
-- Table structure for `updateinfo`
-- ----------------------------
DROP TABLE IF EXISTS `updateinfo`;
CREATE TABLE `updateinfo` (
  `id` int(11) NOT NULL default '0',
  `versioncode` int(11) default NULL,
  `packageName` varchar(255) character set utf8 default NULL,
  `updateInfo` varchar(255) character set utf8 default NULL,
  `url` varchar(255) character set utf8 default NULL,
  `versionName` varchar(255) character set utf8 default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of updateinfo
-- ----------------------------

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL auto_increment,
  `accid` varchar(255) default NULL COMMENT '云信用户名',
  `username` varchar(255) default NULL COMMENT '昵称',
  `password` varchar(255) default NULL,
  `token` varchar(255) default NULL COMMENT '登录云信的密码',
  `user_photo` varchar(255) default NULL,
  `sex` varchar(255) default NULL,
  `birthday` varchar(255) default NULL,
  `phone` varchar(255) default NULL,
  `address` varchar(255) default NULL,
  `sign_desc` varchar(255) default NULL COMMENT '个性签名',
  `email` varchar(255) default NULL,
  `homeid` int(11) default '0' COMMENT '0代表还没关注任何乡吧',
  `state` int(11) default NULL,
  `update_time` varchar(255) default NULL,
  `create_time` varchar(255) default NULL,
  PRIMARY KEY  (`id`),
  KEY `FK936FCAF21DB1FD15` (`homeid`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('16', 'ff)', 'ff)', '123456', '123456', '/upload/img/2017-04-24/4645230920540.PNG', '女', '19941225', '13928966258', '贵州贵阳', 'fdd', null, '1', null, null, '2017-04-25 10:06:02');
INSERT INTO `user` VALUES ('17', 'ttiu', 'ttiu', '123456', '123456', '/upload/img/2017-04-24/5066489913988.PNG', '女', '19941214', '13929800752', '贵州铜仁', 'fff', null, '1', null, null, '2017-04-25 10:13:05');
INSERT INTO `user` VALUES ('18', 'lqm', 'lqm', '123456', '123456', '/upload/img/2017-04-24/32471066674930.PNG', '男', '19941216', '13927900786', '广东汕尾', '我就是我', null, '1', null, null, '2017-04-26 18:06:32');
INSERT INTO `user` VALUES ('19', '科技', '科技', '123456', '123456', '/upload/img/2017-04-24/17334922099997.PNG', '女', '19941225', '13927900786', '海南三亚', '默默', null, '1', null, null, '2017-04-28 13:44:44');
INSERT INTO `user` VALUES ('20', 'ppp', 'ppp', '123456', '123456', '/upload/img/2017-04-24/23659495232553.PNG', '女', '19941225', '13927900786', '广西防城港', '弄', null, '1', null, null, '2017-04-28 15:30:09');
INSERT INTO `user` VALUES ('21', 'kkk', 'kkk', '123456', '123456', '/upload/img/2017-04-24/30510173619603.PNG', '女', '19941225', '13927900786', '贵州毕节', 'nnnn', null, '1', null, null, '2017-04-28 17:24:19');
INSERT INTO `user` VALUES ('22', 'ooo', 'ooo', '123456', '123456', '/upload/img/2017-05-01/12282157355109.PNG', '男', '19941020', '13927900786', '广西崇左', '谁说我呢', null, '2', null, null, '2017-05-02 16:59:34');
INSERT INTO `user` VALUES ('23', 'rrr', 'rrr', '123456', '123456', '/upload/img/2017-05-01/15444181165404.PNG', '男', '19941225', '13927900786', '福建厦门', 'rrr', null, '1', null, null, '2017-05-02 17:52:11');
INSERT INTO `user` VALUES ('24', 'lqm', '陆青猫', '123456', '123456', '/upload/img/2017-05-01/3932295878167.PNG', '男', '19941225', '13927900786', '广东广州', '搜索', null, '1', null, null, '2017-05-03 10:07:47');
INSERT INTO `user` VALUES ('25', 'kkk', '我是kkk', '123456', '123456', '/upload/img/2017-05-01/5210543542622.PNG', '', '', '', '', '', null, '1', null, null, '2017-05-03 10:29:06');
INSERT INTO `user` VALUES ('26', 'zxc', '整除', '123456', '123456', '/upload/img/2017-05-01/8836237982000.PNG', '', '', '', '', '', null, '1', null, null, '2017-05-03 11:29:30');
INSERT INTO `user` VALUES ('27', 'pppp', 'ppp啥的', '123456', '123456', '/upload/img/2017-05-01/20867924947162.PNG', '', '', '', '', '', null, '1', null, null, '2017-05-03 14:50:05');
INSERT INTO `user` VALUES ('28', 'oooo', 'oooo问问', '123456', '123456', '/upload/img/2017-05-01/22102973469175.PNG', '', '', '', '', '', null, '1', null, null, '2017-05-03 15:10:38');
INSERT INTO `user` VALUES ('29', 'qqq', 'qqqq', '123456', '123456', '/upload/img/2017-05-01/24299104651667.PNG', '', '', '', '', '', null, '2', null, null, '2017-05-03 15:47:16');
INSERT INTO `user` VALUES ('30', 'dbc', '公交', '123456', '123456', '/upload/img/2017-05-15/12828948690245.jpg', '', '', '', '', '', null, '1', null, null, '2017-05-19 20:27:40');
INSERT INTO `user` VALUES ('31', 'iop', '厦门模型', '123456', '123456', '/upload/img/2017-05-22/29572552101816.jpg', '', '', '', '', '', null, '1', null, null, '2017-05-27 17:09:20');
INSERT INTO `user` VALUES ('32', 'ffgg', '风风光光', '123456', '123456', '/upload/img/2017-06-12/2813758004004.jpg', '', '', '', '', '', null, '1', null, null, '2017-06-12 20:48:15');

-- ----------------------------
-- Table structure for `village`
-- ----------------------------
DROP TABLE IF EXISTS `village`;
CREATE TABLE `village` (
  `id` int(11) NOT NULL auto_increment,
  `village_icon` varchar(255) NOT NULL,
  `title` varchar(255) NOT NULL,
  `village_desc` varchar(255) NOT NULL default '',
  `attention_num` int(11) NOT NULL,
  `post_num` int(11) NOT NULL,
  `province` varchar(255) NOT NULL,
  `city` varchar(255) NOT NULL,
  `district` varchar(255) NOT NULL COMMENT '区',
  `create_time` varchar(255) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of village
-- ----------------------------
INSERT INTO `village` VALUES ('1', '/upload/img/2017-05-08/30101554533102.PNG', '大塘村', '汕尾十大古村落之一，美丽的乡村', '0', '0', '广东省', '汕尾市', '陆丰市', '2017-01-10 21:33:54');
INSERT INTO `village` VALUES ('2', '/upload/img/2017-05-01/12936799446317.PNG', '下塘村', '在大塘的下面.sdsd速度速度速度所断点实打实的阿萨德阿萨德阿萨德', '0', '0', '广东省', '汕尾市', '陆丰市', '2017-05-04 12:43:31');
INSERT INTO `village` VALUES ('3', '/upload/img/2017-05-08/30101554533102.PNG', '小唐村', '按时打算打算  我哦是小塘村', '0', '0', '广东省', '汕尾市', '陆丰市', '2017-05-11 17:21:34');
INSERT INTO `village` VALUES ('4', '/upload/img/2017-05-15/36092043228571.PNG', '钦茂村', '是的是的是的实打实的', '0', '0', '广东省', '汕尾市', '陆河县', '2017-05-17 19:07:17');
