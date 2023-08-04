package com.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Dao {
	public static void main(String[] args) {
		System.out.println("project started");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/stereotype/sterioconfig.xml");
		Ipl i = context.getBean("ipl", Ipl.class);
		System.out.println(i);
		System.out.println("project ended");
	}

}
