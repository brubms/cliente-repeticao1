package br.com.bbsm.clienterepeticao1.application.api;

import br.com.bbsm.clienterepeticao1.domain.Sexo;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;
@Getter // cria os getters
@Builder //cria um objeto de forma mais fluida e legivel, sem fazer aquele objeto gigante com varias "" ele cria de forma a ser mais organizada
//Cria um construtor completo com todos os atributos da classe, feito para testes.
@AllArgsConstructor
//Criando um construtor vazio, para que o JPA possa buscar no banco de dados
@NoArgsConstructor
//recebe o JSON que o usuario mandar quando quiser se cadastrar!(DTO de entrada)
public class ClienteRequest {

    private String nomeCompleto;
    @CPF
    private String cpf;
    @NotBlank
    @NotBlank
    private String email;
    @Size(min = 10, max = 13)
    private String telefone;
    @NotNull
    private LocalDate dataNascimento;
    private Sexo sexo;
    private String celular;

}
