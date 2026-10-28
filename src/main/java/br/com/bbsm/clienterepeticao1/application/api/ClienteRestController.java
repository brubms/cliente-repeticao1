package br.com.bbsm.clienterepeticao1.application.api;

import br.com.bbsm.clienterepeticao1.application.service.ClienteService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;
/*
* A anotação @RestController pertence ao Spring Web (Spring MVC) e serve para indicar que uma classe é um controlador
* responsável por responder a requisições HTTP em uma API RESTful.
*
* acaba sendo a porta de entrada que se comunica com o front com as chamadas feitas lá atrvés dos métodos Http e devolve em JSON
* */
@RestController
@RequiredArgsConstructor
@Log4j2
public class ClienteRestController implements ClienteAPI{

    private final ClienteService clienteService;

    @Override
    public ClienteResponse postCadastraNovoCliente(@Valid ClienteRequest clienteRequest){
        log.info("[inicia] ClienteRestController - postCadastraNovoCliente");
        ClienteResponse cliente = clienteService.cadastraNovoCliente(clienteRequest);
        log.info("[finaliza] ClienteRestController - postCadastraNovoCliente");
        return cliente;

    }
}
