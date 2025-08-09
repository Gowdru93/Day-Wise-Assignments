package com.example.userprofileservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.userprofileservice.model.UserProfile;
import com.example.userprofileservice.service.UserService;

@RestController
@RequestMapping("/users")
public class UserProfileController {
	 private final UserService userService;

	    // Manual constructor instead of @RequiredArgsConstructor
	    public UserProfileController(UserService userService) {
	        this.userService = userService;
	    }

	    @GetMapping("/{id}")
	    public UserProfile getUser(@PathVariable String id) {
	        return userService.getUserById(id);
	    }
}
