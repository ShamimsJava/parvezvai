package com.shamim.test;

import com.shamim.entity.Employee;
import com.shamim.util.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author Shamim
 */
public class Delete {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        //-------------------------CRUD Section---------------------------------

        Employee emp = (Employee) session.get(Employee.class, 14);
        session.delete(emp);

        //----------------------------------------------------------------------
        session.getTransaction().commit();
        session.close();
        System.out.println("Success");
    }
}
