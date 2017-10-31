package com.example.feign.API;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@FeignClient(value = "SERVICE-SQL",fallback = SchedualServiceHystric.class)//指定调用SERVICE-SQL服务的接口
public interface Service {
    @RequestMapping(value = "/all",method = RequestMethod.GET)
    List UsersList();
    @RequestMapping(value = "/insertParam",method = RequestMethod.GET)
    String InsertUser();
    @RequestMapping(value = "/updateParam",method = RequestMethod.GET)
    String UpdateUser();
    @RequestMapping(value = "/verify",method = RequestMethod.POST)
    String VerifyUser(@RequestParam(value = "UserId") String name,@RequestParam(value = "password") String pwd);
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    String DeleteById(long id);
}