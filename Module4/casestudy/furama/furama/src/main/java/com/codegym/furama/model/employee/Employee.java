package com.codegym.furama.model.employee;

import com.codegym.furama.model.contract.Contract;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Parent;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.sql.Date;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity(name = "nhan_vien")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_nhan_vien")
    private Integer id;


    @Column(name = "ho_va_ten")
    @Pattern(regexp = "^([a-zA-Z]{2,}\\s[a-zA-Z]{1,}'?-?[a-zA-Z]{2,}\\s?([a-zA-Z]{1,})?)", message = "loi syntax ten")
    @NotBlank(message = "khong duoc de trong")
    private String name;


    @Column(name = "ngay_sinh")
    private Date dateOfBirth;


    @NotBlank(message = "khong duoc de trong")
    @Column(name = "so_cmnd")
    private String identityCard;


    @Column(name = "luong")
    private Double salary;


    @NotBlank(message = "khong duoc de trong")
    @Column(name = "so_dien_thoai")
    private String phoneNumber;

    @Email(message = "email khong dung dinh dang")
    @Column(name = "email")
    @NotBlank(message = "khong duoc de trong")
    private String email;


    @Column(name = "dia_chi")
    @NotBlank(message = "khong duoc de trong")
    private String address;


    @ManyToOne
    @JoinColumn(name = "ma_vi_tri")
    private Position position;
    @ManyToOne
    @JoinColumn(name = "ma_trinh_do")
    private Level level;
    @ManyToOne
    @JoinColumn(name = "ma_bo_phan")
    private Department department;
    @OneToMany(mappedBy = "employee")
    private List<Contract> contracts;
}
