package org.example.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
    @Id
    int id;
    String addressType;
    String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
