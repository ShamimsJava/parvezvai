package com.shamim.test;

import com.shamim.entity.Employee;
import com.shamim.util.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author Shamim
 */
public class SingleInsert {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        //-------------------------CRUD Section---------------------------------
        
        Employee emp = new Employee("Ruhul", "Rajshahi");
        Employee emp2 = new Employee();
        emp2.setEmpName("Parvez");
        emp2.setEmpAddress("Uttara");
        
        session.save(emp);
        session.save(emp2);
        
        //----------------------------------------------------------------------
        session.getTransaction().commit();
        session.close();
        System.out.println("Success");
    }
}
