package br.com.testimportcceeback.api.restcontroller;

import br.com.testimportcceeback.api.dto.AgentesDTO;
import br.com.testimportcceeback.api.mapper.AgenteMapper;
import br.com.testimportcceeback.business.service.AgenteService;
import br.com.testimportcceeback.domain.model.Agente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/agente")
public class AgenteRestController {

    @Autowired
    AgenteService agenteService;
    private static final AgenteMapper agenteMapper = AgenteMapper.INSTANCE;

    @PostMapping("/importar")
    public ResponseEntity<Object> importAgents(@RequestBody AgentesDTO agentesDTO){

        if(agentesDTO.getAgente().isEmpty())
            return ResponseEntity
                    .status(HttpStatus.NO_CONTENT)
                    .body("Não foram encontrados agentes no arquivo xml");

        List<Agente> agentes = agenteService.saveListAgents(agenteMapper.toModelList(agentesDTO.getAgente()));
        agentes.forEach(agenteDTO -> System.out.println("Código do agente: " + agenteDTO.getCodigo()));

        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @GetMapping(value = "/{codigo}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> findAgenteByCodigoAndRegial(@PathVariable("codigo") Long codigo){
        List<Agente> agentes = agenteService.findAgenteByCodigo(codigo);

        if(agentes.isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Agente(s) não foi encontrada!");

        return ResponseEntity.ok(agenteMapper.toDtoListJson(agentes));
    }
}
