package com.example.mysql.dao;

import com.example.mysql.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void selectOne() throws Exception {
        System.out.print(userDao.selectByName("mk"));
    }

    @Test
    public void select() throws Exception {
        System.out.print(userDao.select());
    }

    @Test
    public void verify() throws Exception{
        User user=new User("justin","123");
        System.out.print(userDao.verify(user));
    }
    @Test
    public void insert() throws Exception{
        User user=new User("ck","123",'F',"12345645612","163","C00","yes");
        userDao.insert(user);
        System.out.print(userDao.selectByName(user.getName()));
    }
    @Test
    public void update() throws Exception{
        User user = new User("jiangnan","321");
        user.setId(6L);
        userDao.update(user);
    }
    @Test
    public  void delete() throws Exception{
        userDao.delete(2L);
    }
}