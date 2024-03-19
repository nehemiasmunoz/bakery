package entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "Orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "OrderID")
    int id;
    @Column(name = "CustomerID")
    Customer customer;
    @Column(name = "OrderDate")
    LocalDate orderDate;
    @Column(name = "TotalAmount")
    double totalAmount;

}
