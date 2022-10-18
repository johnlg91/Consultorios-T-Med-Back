package org.tmed.consultoriosback.repository;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.tmed.consultoriosback.model.AlquilerVacancia;

import java.util.List;
import java.util.stream.Stream;

@Repository
public interface AlquileresVacanciaRepositorio extends CrudRepository<AlquilerVacancia, Long> {

    @Query("SELECT * FROM ALQUILERES_VACANCIA WHERE OCULTO = 0")
    Iterable<AlquilerVacancia> getAlquileresVacancia();

    @Query("SELECT * FROM ALQUILERES_VACANCIA WHERE ALQUILERES_VACANCIA.ID_CONTRATO_DE_ALQUILER IN (:ids) AND OCULTO = 0")
    Stream<AlquilerVacancia> getAlquileresVacancia(@Param("ids") List<Long> idsContratos);

    @Modifying
    @Query("UPDATE ALQUILERES_VACANCIA SET OCULTO = 1 WHERE ID = :id")
    void deleteAlquilerVacancia(@Param("id") long id);
}
