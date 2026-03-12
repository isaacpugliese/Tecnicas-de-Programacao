import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[10];

        for(int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = entrada.nextInt();
        }

        for(int i = 0; i < 10; i++) {

            if(numeros[i] % 2 == 0) {
                numeros[i] = numeros[i] + 1;
            } else {
                numeros[i] = numeros[i] - 1;
            }

        }

        System.out.println("Novos valores:");

        for(int i = 0; i < 10; i++) {
            System.out.println(numeros[i]);
        }

    }
}