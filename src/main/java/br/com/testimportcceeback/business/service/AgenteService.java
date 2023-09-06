package br.com.testimportcceeback.business.service;

import br.com.testimportcceeback.domain.model.Agente;
import br.com.testimportcceeback.domain.model.Regiao;
import br.com.testimportcceeback.domain.repository.AgenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgenteService {

    @Autowired
    AgenteRepository agenteRepository;

    /**
     * salvar lista agentes
     * @param List<agente>
     * @return List<Agente>
     */
    public List<Agente> saveListAgents(List<Agente> agentes){
        return agenteRepository.saveAll(agentes);
    }

    /**
     * encontar agente pelo codigo
     * @param codigo
     * @return List<Agente>
     */
    public List<Agente> findAgenteByCodigo(Long codigo){
        return agenteRepository.findAgenteByCodigo(codigo);
    }

    /**
     * salvar agente
     * @param Agente
     */
    public Agente salvarAgente(Agente agente){
        return agenteRepository.save(agente);
    }
}
