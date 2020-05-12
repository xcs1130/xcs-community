package com.xcs.community.util;

import com.xcs.community.entity.User;
import org.springframework.stereotype.Component;

/**
 * @author xcs
 * @create 2020-04-24 15:13
 * 持有用户信息，用于代替session对象
 */
@Component
public class HostHolder {

    private ThreadLocal<User> users = new ThreadLocal<>();

    public void setUser(User user) {
        users.set(user);
    }
    public User getUser() {
        return users.get();
    }

    public void clear() {
        users.remove();
    }
}
