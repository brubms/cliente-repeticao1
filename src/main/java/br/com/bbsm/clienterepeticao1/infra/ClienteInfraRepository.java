package br.com.bbsm.clienterepeticao1.infra;

import br.com.bbsm.clienterepeticao1.application.repository.ClienteRepository;
import br.com.bbsm.clienterepeticao1.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;
/*
* Diz para o Spring essa classe vai acessar o banco de dados!
* */
@Repository
/*
* Cria um construtor completo para todos os atributos final, para que o Spring
* possa injeta-los automaticamente sem precisar digitar o construtor
* */
@RequiredArgsConstructor
@Log4j2
public class ClienteInfraRepository implements ClienteRepository {

    private final ClienteSpringDataJpaRepository jpaRepository;

    @Override
    public Cliente salva(Cliente cliente){

        log.info("[inicia] ClienteInfraRepository - salva");
        Cliente salvaCliente = jpaRepository.save(cliente);
        log.info("[finaliza] ClienteInfraRepository - salva");
        return salvaCliente;
    }


}
