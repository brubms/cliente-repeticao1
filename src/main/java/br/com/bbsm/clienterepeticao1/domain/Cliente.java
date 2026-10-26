package br.com.bbsm.clienterepeticao1.domain;

import br.com.bbsm.clienterepeticao1.application.api.ClienteRequest;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;
//declarado a fim de atribuir a esta classe como uma entidade dentro do banco de dados relacional
@Entity(name = "cliente")
//adiciona todos os métodos essenciais do java como: Getter,Setter,ToString,EqualsAndHashCode e RequiredArgsConstructor
@Data
//Criando um construtor vazio, para que o JPA possa buscar no banco de dados
@NoArgsConstructor
//Cria um construtor completo com todos os atributos da classe, feito para testes.
@AllArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//gera um ID aleatorio a cada cliente criado de forma automatica
    @Column(unique = true, nullable = false)
    private UUID idCliente;

    @NonNull
    @NotBlank
    @Size(min = 10)//define o tamanho minimo do nome
    private String nomeCompleto;

    @CPF//valida somente um cpf real
    private String cpf;

    @NotNull
    @NotBlank
    private String email;

    @Size(min = 10, max = 13)//tamanho máximo e minimo do numero
    private String telefone;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Sexo sexo;

    @NotNull
    @Size(min = 10, max = 13)//tamanho máximo e minimo do numero
    private String celular;

    @NotNull
    private LocalDate dataNascimento;
    private LocalDateTime dataHoraCadastro;
    private LocalDateTime dataHoraAtualizacao;
    private boolean ativo = true;

    public Cliente(ClienteRequest clienteRequest) {
        this.nomeCompleto = clienteRequest.getNomeCompleto();
        this.cpf = clienteRequest.getCpf();
        this.email = clienteRequest.getEmail();
        this.telefone = clienteRequest.getTelefone();
        this.sexo = clienteRequest.getSexo();
        this.celular = clienteRequest.getCelular();
        this.dataNascimento = clienteRequest.getDataNascimento();
        this.dataHoraCadastro = LocalDateTime.now();

    }

}
