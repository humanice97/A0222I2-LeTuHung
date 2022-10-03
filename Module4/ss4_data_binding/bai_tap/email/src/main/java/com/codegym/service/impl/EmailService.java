package com.codegym.service.impl;

import com.codegym.model.Email;
import com.codegym.service.IEmailService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmailService implements IEmailService {

    @Override
    public List<String> getLanguages() {
        List<String> listLanguage = new ArrayList<>();
        listLanguage.add("Vietnamese");
        listLanguage.add("English");
        listLanguage.add("Japan");
        listLanguage.add("Thailand");
        listLanguage.add("China");
        return listLanguage;
    }

    @Override
    public List<String> getPageSize() {
        List<String> listPage = new ArrayList<>();
        listPage.add("5");
        listPage.add("10");
        listPage.add("15");
        listPage.add("20");
        listPage.add("25");
        return listPage;
    }
}
