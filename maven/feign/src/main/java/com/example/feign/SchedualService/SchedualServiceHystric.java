package com.example.feign.SchedualService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Component
public class SchedualServiceHystric implements Service {
    @Override
    public String Users() {
        return "SQL no work";
    }
}
