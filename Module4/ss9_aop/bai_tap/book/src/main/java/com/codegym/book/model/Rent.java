package com.codegym.book.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "rent")
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Rent {
    @Id
    @Column(name = "id", nullable = false)
    private Long bookCode;

    private String dateStart;

    private String dateEnd;

    @ManyToOne
    @JoinColumn(name = "book_id", referencedColumnName = "id")
    private Book book;
}