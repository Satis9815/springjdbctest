package org.example.springjdbc;

import org.example.entity.Student;
import org.example.springjdbcDbO.StudentInterFace;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //spring jdbc=>jdbcTemplate
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        StudentInterFace studentInterFace=context.getBean("studentInterFace",StudentInterFace.class);

//        Inserting the new student data
//        Student student=new Student();
//        student.setId(112);
//        student.setName("Hari");
//        student.setCity("baneshower");
//        int result=studentInterFace.insert(student);


//        Updating the existing student data
//        Student student= new Student();
//        student.setId(11);
//        student.setName("Kumar chaudhary");
//        student.setCity("Banglore");
//        int result= studentInterFace.change(student);
//        System.out.println(result+" Student data  updated  ");

        //Deleting and existing student data
//        int result= studentInterFace.delete(1232);
//        System.out.println("Deleted "+result);

//        Getting single student object 
//       Student s= studentInterFace.getStudent(1);
//        System.out.println(s);
        
//        Getting  multiple student objects
        List<Student> students= studentInterFace.getAllStudents();
        for (Student s :
                students) {
            System.out.println(s);

        }
    }
}
