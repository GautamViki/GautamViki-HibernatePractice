package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Student student = session.get(Student.class, 1);
        System.out.println(student.getName());

        Address address = session.get(Address.class, 1);
        System.out.println(address.getCity());
        session.close();
        factory.close();

    }
}
