package br.com.testimportcceeback.domain.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Agente implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private Long codigo;

    @Column(nullable = false)
    private OffsetDateTime data;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinTable(name = "AGENTE_REGIAO",
            joinColumns = @JoinColumn(name = "AGENTE_ID"),
            inverseJoinColumns = @JoinColumn(name = "REGIAO_ID"))
    private List<Regiao> regiao;
}
