package com.example.mysql;

import com.example.mysql.controller.UserController;
import com.example.mysql.dao.UserDao;
import com.example.mysql.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MysqlApplicationTests {
    @Autowired
    UserController userController;
	@Test
	public void contextLoads() {

       // System.out.println(userController.select().size());
        User user=new User("justin","123");
        HttpServletRequest request=null;

        System.out.println(userController.verify(user,request));
    }





}
