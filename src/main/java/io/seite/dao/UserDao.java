package io.seite.dao;

import io.seite.entity.User;
import io.seite.mappers.UserMapper;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDao implements Dao {

    /*@Autowired
    public JdbcTemplate jdbcTemplate;*/

    @Autowired
    private SessionFactory sessionFactory;

    /*@Override
    public List<User> findAll() {
        String sql = "select * from user";
        return jdbcTemplate.query(sql, new UserMapper());
    }

    @Override
    public User getUser(int id) {
        String sql = "select * from user where id = ?";
        return (User) jdbcTemplate.queryForObject(sql, new UserMapper(), id);
    }

    @Override
    public User getUserByEmail(String email) {

        String sql = "select * from users where username = ?";
        return (User) jdbcTemplate.queryForObject(sql, new UserMapper(), email);
    }*/

    @Override
    public User findUserByUsername(String username) {
        return sessionFactory.getCurrentSession().get(User.class, username);
    }
}
