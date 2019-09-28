package com.hackaton.utp.hackatonutp.denuncia.domain;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.*;

@Getter
@Setter
@JsonSerialize
@Builder(access = AccessLevel.PUBLIC)
public class Denuncia {
    private String id;
    private String nombre;
    private String tipoDocumento;
    private String numeroDocument;
    private String telefono;
    private String foto;
    private String coordenadas;
    private String direccion;
    private String comisa;
    private String descripcion;
    private TipoDenuncia tipoDenuncia;

}
