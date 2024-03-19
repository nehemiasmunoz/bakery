package entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UserID")
    int id;
    @Column(name = "Name")
    String name;

    //Product relation
    @OneToMany(mappedBy = "categoria")
    List<Product> productList;
}
