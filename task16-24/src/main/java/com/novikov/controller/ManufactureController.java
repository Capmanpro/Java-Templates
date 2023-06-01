package com.novikov.controller;

import com.novikov.repository.ManufactureRepository;
import com.novikov.entity.Manufacture;
import com.novikov.entity.Phone;
import com.novikov.service.PhoneServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ManufactureController {
    private final ManufactureRepository repository;
    @Autowired
    PhoneServiceImpl repository1;

    public ManufactureController(ManufactureRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/manufacture/{manuId}")
    public Manufacture getManufacture(@PathVariable("manuId") Long id) {
        return repository.findById(id).get();
    }

    @GetMapping("/phone/{id}")
    public List<Phone> getPhones(){
        return repository1.getFilterPhone();
    }
}
