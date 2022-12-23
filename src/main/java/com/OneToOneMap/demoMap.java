package com.OneToOneMap;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class demoMap {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.config.xml");
        SessionFactory factory = configuration.buildSessionFactory();
//first Object
        Answer answer=new Answer();
        answer.setId(22);
        answer.setAnswer("Java is a Programming Language");

        Question question = new Question();
        question.setQuestionId(11);
        question.setQuestion("What is Java?");

        question.setAnswer(answer);
        answer.setQuestion(question);
// Second object:
        Answer answer1=new Answer();
        answer1.setId(23);
        answer1.setAnswer("Pyhton is a Programming Language");
        Question question1 = new Question();
        question1.setQuestionId(13);
        question1.setQuestion("What is Python?");
        question1.setAnswer(answer1);
        answer1.setQuestion(question1);
//Saving Data
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(question);
        session.save(answer);
        session.save(question1);
        session.save(answer1);
        tx.commit();
        session.close();
    }
}
