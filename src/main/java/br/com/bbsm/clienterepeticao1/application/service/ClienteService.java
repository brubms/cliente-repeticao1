package br.com.bbsm.clienterepeticao1.application.service;

import br.com.bbsm.clienterepeticao1.application.api.ClienteRequest;
import br.com.bbsm.clienterepeticao1.application.api.ClienteResponse;
import br.com.bbsm.clienterepeticao1.domain.Cliente;

public interface ClienteService {
    /*
    * o que está acontecendo nesse momento é o seguinte:
    *
    *  - ClienteResponse(tipo de retorno) -> ele retorna uma saída nesse caso um id.
    *  - método responsavel por cadastar um novo cliente
    *  - ele recebe um request ou seja um cliente que foi criado!
    *
    * */
    ClienteResponse cadastraNovoCliente(ClienteRequest clienteRequest);
}
