package com.fy.demo.controller;

import com.fy.demo.model.User;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
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

    //@PostMapping(path = "")
    //public String addUser() {
    //    return "add user";
    //}


    // Path defined as add
    // Returns defined as User class
    // It's a post request function, user informations getted from user in requestBody
    @PostMapping(path = "/add")
    public User addUser(@RequestBody User user) {
        System.out.println("add user : " + user);

        if (user.getName() != null && user.getSurname() != null &&
                user.getEmail() != null && user.getPassword() != null &&
                user.getUsername() != null) {
            System.out.println("USER SAVED : " + user.getEmail() + " " + user.getSurname());

            return user;
        } else {
            System.out.println("USER COULDNT SAVE : " + user.getName() + " " + user.getSurname());

            return user;
        }
    }

    @PutMapping(path = "/1")
    public String updateUser() {
        return "update user with id 1";
    }

    @DeleteMapping(path = "/1")
    public String deleteUser() {
        return "delete user";
    }

    @PatchMapping(path = "/1")
    public String updateUsersField() {
        return "update users field";
    }
}
