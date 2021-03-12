package com.prueba.heroku.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.prueba.heroku.system.model.Cliente;
import com.prueba.heroku.system.model.ClienteDTO;
import com.prueba.heroku.system.service.ClienteService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;

	private static final String CATEGORIA_PRINCIPAL = "/cliente";

	@GetMapping(value = CATEGORIA_PRINCIPAL)
	public List<Cliente> listarCategoria() {
		return clienteService.obtenerCliente();
	}

	@PostMapping(value = CATEGORIA_PRINCIPAL)
	public @ResponseBody Boolean addCategoria(@RequestBody ClienteDTO cliente) {
		try {
			Cliente persistir = new Cliente();
			persistir.setNombre(cliente.getNombre());
			persistir.setApellido(cliente.getApellido());
			clienteService.insertarCliente(persistir);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
