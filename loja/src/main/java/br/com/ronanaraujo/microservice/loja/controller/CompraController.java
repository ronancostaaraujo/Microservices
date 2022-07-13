package br.com.ronanaraujo.microservice.loja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.ronanaraujo.microservice.loja.controller.dto.CompraDTO;
import br.com.ronanaraujo.microservice.loja.service.CompraService;

@RestController
@RequestMapping("/compra")
public class CompraController {
	
	@Autowired
	private CompraService compraService;
	
	@RequestMapping(method = RequestMethod.POST)
	public void realizacompra(@RequestBody CompraDTO compra) {
		compraService.realizaCompra(compra);
	}
}
