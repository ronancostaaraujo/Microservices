package br.com.ronanaraujo.microservice.fornecedor.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ronanaraujo.microservice.fornecedor.model.InfoFornecedor;
import br.com.ronanaraujo.microservice.fornecedor.service.InfoService;

@RestController
@RequestMapping("/info")
public class InfoController {
	
	@Autowired
	private InfoService infoService;
	
	@RequestMapping("/{estado}")
	public Optional<InfoFornecedor> getInfoPorEstado(@PathVariable("estado") String estado) {
		return infoService.findByEstado(estado);
	}
}
