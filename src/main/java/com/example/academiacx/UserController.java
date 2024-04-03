package com.example.academiacx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserFacade userFacade;

    @GetMapping("/list")
    public List<User> getAllUsers(){
        return userFacade.getAllUsers();
    }

    @GetMapping("/{id}")
    public UserService getUserById(@PathVariable Long id){
        return (UserService) userFacade;
    }

    @PostMapping("/save")
    public User saveUser(@RequestBody User user){
        return userFacade.saveUser(user);
    }

    @PutMapping("/update")
    public User updateUser(@RequestBody User user){
        return userFacade.updateUser(user);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Long id){
        userFacade.deleteUser(id);
    }
}
