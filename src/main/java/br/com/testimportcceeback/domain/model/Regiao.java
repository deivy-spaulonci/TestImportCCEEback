package br.com.testimportcceeback.domain.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Regiao implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(length = 60, nullable = true)
    private Sigla sigla;

    @ElementCollection
    private List<BigDecimal> geracao;

    @ElementCollection
    private List<BigDecimal> compra;

}
