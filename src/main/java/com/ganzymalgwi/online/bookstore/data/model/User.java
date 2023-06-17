package com.ganzymalgwi.online.bookstore.data.model;

import com.ganzymalgwi.online.bookstore.data.model.enums.Role;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String userName;
    private String password;
    private BigDecimal amount;
    private Role role;

}
