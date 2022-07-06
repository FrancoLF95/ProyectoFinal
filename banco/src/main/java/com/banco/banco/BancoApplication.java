package com.banco.banco;

import com.banco.banco.repository.IClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@SpringBootApplication
@EnableReactiveMongoRepositories("com.banco.banco.repository")
@ComponentScan(basePackages = {"com.banco"})
public class BancoApplication {

	@Autowired
	//private PersonaRepository personaRepository;
	private IClienteRepository clienteRepository;

	public static void main(String[] args) {
		SpringApplication.run(BancoApplication.class, args);
	}

}
