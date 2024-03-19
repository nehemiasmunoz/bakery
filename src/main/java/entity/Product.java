package entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ProductID")
    int id;
    @Column(name = "Name")
    String name;
    @Column(name = "Description")
    String description;
    @Column(name = "Price")
    double price;
    @Column(name = "CategoryID")
    Category category;
    @Column(name = "ImageURL")
    String imageURL;
}
