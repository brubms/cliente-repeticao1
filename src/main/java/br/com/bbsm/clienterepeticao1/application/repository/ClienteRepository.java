package br.com.bbsm.clienterepeticao1.application.repository;

import br.com.bbsm.clienterepeticao1.domain.Cliente;

import java.util.List;
import java.util.UUID;

public interface ClienteRepository {

    Cliente salva(Cliente cliente);

    Cliente buscaPorId(UUID idCliente);

    List<Cliente> buscaTodosClientes();

    void deletaPorId(UUID idCliente);
}
