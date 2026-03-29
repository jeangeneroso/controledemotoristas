package com.example.controledemotoristas.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.controledemotoristas.model.Despesa;

@Repository
public interface ControleDeEquipamentosRepository extends JpaRepository <Despesa, Integer > {
	List <Despesa> findAll();

}
