package br.com.usuario.controller;

import br.com.usuario.model.Usuario;
import br.com.usuario.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/usuario/view")
    public List<Usuario> viewUsuarios() {

        return usuarioService.buscarUsuarios();
    }

    @PostMapping("/usuario/add")
    public Usuario addUsuario(@RequestBody Usuario usuario) {

        return usuarioService.salvarUsuario(usuario);
    }

    @PutMapping("/usuario/update")
    public Usuario updateUsuario(@RequestBody Usuario usuario) {

        return usuarioService.alterarUsuario(usuario);
    }

    @DeleteMapping("/usuario/delete/{id}")
    public void deleteUsuario(@PathVariable Long id) {

        usuarioService.deletarUsuario(id);
    }

}
