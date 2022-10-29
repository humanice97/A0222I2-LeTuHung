package com.codegym.model;

import org.hibernate.validator.constraints.Range;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @NotBlank(message = "khong duoc de trong")
    @Pattern(regexp = "[a-zA-Z0-9\\s\\+]*", message = "khong duoc chua ky tu dac biet")
    @Size(max = 800, message = "khong duoc nhieu hon 800 ky tu")
    @Column(name = "name")
    private String name;


    @NotBlank(message = "khong duoc de trong")
    @Size(max = 300, message = "khong duoc nhieu hon 300 ky tu")
    @Pattern(regexp = "[a-zA-Z0-9\\s\\+]*", message = "khong duoc chua ky tu dac biet")
    @Column(name = "artist")
    private String artist;


    @NotBlank(message = "khong duoc de trong")
    @Size(max = 1000, message = "khong duoc nhieu hon 1000 ky tu")
    @Pattern(regexp = "^[a-zA-Z0-9,]*$", message = "khong duoc chua ky tu dac biet ngoai dau phay")
    @Column(name = "kind")
    private String kind;

    @Column(name = "link")
    private String link;

    public Song() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
