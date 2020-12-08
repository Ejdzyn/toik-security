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
        // TODO: Prosze dokonczyc implementacje...

        return false;
    }
}
