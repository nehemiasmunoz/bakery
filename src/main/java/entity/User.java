package entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UserID")
    int id;
    @Column(name = "Username")
    String name;
    @Column(name = "Password")
    String password;
    @Column(name = "Role")
    UserRole role;
}
