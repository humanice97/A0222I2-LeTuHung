package com.codegym.phone.controller;

import com.codegym.phone.model.SmartPhone;
import com.codegym.phone.service.ISmartPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/smartphones")
@CrossOrigin
public class SmartPhoneRestController {
    @Autowired
    ISmartPhoneService iSmartPhoneService;

    @PostMapping()
    public ResponseEntity<SmartPhone> createSmartPhone(@RequestBody SmartPhone smartPhone) {
        return new ResponseEntity<>(iSmartPhoneService.save(smartPhone), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<SmartPhone>> allPhones() {
        return new ResponseEntity<>(iSmartPhoneService.findAll(), HttpStatus.OK);
    }

    @DeleteMapping("/{smartphoneId}")
    public ResponseEntity<Void> delete(@PathVariable Long smartphoneId){
        System.out.println(smartphoneId);
        Optional<SmartPhone> smartPhone = iSmartPhoneService.findById(smartphoneId);
        if(!smartPhone.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        iSmartPhoneService.remove(smartphoneId);
      return new ResponseEntity<Void>(HttpStatus.OK);

    }

//    @GetMapping("/list")
//    public ModelAndView getAllSmartphonePage() {
//        ModelAndView modelAndView = new ModelAndView("/list");
//        modelAndView.addObject("smartphones", iSmartPhoneService.findAll());
//        return modelAndView;
//    }


}
