package br.com.sistema.lanchonete.pagamento;

public class Dinheiro implements FormaDePagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Dinheiro: Pagamento de R$: " + valor + " concluido!!");
    }
}
