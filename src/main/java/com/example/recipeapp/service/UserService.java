package com.example.recipeapp.service;

import com.example.recipeapp.model.User;

import java.util.List;

public interface UserService {
    User addUser(User user);
    List<User> getAllUsers();
    User findById(Integer id);
    User updateUser(Integer id,User user);
    Boolean deleteById(Integer id);
    
}
