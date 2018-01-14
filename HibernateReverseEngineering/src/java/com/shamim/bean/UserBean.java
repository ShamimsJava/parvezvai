package com.shamim.bean;

import com.shamim.dao.HibernateUtil;
import com.shamim.entity.User;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.hibernate.Session;

/**
 * @ Hello
 */
@ManagedBean
@SessionScoped
public class UserBean {

    User u = new User();

    public User getU() {
        return u;
    }

    public void setU(User u) {
        this.u = u;
    }
    
    public String saveUser(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(u);
        session.getTransaction().commit();
        session.close();
        return "success";
    }
}
