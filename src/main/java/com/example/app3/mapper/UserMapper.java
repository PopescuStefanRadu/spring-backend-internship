package com.example.app3.mapper;

import com.example.app3.entity.User;
import com.example.app3.model.UserModel;

public final class UserMapper {
    private UserMapper() {}


    public static UserModel entityToModel(User user) {
        return UserModel.builder()
                .id(user.getId())
                .age(user.getAge())
                .name(user.getName())
                .status(user.getStatus())
                .build();
    }

}
