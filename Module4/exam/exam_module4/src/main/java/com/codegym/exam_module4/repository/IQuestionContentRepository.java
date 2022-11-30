package com.codegym.exam_module4.repository;

import com.codegym.exam_module4.model.QuestionContent;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IQuestionContentRepository extends JpaRepository<QuestionContent,Long> {
    Page<QuestionContent> findQuestionContentByTitle(String name, Pageable pageable);
    Page<QuestionContent> findQuestionContentByAnswer(String name, Pageable pageable);
}
