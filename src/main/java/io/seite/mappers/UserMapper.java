package io.seite.mappers;

import io.seite.entity.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper {
    @Override
    public User mapRow(ResultSet rs, int i) throws SQLException {
        User user = new User();
        /*user.setId(rs.getInt("id"));
        user.setName(rs.getString("name"));
        user.setEmail(rs.getString("email"));
        user.setAge(rs.getInt("age"));
        user.setPassword(rs.getString("password"));*/

        /*user.setPassword(rs.getString("password"));
        user.setName(rs.getString("username"));*/

        return user;
    }
}
