package com.example.demo.repository;

import com.example.demo.model.User;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {

    private final Map<Integer, User> usersDatabase;

    public UserRepository() {
        usersDatabase = new HashMap<>();

        usersDatabase.put(1, new User("cracker", "cracker1234", true, 0));
        usersDatabase.put(2, new User("marry", "marietta!#09", true, 0));
        usersDatabase.put(3, new User("silver", "$silver$", true, 0));
    }

    public boolean checkLogin(final String login, final String password) {

        return usersDatabase.entrySet().stream().anyMatch(x->{
            if(x.getValue().getLogin().equals(login)){
                if(x.getValue().isActive()){
                    if (x.getValue().getPassword().equals(password)){
                        x.getValue().resetCounter();
                        return true;
                    } else {
                        if(x.getValue().getIncorrectLoginCounter()<2){
                            x.getValue().addCounter();
                        } else {
                            x.getValue().setActive(false);
                        }
                        return false;
                    }
                } else {
                    throw new IllegalStateException("Account not active");
                }
            }

            return false;
        });
    }
}
