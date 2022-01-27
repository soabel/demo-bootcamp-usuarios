package com.bootcamp.users.services;

import com.bootcamp.users.entities.Usuario;

import java.util.List;

public interface UsuarioService {
    List<Usuario> findAll();
    Usuario add(Usuario usuario);
}
