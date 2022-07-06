package com.banco.banco.service;

import com.banco.banco.model.Cliente;
import reactor.core.Disposable;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IClienteService {

    Flux<Cliente> findAll();

    Mono<Cliente> save(Cliente cliente);

    Mono<Cliente> update(Cliente cliente);

    Flux<Cliente> findClienteByDni(String dni);

    Disposable delete(Integer id);

    Mono<Cliente> save();
}
