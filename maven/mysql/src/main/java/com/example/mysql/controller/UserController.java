package com.example.mysql.controller;

import com.example.mysql.dao.UserDao;
import com.example.mysql.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserDao userDao;


    @RequestMapping("/all")
    public List select(){
        //处理get请求，获取用户列表
        return userDao.select();
    }


    @RequestMapping("/insertParam")
    public List<User> insert(User user, HttpServletRequest request){
        userDao.insert(user);
        return userDao.selectByName(user.getName());
    }


    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public String delete(@PathVariable Long id){
        //处理“/user/{id}”的get请求，获取url中id值的user信息
        //url的id通过PathVariable绑定到函数参数中
        userDao.delete(id);
        return "index";
    }


    @RequestMapping("/updateParam")
    public List<User> update(User user, HttpServletRequest request){
        userDao.update(user);
        return userDao.selectByName(user.getName());
    }


    @RequestMapping("/verify")
    public User verify(User user, HttpServletRequest request){
        user.setName(request.getParameter("UserId"));
        user.setPwd(request.getParameter("password"));
            return userDao.verify(user);
    }

}
