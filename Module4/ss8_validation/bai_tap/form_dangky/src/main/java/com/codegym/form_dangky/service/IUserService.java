package com.codegym.form_dangky.service;

import com.codegym.form_dangky.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IUserService {
    List<User> findAll();

    void save(User user);
}
