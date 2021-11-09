package com.example.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.EstilosMusicales;

@Repository

public interface IDatos extends CrudRepository<EstilosMusicales, Integer> {

}
