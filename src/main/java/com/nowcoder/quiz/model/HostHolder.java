package com.nowcoder.quiz.model;

import org.springframework.stereotype.Component;

@Component
public class HostHolder {

    //有用户访问时用于存放此次请求的用户信息，由于可能多用户同时登陆，为了实现线程安全所以使用 TheadLocal ！！
    private static ThreadLocal<User> users = new ThreadLocal<>();

    public User getUser() {
        return users.get();
    }

    public void setUser(User user) {
        users.set(user);
    }

    public void clear(){
        users.remove();
    }
}
