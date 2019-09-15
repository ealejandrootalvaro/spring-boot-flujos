package com.example.demo.flujo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.flujo.entity.Flujo;

@Repository
public interface FlujoRepository extends CrudRepository<Flujo, Long> {}
