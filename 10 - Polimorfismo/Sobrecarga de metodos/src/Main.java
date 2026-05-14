public class Main {

  public static void main(String[] args) {

    Calculadora calc = new Calculadora();

    System.out.print("Soma de 2 inteiros: ");
    System.out.println(calc.somar(10, 5));

    System.out.print("\nSoma de 3 inteiros: ");
    System.out.println(calc.somar(10, 5, 2));

    System.out.print("\nSoma de 2 doubles: ");
    System.out.println(calc.somar(5.5, 2.3));
  }
}