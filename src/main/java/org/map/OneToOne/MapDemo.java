package org.map.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MapDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Question question = new Question();
        question.setQuestionId(1212);
        question.setQuestion("What is java?");

        Answer answer = new Answer();
        answer.setAnswerId(344);
        answer.setAnswer("programming language");
        question.setAnswer(answer);
        answer.setQuestion(question);

        Session session = factory.openSession();
        session.persist(answer);
        session.persist(question);
        session.beginTransaction().commit();
        session.close();
        factory.close();

    }
}
