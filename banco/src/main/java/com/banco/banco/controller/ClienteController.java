package com.banco.banco.controller;

import com.banco.banco.model.Cliente;
import com.banco.banco.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.Update;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private IClienteService clienteService;

    //MOSTRAR CLIENTES
    @GetMapping("/listar")
    public Flux<Cliente> listar(){
        return clienteService.findAll();
    }

    //AGREGAR NUEVO CLIENTE
    @PostMapping("/nuevo")
    public Mono<Cliente> registrar(@RequestBody Cliente cliente){
        return clienteService.save(cliente);
    }

    //BUSQUEDA POR DNI
    @GetMapping("/listar/{dni}")
    public Flux<Cliente> listarPorDni(@PathVariable String dni){
        return clienteService.findClienteByDni(dni);
    }

    @PutMapping("/actualizar")
    public Mono<Cliente> actualizar(@RequestBody Cliente cliente){
        return clienteService.update(cliente);
    }

    @DeleteMapping("/eliminar/{id}")
    void eliminar(@PathVariable Integer id){
        clienteService.delete(id);
    }

}
