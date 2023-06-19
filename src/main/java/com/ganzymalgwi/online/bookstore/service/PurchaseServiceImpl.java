package com.ganzymalgwi.online.bookstore.service;

import com.ganzymalgwi.online.bookstore.data.model.Purchase;
import com.ganzymalgwi.online.bookstore.repository.PurchaseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PurchaseServiceImpl implements PurchaseService{

    @Autowired
    private final PurchaseRepository purchaseRepository;

    public Purchase savePurchaseHistory(Purchase purchaseHistory){
        purchaseHistory.setPurchaseTime(LocalDateTime.now());
        return purchaseRepository.save(purchaseHistory);
    }

    @Override
    public List<PurchaseRepository> findPurchasedItemsOfUser(Long userId){
        return purchaseRepository.findPurchasedItemsOfUser(userId);
    }


}
