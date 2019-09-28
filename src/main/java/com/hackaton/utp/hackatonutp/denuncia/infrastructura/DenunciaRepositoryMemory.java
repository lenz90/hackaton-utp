package com.hackaton.utp.hackatonutp.denuncia.infrastructura;

import com.hackaton.utp.hackatonutp.denuncia.domain.Denuncia;
import com.hackaton.utp.hackatonutp.denuncia.domain.DenunciaRepository;
import com.hackaton.utp.hackatonutp.denuncia.domain.DenunciaUbicacion;
import com.hackaton.utp.hackatonutp.denuncia.domain.TipoDenuncia;
import com.hackaton.utp.hackatonutp.denuncia.infrastructura.adapter.DenunciaAdapter;
import com.hackaton.utp.hackatonutp.denuncia.infrastructura.denuncia.DenunciaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class DenunciaRepositoryMemory implements DenunciaRepository {


    @Autowired
    DenunciaBDRepository denunciaBDRepository;

    @Override
    public Optional<List<Denuncia>> listarDenunciaXUsuario(String usuario) {
        Optional<List<DenunciaEntity>> de = Optional.ofNullable(denunciaBDRepository.buscarTodasDenunciasxUsuario(usuario));

        return de.isPresent()?Optional.ofNullable(de.get().stream().map(DenunciaAdapter::denunciaEntityToDenuncia).collect(Collectors.toList())):Optional.empty();
    }

    @Override
    public Optional<List<Denuncia>> listarDenunciaXComisaria(String comisaria) {
        Optional<List<DenunciaEntity>> de = Optional.ofNullable(denunciaBDRepository.buscarTodasDenunciasxComisaria(comisaria));

        return de.isPresent()?Optional.ofNullable(de.get().stream().map(DenunciaAdapter::denunciaEntityToDenuncia).collect(Collectors.toList())):Optional.empty();

    }

    @Override
    public Optional<List<DenunciaUbicacion>> listarDenunciaMapaDeCalor() {
        return Optional.ofNullable(Optional.ofNullable(denunciaBDRepository.findAll()).orElseGet(()->new ArrayList<>()).stream().map(x->{
            return new DenunciaUbicacion(x.getCoordenadas(), TipoDenuncia.valueOf(x.getTipoDenuncia()));
        }).collect(Collectors.toList()));
    }

    @Override
    public String registrarDenuncia(Denuncia denuncia) {
        return DenunciaAdapter
                .denunciaEntityToDenuncia(
                        denunciaBDRepository.save(DenunciaAdapter.DenunciaTodenunciaEntity(denuncia))).getId();
    }
}
