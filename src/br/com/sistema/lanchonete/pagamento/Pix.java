package br.com.sistema.lanchonete.pagamento;

public class Pix implements FormaDePagamento {

    @Override
    public void pagar(double valor) {
        System.out.println("Pix: Pagamento de R$: " + valor + " concluido!!");
    }
}
