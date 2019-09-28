package com.hackaton.utp.hackatonutp.denuncia.infrastructura;

import com.google.common.base.Strings;
import com.hackaton.utp.hackatonutp.denuncia.business.DenunciaApp;
import com.hackaton.utp.hackatonutp.denuncia.domain.Comisaria;
import com.hackaton.utp.hackatonutp.denuncia.domain.Denuncia;
import com.hackaton.utp.hackatonutp.denuncia.domain.DenunciaUbicacion;
import com.hackaton.utp.hackatonutp.denuncia.domain.Direccion;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/denuncia/v1")
@Slf4j
public class DenunciaController {
    @Autowired
    private DenunciaApp denunciaApp;


    @GetMapping(value = "/comisaria", produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<Comisaria> buscarComisaria(@RequestParam String coordenada) {
        return denunciaApp.buscarComisaria(coordenada);
    }

    @GetMapping(value = "/direccion", produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<List<Direccion>> busquedaDeDireccion(@RequestParam String direccion) {
        return denunciaApp.busquedaDeDireccion(direccion);
    }

    @GetMapping(value = "/denuncia", produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<List<Denuncia>> listarDenuncia(@RequestParam(required = false) String usuario,
                                                           @RequestParam(required = false) String comisaria) {
        if (!Strings.isNullOrEmpty(usuario)) {
            return denunciaApp.listarDenunciaXUsuario(usuario);
        } else {
            if (!Strings.isNullOrEmpty(comisaria)) {
                return denunciaApp.listarDenunciaXComisaria(comisaria);
            }
        }
        return Optional.empty();
    }

    @GetMapping(value = "/denuncia/map", produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<List<DenunciaUbicacion>> listarDenunciaMapaDeCalor(@RequestParam String usuario) {
        return denunciaApp.listarDenunciaMapaDeCalor(usuario);
    }

    @PostMapping(value = "/denuncia", produces = MediaType.APPLICATION_JSON_VALUE)
    public String registrarDenuncia(@RequestBody Denuncia denuncia) {
        return denunciaApp.registrarDenuncia(denuncia);
    }

}
