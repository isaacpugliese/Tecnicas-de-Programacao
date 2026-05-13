import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        verificacao sistema = new verificacao();

        while (!sistema.isAutenticado()) {

            System.out.print("Usuário: ");
            String usuario = sc.nextLine();

            System.out.print("Senha: ");
            String senha = sc.nextLine();

            if (sistema.login(usuario, senha)) {
                System.out.println("Bem-vindo ao sistema!");
            } else {
                System.out.println("Login inválido. Tente novamente.\n");
            }
        }

        System.out.println("\nUsuário autenticado.");
        sistema.logout();

        sc.close();
    }
}