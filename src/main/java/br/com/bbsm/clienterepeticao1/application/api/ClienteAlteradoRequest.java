package br.com.bbsm.clienterepeticao1.application.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClienteAlteradoRequest {

    private String email;
    private String celular;
    private String telefone;
}
