package br.com.testimportcceeback.api.restcontroller;

import br.com.testimportcceeback.api.dto.AgenteDTO;
import br.com.testimportcceeback.api.dto.AgentesDTO;
import br.com.testimportcceeback.api.mapper.AgenteMapper;
import br.com.testimportcceeback.business.AgenteService;
import br.com.testimportcceeback.domain.model.Agente;
import br.com.testimportcceeback.domain.model.Regiao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/agente")
public class AgenteRestController {

    @Autowired
    AgenteService agenteService;
    private static final AgenteMapper agenteMapper = AgenteMapper.INSTANCE;

    @PostMapping
    public ResponseEntity<?> importAgents(@RequestBody AgentesDTO agentesDTO){

        if(agentesDTO.getAgente().isEmpty())
            return ResponseEntity
                    .status(HttpStatus.NO_CONTENT)
                    .body("Não foram encontrados agentes no arquivo xml");

        List<Agente> agentes = agenteService.saveListAgents(agenteMapper.toModelList(agentesDTO.getAgente()));
        agentes.forEach(agenteDTO -> System.out.println("Código do agente: " + agenteDTO.getCodigo()));

        return ResponseEntity.status(HttpStatus.OK).body("Agentes salvos");
    }

//    @GetMapping("/{codigo}/{regiao}")
//    public ResponseEntity<List<AgenteDTO>> findAgenteByCodigoAndRegial(
//            @PathVariable("codigo") Long codigo,
//            @PathVariable("regiao") String regiao){
//        return agenteService.findAgenteByCodigoAndRegial(codigo, Regiao.builder().sigla(regiao).build());
//    }
}