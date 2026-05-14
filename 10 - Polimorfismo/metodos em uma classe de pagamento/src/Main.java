public class Main {

    public static void main(String[] args) {

        Pagamento pagamento1 = new PagamentoCartao();
        Pagamento pagamento2 = new PagamentoBoleto();

        pagamento1.processarPagamento();
        pagamento2.processarPagamento();
    }
}