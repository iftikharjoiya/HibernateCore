package com.ManyToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class demoApp {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.config.xml");
        SessionFactory factory = configuration.buildSessionFactory();
        Session session=factory.openSession();
        Transaction tr=session.beginTransaction();
        Employee e1=new Employee();
        Employee e2=new Employee();

        Projects p1=new Projects();
        Projects p2=new Projects();

        e1.setEmployeeId(1);
        e1.setEmployeeName("One");

        e2.setEmployeeId(2);
        e2.setEmployeeName("Two");

        p1.setProjectId(11);
        p1.setProjectName("Web");

        p2.setProjectId(12);
        p2.setProjectName("Visual");

        List<Projects> projectsList=new ArrayList<>();
        List<Employee> employeeList=new ArrayList<>();

        projectsList.add(p1);
        projectsList.add(p2);

        employeeList.add(e1);
        employeeList.add(e2);

        e1.setProject(projectsList);
        p1.setEmployee(employeeList);
        session.save(e1);
        session.save(p1);
        tr.commit();
        session.close();
    }
}
