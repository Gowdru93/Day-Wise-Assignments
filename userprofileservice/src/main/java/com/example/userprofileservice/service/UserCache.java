package com.example.userprofileservice.service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.example.userprofileservice.model.UserProfile;

public class UserCache {

	
	 public static Map<String, UserProfile> cache = new ConcurrentHashMap<>();

	    static {
	        cache.put("u1", new UserProfile("u1", "Alice (Cached)", "alice@cached.com"));
	        cache.put("u2", new UserProfile("u2", "Bob (Cached)", "bob@cached.com"));
	    }
}
