public class Main {

  public static void main(String[] args) {

    Empresa empresa = new Empresa("Tech Solutions");

    //ADCIONANDO FUNCIONARIO
    empresa.adicionarFuncionario(
            "Isaac",
            "Gerente",
            5000
    );

    empresa.adicionarFuncionario(
            "Ana",
            "Desenvolvedor",
            3500
    );

    empresa.adicionarFuncionario(
            "Carlos",
            "Desenvolvedor",
            3500
    );

    empresa.adicionarFuncionario(
            "Pedro",
            "Analista",
            4500
    );

    empresa.adicionarFuncionario(
            "Alana",
            "Vendedor",
            2500
    );

    // Adicionando clientes
    empresa.adicionarCliente(
            "João",
            "joao@email.com"
    );

    empresa.adicionarCliente(
            "Maria",
            "maria@email.com"
    );

    empresa.adicionarCliente(
            "Lucas",
            "luca@email.com"
    );

    empresa.adicionarCliente(
            "Eduarda",
            "eduarda@email.com"
    );

    // Exibindo dados
    empresa.exibirFuncionarios();
    empresa.exibirClientes();
    empresa.calcularFolhaSalarial();
  }
}