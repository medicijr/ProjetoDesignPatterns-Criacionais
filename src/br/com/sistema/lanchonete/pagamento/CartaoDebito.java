    package br.com.sistema.lanchonete.pagamento;

    public class CartaoDebito implements FormaDePagamento {

        @Override
        public void pagar(double valor) {
            System.out.println("Cartao Debito: Pagamento de R$: " + valor + " concluido!!");
        }
    }
