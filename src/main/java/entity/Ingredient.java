package entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IngredientID")
    int id;
    @Column(name = "Name")
    String name;
    @Column(name = "Quantity")
    double quantity;
    @Column(name = "Unit")
    String unit;
    @Column(name = "ExpiryDate")
    LocalDate date;

    //Product relation
    @ManyToMany()
    @JoinTable(name = "ProductIngredient", joinColumns = @JoinColumn(name = "IngredientID",nullable = false),inverseJoinColumns = @JoinColumn(name = "ProductID",nullable = false))
    List<Product> productList;
}
