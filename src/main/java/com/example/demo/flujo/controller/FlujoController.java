package com.example.demo.flujo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.flujo.dto.FlujoDTO;
import com.example.demo.flujo.entity.Flujo;
import com.example.demo.service.FlujosService;

@RestController
@RequestMapping("/flujos")
public class FlujoController {
	
	@Autowired FlujosService service;

	@GetMapping
	public List<Flujo> get() {
		return service.getFlujos();
	}
	
	@PostMapping
	public Flujo add(@RequestBody FlujoDTO dto) {
		return service.add(dto);
	}
	
}
