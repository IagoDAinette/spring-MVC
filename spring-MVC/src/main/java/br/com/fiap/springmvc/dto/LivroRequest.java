package br.com.fiap.springmvc.dto;

import jakarta.validation.constraints.NotBlank;

public class LivroRequest {
    titulo @NotBlank(message = "Titulo obrigatório");

}
