import java.util.Scanner;

public class Principal {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    Data data = new Data(20, 10, 2023);
    System.out.println(data.toString());

    Loja l1 = null;
    Produto p1 = null;

    int entrada = 3;

    do {
      System.out.println();
      System.out.println("-- Menu --");
      System.out.println("1 - Criar loja");
      System.out.println("2 - Criar produto");
      System.out.println("3 - Sair");

      System.out.print("Escolha uma opção: ");
      entrada = scanner.nextInt();

      switch (entrada) {
        case 1: // criar loja
          scanner.nextLine(); // consome o char de nova linha

          System.out.println("Digite o nome da loja:");
          String nome = scanner.nextLine();

          System.out.println("Digite a quantidade de funcionários:");
          int quantidadeFuncionarios = scanner.nextInt();

          System.out.println("Digite o salário base dos funcionários:");
          float salarioBaseFuncionario = scanner.nextFloat();
          scanner.nextLine(); // consome o char de nova linha

          System.out.println("Digite o nome da rua:");
          String nomeDaRua = scanner.nextLine();
          System.out.println("Digite o número da casa:");
          String numero = scanner.nextLine();
          System.out.println("Digite o complemento:");
          String complemento = scanner.nextLine();
          System.out.println("Digite a cidade:");
          String cidade = scanner.nextLine();
          System.out.println("Digite o estado:");
          String estado = scanner.nextLine();
          System.out.println("Digite o país:");
          String pais = scanner.nextLine();
          System.out.println("Digite o CEP:");
          String cep = scanner.nextLine();
          Endereco endereco = new Endereco(nomeDaRua, cidade, estado, pais, cep, numero, complemento);

          System.out.println("Digite o ano da fundação:");
          int anoFundacao = scanner.nextInt();
          System.out.println("Digite o mês da fundação:");
          int mesFundacao = scanner.nextInt();
          System.out.println("Digite o dia da fundação:");
          int diaFundacao = scanner.nextInt();
          Data dataFundacao = new Data(diaFundacao, mesFundacao, anoFundacao);

          l1 = new Loja(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);

          break;

        case 2: // criar produto
          scanner.nextLine(); // consome o char de nova linha

          System.out.println("Digite o nome do produto:");
          String nomeProduto = scanner.nextLine();

          System.out.println("Digite o preço do produto:");
          float precoProduto = scanner.nextFloat();
          scanner.nextLine(); // consome o char de nova linha

          System.out.println("Digite o ano da validade do produto:");
          int anoValidade = scanner.nextInt();
          System.out.println("Digite o mês da validade do produto:");
          int mesValidade = scanner.nextInt();
          System.out.println("Digite o dia da validade do produto:");
          int diaValidade = scanner.nextInt();
          Data dataValidade = new Data(anoValidade, mesValidade, diaValidade);

          p1 = new Produto(nomeProduto, precoProduto, dataValidade);

          break;

        case 3: // sair
          System.out.println("Saindo...");
          scanner.close();
          break;

        default: // mensagem de opção inválida
          System.out.println("Opção inválida.");
      }
    } while (entrada != 3);

    if (p1 == null) {
      System.out.println("Produto não foi inicializado.");
    } else if (p1.estaVencido(data)) {
      System.out.println("PRODUTO VENCIDO");
    } else {
      System.out.println("PRODUTO NÃO VENCIDO");
    }

    if (l1 == null) {
      System.out.println("Loja não foi inicializada.");
    } else
      System.out.println(l1.toString());
  }
}
