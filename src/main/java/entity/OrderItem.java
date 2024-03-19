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
    @Column(name = "OrderID")
    int orderID;
    @Column(name = "ProductID")
    Product product;
    @Column(name = "Quantity")
    int quantity;
    @Column(name = "UnitPrice")
    double unitPrice;
}
