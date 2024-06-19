package org.example.Controller;

import org.example.Model.Address;
import org.example.Service.AddressServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import java.util.List;

@RestController
@RequestMapping("/OneToMany")
public class AddressController  {
    @Autowired
    AddressServiceImpl addressService;

@PostMapping("/save")
public void save(@RequestBody Address address) {
 addressService.save(address);
}

@GetMapping("/getall")
    public List<Address> getAllAddress(){
    return addressService.getAllAddress();
    }

@GetMapping("/{id}")
    public Address getAddressById(@PathVariable("id") int id,@RequestBody Address address){
    return addressService.getAddressById(id);
}

@PutMapping("/update/{id}")
    public void updateAddress(@PathVariable("id") int id ,@RequestBody Address address){
    address.setId(id);
    addressService.update(address);
}
@DeleteMapping("/delete/{id}")
    public void deleteAddress(@PathVariable("id") int id){
    Address address = addressService.getAddressById(id);
    addressService.delete(address);
}
}
