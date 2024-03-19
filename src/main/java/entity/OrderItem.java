package entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "OrderItemID")
    int id;

    //Order relation
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "OrderID",nullable = false)
    Order order;

    //Product relation
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ProductID", nullable = false)
    Product product;

    @Column(name = "Quantity")
    int quantity;
    @Column(name = "UnitPrice")
    double unitPrice;
}
