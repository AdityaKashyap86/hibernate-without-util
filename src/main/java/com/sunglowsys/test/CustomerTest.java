package com.sunglowsys.test;

import com.sunglowsys.domain.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CustomerTest {
    public static void main(String[] args) {
        Configuration configuration = new Configuration ();
        SessionFactory sessionFactory ;
        sessionFactory= new Configuration ().configure ("hibernate.cfg.xml").buildSessionFactory ();

        Session session = sessionFactory.openSession ();
        session.beginTransaction ();

        Customer c = new Customer ();
        c.setName ("Amit");
        c.setEmail ("ak@gmail.com");
        c.setMobile ("563635634");
        c.setAddress ("mohanpua");

        session.save (c);
        session.getTransaction ().commit ();
        session.close ();


    }
}
