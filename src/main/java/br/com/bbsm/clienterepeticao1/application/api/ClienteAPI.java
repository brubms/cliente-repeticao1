package br.com.bbsm.clienterepeticao1.application.api;


import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("/cliente")
public interface ClienteAPI {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    ClienteResponse postCadastraNovoCliente(@RequestBody @Valid ClienteRequest clienteRequest);

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    List<ClienteListResponse> getListaTodosClientes();

    @GetMapping("/{idCliente}")
    @ResponseStatus(HttpStatus.OK)
    ClienteDetalhadoResponse getBuscaClientePorId(@PathVariable UUID idCliente);

    @DeleteMapping("/{idCliente}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void deletaClientePorId(@PathVariable UUID idCliente);

}
