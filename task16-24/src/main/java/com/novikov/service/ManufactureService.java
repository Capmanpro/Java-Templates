package com.novikov.service;

import com.novikov.repository.ManufactureRepository;
import com.novikov.entity.Manufacture;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Slf4j
public class ManufactureService {
    @Autowired
    ManufactureRepository repository;

    public void setRepository(ManufactureRepository repository) {
        this.repository = repository;
    }

    @Transactional()
    public Manufacture getManu(Long id){
        log.info("get Manufacture with id= {}",id);
        return repository.findById(id).get();
    }
}
