package com.example.recipeapp.repository;

import com.example.recipeapp.model.Ingredient;
import com.example.recipeapp.model.User;
import org.aspectj.weaver.AjAttribute;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    private static final List<User> DATABASE_USERS = new ArrayList<>();
    
    static{
        DATABASE_USERS.add(new User(1,"Errrrrm","Nikola","Shwitse","errm@gmail.com"));
        DATABASE_USERS.add(new User(2,"Serogua","Sergey","Minotrovich","serga@gmail.com"));
        DATABASE_USERS.add(new User(3,"Eleonora","Nina","Ubdulahmatze","minovazai@gmail.com"));
    }
    public User addUser(User user){
        DATABASE_USERS.add(user); 
        return user;
    }
    public List<User> getAllUsers(){
        return List.copyOf(DATABASE_USERS);
    }
    public User findUserById(Integer id){
        return DATABASE_USERS
                .stream()
                .filter(u -> id.equals(u.getId()))
                .findFirst()
                .orElseThrow();
    }

    public void findUserByIdAndUpdate (Integer id, User updatedUser) {

        User existingUser = findUserById(updatedUser.getId());
        if (existingUser != null) {
            existingUser.setId(updatedUser.getId());
        }
    }
    public Boolean deleteById(Integer id){
        User user = DATABASE_USERS
                .stream()
                .filter(u->id.equals(u.getId()))
                .findFirst()
                .orElseThrow();
        DATABASE_USERS.remove(user);
        return true;
    }
    
    
    
}
