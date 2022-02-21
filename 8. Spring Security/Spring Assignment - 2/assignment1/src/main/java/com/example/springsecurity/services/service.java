package com.example.springsecurity.services;

import java.util.List;

import com.example.springsecurity.models.User;

public interface service {

    public List<User> getAllUsers();

    public User getUser(String username);

    public User addUser(User user);
}
