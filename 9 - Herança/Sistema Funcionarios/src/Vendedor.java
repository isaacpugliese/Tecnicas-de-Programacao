class Vendedor implements Funcionario {

    @Override
    public void baterPonto() {
        System.out.println("Vendedor bateu o ponto.");
    }

    @Override
    public void trabalhar() {
        System.out.println("Vendedor está atendendo clientes.");
    }

    // Método específico
    public void realizarVenda() {
        System.out.println("Venda realizada com sucesso.");
    }
}