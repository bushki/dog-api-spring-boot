package com.bushki.dogapi.service;

import com.bushki.dogapi.entity.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogServiceImpl  implements  DogService{

    @Autowired
    DogService dogService;

    @Override
    public List<Dog> getAllDogs() {
        return dogService.getAllDogs();
    }
}
