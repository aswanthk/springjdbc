package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Spring JDBC" );
        ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        
        // Insert a record
        Student student=new Student();
        student.setId(104);
        student.setName("Ryan");
        student.setCity("Paris");
//        
//        int result = studentDao.insert(student);
//        System.out.println(result + " record inserted");
        
        // Update a record
//        Student student=new Student();
//        student.setId(102);
//        student.setName("Sai");
//        student.setCity("Lucknow");
//        int result = studentDao.change(student);
//        System.out.println(result + " record changed");
        
        // Delete a record
//        int result=studentDao.delete(104);
//        System.out.println(result + " record deleted");
    }
}
