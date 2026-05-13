public class PagamentoCartao implements Pagamento {

    private double valor;

    public PagamentoCartao(double valor){
        this.valor = valor;
    }

    @Override
    public double calcularPagamento() {
        return valor +(valor * 0.05);
    }

    @Override
    public String emitirRecibo(){
        return "Pagemento no cartão. \nValor original R$" +valor+ "\ntaxa 5% \nValor final R$" +calcularPagamento();
    }
}
