package com.hackaton.utp.hackatonutp.denuncia.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class DenunciaUbicacion {
    private String coordenada;
    private TipoDenuncia tipoDenuncia;
}
