package entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name = "Orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "OrderID")
    int id;

    //Customer relation
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "CustomerID", nullable = false)
    Customer customer;

    @Column(name = "OrderDate")
    LocalDate orderDate;
    @Column(name = "TotalAmount")
    double totalAmount;

    //OrderItem relation
    @OneToMany(mappedBy = "order")
    List<OrderItem> orderItemList;
}
