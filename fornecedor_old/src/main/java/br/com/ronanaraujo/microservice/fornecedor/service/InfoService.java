package br.com.ronanaraujo.microservice.fornecedor.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ronanaraujo.microservice.fornecedor.model.InfoFornecedor;

@Service
public class InfoService {
	
	@Autowired
	private InfoRepository infoRepository;

	public Optional<InfoFornecedor> findByEstado(String estado) {
		return infoRepository.findByEstado(estado);
	}

}
