package com.sample.di.demo8;

import java.util.List;

public class Sample {

	List<String> categories;
	List<Sns> snsList;
	
	public void setCategories(List<String> categories) {
		this.categories = categories;
	}
	public List<Sns> getSnsList() {
		return snsList;
	}
	
	public void printCategories() {
		for(String category : categories) {
			System.out.println("카테고리: " + category);
		}
		System.out.println();
	}
}
