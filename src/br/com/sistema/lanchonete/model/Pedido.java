package br.com.sistema.lanchonete.model;

import br.com.sistema.lanchonete.pagamento.FormaDePagamento;
import br.com.sistema.lanchonete.util.GeradorId;

public class Pedido {
    private final Lanche lanche;
    private final FormaDePagamento formaDePagamento;
    private final int id;
    private final double valor;

    public Pedido(Lanche lanche, FormaDePagamento formaDePagamento, double valor) {
        if (valor == 0) {
            throw new IllegalArgumentException("Valor deve ser maior que zero");
        }
        this.lanche = lanche;
        this.formaDePagamento = formaDePagamento;
        this.id = GeradorId.getInstance().proximoId();
        this.valor = valor;
    }

    public FormaDePagamento getFormaDePagamento() {
        return formaDePagamento;
    }

    public Lanche getLanche() {
        return lanche;
    }

    public int getId() {
        return id;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Pedido #" + id + " - " + lanche + " - R$:" + valor;
    }
}
