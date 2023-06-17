package com.ganzymalgwi.online.bookstore.repository;

import com.ganzymalgwi.online.bookstore.data.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
