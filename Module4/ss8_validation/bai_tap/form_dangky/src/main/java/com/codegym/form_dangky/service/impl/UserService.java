package com.codegym.form_dangky.service.impl;

import com.codegym.form_dangky.model.User;
import com.codegym.form_dangky.repository.UserRepository;
import com.codegym.form_dangky.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

}
