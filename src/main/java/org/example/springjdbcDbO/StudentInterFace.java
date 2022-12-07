package org.example.springjdbcDbO;


import org.example.entity.Student;

public interface StudentInterFace {

    public  int insert(Student student);
    public  int change(Student student);
    public  int delete(int id);
    public Student getStudent(int studentId);
}
