package com.prueba.heroku.system.service;

import java.util.List;

import com.prueba.heroku.system.model.Cliente;

public interface ClienteService {
	
	public void insertarCliente(Cliente cliente);

	public List<Cliente> obtenerCliente();
}
