package com.example.msusuario.service.impl;

import com.example.msusuario.entity.User;
import com.example.msusuario.repository.UserRepository;
import com.example.msusuario.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public List<User> list() {
        return userRepository.findAll();
    }
    @Override
    public Optional<User> findById(Integer id) {
        return userRepository.findById(id);
    }
    @Override
    public User save(User user) {
        return userRepository.save(user);
    }
    @Override
    public User update(User user) {
        return userRepository.save(user);
    }
    @Override
    public void delete(Integer id) { userRepository.deleteById(id);
    }
}
