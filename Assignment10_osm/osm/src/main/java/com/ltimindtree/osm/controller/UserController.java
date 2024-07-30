package com.ltimindtree.osm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ltimindtree.osm.model.User;
import com.ltimindtree.osm.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController{
    
    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<User> addProduct(@RequestBody User user){
        return ResponseEntity.ok(userService.addProduct (user));
    }
}