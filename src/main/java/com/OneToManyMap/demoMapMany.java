package com.OneToManyMap;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class demoMapMany {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.config.xml");
        SessionFactory factory = configuration.buildSessionFactory();
//first Object
        AnswerMany answerMany1 =new AnswerMany();
        answerMany1.setId(22);
        answerMany1.setAnswer("Java is a Programming Language");
//Second answer
        AnswerMany answerMany2 =new AnswerMany();
        answerMany2.setId(23);
        answerMany2.setAnswer("Pyhton is a Programming Language");
//Third answer
        AnswerMany answerMany3 =new AnswerMany();
        answerMany3.setId(24);
        answerMany3.setAnswer("Pyhton is a Programming Language");
// Adding into List
        List<AnswerMany> list=new ArrayList<>();
        list.add(answerMany1);
        list.add(answerMany2);
        list.add(answerMany3);
        QuestionMany questionMany = new QuestionMany();
        questionMany.setQuestionId(11);
        questionMany.setQuestion("What is Java?");
        questionMany.setAnswer(list);


// Second object:



//Saving Data
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(questionMany);
        session.save(answerMany1);
        session.save(answerMany2);
        session.save(answerMany3);
//Fetching Data
        QuestionMany questionMany1=session.load(QuestionMany.class,11);
        for (AnswerMany a:questionMany1.getAnswer()
             ) {
            System.out.println(a.getAnswer());
        }

        tx.commit();
        session.close();
    }
}
