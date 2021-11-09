package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.interfaceService.IDatosService;
import com.example.demo.interfaces.IDatos;
import com.example.demo.interfaces.IDatosUsuario;
import com.example.demo.model.DatosUsuario;
import com.example.demo.model.EstilosMusicales;

@Service
public class DatosUsuarioService implements IDatosService {

	@Autowired
	private IDatos data;
	@Autowired
	private IDatosUsuario dataUsu;
	
	@Override
	public List<EstilosMusicales> listar() {
		// TODO Auto-generated method stub		
		return (List<EstilosMusicales>) data.findAll();
	}

	@Override
	public List<DatosUsuario> listarUsuarios() {
		// TODO Auto-generated method stub		
		return (List<DatosUsuario>) dataUsu.findAll();
	}

	@Override
	public Optional<EstilosMusicales> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(DatosUsuario guardar) {
		// TODO Auto-generated method stub
		int resp=0;		
		DatosUsuario datos= dataUsu.save(guardar);
		if(!datos.equals(null)) {
			resp  = 1;
		}		
		return resp;
	}

}
