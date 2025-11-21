package com.id.gestion_back.controller;

import com.id.gestion_back.dto.UsuarioDTO;
import com.id.gestion_back.dto.UsuarioInput;
import com.id.gestion_back.service.UsuarioService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class UsuarioResolver {

    private final UsuarioService usuarioService;

    public UsuarioResolver(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @QueryMapping
    public List<UsuarioDTO> obtenerUsuarios() {
        return usuarioService.obtenerTodos();
    }

    @QueryMapping
    public UsuarioDTO obtenerPorId(@Argument String id) {
        return usuarioService.obtenerUsuarioPorId(id);
    }

    @MutationMapping
    public UsuarioDTO crearUsuario(@Argument UsuarioInput input) {
        return usuarioService.crearUnUsuario(input);
    }

    @MutationMapping
    public UsuarioDTO actualizarUsuario(@Argument String id, UsuarioInput input) {
        return usuarioService.actualizarUnUsuario(id, input);
    }

    @MutationMapping
    public boolean eliminarUsuario(@Argument String id) {
        return usuarioService.borrarUsuario(id);
    }
}
