package com.example.recipeapp.controller;

import com.example.recipeapp.model.User;
import com.example.recipeapp.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/users")
public class UserController {
    private final IUserService userService;
    
    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }
    @GetMapping("{id}")
    public ResponseEntity<User> getUser(@PathVariable ("id") Integer id){
        return ResponseEntity.ok(userService.findById(id));
    }
    @PostMapping
    public ResponseEntity<User>addUser(@RequestBody User user) {
        user.setId(userService.getAllUsers().size()+1);
        return ResponseEntity.created(getLocation(user.getId())).body(userService.addUser(user));
    }

    @DeleteMapping({"id"})
    public ResponseEntity<Boolean> deleteUser(@PathVariable ("id") Integer id) {
        return ResponseEntity.ok(userService.deleteById(id));
    }
    @PutMapping("{id}")
    public ResponseEntity<User> updateUser(@PathVariable("id") Integer id, @RequestBody User updatedUser) {
        return ResponseEntity.ok(userService.updateUser(id, updatedUser));
    }

    private URI getLocation(Integer id) {
        return ServletUriComponentsBuilder.fromCurrentRequest().path("{id}").buildAndExpand(id).toUri();
    }
    
}
