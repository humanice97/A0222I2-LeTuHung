package com.codegym.book.service.impl;

import com.codegym.book.model.Rent;
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

    @Override
    public List<Rent> findAll() {
        return this.iRentRepository.findAll();
    }

    @Override
    public Rent findById(Long id) {
        return this.iRentRepository.findById(id).get();
    }

    @Override
    public void saveBookCode(Rent rent) {
        Integer num = this.getRentCode();
        LocalDate localDate = LocalDate.now();
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
