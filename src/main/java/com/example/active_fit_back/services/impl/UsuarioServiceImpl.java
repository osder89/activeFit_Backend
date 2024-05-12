package com.example.active_fit_back.services.impl;


import com.example.active_fit_back.model.Usuario;
import com.example.active_fit_back.repository.UsuarioRepository;
import com.example.active_fit_back.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;


    private PasswordEncoder passwordEncoder;

    @Override
    public List<Usuario> findAll() {
        List<Usuario> usuarios = usuarioRepository.findAll();
        return usuarios;
    }

    @Override
    public Long save(Usuario usuario) {
        String contraseñaEncriptada = passwordEncoder.encode(usuario.getContrasena());
        usuario.setContrasena(contraseñaEncriptada);

        usuarioRepository.save(usuario);
        return usuario.getId();
    }

    @Override
    public void delete(Long id) {
        if (usuarioRepository.existsById(id)) {
            usuarioRepository.deleteById(id);
        }
    }

    @Override
    public void update(Long id, Usuario usuario) {
        if (usuarioRepository.existsById(id)) {
            usuarioRepository.save(usuario);
        } else {
            throw new RuntimeException("No se encontro el Usuario");
        }

    }

    @Override
    public Boolean login(String email, String contrasena) {
        Optional<Usuario> usuario = usuarioRepository.findByEmail(email);

        if( usuario != null) {
            return passwordEncoder.matches(contrasena, usuario.get().getContrasena());
        }
        return false;
    }
}
