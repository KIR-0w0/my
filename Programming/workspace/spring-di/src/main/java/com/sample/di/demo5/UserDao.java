package com.sample.di.demo5;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	public void deleteAllUsers() {
		System.out.println("모든 사용자 정보를 삭제합니다.");
	}
}
