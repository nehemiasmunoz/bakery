package entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

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
}
