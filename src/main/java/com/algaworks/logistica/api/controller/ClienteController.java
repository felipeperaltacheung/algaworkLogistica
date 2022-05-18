package com.algaworks.logistica.api.controller;

import domain.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class ClienteController {

    @GetMapping("/clientes")
    public List<Cliente> listar(){
        var cliente1 = new Cliente();
        cliente1.setId(1L);
        cliente1.setNome("jacarez");
        cliente1.setEmail("jacare@jacare");
        cliente1.setTelefone("1010010101001");

        var cliente2 = new Cliente();
        cliente2.setId(2L);
        cliente2.setNome("ke");
        cliente2.setEmail("jake@jake");
        cliente2.setTelefone("202020000202020");

        return Arrays.asList(cliente1, cliente2);

    }

}
