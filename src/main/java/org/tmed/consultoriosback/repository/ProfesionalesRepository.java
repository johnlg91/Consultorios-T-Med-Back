package org.tmed.consultoriosback.repository;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.tmed.consultoriosback.model.Profesional;

import java.util.Optional;

@Repository
public interface ProfesionalesRepository extends CrudRepository<Profesional, Long> {

    @Query("SELECT * FROM PROFESIONALES where DNI = :dni")
    Optional<Profesional> findByDni(@Param("dni") long dni);
}
