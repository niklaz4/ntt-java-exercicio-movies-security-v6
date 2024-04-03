package com.example.academiacx;

import com.example.academiacx.UserFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserFacadeImpl implements UserFacade {

    @Autowired
    private UserService userService;

    @Override
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @Override
    public Optional getUserById(Long id){
        return userService.getUserById(id);
    }

    @Override
    public User saveUser(User user){
        return userService.saveUser(user);
    }

    @Override
    public User updateUser(User user){
        return userService.updateUser(user);
    }

    @Override
    public void deleteUser(Long id){
        userService.deleteUser(id);
    }
}
