package com.example.controledemotoristas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.controledemotoristas.model.Despesa;
import com.example.controledemotoristas.repository.ControleDeEquipamentosRepository;

@RestController
public class EquipamentosController {
	
	@Autowired
	private ControleDeEquipamentosRepository repository;
	
	@GetMapping("/despesas")
	public List<Despesa> getDespesas(){
		return repository.findAll();
		
	}

}
