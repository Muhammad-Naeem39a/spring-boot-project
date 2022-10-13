package com.sufyan.demo.controller;

import com.sufyan.demo.model.UserModel;
import com.sufyan.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/user")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("")
    public ResponseEntity<UserModel> update(@RequestBody UserModel usermodel) {
        return (new ResponseEntity<>(userService.addUser(usermodel), HttpStatus.CREATED));
    }

    @GetMapping("")
    public ResponseEntity<Page<UserModel>> getAllResults(Pageable pageable) {
        return new ResponseEntity<>( userService.getAllUsers(pageable), HttpStatus.OK);
    }

}
