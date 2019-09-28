package com.hackaton.utp.hackatonutp.denuncia.infrastructura;

import com.hackaton.utp.hackatonutp.denuncia.domain.Comisaria;
import com.hackaton.utp.hackatonutp.denuncia.domain.Denuncia;
import com.hackaton.utp.hackatonutp.denuncia.domain.Direccion;
import com.hackaton.utp.hackatonutp.denuncia.domain.TipoDenuncia;

import java.util.Arrays;
import java.util.List;

public class Constantes {
    private static Denuncia denuncia = Denuncia.builder()
            .tipoDenuncia(TipoDenuncia.ACOSO_LABORAL)
            .comisa("SAN_ANDRES")
            .coordenadas("12178;34253;2320")
            .descripcion("Se visualiza la colaboradora Panchita está siendo acosada por Rigoberto")
            .direccion("Av. 28 de Julio 666, Jesus Maria")
            .id("D3")
            .nombre("Juanito")
            .numeroDocument("34567890")
            .telefono("9998880000")
            .tipoDocumento("DNI").build();

    private static Denuncia denuncia1 = Denuncia.builder()
            .tipoDenuncia(TipoDenuncia.ROBO)
            .comisa("SAN_JACINTO")
            .coordenadas("12178;34253;2320")
            .descripcion("Se visualiza el robo de un auto a Rigoberto.")
            .direccion("Av. Nicolar Ayllon 888, La victoria")
            .id("D3")
            .nombre("Juanito")
            .numeroDocument("34567890")
            .telefono("9998880000")
            .tipoDocumento("DNI").build();
    public static List<Denuncia> listDenuncia =  Arrays.asList(denuncia,denuncia1);

    private static Direccion direccion = new Direccion("Av. 28 de Julio - Cercado de Lima", "41.40338, 2.17403");

    public static List<Direccion> listDireccion = Arrays.asList(direccion);
    public static Comisaria comisaria = new Comisaria("123456", "Av. San Jacinto ", "SAN JACINTO", "Cap. Gonzales");


}
