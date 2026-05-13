// Classe de teste dos funcionários
public class Main {

    public static void main(String[] args) {

        Gerente gerente = new Gerente();
        Vendedor vendedor = new Vendedor();
        Faxineiro faxineiro = new Faxineiro();

        System.out.println("=== GERENTE ===");
        gerente.baterPonto();
        gerente.trabalhar();
        gerente.fecharCaixa();

        System.out.println("\n=== VENDEDOR ===");
        vendedor.baterPonto();
        vendedor.trabalhar();
        vendedor.realizarVenda();

        System.out.println("\n=== FAXINEIRO ===");
        faxineiro.baterPonto();
        faxineiro.trabalhar();
        faxineiro.solicitarMaterial();
    }
}