package org.example.springjdbcDbO;

import org.example.entity.Student;
import org.springframework.jdbc.core.JdbcTemplate;

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
}
