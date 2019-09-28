package com.hackaton.utp.hackatonutp.denuncia.infrastructura.adapter;

import com.hackaton.utp.hackatonutp.denuncia.domain.Denuncia;
import com.hackaton.utp.hackatonutp.denuncia.domain.TipoDenuncia;
import com.hackaton.utp.hackatonutp.denuncia.infrastructura.denuncia.DenunciaEntity;

import java.util.UUID;

public class DenunciaAdapter {
    public static DenunciaEntity DenunciaTodenunciaEntity(Denuncia denuncia) {
        return DenunciaEntity.builder()
                .comisa(denuncia.getComisa())
                .coordenadas(denuncia.getCoordenadas())
                .descripcion(denuncia.getDescripcion())
                .direccion(denuncia.getDireccion())
                .foto(denuncia.getFoto())
                .id(UUID.randomUUID().toString())
                .nombre(denuncia.getNombre())
                .numeroDocument(denuncia.getNumeroDocument())
                .telefono(denuncia.getTelefono())
                .tipoDenuncia(denuncia.getTipoDenuncia().toString())
                .tipoDocumento(denuncia.getTipoDocumento())
                .build();
    }

    public static Denuncia denunciaEntityToDenuncia(DenunciaEntity denuncia) {
        return Denuncia.builder()
                .comisa(denuncia.getComisa())
                .coordenadas(denuncia.getCoordenadas())
                .descripcion(denuncia.getDescripcion())
                .direccion(denuncia.getDireccion())
                .foto(denuncia.getFoto())
                .id(UUID.randomUUID().toString())
                .nombre(denuncia.getNombre())
                .numeroDocument(denuncia.getNumeroDocument())
                .telefono(denuncia.getTelefono())
                .tipoDenuncia(TipoDenuncia.valueOf(denuncia.getTipoDenuncia()))
                .tipoDocumento(denuncia.getTipoDocumento())
                .build();
    }
}
