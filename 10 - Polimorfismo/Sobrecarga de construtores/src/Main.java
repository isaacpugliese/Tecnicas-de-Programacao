public class Main {

    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook");
        Produto p2 = new Produto("Mouse", 89.90);
        Produto p3 = new Produto("Teclado", 150.00, 20);

        p1.exibirInformacoes();
        p2.exibirInformacoes();
        p3.exibirInformacoes();
    }
}