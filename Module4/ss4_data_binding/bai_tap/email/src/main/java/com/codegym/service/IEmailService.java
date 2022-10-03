package com.codegym.service;

import org.springframework.stereotype.Service;

import java.util.List;

public interface IEmailService {
    List<String> getLanguages();

    List<String> getPageSize();
}
