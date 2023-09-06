package br.com.testimportcceeback.business.service;

import br.com.testimportcceeback.domain.model.Agente;
import br.com.testimportcceeback.domain.model.Regiao;
import br.com.testimportcceeback.domain.model.Sigla;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
@Transactional //@Transactional annotation rollbacks @Test methods calls
@SpringBootTest
public class AgenteServiceTest {

    @Autowired
    AgenteService agenteService;

    private Regiao regiao;
    private Agente agente;
    final private Long CODIGO_AGENTE = 3L;
    final private Long ID_REGIAO = 4l;
    final private Sigla SIGLA = Sigla.SE;

    @BeforeEach
    void init() {
        this.regiao = Regiao.builder()
                .compra(new ArrayList<>())
                .geracao(new ArrayList<>())
                .sigla(this.SIGLA)
                .id(this.ID_REGIAO)
                .build();
        List<Regiao> listRegiao = new ArrayList<>();
        listRegiao.add(regiao);
        this.agente = Agente.builder()
                .id(1L)
                .codigo(CODIGO_AGENTE)
                .data(OffsetDateTime.now())
                .regiao(listRegiao)
                .build();
    }

    @Test
    public void testeSalvarAgente(){
        Agente agente = agenteService.salvarAgente(this.agente);
        assertEquals(agente.getCodigo(), CODIGO_AGENTE, "Erro no teste de salvar agente.");
    }
}
