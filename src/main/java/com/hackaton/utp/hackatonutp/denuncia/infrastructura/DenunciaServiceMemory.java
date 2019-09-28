package com.hackaton.utp.hackatonutp.denuncia.infrastructura;

import com.hackaton.utp.hackatonutp.denuncia.domain.Comisaria;
import com.hackaton.utp.hackatonutp.denuncia.domain.DenunciaService;
import com.hackaton.utp.hackatonutp.denuncia.domain.Direccion;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DenunciaServiceMemory implements DenunciaService {

    @Override
    public Optional<Comisaria> buscarComisaria(String coordenadas) {
        return Optional.ofNullable(Constantes.comisaria);
    }

    @Override
    public Optional<List<Direccion>> busquedaDeDireccion(String direccion) {
        return Optional.ofNullable(Constantes.listDireccion);
    }
}
