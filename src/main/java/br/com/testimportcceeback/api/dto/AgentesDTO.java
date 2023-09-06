package br.com.testimportcceeback.api.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JacksonXmlRootElement
public class AgentesDTO implements Serializable {

    @JacksonXmlProperty(localName = "agente")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<AgenteDTO> agente;
}
