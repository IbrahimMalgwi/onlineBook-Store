package com.ganzymalgwi.online.bookstore.data.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
public class Purchase {

    @Id
    private Long userId;
    private Long bookId;
    private LocalDateTime date;
    private BigDecimal amount;
}
