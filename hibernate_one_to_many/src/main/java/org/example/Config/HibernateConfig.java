package org.example.Config;

import org.example.Model.Address;
import org.example.Model.Employee;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;

public class HibernateConfig {
    public  static SessionFactory getSessionFactory(){
        Properties prop = new Properties();
        prop.setProperty("hibernate.connection.driver_class","org.postgresql.Driver");
        prop.setProperty("hibernate.connection.url","jdbc:postgresql://localhost:5432/employeedb");
        prop.setProperty("hibernate.connection.username","postgres");
        prop.setProperty("hibernate.connection.password","root");
        prop.setProperty("hibernate.dialect","org.hibernate.dialect.PostgreSQL10Dialect");
        prop.setProperty("hibernate.show_sql","true");
        prop.setProperty("hibernate.hbm2ddl.auto","create");

        Configuration cfg = new Configuration().addAnnotatedClass(Employee.class).addAnnotatedClass(Address.class).setProperties(prop);

        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();

        return cfg.buildSessionFactory(serviceRegistry);
    }

}
