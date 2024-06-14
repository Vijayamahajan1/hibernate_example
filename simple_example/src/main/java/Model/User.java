package Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
     @Id
    int id;
    String name;
    String address;
}
