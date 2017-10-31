package com.example.feign;

import com.example.feign.API.Service;
import com.example.feign.controller.UserController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.ui.ModelMap;

import javax.servlet.http.HttpServletRequest;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FeignApplicationTests {
@Autowired
UserController service;
	@Test
	public void contextLoads() {
		ModelMap map = null;
		System.out.println(service.SelectAllUser(map));
			//model.addAttribute("user", service.UsersList());
		//	return "login";


}}
