package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        User u1 = new User();
         u1.setId(2);
         u1.setName("Sham");
         u1.setAddress("mumbai");


        session.save(u1);
        System.out.println("Successfully saved data");

        transaction.commit();
        session.close();
        }
    }
