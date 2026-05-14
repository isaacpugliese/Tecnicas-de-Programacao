public class Empresa {

    String nome;

    Funcionario[] funcionarios = new Funcionario[5];
    Cliente[] clientes = new Cliente[10];

    int totalFuncionarios = 0;
    int totalClientes = 0;

    public Empresa(String nome) {
        this.nome = nome;
    }

    public void adicionarFuncionario(String nome, String cargo, double salario) {

        if (totalFuncionarios < funcionarios.length) {

            funcionarios[totalFuncionarios] =
                    new Funcionario(nome, cargo, salario);

            totalFuncionarios++;

            System.out.println("Funcionário adicionado com sucesso.");

        } else {
            System.out.println("Limite de funcionários atingido.");
        }
    }

    public void exibirFuncionarios() {

        System.out.println("\n=== FUNCIONÁRIOS ===");

        for (int i = 0; i < totalFuncionarios; i++) {

            System.out.println("Nome: " + funcionarios[i].nome);
            System.out.println("Cargo: " + funcionarios[i].cargo);
            System.out.println("Salário: R$ " + funcionarios[i].salario);
            System.out.println("-------------------");
        }
    }

    public void adicionarCliente(String nome, String email) {

        if (totalClientes < clientes.length) {

            clientes[totalClientes] =
                    new Cliente(nome, email);

            totalClientes++;

            System.out.println("Cliente adicionado com sucesso.");

        } else {
            System.out.println("Limite de clientes atingido.");
        }
    }

    public void exibirClientes() {

        System.out.println("\n=== CLIENTES ===");

        for (int i = 0; i < totalClientes; i++) {

            System.out.println("Nome: " + clientes[i].nome);
            System.out.println("Email: " + clientes[i].email);
            System.out.println("-------------------");
        }
    }

    public void calcularFolhaSalarial() {

        double total = 0;

        for (int i = 0; i < totalFuncionarios; i++) {

            total += funcionarios[i].salario;
        }

        System.out.println("\nTotal da folha salarial: R$ " + total);
    }
}