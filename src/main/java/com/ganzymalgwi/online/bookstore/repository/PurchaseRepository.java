package com.ganzymalgwi.online.bookstore.repository;

import com.ganzymalgwi.online.bookstore.data.model.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseRepository extends JpaRepository<Purchase, Long> {
}
