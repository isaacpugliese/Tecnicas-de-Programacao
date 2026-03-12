/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int opcao, vl1, vl2, resultado;
    double raiz;
    
    System.out.print("Menu de opções:\n"+
    "1. Somar dois números. \n"+
    "2. Subtrair dois números \n"+
    "3. Multiplicar dois números \n"+
    "4. Dividir dois números \n"+
    "5. Raiz quadrada de um número \n"+
    "Digite a opção desejada: ");
    opcao = entrada.nextInt();

switch(opcao){
    case 1:
        System.out.print("\nOpção 1 \nSomar dois números \nDigite o primeiro número: ");
        vl1 = entrada.nextInt();
        System.out.print("Digite o segundo número: ");
        vl2= entrada.nextInt();
        
        resultado = vl1 + vl2;
        System.out.print("\nO resultado da soma dos números é: " +resultado);
        break;
        
    case 2:
        System.out.print("\nOpção 2 \nSubtrair dois números \nDigite o primeiro número: ");
        vl1 = entrada.nextInt();
        System.out.print("Digite o segundo número: ");
        vl2= entrada.nextInt();
        
        resultado = vl1 - vl2;
        System.out.print("\nO resultado da subtração dos números é: " +resultado);
        break;
        
    case 3:
        System.out.print("\nOpção 3 \nMultiplicar dois números \nDigite o primeiro número: ");
        vl1 = entrada.nextInt();
        System.out.print("Digite o segundo número: ");
        vl2= entrada.nextInt();
        
        resultado = vl1 * vl2;
        System.out.print("\nO resultado da multiplicação dos números é: " +resultado);
        break;
        
    case 4:
        System.out.print("\nOpção 4 \nDividir dois números \nDigite o primeiro número: ");
        vl1 = entrada.nextInt();
        System.out.print("Digite o segundo número: ");
        vl2= entrada.nextInt();
        
        resultado = vl1 / vl2;
        System.out.print("\nO resultado da divisão dos números é: " +resultado);
        break;
        
    case 5:
    System.out.print("\nOpção 5 \nRaiz quadrada de um número \nDigite o número: ");
    raiz = entrada.nextDouble();
    raiz = Math.sqrt(raiz);
    System.out.print("\nA raiz quadrada do número é: " +raiz);
    break;
    }
	}
}
