package com.JdbcTemplate.springJdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Update {
	public static void main(String[] args) {
		System.out.println("start");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/JdbcTemplate/springJdbc/springjdbcconfig.xml");
		JdbcTemplate j = context.getBean("JdbcTemplate",JdbcTemplate.class);
		String query ="update springjdbc.student set usn=?,name=?,city=? where usn='1Da16Mca40'";
		int b = j.update(query,"!Da16Mca36","suman","shimoga");
		System.out.println("Record updated" +b); 
		
		System.out.println("end");
	}

}
