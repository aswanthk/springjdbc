package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Spring JDBC" );
        ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
        String query="insert into student(id,name,city) values(?,?,?)";
        int result = template.update(query,103,"Ryan","London");
        System.out.println(result + " rows affected");
    }
}
