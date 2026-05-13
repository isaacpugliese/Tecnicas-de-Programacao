class Faxineiro implements Funcionario {

    @Override
    public void baterPonto() {
        System.out.println("Faxineiro bateu o ponto.");
    }

    @Override
    public void trabalhar() {
        System.out.println("Faxineiro está limpando o ambiente.");
    }

    public void solicitarMaterial() {
        System.out.println("Faxineiro solicitou materiais de limpeza.");
    }
}