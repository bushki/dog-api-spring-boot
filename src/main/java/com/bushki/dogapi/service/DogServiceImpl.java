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
    public List<Dog> retrieveDogs() {
        return dogService.retrieveDogs();
    }

    @Override
    public List<String> retrieveDogBreed() {
       return dogService.retrieveDogBreed();
    }

    @Override
    public String retrieveDogBreedById(Long id) {
        return dogService.retrieveDogBreedById(id);
    }

    @Override
    public List<String> retrieveDogNames() {
        return dogService.retrieveDogNames();
    }
}
