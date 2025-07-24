package org.sn.shopliker.services;

import org.sn.shopliker.entity.User;
import org.sn.shopliker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return (List<User>)userRepository
                .findAll();
    }

    @Override
    public User updatUser(User user, Long userId) {
        return null;
    }

    @Override
    public void deleteUserById(Long userId) {
       userRepository.deleteById(userId);
    }

    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
