package br.com.usuario.service;

import br.com.usuario.model.Usuario;
import br.com.usuario.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> buscarUsuarios() {
        return usuarioRepository.findAll();
    }

}
