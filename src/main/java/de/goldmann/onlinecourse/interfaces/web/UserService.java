package de.goldmann.onlinecourse.interfaces.web;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    private static Map<String, String> users = new HashMap<>();
    static  {
        users.put("1", "Nano");
        users.put("2", "Nano");
    }
    public Map<String, String> getUsers(){
        return this.users;
    }
}
