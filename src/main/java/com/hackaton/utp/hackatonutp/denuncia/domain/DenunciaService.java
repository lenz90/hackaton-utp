package com.hackaton.utp.hackatonutp.denuncia.domain;

import java.util.List;
import java.util.Optional;

public interface DenunciaService {
    Optional<Comisaria> buscarComisaria(String coordenadas);
    Optional<List<Direccion>> busquedaDeDireccion(String direccion);
}
