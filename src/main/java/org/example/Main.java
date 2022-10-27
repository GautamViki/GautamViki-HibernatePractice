package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Student std = new Student();
        std.setCity("Kanpur");
        std.setName("Brijesh");

        Address address = new Address();
        address.setCity("Delhi");
        address.setStreet("152F");
        address.setOpen(true);
        address.setX(524);
        address.setAddedDate(new Date());
//        System.out.println(std);
        Session session = factory.openSession();
        session.persist(std);
        session.persist(address);
        session.beginTransaction().commit();
        session.close();
        System.out.println("done...........");
    }
}