package com.bootcamp.users.services;

import com.bootcamp.users.entities.Usuario;
import com.bootcamp.users.repositories.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service()
public class UsuarioServiceImpl implements UsuarioService {

    private UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(UsuarioRepository usuarioRepository){
        this.usuarioRepository=usuarioRepository;
    }

    @Override
    public List<Usuario> findAll() {
        return this.usuarioRepository.findAll();
    }

    @Override
    public Usuario add(Usuario usuario) {
        return this.usuarioRepository.saveAndFlush(usuario);
    }
}
