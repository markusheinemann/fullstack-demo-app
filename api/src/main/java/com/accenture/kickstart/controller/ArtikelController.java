package com.accenture.kickstart.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.kickstart.entity.Artikelgruppe;
import com.accenture.kickstart.repository.ArtikelgruppeRepository;

@RestController
@CrossOrigin
@RequestMapping("/v1/artikel")
public class ArtikelController {
    
    private final ArtikelgruppeRepository repository;

    public ArtikelController(ArtikelgruppeRepository repo){
        this.repository = repo;
    }

	@GetMapping("/artikelgruppen")
	public List<Artikelgruppe> home() {
		return repository.findAll();
		
		//return "test";
	}
}