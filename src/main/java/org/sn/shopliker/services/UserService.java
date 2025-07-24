package org.sn.shopliker.services;

import org.sn.shopliker.entity.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);

    List<User> getAllUsers();

    User updatUser(User user, Long userId);

    void deleteUserById(Long userId);
    public User findByEmail(String email);
}
