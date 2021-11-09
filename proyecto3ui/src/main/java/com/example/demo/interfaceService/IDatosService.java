package com.example.demo.interfaceService;
import java.util.List;
import java.util.Optional;

import com.example.demo.model.DatosUsuario;
import com.example.demo.model.EstilosMusicales;




public interface IDatosService {
	public List<EstilosMusicales> listar();
	public List<DatosUsuario> listarUsuarios();
	public Optional<EstilosMusicales> listarId(int id);
	public int save(DatosUsuario guardar);
	
}
