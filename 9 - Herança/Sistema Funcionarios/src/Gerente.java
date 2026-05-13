class Gerente implements Funcionario {

    @Override
    public void baterPonto() {
        System.out.println("Gerente bateu o ponto.");
    }

    @Override
    public void trabalhar() {
        System.out.println("Gerente está gerenciando a equipe.");
    }
    public void fecharCaixa() {
        System.out.println("Gerente fechou o caixa.");
    }
}
