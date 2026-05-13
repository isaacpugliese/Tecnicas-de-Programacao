public class TestePagamento {
    public static void main(String[] args) {

        PagamentoCartao cartao = new PagamentoCartao(100);
        PagamentoDinheiro dinheiro = new PagamentoDinheiro(100);

        System.out.println("=== PAGAMENTO CARTÃO ===");
        System.out.println(cartao.emitirRecibo());

        System.out.println("\n=== PAGAMENTO DINHEIRO ===");
        System.out.println(dinheiro.emitirRecibo());
    }
}