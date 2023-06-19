package com.ganzymalgwi.online.bookstore.service;

import com.ganzymalgwi.online.bookstore.repository.PurchaseRepository;

import java.util.List;

public interface PurchaseService {
    List<PurchaseRepository> findPurchasedItemsOfUser(Long userId);
}
