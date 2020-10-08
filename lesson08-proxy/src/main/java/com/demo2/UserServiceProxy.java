package com.demo2;

public class UserServiceProxy implements UserService {
    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService){
        this.userService = userService;
    }
    public void add() {
        userService.add();
    }

    public void delete() {
        userService.delete();
    }

    public void update() {
        userService.update();
    }

    public void query() {
        userService.add();
    }

    public void log(String msg){
        System.out.println("use "+msg+" method");
    }
}
