package com.example.tarea.repository;


import com.example.tarea.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    /*select * from usuario where usuario = usuario*/
    Usuario findByUsuario(String usuario);
}
