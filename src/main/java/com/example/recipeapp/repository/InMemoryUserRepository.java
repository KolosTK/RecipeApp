package com.example.recipeapp.repository;

import com.example.recipeapp.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryUserRepository {
    private static final List<User> DATABASE = new ArrayList<>();
    
    static{
        DATABASE.add(new User(1,"Errrrrm","Nikola","Shwitse"));
        DATABASE.add(new User(2,"Serogua","Sergey","Minotrovich"));
        DATABASE.add(new User(3,"Eleonora","Nina","Ubdulahmatze"));
    }
    public User addUser(User user){
        DATABASE.add(user);
        return user;
    }
    public List<User> getAllUsers(){
        return List.copyOf(DATABASE);
    }
    public User findUserById(Integer id){
        return DATABASE
                .stream()
                .filter(u -> id.equals(u.getId()))
                .findFirst()
                .orElseThrow();
    }
    
    public User findUserByIdAndUpdate(Integer id, User updatedUser)
    {
        for (User user : DATABASE) {
            if (user.getId().equals(id)) {
                user.setUsername(updatedUser.getUsername());
                user.setFirstName(updatedUser.getFirstName());
                user.setLastName(updatedUser.getLastName());
                return user;
            }
        }
        throw new RuntimeException("User not found");
        
    }
    public Boolean deleteById(Integer id){
        User user = DATABASE
                .stream()
                .filter(u->id.equals(u.getId()))
                .findFirst()
                .orElseThrow();
        DATABASE.remove(user);
        return true;
    }
    
    
    
}
