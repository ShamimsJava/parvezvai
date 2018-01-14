package com.shamim.test;

import com.shamim.dao.HibernateUtil;
import com.shamim.entity.User;
import org.hibernate.Session;

/**
 *
 * @author Shamim
 */
public class Main {
    public static void main(String[] args) {
        User u1 = new User("shamim", "sarker", "shamim", "shamim");
        User u2 = new User("shamim2", "sarker2", "shamim2", "shamim2");
        User u3 = new User("shamim3", "sarker3", "shamim3", "shamim3");
        
        Session s = HibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        
        s.save(u1);
        s.save(u2);
        s.save(u3);
        
        s.getTransaction().commit();
        s.close();
        System.out.println("Success");
    }
}
