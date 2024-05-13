package com.example.active_fit_back.services.impl;


import com.example.active_fit_back.model.Usuario;
import com.example.active_fit_back.repository.UsuarioRepository;
import com.example.active_fit_back.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;


    @Override
    public List<Usuario> findAll() {
        List<Usuario> usuarios = usuarioRepository.findAll();
        return usuarios;
    }

    @Override
    public Long save(Usuario usuario) {

        Double imc = usuario.getPeso() / usuario.getAltura();
        usuario.setImc(imc);

        String contraseñaEncriptada = BCrypt.hashpw(usuario.getContrasena(), BCrypt.gensalt());
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
            return true;
        }
        return false;
    }
}
