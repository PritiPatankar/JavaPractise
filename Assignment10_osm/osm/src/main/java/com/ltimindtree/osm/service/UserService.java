package com.ltimindtree.osm.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.ltimindtree.osm.model.User;

@Service
public class UserService {
    private final List<User> users = new ArrayList<>();
    public User addProduct(User user) {
        users.add(user);
        return user;
    }
     
}