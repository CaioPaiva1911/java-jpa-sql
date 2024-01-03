package br.com.alura.loja.modelo;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    private String nome;
    @NonNull
    private String cpf;

}
