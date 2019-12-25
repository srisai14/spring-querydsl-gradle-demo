package com.srisai.springquerydslgradledemo.service;

import com.querydsl.jpa.impl.JPAQuery;
import com.srisai.springquerydslgradledemo.model.QUserProfile;
import com.srisai.springquerydslgradledemo.model.UserProfile;
import com.srisai.springquerydslgradledemo.repository.UserProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
public class UserProfileServiceImpl implements UserProfileService {

    @Autowired
    public UserProfileRepository userProfileRepository;

    @PersistenceContext
    public EntityManager entityManager;

    @Override
    public List<UserProfile> getAllUsers() {
        return userProfileRepository.findAll();
    }

    @Override
    public List<UserProfile> getUsersByName(String name) {
        QUserProfile qUserProfile = QUserProfile.userProfile;

        JPAQuery<UserProfile> query = new JPAQuery(entityManager);

        return query.from(qUserProfile).where(qUserProfile.firstName.startsWithIgnoreCase( name )
                                        .or(qUserProfile.lastName.startsWithIgnoreCase( name ))
                                        .or(qUserProfile.userId.startsWithIgnoreCase( name ))
                                        .or(qUserProfile.firstName.containsIgnoreCase( name )
                                        .or(qUserProfile.lastName.containsIgnoreCase( name ))
                                        .or(qUserProfile.userId.containsIgnoreCase( name )))).distinct().fetch();


    }
}
