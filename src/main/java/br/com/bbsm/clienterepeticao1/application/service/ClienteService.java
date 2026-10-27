package br.com.bbsm.clienterepeticao1.application.service;

import br.com.bbsm.clienterepeticao1.application.api.ClienteRequest;
import br.com.bbsm.clienterepeticao1.application.api.ClienteResponse;
import br.com.bbsm.clienterepeticao1.domain.Cliente;

public interface ClienteService {

    ClienteResponse cadastraNovoCliente(ClienteRequest clienteRequest);
}
