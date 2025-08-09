package com.example.userprofileservice.service;

import org.springframework.stereotype.Service;

import com.example.userprofileservice.model.UserProfile;
import com.example.userprofileservice.repository.UserProfileRepository;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class UserService {

	
	 private final UserProfileRepository userRepository;

	    // Manual constructor 
	    public UserService(UserProfileRepository userRepository) {
	        this.userRepository = userRepository;
	    }

	    // Simulate DB failure testing
	    @CircuitBreaker(name = "userProfileCB", fallbackMethod = "getUserFromCache")
	    public UserProfile getUserById(String id) {

	        // Uncomment this line to simulate DB down
	        //if (true) throw new RuntimeException("DB DOWN");

	        UserProfile user = userRepository.findById(id)
	                .orElseThrow(() -> new RuntimeException("User not found in DB"));

	        UserCache.cache.put(id, user); // update cache
	        return user;
	    }

	    public UserProfile getUserFromCache(String id, Throwable t) {
	        System.out.println("Fallback triggered: " + t.getMessage());

	        return UserCache.cache.getOrDefault(id,
	                new UserProfile("0", "Fallback User", "not.available@fallback.com"));
	    }
}
