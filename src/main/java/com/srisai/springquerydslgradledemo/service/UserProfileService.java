package com.srisai.springquerydslgradledemo.service;

import com.srisai.springquerydslgradledemo.model.UserProfile;

import java.util.List;

public interface UserProfileService {

    public List<UserProfile> getAllUsers();

    public List<UserProfile> getUsersByName(String name);
}
