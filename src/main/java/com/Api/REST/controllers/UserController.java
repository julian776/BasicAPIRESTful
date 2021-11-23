package com.Api.REST.controllers;

import com.Api.REST.models.UserModel;
import com.Api.REST.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping
    public ArrayList<UserModel> getAllUsers(){
        return userService.getUsers();
    }

    @PostMapping
    public UserModel saveUser(@RequestBody UserModel user){
        return this.userService.saveUser(user);
    }

    @GetMapping(path = "/{id}")
    public Optional<UserModel> getUserById(@PathVariable("id") Long id){
        return this.userService.getById(id);
    }

    @GetMapping(path = "/query")
    public ArrayList<UserModel> getUserByPriority(@PathVariable("priority") int prioridades){
        return this.userService.getByPriority(prioridades);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteUserById(@PathVariable("id") Long id){
        boolean ok = this.userService.deleteUser(id);
        if(ok == true){
            return "Se elimino correctamente el id "+id;
        }
        else{
            return "No se pudo eliminar el id proporcionado ("+id+")";
        }
    }
}
