package com.banco.banco.repository;

import com.banco.banco.model.Cliente;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClienteRepository extends ReactiveMongoRepository<Cliente, Integer> {
}
