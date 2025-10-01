import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Estoque estoque = new Estoque();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do
        {
            System.out.println("\nMenu:");
            System.out.println("1 - Cadastrar um produto");
            System.out.println("2 - Atualizar a quantidade de um produto");
            System.out.println("3 - Listar os produtos cadastrados");
            System.out.println("4 - Salvar estoque");
            System.out.println("5 - Carregar estoque de um arquivo existente");
            System.out.println("6 - Encerrar o programa");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao)
            {
                case 1:
                    System.out.print("Código do produto: ");
                    String codigo = scanner.nextLine();
                    System.out.print("Nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Quantidade: ");
                    int quantidade = scanner.nextInt();
                    scanner.nextLine();

                    if (estoque.cadastrarProduto(codigo, nome, quantidade))
                    {
                        System.out.println("Produto cadastrado com sucesso!");
                    }
                    else
                    {
                        System.out.println("Erro: Código já existente.");
                    }
                    break;

                case 2:
                    System.out.print("Código do produto: ");
                    String codigoAtualizar = scanner.nextLine();
                    System.out.print("Nova quantidade: ");
                    int novaQuantidade = scanner.nextInt();
                    scanner.nextLine();

                    if (estoque.atualizarQuantidade(codigoAtualizar, novaQuantidade))
                    {
                        System.out.println("Quantidade atualizada com sucesso!");
                    } else {
                        System.out.println("Erro: Produto não encontrado.");
                    }
                    break;

                case 3:
                    estoque.listarProdutos();
                    break;

                case 4:
                    System.out.print("Nome do arquivo para salvar (ex: estoque.txt): ");
                    String nomeArquivoSalvar = scanner.nextLine();
                    estoque.salvarEstoque(nomeArquivoSalvar);
                    break;

                case 5:
                    System.out.print("Nome do arquivo para carregar (ex: estoque.txt): ");
                    String nomeArquivoCarregar = scanner.nextLine();
                    if (estoque.carregarEstoque(nomeArquivoCarregar))
                    {
                        System.out.println("Estoque carregado com sucesso!");
                    }
                    break;

                case 6:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 6);

        scanner.close();
    }
}