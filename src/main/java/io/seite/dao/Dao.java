package io.seite.dao;

import io.seite.entity.User;

import java.util.List;

public interface Dao {

    /*List<User> findAll();

    User getUser(int id);

    User getUserByEmail(String email);*/

    User findUserByUsername(String username);

}
