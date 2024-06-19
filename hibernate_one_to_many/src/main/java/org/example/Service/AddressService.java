package org.example.Service;

import org.example.Model.Address;
import org.example.Model.Employee;

import java.util.List;

public interface AddressService {

    void save(Address address);
    Address getAddressById(int id);
    void update(Address address);
    void delete(Address address);
    List<Address> getAllAddress();

}
