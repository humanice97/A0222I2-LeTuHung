package com.codegym.exam_module4.service.impl;

import com.codegym.exam_module4.model.QuestionContent;
import com.codegym.exam_module4.repository.IQuestionContentRepository;
import com.codegym.exam_module4.service.IQuestionContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class QuestionContentService implements IQuestionContentService {
    @Autowired
    IQuestionContentRepository iQuestionContentRepository;

    @Override
    public Page<QuestionContent> findAll(Pageable pageable) {
        return iQuestionContentRepository.findAll(pageable);
    }

    @Override
    public void save(QuestionContent questionContent) {
        LocalDate localDate = LocalDate.now();
        questionContent.setStatus("chua phan hoi");
        questionContent.setDateCreate(String.valueOf(localDate));
        this.iQuestionContentRepository.save(questionContent);
    }

    @Override
    public void delete(QuestionContent questionContent) {
        iQuestionContentRepository.delete(questionContent);
    }

    @Override
    public QuestionContent getQuestionContentById(Long id) {
        return iQuestionContentRepository.findById(id).orElse(null);
    }


    @Override
    public Page<QuestionContent> findByTitle(String title, Pageable pageable) {
        return iQuestionContentRepository.findQuestionContentByTitle(title, pageable);
    }

    @Override
    public List<QuestionContent> getAll() {
        return iQuestionContentRepository.findAll();
    }


}
