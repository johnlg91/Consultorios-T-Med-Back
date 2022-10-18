package org.tmed.consultoriosback.repository;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.tmed.consultoriosback.model.Expensa;

@Repository
public interface ExpensasRepositorio extends CrudRepository<Expensa, Long> {

    @Query("SELECT * FROM EXPENSAS WHERE OCULTO = 0")
    Iterable<Expensa> getExpensa();

    @Modifying
    @Query("UPDATE EXPENSAS SET OCULTO = 1 WHERE ID = :id")
    void deleteExpensa(@Param("id") long id);
}
