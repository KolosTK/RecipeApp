package com.example.recipeapp.service;

import com.example.recipeapp.model.User;
import com.example.recipeapp.repository.InMemoryUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class InMemoryUserService implements UserService{
    private final InMemoryUserRepository inMemoryUserRepository;


    @Override
    public User addUser(User user) {
        return inMemoryUserRepository.addUser(user);
    }

    @Override
    public List<User> getAllUsers() {
        return inMemoryUserRepository.getAllUsers();
    }

    @Override
    public User findById(Integer id) {
        return inMemoryUserRepository.findUserById(id);
    }

    @Override
    public User updateUser(Integer id,User user) {
        inMemoryUserRepository.findUserByIdAndUpdate(id, user);
        return user;
    }

    @Override
    public Boolean deleteById(Integer id) {
        return inMemoryUserRepository.deleteById(id);
    }
}
