package com.shamim.test;

import com.shamim.entity.Employee;
import com.shamim.util.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author Shamim
 */
public class ReadSingle {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        //-------------------------CRUD Section---------------------------------

        Employee emp = (Employee) session.get(Employee.class, 2);
        System.out.println("Name : " + emp.getEmpName());
        System.out.println("Address : " + emp.getEmpAddress());

        //----------------------------------------------------------------------
        session.getTransaction().commit();
        session.close();
        System.out.println("Success");
    }
}
