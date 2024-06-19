package org.example.Dao;

import org.example.Model.Address;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AddressDaoImpl implements AddressDao {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public void save(Address address) {
        Session session = sessionFactory.getCurrentSession();
        session.save(address);
    }

    @Override
    public Address getAddressById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Address.class, id);
    }

    @Override
    public void update(Address address) {
        Session session = sessionFactory.getCurrentSession();
       session.update(address);
    }

    @Override
    public void delete(Address address) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(address);
    }

    @Override
    public List<Address> getAllAddress() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("FROM Address").getResultList();
    }
}
