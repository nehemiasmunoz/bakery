package entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CostumerID")
    int id;
    @Column(name = "FirstName")
    String firstName;
    @Column(name = "LastName")
    String lastName;
    @Column(name = "Email")
    String email;
    @Column(name = "Address")
    String address;
    @Column(name = "PhoneNumber")
    String phoneNumber;
}
