package entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

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

    // Category relation
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn (name = "CategoryID", nullable = false)
    Category category;

    @Column(name = "ImageURL")
    String imageURL;

    // OrderItem relation
    @OneToMany(mappedBy = "product")
    List<OrderItem> orderItemList;

    //Ingredient relation
    @ManyToMany(mappedBy = "productList",cascade = CascadeType.ALL)
    List<Ingredient> ingredientList;
}
