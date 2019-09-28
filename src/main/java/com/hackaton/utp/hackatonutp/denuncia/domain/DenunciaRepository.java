package com.hackaton.utp.hackatonutp.denuncia.domain;

import java.util.List;
import java.util.Optional;

public interface DenunciaRepository {
    Optional<List<Denuncia>> listarDenunciaXUsuario(String usuario);
    Optional<List<Denuncia>> listarDenunciaXComisaria(String comisaria);
    Optional<List<DenunciaUbicacion>> listarDenunciaMapaDeCalor();
    String registrarDenuncia(Denuncia denuncia);
}
