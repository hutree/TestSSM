package com.vivo.dao;

import com.vivo.domin.User;

import java.util.List;

public interface IUserDao {
    List<User> findAll();
}
