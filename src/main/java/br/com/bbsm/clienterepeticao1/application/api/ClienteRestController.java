package br.com.bbsm.clienterepeticao1.application.api;

import br.com.bbsm.clienterepeticao1.application.service.ClienteService;
import br.com.bbsm.clienterepeticao1.domain.Cliente;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

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

    @Override
    public List<ClienteListResponse> getListaTodosClientes() {
        log.info("[inicia] ClienteRestController - getListaTodosClientes");
        List<ClienteListResponse> listaCliente = clienteService.listaTodosClientes();
        log.info("[finaliza] ClienteRestController - getListaTodosClientes");
        return listaCliente;
    }

    @Override
    public ClienteDetalhadoResponse getBuscaClientePorId(UUID idCliente) {
        log.info("[inicia] ClienteRestController - getBuscaClientePorId");
        ClienteDetalhadoResponse detalhado = clienteService.buscaClientePorId(idCliente);
        log.info("[finaliza] ClienteRestController - getBuscaClientePorId");
        return detalhado;
    }

    @Override
    public void deletaClientePorId(UUID idCliente) {
        log.info("[inicia] ClienteRestController - deletaClientePorId");
        
        log.info("[finaliza] ClienteRestController - deletaClientePorId");

    }




    }



