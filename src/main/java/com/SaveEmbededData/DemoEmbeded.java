package com.SaveEmbededData;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

// Class for Embeded Entities
public class DemoEmbeded {
    public static void main(String[] args) {
        Configuration configuration=new Configuration();
        configuration.configure("hibernate.config.xml");
        SessionFactory factory=configuration.buildSessionFactory();
        // Creating Course Class Object....
        Course course=new Course();
        course.setCourseName("Java");
        course.setCourseDuration("1.5 Month");

        // Creating StudentDetail Class object...
        StudentDetail detail=new StudentDetail();
        detail.setId(888);
        detail.setName("Awais");
        detail.setCourse(course);

        // Creating Another Course Class Object....
        Course course1=new Course();
        course1.setCourseName("Python");
        course1.setCourseDuration("5 Month");

        // Creating Another StudentDetail Class object...
        StudentDetail detail1=new StudentDetail();
        detail1.setId(999);
        detail1.setName("Ahmad");
        detail1.setCourse(course1);


        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        session.save(detail);
        session.save(detail1);
        tx.commit();
        session.close();
    }
}
