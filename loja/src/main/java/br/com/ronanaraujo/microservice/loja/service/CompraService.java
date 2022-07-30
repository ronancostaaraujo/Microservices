package br.com.ronanaraujo.microservice.loja.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ronanaraujo.microservice.loja.client.FornecedorClient;
import br.com.ronanaraujo.microservice.loja.controller.dto.CompraDTO;
import br.com.ronanaraujo.microservice.loja.controller.dto.InfoFornecedorDTO;

@Service
public class CompraService {

	@Autowired
	private FornecedorClient fornecedorClient;
	
	public void realizaCompra(CompraDTO compra) {
		
		InfoFornecedorDTO fornecedor =  fornecedorClient.getInfoPorEstado(compra.getEndereco().getEstado());
		
		System.out.println(fornecedor.getEndereco());
	}

}
