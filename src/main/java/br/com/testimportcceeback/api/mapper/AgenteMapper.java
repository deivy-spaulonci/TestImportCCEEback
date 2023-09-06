package br.com.testimportcceeback.api.mapper;

import br.com.testimportcceeback.api.dto.AgenteDTO;
import br.com.testimportcceeback.domain.model.Agente;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface AgenteMapper {
    AgenteMapper INSTANCE = Mappers.getMapper(AgenteMapper.class);
    Agente toModel(AgenteDTO agenteDTO);
    AgenteDTO toDTO(Agente agente);
    List<AgenteDTO> toDtoList(List<Agente> agentes);
    List<Agente> toModelList(List<AgenteDTO> agenteDTOS);

}
