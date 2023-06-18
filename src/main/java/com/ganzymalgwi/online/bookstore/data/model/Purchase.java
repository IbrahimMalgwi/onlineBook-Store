package com.ganzymalgwi.online.bookstore.data.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "purchase_history")
public class Purchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private Long bookId;
    private LocalDateTime date;
    private double amount;
    private LocalDateTime purchaseTime;
}
