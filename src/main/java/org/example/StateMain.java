package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StateMain {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Student std = new Student(); //Transient state
        std.setCity("NewYork");     //Transient state
        std.setName("John");        //Transient state

        Certificate cer = new Certificate();        //Transient state
        cer.setCourse("Spring");        //Transient state
        cer.setDuration("3 months");        //Transient state
        std.setCertificate(cer);        //Transient state

        Session session = factory.openSession();
        session.persist(std);       //Persistent state
        std.setName("Vikas");        //Persistent state
        session.beginTransaction().commit();
        session.close();        //Detached state
        factory.close();
    }
}
