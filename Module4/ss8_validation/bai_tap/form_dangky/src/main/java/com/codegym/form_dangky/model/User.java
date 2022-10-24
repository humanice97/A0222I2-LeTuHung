package com.codegym.form_dangky.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

@Table(name = "user")
@Entity
@Getter
@Setter
@NoArgsConstructor
public class User implements Validator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Length(min = 5,message = "ten khong duoc nho hon 5 ky tu")
    private String name;
//    @Pattern(regexp = "^0\\d{9}$",message = "Phone number phai dung dinh dang")
    private String phoneNumber;
    @Min(value = 17,message = "khong duoc nho hon 18 tuoi")
    private Integer age;
    private String email;
    private String address;
    private String description;

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        User user = (User) target;
        String number = user.getPhoneNumber();
        ValidationUtils.rejectIfEmpty(errors, "phoneNumber", "number.empty");
        if (number.length() > 11 || number.length() < 10) {
            errors.rejectValue("phoneNumber", "number.length");
        }
        if (!number.startsWith("0")) {
            errors.rejectValue("phoneNumber", "number.startsWith");
        }
        if (!number.matches("(^$|[0-9]*$)")) {
            errors.rejectValue("phoneNumber", "number.matches");
        }
    }
}