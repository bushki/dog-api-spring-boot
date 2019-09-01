package com.bushki.dogapi.repository;

import com.bushki.dogapi.entity.Dog;
import org.springframework.data.repository.CrudRepository;


public interface DogRepository extends CrudRepository<Dog, Long> {

}
