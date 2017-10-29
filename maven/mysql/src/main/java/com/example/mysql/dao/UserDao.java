package com.example.mysql.dao;

import com.example.mysql.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    List selectByName(String name);
    int insert(User user);
    void update(User user);
    void delete(Long id);
    int verify(User user);
    List<User> select();
}
