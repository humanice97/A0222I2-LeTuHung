package com.codegym.service;

import com.codegym.model.Song;

import java.util.List;
import java.util.Optional;

public interface ISongService {
    List<Song> findAll();
    Optional<Song> findById(long id);
    void save(Song song);
    Object delete(Long id);
}
