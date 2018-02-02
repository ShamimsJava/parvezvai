package com.shamim.dao;

import com.shalmim.pojo.Student;
import com.shamim.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author SHAMIM SARKER
 */
public class StudentDao {
    
    public List<Student> allStudents(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        List<Student> list = session.createCriteria(Student.class).list();
        
        session.getTransaction().commit();
        session.close();
        
        return list;
    }
    
    public void add(Student student){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        session.save(student);
        
        session.getTransaction().commit();
        session.close();
    }
    
    public void update(Student student){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        session.update(student);
        
        session.getTransaction().commit();
        session.close();
    }
    
    public void delete(Student student){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        session.delete(student);
        
        session.getTransaction().commit();
        session.close();
    }
}
