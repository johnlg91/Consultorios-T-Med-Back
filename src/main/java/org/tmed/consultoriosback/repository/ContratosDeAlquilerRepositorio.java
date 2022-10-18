package org.tmed.consultoriosback.repository;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.tmed.consultoriosback.model.ContratoDeAlquiler;
import org.tmed.consultoriosback.model.componentesJson.ContratoConNombres;

import java.util.stream.Stream;

@Repository
public interface ContratosDeAlquilerRepositorio extends CrudRepository<ContratoDeAlquiler, Long> {

    @Query("SELECT * FROM CONTRATOS_DE_ALQUILER WHERE OCULTO = 0")
    Iterable<ContratoDeAlquiler> getContratos();

    @Query("SELECT CONTRATOS_DE_ALQUILER.ID, CONSULTORIOS.NUMERO_DE_CONSULTORIO, PROFESIONALES.SOBRENOMBRE ,TIPO_DE_ALQUILER, INICIO_DEL_CONTRATO_DE_ALQUILER, FIN_DEL_CONTRATO, COSTO_TOTAL, CONTRATOS_DE_ALQUILER.NOTAS " +
            "FROM ((CONTRATOS_DE_ALQUILER " +
            "INNER JOIN CONSULTORIOS ON CONTRATOS_DE_ALQUILER.ID_CONSULTORIO = CONSULTORIOS.ID) " +
            "INNER JOIN PROFESIONALES ON CONTRATOS_DE_ALQUILER.ID_PROFESIONAL = PROFESIONALES.ID) ")
    Iterable<ContratoConNombres> getContratosConNombres();

    @Query("SELECT * FROM CONTRATOS_DE_ALQUILER WHERE OCULTO = 0 AND INICIO_DEL_CONTRATO_DE_ALQUILER <= :fechaInicio AND FIN_DEL_CONTRATO >= :fechaFin")
    Stream<ContratoDeAlquiler> getContratosEntreFechas(@Param("fechaInicio") java.sql.Date fechaInicio, @Param("fechaFin") java.sql.Date fechaFin);

    @Query("SELECT * FROM CONTRATOS_DE_ALQUILER WHERE TIPO_DE_ALQUILER = 'NORMAL'")
    Iterable<ContratoDeAlquiler> getContratosNormales();

    @Query("SELECT * FROM CONTRATOS_DE_ALQUILER WHERE TIPO_DE_ALQUILER = 'EXCEPCIONAL'")
    Iterable<ContratoDeAlquiler> getContratosExcepcionales();

    @Modifying
    @Query("UPDATE CONTRATOS_DE_ALQUILER SET OCULTO = 1 WHERE ID = :id")
    void deleteContrato(@Param("id") long id);
}
