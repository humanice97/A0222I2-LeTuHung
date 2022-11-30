package com.codegym.exam_module4.repository;

import com.codegym.exam_module4.model.QuestionType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IQuestionTypeRepository extends JpaRepository<QuestionType,Long> {
}
