package com.hackaton.utp.hackatonutp.denuncia.domain;

public enum TipoDenuncia {
    ROBO("ROBO","Robo"),
    ACOSO_LABORAL("ACOSO_LABORAL","Acoso Laboral"),
    ACOSO_SEXUAL("ACOSO_SEXUAL","Acoso Sexual"),
    DISCRIMINACION("DISCRIMINACION","Discriminacion"),
    SOBORNO("SOBORNO","Soborno"),
    AGRESION_FISICA("AGRESION_FISICA","Agresion Fisica"),
    AGRESION_VERBAL("AGRESION_VERBAL","Agresion Verbal");

    TipoDenuncia(String codigo, String valor) {
        this.codigo = codigo;
        this.valor = valor;
    }

    private String codigo;
    private String valor;


    @Override
    public String toString() {
        return this.codigo;
    }

}
