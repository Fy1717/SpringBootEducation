package com.fy.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/users")
public class UserController {
    @GetMapping(path = "")
    //@RequestMapping(path = "/users", method = RequestMethod.GET)
    public String getAllUsers() {
        return "get all users";
    }

    @GetMapping(params = {"nation"})
    public String getUsersWithNation(@RequestParam("nation") String nation) {
        return "there is " + nation + " people";
    }

    @GetMapping(params = {"id"})
    public String getUsersWithId(@RequestParam("id") int id) {
        return "user id is : " + id;
    }

    @GetMapping(path = "/1")
    public String getOneUser() {
        return "get one user";
    }

    @PostMapping(path = "")
    public String addUser() {
        return "add user";
    }

    @PutMapping(path = "/1")
    public String updateUser() {
        return "update user with id 1";
    }

    @PatchMapping(path = "/1")
    public String updateUsersField() {
        return "update users field";
    }

    @DeleteMapping(path = "/1")
    public String deleteUser() {
        return "delete user";
    }
}
