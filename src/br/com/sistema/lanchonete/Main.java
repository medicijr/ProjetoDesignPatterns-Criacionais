package br.com.sistema.lanchonete;


import br.com.sistema.lanchonete.model.Lanche;
import br.com.sistema.lanchonete.model.Pedido;
import br.com.sistema.lanchonete.pagamento.TipoPagamento;
import br.com.sistema.lanchonete.service.PedidoService;

public class Main {
    public static void main(String[] args) {

        PedidoService service = new PedidoService();

        Lanche lanche1 = new Lanche.Builder("Integral", "Hamburguer")
                .molho("Barbecue")
                .queijo()
                .bacon()
                .build();
        service.registrar(lanche1, TipoPagamento.PIX, 45.00);

        Lanche lanche2 = new Lanche.Builder("Integral", "Frango")
                .build();
        service.registrar(lanche2, TipoPagamento.DINHEIRO, 29.99);

        Lanche lanche3 = new Lanche.Builder("Integral", "Bovino")
                .molho("Cheddar")
                .bacon()
                .build();
        service.registrar(lanche3, TipoPagamento.CARTAODEBITO, 35.00);

        Lanche lanche4 = new Lanche.Builder("Natural", "Frango")
                .bacon()
                .queijo()
                .build();
        service.registrar(lanche4, TipoPagamento.ALELO, 40);

        for (Pedido pedido : service.listar()) {
            System.out.println(pedido);
            pedido.getFormaDePagamento().pagar(pedido.getValor());
            System.out.println("=====================================================================================");
        }
    }
}
