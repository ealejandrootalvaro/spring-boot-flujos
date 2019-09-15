package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.flujo.dto.FlujoDTO;
import com.example.demo.flujo.entity.Flujo;
import com.example.demo.flujo.repo.FlujoRepository;

@Component
public class FlujosService {
	@Autowired FlujoRepository repository;
	
	public Flujo add(FlujoDTO dto) {
		return repository.save(toEntity(dto));
	}
	
	public List<Flujo> getFlujos() {
		return (List<Flujo>) repository.findAll();
	}
	
	public Flujo toEntity(FlujoDTO dto) {
		Flujo flujo = new Flujo();
		flujo.setId(dto.getId());
		flujo.setTitle(dto.getTitle());
		return flujo;
	}
}
