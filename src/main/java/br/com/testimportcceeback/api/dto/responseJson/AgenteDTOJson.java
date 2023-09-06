package br.com.testimportcceeback.api.dto.responseJson;

import br.com.testimportcceeback.api.dto.RegiaoDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.OffsetDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AgenteDTOJson {
    private Long codigo;

    @DateTimeFormat(pattern = "yyyy-MM-ddTHH:mm:ss.SSS")
    private OffsetDateTime data;

    private List<RegiaoDTO> regiao;

}
