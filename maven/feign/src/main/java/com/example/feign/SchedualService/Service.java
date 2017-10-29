package com.example.feign.SchedualService;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "SERVICE-SQL",fallback = SchedualServiceHystric.class)
public interface Service {
    @RequestMapping(value = "/all",method = RequestMethod.GET)
    String Users();
}
