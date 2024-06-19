package org.example.Dao;

import org.example.Model.Address;

import java.util.List;

public interface AddressDao  {
   void save(Address address);
   Address getAddressById(int id);
   void update(Address address);
   void delete(Address address);
   List<Address> getAllAddress();
}
