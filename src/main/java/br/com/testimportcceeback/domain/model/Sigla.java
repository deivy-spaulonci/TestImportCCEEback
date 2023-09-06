package br.com.testimportcceeback.domain.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;

@Getter
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Sigla {
    SE,
    S,
    NE,
    N
}
