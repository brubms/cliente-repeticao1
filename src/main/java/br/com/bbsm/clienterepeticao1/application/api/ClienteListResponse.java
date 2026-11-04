package br.com.bbsm.clienterepeticao1.application.api;

import br.com.bbsm.clienterepeticao1.domain.Cliente;
import lombok.Getter;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Getter
public class ClienteListResponse {

    private UUID idCliente;
    private String nomeCompleto;
    private  String email;

    public ClienteListResponse(Cliente cliente) {
        this.idCliente = cliente.getIdCliente();
        this.nomeCompleto = cliente.getNomeCompleto();
        this.email = cliente.getEmail();

    }

    public static List<ClienteListResponse> converte(List<Cliente> clientes) {
        return clientes.stream()
                .map(ClienteListResponse::new)
                .collect(Collectors.toList());
    }
}
