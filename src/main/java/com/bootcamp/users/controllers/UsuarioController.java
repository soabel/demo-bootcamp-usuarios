package com.bootcamp.users.controllers;

import com.bootcamp.users.entities.Usuario;
import com.bootcamp.users.services.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("usuarios")
public class UsuarioController {

    private UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService){
        this.usuarioService=usuarioService;
    }

    @GetMapping
    public List<Usuario> findALl(){
        return this.usuarioService.findAll();
    }

    @PostMapping
    public Usuario add (@RequestBody Usuario usuario){
        return this.usuarioService.add(usuario);
    }

}
