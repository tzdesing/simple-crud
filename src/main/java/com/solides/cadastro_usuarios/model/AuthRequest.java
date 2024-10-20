package com.solides.cadastro_usuarios.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthRequest {
    private String cpf;
    private String senha;
}
