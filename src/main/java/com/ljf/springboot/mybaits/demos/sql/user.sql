CREATE DATABASE mytestdb;

CREATE TABLE tb_user(
  userId INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  userName VARCHAR(255) NOT NULL ,
  pwd VARCHAR(255) NOT NULL ,
  tel VARCHAR(255) NOT NULL
) ENGINE=INNODB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8;