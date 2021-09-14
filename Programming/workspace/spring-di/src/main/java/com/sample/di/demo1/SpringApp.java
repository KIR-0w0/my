package com.sample.di.demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("context-di-demo1.xml");
		
		BookDao bookDao = container.getBean("bookDao", BookDao.class);
		
		CustomerDao customerDao = container.getBean(CustomerDao.class);
		// 식별자가 없을경우 object타입이 반환되어 형변환을 해줘야 한다.
		OrderDao orderDao = (OrderDao)container.getBean("orderDao");
		
		bookDao.getAllBooks();
		customerDao.getCustomerById();
		orderDao.cancelOrder();
		
	}
}
