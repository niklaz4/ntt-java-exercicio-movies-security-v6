package com.example.academiacx;

import java.util.List;
import java.util.Optional;

public interface UserFacade {

    List<User> getAllUsers();

    Optional getUserById(Long id);

    User saveUser(User user);

    User updateUser(User user);

    void deleteUser(Long id);
}
