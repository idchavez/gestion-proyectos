package com.id.gestion_back;

import com.id.gestion_back.domain.Usuario;
import com.id.gestion_back.repository.UsuarioRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GestionBackApplication implements CommandLineRunner {

	private final UsuarioRepository usuariosRepository;

	public GestionBackApplication (UsuarioRepository usuariosRepository) {
		this.usuariosRepository = usuariosRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(GestionBackApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//usuariosRepository.deleteAll();

		// save a couple of customers
		usuariosRepository.save(new Usuario());
		usuariosRepository.save(new Usuario());
	}
}
