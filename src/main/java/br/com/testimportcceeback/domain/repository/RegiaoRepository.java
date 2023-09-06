package br.com.testimportcceeback.domain.repository;

import br.com.testimportcceeback.domain.model.Regiao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegiaoRepository extends JpaRepository<Regiao, Long> {


}
