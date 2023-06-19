package com.ganzymalgwi.online.bookstore.service;

import com.ganzymalgwi.online.bookstore.data.model.User;
import com.ganzymalgwi.online.bookstore.data.model.enums.Role;
import com.ganzymalgwi.online.bookstore.repository.UserRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
@NoArgsConstructor
public class UserServiceImpl implements UserService{
    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    private PasswordEncoder passwordEncoder;


    @Override
    public User saveUser(User user){
        user.setPassword((passwordEncoder.encode(user.getPassword())));
        user.setRole(Role.USER);
        user.setCreateTime(LocalDateTime.now());

        return userRepository.save(user);
    }


    @Override
    public Optional<User> findByUsername(String username){
        return userRepository.findByUserName(username);
    }

    @Override
    @Transactional
    public  void makeAdmin(String username){
        userRepository.updateUserRole(username, Role.ADMIN);
    }
}
