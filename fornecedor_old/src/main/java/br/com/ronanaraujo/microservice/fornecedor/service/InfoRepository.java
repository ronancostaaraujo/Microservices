package br.com.ronanaraujo.microservice.fornecedor.service;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.ronanaraujo.microservice.fornecedor.model.InfoFornecedor;

@Repository
public interface InfoRepository extends CrudRepository<InfoFornecedor, Long>{
	Optional<InfoFornecedor> findByEstado(String estado);
}