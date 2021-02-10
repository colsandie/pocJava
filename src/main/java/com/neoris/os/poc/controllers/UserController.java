package com.neoris.os.poc.controllers;

import com.neoris.os.poc.entities.User;
import com.neoris.os.poc.repositories.UserRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * UserController
 * Descripcion:
 * <p>
 * <p>
 * Control de versiones:
 * Version  Date/Hour               	  By                 				Company     Description
 * -------  -------------------     	  ----------------    				--------    -----------------------------------------------------------------
 * 1.0      08/02/2021/11:11 a. m.         [Diego Colchado S.]              NEORIS	    Creacion de clase UserController.java
 */
@RestController
@CrossOrigin(origins =  "http://poc-angular-git-poc-angular3.apps.devsecops.zkhj.p1.openshiftapps.com")
public class UserController {
    /**
     * Repositorio de Usuario
     */
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return (List<User>) userRepository.findAll();
    }

    @PostMapping("/users")
    void addUser(@RequestBody User user) {
        userRepository.save(user);
    }
}
