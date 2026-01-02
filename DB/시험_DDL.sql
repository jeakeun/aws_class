DROP DATABASE IF EXISTS SHOPPINGMALL3;

CREATE DATABASE SHOPPINGMALL3;

USE SHOPPINGMALL3;

DROP TABLE IF EXISTS `member`;

CREATE TABLE `member` (
	`m_id`	int	primary key AUTO_INCREMENT ,
	`m_name`	varchar(20)	 NULL,
	`m_point`	int	NULL DEFAULT 0
);

DROP TABLE IF EXISTS `product`;

CREATE TABLE `product` (
	`p_id`	int	primary key ,
	`p_name`	varchar(50)	NOT NULL,
	`p_price`	int	NOT NULL,
	`p_stock`	int NULL
);

DROP TABLE IF EXISTS `orders`;
	
CREATE TABLE `orders`(
	`o_id` int primary key AUTO_INCREMENT,
    `o_qty` int null,
    `o_date` datetime not null default current_timestamp,
    `o_m_id` int not null, 
    `o_p_id` int not null,
    foreign key(o_m_id) references member(m_id),
    foreign key(o_p_id) references product(p_id)
    );

