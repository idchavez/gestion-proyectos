package com.id.gestion_back.service;

import com.id.gestion_back.domain.Usuario;
import com.id.gestion_back.dto.UsuarioDTO;
import com.id.gestion_back.dto.UsuarioInput;
import com.id.gestion_back.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService (UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<UsuarioDTO> obtenerTodos() {
        return usuarioRepository.findAll().stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

    public UsuarioDTO obtenerUsuarioPorId (String id) {
        return usuarioRepository.findById(id)
                .map(this::toDTO)
                .orElse(null);
    }

    public UsuarioDTO crearUnUsuario(UsuarioInput input) {
        Usuario usuario = new Usuario();
        usuario.setCorreo(input.getCorreo());
        usuario.setIdentificacion(input.getIdentificacion());
        usuario.setNombre(input.getNombre());
        usuario.setApellido(input.getApellido());
        return toDTO(usuarioRepository.save(usuario));
    }

    public UsuarioDTO actualizarUnUsuario(String id, UsuarioInput input) {
        return usuarioRepository.findById(id).map(encontrado -> {
            encontrado.setCorreo(input.getCorreo());
            encontrado.setIdentificacion(input.getIdentificacion());
            encontrado.setNombre(input.getNombre());
            encontrado.setApellido(input.getApellido());
            return toDTO(usuarioRepository.save(encontrado));
        }).orElse(null);
    }

    public boolean borrarUsuario(String id) {
        if (usuarioRepository.existsById(id)) {
            usuarioRepository.deleteById(id);
            return true;
        }
        return false;
    }

    private UsuarioDTO toDTO(Usuario usuario) {
        return new UsuarioDTO(usuario.get_id(), usuario.getCorreo(), usuario.getIdentificacion(), usuario.getNombre(), usuario.getApellido());
    }
}
