package com.example.demo.model;

public class User {

    private String login;
    private String password;
    private boolean active;
    int incorrectLoginCounter;

    public User(String login, String password, boolean active, int incorrectLoginCounter) {
        this.login = login;
        this.password = password;
        this.active = active;
        this.incorrectLoginCounter = incorrectLoginCounter;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active){
        this.active=active;
    }

    public void resetCounter(){
        this.incorrectLoginCounter=0;
    }

    public void addCounter(){
        this.incorrectLoginCounter++;
    }

    public int getIncorrectLoginCounter() {
        return incorrectLoginCounter;
    }
}
