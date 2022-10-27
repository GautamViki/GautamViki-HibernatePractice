package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmbeddedDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Student student = new Student();
        student.setName("vikas");
        student.setCity("kanpur");
        Certificate certificate = new Certificate();
        certificate.setCourse("Android");
        certificate.setDuration("2Month");
        student.setCertificate(certificate);


        Student student1 = new Student();
        student1.setName("Durgesh");
        student1.setCity("Lucknow");
        Certificate certificate1 = new Certificate();
        certificate1.setDuration("5month");
        certificate1.setCourse("Java");
        student1.setCertificate(certificate1);

        Session session = factory.openSession();
        session.beginTransaction();
        session.persist(student1);
        session.persist(student);
        session.close();
        factory.close();

    }
}
