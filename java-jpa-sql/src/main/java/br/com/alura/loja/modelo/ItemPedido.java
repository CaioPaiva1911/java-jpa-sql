package br.com.alura.loja.modelo;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "itens_pedido")
@NoArgsConstructor
@Getter
@Setter
public class ItemPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    @Column(name = "oreco_unitario")
    private BigDecimal precoUnitario;
    @NonNull
    private int quantidade;
    @NonNull
    @ManyToOne(fetch = FetchType.LAZY)
    private Pedido pedido;
    @NonNull
    @ManyToOne(fetch = FetchType.LAZY)
    private Produto produto;

    public ItemPedido(@NonNull BigDecimal precoUnitario, @NonNull int quantidade, @NonNull Pedido pedido, @NonNull Produto produto) {
        this.precoUnitario = produto.getPreco();
        this.quantidade = quantidade;
        this.pedido = pedido;
        this.produto = produto;
    }

    public ItemPedido(int i, Pedido pedido, Produto produto) {
        this.precoUnitario = produto.getPreco();
        this.pedido = pedido;
        this.quantidade = i;
        this.produto = produto;
    }

    public BigDecimal getValor() {
        return precoUnitario.multiply(new BigDecimal(quantidade));
    }
}
