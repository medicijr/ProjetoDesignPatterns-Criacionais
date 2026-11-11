package br.com.sistema.lanchonete.pagamento;

public class Alelo implements FormaDePagamento {

    @Override
    public void pagar(double valor) {
        System.out.println("Alelo: Pagamento de R$: " + valor + " concluido!!");
    }
}
