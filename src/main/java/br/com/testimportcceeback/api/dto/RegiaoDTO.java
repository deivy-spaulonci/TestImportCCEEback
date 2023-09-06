package br.com.testimportcceeback.api.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import jakarta.persistence.ElementCollection;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JacksonXmlRootElement(localName = "regiao")
public class RegiaoDTO implements Serializable {
    private Long id;
    @JacksonXmlProperty(isAttribute = true)
    private String sigla;
    @JacksonXmlProperty
    @ElementCollection
    private List<BigDecimal> geracao;
    @JacksonXmlProperty
    @ElementCollection
    private List<BigDecimal> compra;
}
