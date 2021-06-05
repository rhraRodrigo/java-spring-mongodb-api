package com.rodrigo.springmongodb.service;

import java.util.List;

import com.rodrigo.springmongodb.model.Funcionario;

public interface FuncionarioService {
	public List<Funcionario> obterTodos();
	
	public Funcionario obterPorCodigo(String codigo);
	
	public Funcionario criar(Funcionario funcionario);
}
