package br.com.testimportcceeback.api.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JacksonXmlRootElement(localName = "agente")
public class AgenteDTO implements Serializable {

    @JacksonXmlProperty
    private Long codigo;

    @JacksonXmlProperty
    @DateTimeFormat(pattern = "yyyy-MM-ddTHH:mm:ss.SSS")
    private OffsetDateTime data;

    @JacksonXmlProperty(localName = "regiao")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<RegiaoDTO> regiao;
}
