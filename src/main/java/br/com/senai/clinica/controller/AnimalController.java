package br.com.senai.clinica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.clinica.entity.Animal;
import br.com.senai.clinica.exception.Response;
import br.com.senai.clinica.repository.AnimalRepository;
import io.swagger.v3.oas.annotations.parameters.RequestBody;


@RestController
@RequestMapping("AnimalController")
public class AnimalController {

    

  
  @Autowired
  private AnimalRepository repository;



  @PostMapping
  public Response criaAnimal(@RequestBody Animal entity) {
      repository.save(entity);
      return repository.findAll();
  }



@PutMapping("/{id}")
public Response




}
