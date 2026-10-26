package br.com.bbsm.clienterepeticao1.application.api;

import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

@Getter
@Builder
//DTO de sáida
public class ClienteResponse {

    private UUID idCliente;
}
