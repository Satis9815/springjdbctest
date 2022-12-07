package org.example.springjdbcDbO;

import org.example.entity.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class SudentInterFaceImpl implements  StudentInterFace {
    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private JdbcTemplate jdbcTemplate;
    public int insert( Student student) {
        //        Insert query
        String query="insert into student(id,name,city) values(?,?,?)";
        //        fire the query
        int result=this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());

        return result;
    }
    //        updating existing student data
    public  int change(Student student){
        String query="update  student set name=?,city=? where id=?";
        int result=this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
        return  result;
    }

//    Deleting an existing data
    public  int delete(int studentId){
        String query="delete from   student   where id=?";
        int result=this.jdbcTemplate.update(query,studentId);
        return  result;
        

    }
    public  Student getStudent(int studentId){
//        selecting single student data
        RowMapper<Student> rowMapper=new RowMapperImpl();
      String query="select * from student where id=?";
      Student student=this.jdbcTemplate.queryForObject(query,rowMapper,studentId);
      return  student;


    }

    public List<Student> getAllStudents(){
//        selecting multiple student
        String query="select * from student";
        List<Student> students=this.jdbcTemplate.query(query,new RowMapperImpl());
        return  students;

    }





















}
