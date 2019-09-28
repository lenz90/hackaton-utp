package com.hackaton.utp.hackatonutp.denuncia.infrastructura.denuncia;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Getter
@Setter
@Builder
@Entity
@Table(name = "denuncia")
public class DenunciaEntity {
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "tipo_documento")
    private String tipoDocumento;
    @Column(name = "numero_documento")
    private String numeroDocument;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "foto")
    private String foto;
    @Column(name = "coordenada")
    private String coordenadas;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "comisaria")
    private String comisa;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "tipo_denuncia")
    private String tipoDenuncia;

    public DenunciaEntity() {
    }

    public DenunciaEntity(String id, String nombre, String tipoDocumento, String numeroDocument, String telefono, String foto, String coordenadas, String direccion, String comisa, String descripcion, String tipoDenuncia) {
        this.id = id;
        this.nombre = nombre;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocument = numeroDocument;
        this.telefono = telefono;
        this.foto = foto;
        this.coordenadas = coordenadas;
        this.direccion = direccion;
        this.comisa = comisa;
        this.descripcion = descripcion;
        this.tipoDenuncia = tipoDenuncia;
    }
}
