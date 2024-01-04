package br.com.alura.loja.modelo.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
@ToString
public class RelatorioDeVendasVo {
    private String nomeProduto;
    private Long quantidadeVendida;
    private LocalDate dataUltimaVenda;
}
