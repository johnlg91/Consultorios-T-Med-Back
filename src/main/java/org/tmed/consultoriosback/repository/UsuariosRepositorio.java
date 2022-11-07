package org.tmed.consultoriosback.repository;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.tmed.consultoriosback.model.Usuario;

@Repository
public interface UsuariosRepositorio extends CrudRepository<Usuario, Long> {

    @Query("SELECT * FROM USUARIOS WHERE OCULTO = 0")
    Iterable<Usuario> getUsuario();

    @Modifying
    @Query("UPDATE USUARIOS SET OCULTO = 1 WHERE ID = :id")
    void deleteUsuario(@Param("id") long id);
}
