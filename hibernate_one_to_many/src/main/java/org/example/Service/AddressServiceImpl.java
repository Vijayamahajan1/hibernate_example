package org.example.Service;

import org.example.Dao.AddressDao;
import org.example.Model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    AddressDao addressDao;


    @Override
    public void save(Address address) {
    this.addressDao.save(address);
    }

    @Override
    public Address getAddressById(int id) {
        return this.addressDao.getAddressById(id);
    }

    @Override
    public void update(Address address) {
        this.addressDao.update(address);
    }

    @Override
    public void delete(Address address) {
      this.addressDao.delete(address);
    }

    @Override
    public List<Address> getAllAddress() {
        return this.addressDao.getAllAddress();
    }
}
