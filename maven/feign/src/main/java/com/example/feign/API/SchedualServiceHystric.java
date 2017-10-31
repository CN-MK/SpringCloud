package com.example.feign.API;

import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class SchedualServiceHystric implements Service{
    @Override
    public List UsersList() {
        return null;}


    @Override
    public String InsertUser() {
        return "Insert Failed ";
    }

    @Override
    public String UpdateUser() {
        return "Update Failed";
    }

    @Override
    public String VerifyUser(String name, String pwd) {
        return "Verify server failed";
    }

    @Override
    public String DeleteById(long id) {
        return "Delete failed";
    }
}
