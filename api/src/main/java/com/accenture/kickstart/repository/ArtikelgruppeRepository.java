package com.accenture.kickstart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.accenture.kickstart.entity.Artikelgruppe;

@Repository
public interface ArtikelgruppeRepository extends JpaRepository<Artikelgruppe, Integer> {}

