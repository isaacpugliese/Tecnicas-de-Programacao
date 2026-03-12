import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int idade;
        int contador = 0;

        for(int i = 1; i <= 10; i++) {

            System.out.print("Digite a idade da pessoa " + i + ": ");
            idade = entrada.nextInt();

            if(idade >= 18) {
                contador++;
            }

        }

        System.out.println("Quantidade de pessoas com 18 anos ou mais: " + contador);

    }
}