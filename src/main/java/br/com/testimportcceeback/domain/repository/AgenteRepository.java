package br.com.testimportcceeback.domain.repository;

import br.com.testimportcceeback.domain.model.Agente;
import br.com.testimportcceeback.domain.model.Regiao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AgenteRepository extends JpaRepository<Agente, Long> {
    List<Agente> findAgenteByCodigo(Long codigo);
}
