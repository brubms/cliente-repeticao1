package br.com.bbsm.clienterepeticao1.application.api;

import br.com.bbsm.clienterepeticao1.domain.Cliente;
import br.com.bbsm.clienterepeticao1.domain.Sexo;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
public class ClienteDetalhadoResponse {

    private UUID idCliente;
    private String nomeCompleto;
    private String cpf;
    private String email;
    private String telefone;
    private String celular;
    private LocalDate dataNascimento;
    private Sexo sexo;
    private LocalDateTime dataHoraCadastro;
    private LocalDateTime dataHoraAtualizacao;

    public ClienteDetalhadoResponse(Cliente cliente) {
        this.idCliente = cliente.getIdCliente();
        this.nomeCompleto = cliente.getNomeCompleto();
        this.cpf = cliente.getCpf();
        this.email = cliente.getEmail();
        this.telefone = cliente.getTelefone();
        this.celular = cliente.getCelular();
        this.dataNascimento = cliente.getDataNascimento();
        this.dataHoraCadastro = cliente.getDataHoraCadastro();
        this.dataHoraAtualizacao = cliente.getDataHoraAtualizacao();
        this.sexo = cliente.getSexo();
    }


}
