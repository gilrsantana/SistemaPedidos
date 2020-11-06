package com.gilmarsantana.sistemapedidos.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gilmarsantana.sistemapedidos.domain.Categoria;
import com.gilmarsantana.sistemapedidos.repositories.CategoriaRepository;

import java.util.Optional;


@Service
public class CategoriaService {
	
	@Autowired
	public CategoriaRepository repo;
	
	public Categoria find(Integer id) {
			Optional<Categoria> obj = repo.findById(id);
			return obj.orElse(null);
	}
}
