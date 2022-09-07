CREATE DATABASE IF NOT EXISTS seckill CHARACTER SET utf8mb4;

use seckill;

CREATE TABLE t_user(
`id` CHAR(11) NOT NULL COMMENT '用户id，手机号码',
`nickname` VARCHAR(255) NOT NULL,
`password` VARCHAR(32) DEFAULT NULL,
`slat` VARCHAR(10) DEFAULT NULL,
`head` VARCHAR(128) DEFAULT NULL COMMENT '头像',
`register_date` datetime DEFAULT NULL,
`login_count` int(10) DEFAULT 0,
PRIMARY KEY(`id`)
)ENGINE=InnoDB;