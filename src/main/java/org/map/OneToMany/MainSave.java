package org.map.OneToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class MainSave {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();

        QuestionOToM que = new QuestionOToM();
        que.setQuestion("What is java?");
        que.setQuestionId(124);

        AnswerOToM ans1 = new AnswerOToM();
        ans1.setAnswerId(241);
        ans1.setQuestion(que);
        ans1.setAnswer("Programming Lang");

        AnswerOToM ans2 = new AnswerOToM();
        ans2.setAnswerId(242);
        ans2.setQuestion(que);
        ans2.setAnswer("follows OOPs");

        AnswerOToM ans3 = new AnswerOToM();
        ans3.setAnswerId(243);
        ans3.setQuestion(que);
        ans3.setAnswer("Secure Lang");

        List<AnswerOToM> list = new ArrayList<>();
        list.add(ans1);
        list.add(ans2);
        list.add(ans3);
        que.setAnswers(list);

        Session session = factory.openSession();
        session.persist(ans2);
        session.persist(ans1);
        session.persist(ans3);
        session.persist(que);
        session.beginTransaction().commit();
        session.close();
        factory.close();

    }
}
