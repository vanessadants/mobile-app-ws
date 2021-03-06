package com.example.mobileappws.ui.controller;

import com.example.mobileappws.ui.model.request.UserRequest;
import com.example.mobileappws.ui.model.response.UserResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("users")
public class UserController {

    @GetMapping
    public String getUser(@RequestParam(value = "page", defaultValue = "1") int page,
                          @RequestParam(value = "limit", defaultValue = "50") int limit){
        return "get user was called, with page = " + page + ", limit = " + limit;
    }

    @GetMapping(path="/{userId}", produces = {
            MediaType.APPLICATION_JSON_VALUE,
            MediaType.APPLICATION_XML_VALUE
    })
    public ResponseEntity<UserResponse> getUser(@PathVariable String userId){
        return new ResponseEntity<>(
                UserResponse.builder()
                    .firstName("Vanessa")
                    .lastName("Costa")
                    .email("vanessa.dantas796@gmail.com")
                    .build(),
                HttpStatus.OK);
    }

    @PostMapping(
            consumes = {
                MediaType.APPLICATION_JSON_VALUE,
                MediaType.APPLICATION_XML_VALUE},
            produces = {
                MediaType.APPLICATION_JSON_VALUE,
                MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<UserResponse> createUser(@Valid @RequestBody UserRequest userRequest){
        return new ResponseEntity<>(
                UserResponse.builder()
                    .email(userRequest.getEmail())
                    .firstName(userRequest.getFirstName())
                    .lastName(userRequest.getLastName())
                    .build(),
                HttpStatus.CREATED);
    }

    @PutMapping
    public String updateUser(){
        return "update user was called";
    }

    @DeleteMapping
    public String deleteUser(){
        return "delete user was called";
    }
}
