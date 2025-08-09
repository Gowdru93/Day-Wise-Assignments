package com.example.userprofileservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.userprofileservice.model.UserProfile;

public interface UserProfileRepository  extends JpaRepository<UserProfile, String>{

}
