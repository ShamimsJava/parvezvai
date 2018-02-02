package com.shamim.controller;

import com.shalmim.pojo.Student;
import com.shamim.dao.StudentDao;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author SHAMIM SARKER
 */
@ManagedBean
@ViewScoped
public class StudentBean {
    Student student = new Student();
    StudentDao studentDao = new StudentDao();

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public StudentDao getStudentDao() {
        return studentDao;
    }

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }
    
    public List<Student> getAllStudents(){
        return studentDao.allStudents();
    }
    
    public String addStudent(){
        studentDao.add(student);
        return "index.xhtml?faces-redirect=true";
    }
    
    public String deleteStudent(Student student){
        studentDao.delete(student);
        return "index.xhtml?faces-redirect=true";
    }
    
    public String updateStudent(Student student){
        studentDao.update(student);
        return "index.xhtml?faces-redirect=true";
    }
    
    public void changeStudent(Student student){
        this.student = student;
    }
}
