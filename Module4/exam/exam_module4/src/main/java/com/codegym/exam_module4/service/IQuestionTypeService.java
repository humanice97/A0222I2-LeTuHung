package com.codegym.exam_module4.service;

import com.codegym.exam_module4.model.QuestionContent;
import com.codegym.exam_module4.model.QuestionType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IQuestionTypeService {
    List<QuestionType> findAll();
}
