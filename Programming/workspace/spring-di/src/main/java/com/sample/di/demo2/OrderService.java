package com.sample.di.demo2;

import com.sample.di.demo1.BookDao;
import com.sample.di.demo1.CustomerDao;
import com.sample.di.demo1.OrderDao;

public class OrderService {
	
	// 스프링 컨테이너를 사용한 객체 생성(의존선 주입)
	// 1. 의존성 주입을 받은 객체를 저장하는 멤버변수를 정의한다.
	private OrderDao orderDao;
	private BookDao bookDao;
	private CustomerDao customerDao;
	// 2. 의존성 주입에 활용할 setter 메소드를 정의한다.
	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}
	public void setOrderDao(OrderDao orderDao) {
		this.orderDao = orderDao;
	}
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	
	// 주문하기
	public void order() {
		// 새로운 주문정보 저장		<-- OrderDao.insertOrder()
		// 책의 재고 변경			<-- BookDao.updateBook()		
		// 고객의 포인트 변경		<-- CustomerDao.updateCustomer()
		System.out.println("책 주문요청을 처리합니다.");
		orderDao.insertOrder();
		bookDao.updateBook();
		customerDao.updateCustomer();
	}
	
	// 주문 취소하기
	public void cancel() {
		// 주문정보 취소			<-- OrderDao cancelOrder()
		// 책재고 변경				<-- BookDao updateBook()
		// 고객의 포인트 변경		<-- CustomerDao updateCustomer()
		System.out.println("책 주문내용에 대한 취소요청을 처리합니다.");
		orderDao.cancelOrder();
		bookDao.updateBook();
		customerDao.updateCustomer();
	}
}
