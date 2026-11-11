package br.com.sistema.lanchonete.service;

import br.com.sistema.lanchonete.model.Lanche;
import br.com.sistema.lanchonete.model.Pedido;
import br.com.sistema.lanchonete.pagamento.FormaDePagamento;
import br.com.sistema.lanchonete.pagamento.PagamentoFactory;
import br.com.sistema.lanchonete.pagamento.TipoPagamento;

import java.util.ArrayList;
import java.util.List;

public class PedidoService {
    private final List<Pedido> pedidos;

    public PedidoService() {
        this.pedidos = new ArrayList<>();
    }

    public void registrar(Lanche lanche, TipoPagamento tipo, double valor) {
        FormaDePagamento pagamento = PagamentoFactory.criar(tipo);
        Pedido pedido = new Pedido(lanche, pagamento, valor);
        pedidos.add(pedido);
    }

    public List<Pedido> listar() {
        return List.copyOf(pedidos);
    }


}
