public class Main {

    public static void main(String[] args) {

        Veiculo veiculo = new Veiculo();
        Carro carro = new Carro();
        Bicicleta bicicleta = new Bicicleta();

        veiculo.mover();
        carro.mover();
        bicicleta.mover();
    }
}