package org.example.springjdbcDbO;


import org.example.entity.Student;

import java.util.List;

public interface StudentInterFace {

    public  int insert(Student student);
    public  int change(Student student);
    public  int delete(int id);
    public Student getStudent(int studentId);

    public List<Student> getAllStudents();
}
