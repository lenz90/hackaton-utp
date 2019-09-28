package com.hackaton.utp.hackatonutp.denuncia.business;

import com.hackaton.utp.hackatonutp.denuncia.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DenunciaAppImpl implements DenunciaApp {

    @Autowired
    private DenunciaRepository denunciaRepository;

    @Autowired
    private DenunciaService denunciaService;

    @Override
    public Optional<Comisaria> buscarComisaria(String coordenadas) {
        return denunciaService.buscarComisaria(coordenadas);
    }

    @Override
    public Optional<List<Direccion>> busquedaDeDireccion(String direccion) {
        return denunciaService.busquedaDeDireccion(direccion);
    }

    @Override
    public Optional<List<Denuncia>> listarDenunciaXUsuario(String usuario) {
        return denunciaRepository.listarDenunciaXUsuario(usuario);
    }

    @Override
    public Optional<List<Denuncia>> listarDenunciaXComisaria(String comisaria) {
        return denunciaRepository.listarDenunciaXComisaria(comisaria);
    }

    @Override
    public Optional<List<DenunciaUbicacion>> listarDenunciaMapaDeCalor(String usuario) {
        return denunciaRepository.listarDenunciaMapaDeCalor();
    }

    @Override
    public String registrarDenuncia(Denuncia denuncia) {
        return denunciaRepository.registrarDenuncia(denuncia);
    }
}
