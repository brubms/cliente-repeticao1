package br.com.bbsm.clienterepeticao1.infra;

import br.com.bbsm.clienterepeticao1.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClienteSpringDataJpaRepository extends JpaRepository<Cliente, UUID > {
}
