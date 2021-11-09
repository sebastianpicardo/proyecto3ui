package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Funciones;
import com.example.demo.interfaceService.IDatosService;
import com.example.demo.model.DatosUsuario;
import com.example.demo.model.EstilosMusicales;

@Controller
@RequestMapping
public class Controlador {
	
	@Autowired
	private IDatosService service; 
	
	@GetMapping(value = "/listar")
	public String listar(Model model) {		
		List<EstilosMusicales>  estilos = service.listar();		
		model.addAttribute("estilos", estilos);
		model.addAttribute("datosUsuario", new DatosUsuario());
		return "form3it";
	}
	
	@GetMapping(value = "/new")
	public String agregar(Model model) {		
		System.out.println("Entra a new:");
		model.addAttribute("datosUsuario", new DatosUsuario());
		return "form";
	}
	
	
	@PostMapping(value = "/guardar")
	public String guardar(@Validated DatosUsuario datosUsuario, Model model) {		
		int resp = service.save(datosUsuario);
		String url = "";
		Funciones func = new Funciones();
		Boolean validaCorreo = func.validaCorreo(datosUsuario.getMail_usuario());		
		if (validaCorreo) {
			if(resp == 1) 
				url = "redirect:/confirmar";
			else 
				url = "redirect:/error";
		}
		else
			url = "redirect:/errorMail";
		return url;
	}
	
	@GetMapping(value = "/confirmar")
	public String confirmar(Model model) {		
		List<DatosUsuario>  datosUsuario = service.listarUsuarios();			
		model.addAttribute("datosUsuario", datosUsuario);
		return "confirmar";
	}
	
	@GetMapping(value = "/error")
	public String error() {				
		return "error";
	}
	
	@GetMapping(value = "/errorMail")
	public String errorMail() {				
		return "errorMail";
	}
	
}
