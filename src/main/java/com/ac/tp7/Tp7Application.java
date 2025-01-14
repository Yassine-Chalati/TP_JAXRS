package com.ac.tp7;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.ac.tp7.entity.Compte;
import com.ac.tp7.entity.TypeCompte;
import com.ac.tp7.repository.CompteRepository;

@SpringBootApplication
public class Tp7Application {

	public static void main(String[] args) {
		SpringApplication.run(Tp7Application.class, args);
	}

	@Bean
	CommandLineRunner start(CompteRepository compteRepository) {
		return args -> {
			compteRepository.save(new Compte(0, Math.random() * 9000, new Date(), TypeCompte.EPARGNE));
			compteRepository.save(new Compte(0, Math.random() * 9000, new Date(), TypeCompte.COURANT));
			compteRepository.save(new Compte(0, Math.random() * 9000, new Date(), TypeCompte.EPARGNE));

			compteRepository.findAll().forEach(c -> {
				System.out.println(c.toString());
			});
		};
	}

}
