package br.com.usuario.service;

import br.com.usuario.model.Usuario;

import java.util.List;

public interface UsuarioService {

    List<Usuario> viewUsuarios();

    Usuario saveUsuario(Usuario usuario);

    void deleteUsuario(Long id);

    Usuario updateUsuario(Usuario usuario);
}
