package com.ganzymalgwi.online.bookstore.repository;

import com.ganzymalgwi.online.bookstore.data.model.User;
import com.ganzymalgwi.online.bookstore.data.model.enums.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUserName(String username);

    @Modifying
    @Query("update User set role = :role where userName = :username")
    void updateUserRole(@Param("username") String username, @Param("role")Role role);
}
