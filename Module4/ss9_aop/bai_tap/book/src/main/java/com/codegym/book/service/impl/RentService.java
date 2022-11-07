package com.codegym.book.service.impl;

import com.codegym.book.model.Book;
import com.codegym.book.model.Rent;
import com.codegym.book.repository.IBookRepository;
import com.codegym.book.repository.IRentRepository;
import com.codegym.book.service.IRentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class RentService implements IRentService {
    @Autowired
    IRentRepository iRentRepository;

    @Autowired
    IBookRepository iBookRepository;

    @Override
    public List<Rent> findAll() {
        return this.iRentRepository.findAll();
    }

    @Override
    public Rent findById(Long id) {
        return this.iRentRepository.findById(id).orElse(null);
    }

    @Override
    public void saveBookCode(Book book) {
        Integer num = this.getRentCode();
        LocalDate localDate = LocalDate.now();
        Rent rent = new Rent();
        rent.setBook(book);
        rent.setDateStart(String.valueOf(localDate));
        rent.setDateEnd(String.valueOf(localDate));
        rent.setBookCode(Long.valueOf(num));
        this.iRentRepository.save(rent);
    }

    @Override
    public void delete(Rent rent) {
        this.iRentRepository.delete(rent);
    }

    public Integer getRentCode() {
        Integer num;
        while (true) {
            num = (int) (Math.floor(Math.random() * 100000) - 1);
            if (String.valueOf(num).length() == 5) {
                return num;
            }
        }
    }
}
