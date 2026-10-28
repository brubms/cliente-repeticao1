package br.com.bbsm.clienterepeticao1.application.service;

import br.com.bbsm.clienterepeticao1.application.repository.ClienteRepository;
import br.com.bbsm.clienterepeticao1.application.api.ClienteRequest;
import br.com.bbsm.clienterepeticao1.application.api.ClienteResponse;
import br.com.bbsm.clienterepeticao1.domain.Cliente;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

/*
*
* -avisa o spring que essa classe é responsável pela regra de negocio e que pode gerenciar
*
* */
@Service
/*
* cria automaticamente em tempo de compilação todos os construtores para todos os atributos final
* */
@RequiredArgsConstructor
/*
* ferrementa de logs
* */
@Log4j2

/*
* quando implemento o ClienteService aqui estou assinando o contrato de service, nesse caso preciso cadastrar um novo clinte
* */
public class ClienteApplicationService implements ClienteService{

    //ajudante para salvar no banco (privado por questões de segurança
    private final ClienteRepository clienteRepository;

    @Override
    public ClienteResponse cadastraNovoCliente(ClienteRequest clienteRequest) {
        log.info("[inicia] ClienteApplicationService - cadastraNovoCliente");
        Cliente cliente = clienteRepository.salva(new Cliente(clienteRequest));
        log.info("[finaliza] ClienteApplicationService - cadastraNovoCliente");
        return ClienteResponse.builder().idCliente(cliente.getIdCliente()).build();

        /*
        * este salva da seguinte maneira, clienteRequest fez um cliente novo com os dados cruciais,
        * no qual agora é usado dentro de um atributo do tipo Cliente dentro de ApplicationService onde é salvo
        * e passado para repository, fazendo com o que os dados do cliente não sejam alterados mas reutilizados.
        * o service entrega para o usuario o id criado. o cliente response é o retorno do método cadastranovocliente,
        * ou seja só recebe desse tipo, quando fazemos o processo de build passamos o dado crucial que ele precisa !
        * */
    }
}
