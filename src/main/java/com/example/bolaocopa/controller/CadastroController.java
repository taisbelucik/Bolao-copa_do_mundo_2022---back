// Engloba todos os endpoints

package com.example.bolaocopa.controller;
import com.example.bolaocopa.entity.Usuario;
import com.example.bolaocopa.repository.UsuarioRepository;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController

public class CadastroController {

    UsuarioRepository repository;

    @GetMapping("/usuario")
    public List<Usuario> getAllUsuarios()
    {
        return repository.findAll();
    }

    @PostMapping("/usuario")  //anottation informando que é um método POST
    public Usuario cadastrarUsuario(@RequestBody Usuario usuario) {
            return repository.save(usuario);
    }


}
