package com.codegym.exam_module4.service.impl;

import com.codegym.exam_module4.model.QuestionType;
import com.codegym.exam_module4.repository.IQuestionTypeRepository;
import com.codegym.exam_module4.service.IQuestionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuestionTypeService implements IQuestionTypeService {
    @Autowired
    IQuestionTypeRepository iQuestionTypeRepository;
    @Override
    public List<QuestionType> findAll() {
        return iQuestionTypeRepository.findAll();
    }
}
