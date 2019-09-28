package com.hackaton.utp.hackatonutp.denuncia.business;

import com.hackaton.utp.hackatonutp.denuncia.domain.Comisaria;
import com.hackaton.utp.hackatonutp.denuncia.domain.Denuncia;
import com.hackaton.utp.hackatonutp.denuncia.domain.DenunciaUbicacion;
import com.hackaton.utp.hackatonutp.denuncia.domain.Direccion;

import java.util.List;
import java.util.Optional;

public interface DenunciaApp {
    Optional<Comisaria> buscarComisaria(String coordenadas);
    Optional<List<Direccion>> busquedaDeDireccion(String direccion);
    Optional<List<Denuncia>> listarDenunciaXUsuario(String usuario);
    Optional<List<Denuncia>> listarDenunciaXComisaria(String comisaria);
    Optional<List<DenunciaUbicacion>> listarDenunciaMapaDeCalor(String usuario);
    String registrarDenuncia(Denuncia denuncia);
}
