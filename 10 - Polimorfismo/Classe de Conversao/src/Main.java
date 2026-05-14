public class Main {
    public static void main(String[] args) {

        Conversor conversor = new Conversor();

        System.out.print("Temperatura convertida: ");
        System.out.println(conversor.converter(30.0) + " °F");

        System.out.print("\nDistância convertida: ");
        System.out.println(conversor.converter(10) + " milhas");

        System.out.print("\nTexto convertido: ");
        System.out.println(conversor.converter("olá munndo!! :D"));
    }
}