package br.com.sistema.lanchonete.pagamento;

public class PagamentoFactory {
    public static FormaDePagamento criar(TipoPagamento tipo) {
        return switch (tipo) {

            case PIX -> new Pix();
            case CARTAODEBITO -> new CartaoDebito();
            case ALELO -> new Alelo();
            case DINHEIRO -> new Dinheiro();
        };
    }
}
