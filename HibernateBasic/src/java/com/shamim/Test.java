package com.shamim;

import org.hibernate.Session;

/**
 *
 * @author Shamim
 */
public class Test {
    public static void main(String[] args) {
        Employee emp =  new Employee("shihab", "sharar");
        Employee emp2 =  new Employee("shahin", "rahman");
        Employee emp3 =  new Employee("upoma", "barman");
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        session.save(emp);
        session.save(emp2);
        session.save(emp3);
        
        session.getTransaction().commit();
        session.close();
        System.out.println("Success");
    }
}
