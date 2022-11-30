package com.codegym.exam_module4.service;

import com.codegym.exam_module4.model.QuestionContent;
import com.codegym.exam_module4.model.QuestionType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IQuestionContentService {
    Page<QuestionContent> findAll(Pageable pageable);
    void save (QuestionContent questionContent);
    void delete(QuestionContent questionContent);
    QuestionContent getQuestionContentById(Long id);
    Page<QuestionContent> findByTitle(String name, Pageable pageable);

    List<QuestionContent> getAll();

}
