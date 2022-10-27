package org.map.OneToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainGet {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        QuestionOToM que = session.get(QuestionOToM.class, 124);

        System.out.println(que.getQuestion());
        
        for (AnswerOToM ans : que.getAnswers()) {
            System.out.println(ans.getAnswer());
        }
        session.close();
        factory.close();
    }
}