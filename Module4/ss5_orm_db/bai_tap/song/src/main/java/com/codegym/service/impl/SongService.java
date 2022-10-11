package com.codegym.service.impl;

import com.codegym.model.Song;
import com.codegym.service.ISongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongService implements ISongService {
    @Autowired
    private ISongService iSongService;

    @Override
    public List<Song> findAll() {
        return iSongService.findAll();
    }

    @Override
    public Song findById(long id) {
        return iSongService.findById(id);
    }

    @Override
    public void save(Song song) {
        iSongService.save(song);
    }

    @Override
    public void delete(Long id) {
        iSongService.delete(id);
    }
}
