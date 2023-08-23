package com.vz.adapt.adaptusers;

import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController()
@RequestMapping("/api/user")
public class UserController {

    // @GetMapping("/{id}",consumes =
    // "application/json",produces="application/json")
    @Operation(method = "getUserInfo")
    @GetMapping("/{id}")
    public String getUserInfo(@RequestParam String userId) {
        return "User with id" + userId + " is a valid user";
    }

}
