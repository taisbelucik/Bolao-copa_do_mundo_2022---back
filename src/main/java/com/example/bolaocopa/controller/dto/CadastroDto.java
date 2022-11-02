package com.example.bolaocopa.controller.dto;

public class CadastroDto {
    private Long Id;
    private String Usuario;
    private String Email;
    private String Senha;

    public CadastroDto(Long id, String usuario, String email, String senha) {
        Id = id;
        Usuario = usuario;
        Email = email;
        Senha = senha;
    }
}
