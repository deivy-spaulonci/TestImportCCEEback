package br.com.testimportcceeback.business;

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
     * @param agentes
     * @return List<Agente>
     */
    public List<Agente> saveListAgents(List<Agente> agentes){
        return agenteRepository.saveAll(agentes);
    }

    /**
     * consulta agente por codigo e regiao
     * @param codigo
     * @param regiao
     * @return List<Agente>
     */
//    public List<Agente> findAgenteByCodigoAndRegial(Long codigo, Regiao regiao){
//        return agenteRepository.findAgenteByCodigoAndRegiao(codigo, regiao);
//    }
}
