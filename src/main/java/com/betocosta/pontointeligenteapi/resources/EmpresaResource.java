package com.betocosta.pontointeligenteapi.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/empresas")
public class EmpresaResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public String listar() {
		return "REST esta funcionando";
	}

}
