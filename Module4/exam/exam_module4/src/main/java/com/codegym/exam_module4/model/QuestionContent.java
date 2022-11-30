package com.codegym.exam_module4.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "question_content")
public class QuestionContent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @NotBlank(message = "khong duoc de trong")
    @Size(min = 5,max = 100,message = "Tieu de phai tu 5 den 100 ky tu")
    private String title;

    @Size(min = 10,max = 500,message = "Tieu de phai tu 10 den 500 ky tu")
    @NotBlank(message = "khong duoc de trong")
    private String content;

//    @NotBlank(message = "khong duoc de trong")
    private String answer;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String dateCreate;

//    @NotBlank(message = "khong duoc de trong")
    private String status;

    @ManyToOne
    @JoinColumn(name = "id_question_type")
    private QuestionType questionType;
}