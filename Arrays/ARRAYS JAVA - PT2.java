import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[10];
        int pares = 0;
        int impares = 0;

        // Preencher o array
        for(int i = 0; i < 10; i++){
            System.out.print("Digite um número: ");
            numeros[i] = entrada.nextInt();
        }

        System.out.println("\nNúmeros pares:");

        for(int i = 0; i < 10; i++){

            if(numeros[i] % 2 == 0){
                System.out.println(numeros[i]);
                pares++;
            }

        }

        System.out.println("\nNúmeros ímpares:");

        for(int i = 0; i < 10; i++){

            if(numeros[i] % 2 != 0){
                System.out.println(numeros[i]);
                impares++;
            }

        }

        System.out.println("\nQuantidade de pares: " + pares);
        System.out.println("Quantidade de ímpares: " + impares);

    }
}