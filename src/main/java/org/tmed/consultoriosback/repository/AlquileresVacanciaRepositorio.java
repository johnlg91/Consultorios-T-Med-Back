package org.tmed.consultoriosback.repository;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.tmed.consultoriosback.model.AlquilerVacancia;
import org.tmed.consultoriosback.model.componentesJson.CoordenadaDeMatriz;

import java.util.Date;

@Repository
public interface AlquileresVacanciaRepositorio extends CrudRepository<AlquilerVacancia, Long> {

    @Query("SELECT * FROM ALQUILERES_VACANCIA WHERE OCULTO = 0")
    Iterable<AlquilerVacancia> getAlquileresVacancia();

    @Query("""
            SELECT AV.DIA_DE_LA_SEMANA, AV.EMPIEZA_VACANCIA, AV.TERMINA_VACANCIA, C.NUMERO_DE_CONSULTORIO, P.NOMBRE, P.APELLIDO, ID_CONTRATO_DE_ALQUILER
                      FROM ALQUILERES_VACANCIA AV
                           JOIN CONTRATOS_DE_ALQUILER CDA on AV.ID_CONTRATO_DE_ALQUILER = CDA.ID
                           JOIN CONSULTORIOS C on C.ID = CDA.ID_CONSULTORIO
                           JOIN PROFESIONALES P on CDA.ID_PROFESIONAL = P.ID
                           WHERE CDA.INICIO_DEL_CONTRATO_DE_ALQUILER >= :inicio AND
                                 CDA.FIN_DEL_CONTRATO <= :fin AND
                                 CDA.OCULTO = 0
                """)
    Iterable<CoordenadaDeMatriz> getAlquileresVacanciaParaMatriz(@Param("inicio") Date inicio, @Param("fin") Date fin);

    @Modifying
    @Query("UPDATE ALQUILERES_VACANCIA SET OCULTO = 1 WHERE ID = :id")
    void deleteAlquilerVacancia(@Param("id") long id);
}
