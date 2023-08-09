package com.JdbcTemplate.springJdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

//import javax.sql.DataSource;

//import org.springframework.jdbc.datasource.DriverManagerDataSource;

//import org.springframework.jdbc.core.JdbcTemplate;

public class InsertApp 
{
    public static void main( String[] args )
    {
    	//JdbcTemplate
    	//DriverManagerDataSource
    	// DataSource
        System.out.println( "project started");
        ApplicationContext context = new ClassPathXmlApplicationContext("com/JdbcTemplate/springJdbc/springjdbcconfig.xml");
//        Student s = context.getBean("stud",Student.class);
//        System.out.println(s);
        JdbcTemplate j = context.getBean("JdbcTemplate",JdbcTemplate.class);
        String query ="insert into springjdbc.student values(?,?,?)";
        int b = j.update(query,"1Da16Mca40","madu","jungle");
        System.out.println("Record inserted " +b);
        System.out.println( "project End");
        
        
     
    }
}
