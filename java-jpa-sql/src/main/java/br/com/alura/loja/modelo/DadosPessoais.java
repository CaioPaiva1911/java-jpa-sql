package br.com.alura.loja.modelo;

import lombok.*;

import javax.persistence.Embeddable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class DadosPessoais {
    @NonNull
    private String nome;
    @NonNull
    private String cpf;
}
