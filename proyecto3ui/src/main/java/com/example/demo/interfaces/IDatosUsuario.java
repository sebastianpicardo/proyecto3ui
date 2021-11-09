package com.example.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.DatosUsuario;
import com.example.demo.model.EstilosMusicales;

@Repository

public interface IDatosUsuario extends CrudRepository<DatosUsuario, Integer> {

}
