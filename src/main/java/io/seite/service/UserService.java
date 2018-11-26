package io.seite.service;

import io.seite.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    User getUser(int id);

    User getGetUserByEmail(String email);

    User findUserByUsername(String username);
}
