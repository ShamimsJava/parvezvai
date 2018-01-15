package com.shamim.test;

import com.shamim.entity.Employee;
import com.shamim.util.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author Shamim
 */
public class LoopInsert {
    
     public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        //-------------------------CRUD Section---------------------------------
        
         for (int i = 0; i < 15; i++) {
             Employee emp = new Employee("Employee "+i, "Dhaka "+i);
             session.persist(emp);
         }
        
        //----------------------------------------------------------------------
        session.getTransaction().commit();
        session.close();
        System.out.println("Success");
    }
}
