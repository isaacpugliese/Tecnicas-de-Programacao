public class PagamentoDinheiro implements Pagamento {
    private double valor;

    public PagamentoDinheiro(double valor){
        this.valor = valor;
    }

    @Override
    public double calcularPagamento(){
        return valor -(valor*0.10);
    }

    @Override
    public String emitirRecibo(){
        return "Pagamento em dinheiro. \nValor original R$ " +valor+ "\nDesconto de 10%\nValor final R$"+calcularPagamento();
    }
}
