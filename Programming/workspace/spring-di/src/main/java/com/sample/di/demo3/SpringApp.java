package com.sample.di.demo3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {

	public static void main(String[] args) {
		
		ApplicationContext container = new ClassPathXmlApplicationContext("context-di-demo3.xml");
		
		EventService eventService = container.getBean("eventService", EventService.class);
		eventService.noticeEvent("가을 추천 도서", "가을에 읽기 좋은 도서 추천드려요!");
		
		SystemAlertService alertService = container.getBean("systemAlertService", SystemAlertService.class);
		alertService.alert("잘못된 입력", "잘못된 입력입니다. 입력값을 확인해주세요", "전산시스템");
		
		
	}
}
