package com.ac.tp7.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ac.tp7.entity.Compte;

public interface CompteRepository extends JpaRepository<Compte, Long> {

}
