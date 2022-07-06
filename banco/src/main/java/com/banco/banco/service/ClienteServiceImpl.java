package com.banco.banco.service;

import com.banco.banco.model.Cliente;
import com.banco.banco.repository.IClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.Disposable;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ClienteServiceImpl implements IClienteService{

    @Autowired
    IClienteRepository clienteRepository;

    public Flux<Cliente> findAll(){
        return clienteRepository.findAll();
    }

    @Override
    public Mono<Cliente> save(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    @Override
    public Mono<Cliente> update(Cliente cliente){
        return null;
    }

    @Override
    public Flux<Cliente> findClienteByDni(String dni){
        return clienteRepository.findAll().filter(x -> x.getDni().equals(dni));
    }

    @Override
    public Disposable delete(Integer id) {
        return clienteRepository.deleteById(id).subscribe();
    }

    @Override
    public Mono<Cliente> save() {
        return null;
    }
}
