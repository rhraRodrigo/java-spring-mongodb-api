package com.rodrigo.springmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.rodrigo.springmongodb.model.Funcionario;

public interface FuncionarioRepository extends MongoRepository<Funcionario, String> {
	
}
