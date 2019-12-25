package com.srisai.springquerydslgradledemo.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import sun.plugin.util.UserProfile;


/**
 * QUserProfile is a Querydsl query type for UserProfile
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QUserProfile extends EntityPathBase<UserProfile> {

    private static final long serialVersionUID = -1814176537L;

    public static final QUserProfile userProfile = new QUserProfile("userProfile");

    public final StringPath firstName = createString("firstName");

    public final StringPath lastName = createString("lastName");

    public final StringPath userId = createString("userId");

    public final NumberPath<Integer> userNo = createNumber("userNo", Integer.class);

    public QUserProfile(String variable) {
        super(UserProfile.class, forVariable(variable));
    }

    public QUserProfile(Path<? extends UserProfile> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUserProfile(PathMetadata metadata) {
        super(UserProfile.class, metadata);
    }

}

