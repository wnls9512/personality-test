package com.pjj.personalityTest.vo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity(name = "user")
public class UserDto {

    @Id
    private String userId;
    private String password;
    private String userName;
    private String phoneNum;
    private Integer roleType;
}

/*
create database pjj;
create user pjj@'%' identified by '12341234';
create user pjj@'localhost' identified by '12341234';

grant all privileges on pjj.* to 'pjj'@'%';
grant all privileges on pjj.* to 'pjj'@'localhost';

create table user(
	user_id varchar(100) primary key,
	password varchar(2000),
	user_name varchar(500),
	phone_num varchar(20)
)default charset=utf8

INSERT INTO `user` (`user_id`, `password`, `user_name`, `phone_num`, `role_type`)
VALUES ('master', '1234', '관리자', '01098168910', 0);
 */