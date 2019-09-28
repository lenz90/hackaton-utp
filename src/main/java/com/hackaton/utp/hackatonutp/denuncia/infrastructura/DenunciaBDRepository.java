package com.hackaton.utp.hackatonutp.denuncia.infrastructura;

import com.hackaton.utp.hackatonutp.denuncia.infrastructura.denuncia.DenunciaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DenunciaBDRepository extends JpaRepository<DenunciaEntity, String> {

    @Query(
            value = "SELECT * FROM denuncia u WHERE u.numero_documento = ?1",
            nativeQuery = true)
    List<DenunciaEntity> buscarTodasDenunciasxUsuario(String user);

    @Query(
            value = "SELECT * FROM denuncia u WHERE u.comisaria = ?1",
            nativeQuery = true)
    List<DenunciaEntity> buscarTodasDenunciasxComisaria(String comisaria);
}
