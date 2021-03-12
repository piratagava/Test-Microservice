package com.prueba.heroku.system.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.heroku.system.model.Cliente;
import com.prueba.heroku.system.respository.ClienteRepository;
import com.prueba.heroku.system.service.ClienteService;

@Service
public class ClienteServiceImplement implements ClienteService {

	@Autowired
	private ClienteRepository clienteRepo;

	@Override
	public void insertarCliente(Cliente cliente) {
		clienteRepo.save(cliente);
	}

	@Override
	public List<Cliente> obtenerCliente() {
		return clienteRepo.findAll();
	}

}
