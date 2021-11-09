package com.example.demo;

import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class Funciones {

	public Boolean validaCorreo(String email) {
		System.out.println("valor correo " + email);
		 Pattern pattern = Pattern
	                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
	                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");		
	        Matcher mather = pattern.matcher(email);
		 return mather.find();
	}
	
}
