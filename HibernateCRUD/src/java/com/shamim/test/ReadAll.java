package com.shamim.test;

import com.shamim.entity.Employee;
import com.shamim.util.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Shamim
 */
public class ReadAll {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        //-------------------------CRUD Section---------------------------------

        Query query = session.createQuery("from Employee");
        List<Employee> emp = query.list();

        System.out.println("Emp Name            Emp Address");
        System.out.println("-------------------------------------");
        for (Employee e : emp) {
            System.out.println(e.getEmpName() + "         " + e.getEmpAddress());
        }
        System.out.println("-------------------------------------");
        
        //----------------------------------------------------------------------
        session.getTransaction().commit();
        session.close();
        System.out.println("Success");
    }
}
