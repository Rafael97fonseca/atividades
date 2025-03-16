package prova2;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public Main() {
		public static void main(String[] args) {
	        List<Produto> produtos = new ArrayList<>();
	        Map<String, Produto> produtoPorNome = new HashMap<>();
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("Menu:");
	            System.out.println("1. Cadastrar Produto");
	            System.out.println("2. Visualizar Produto");
	            System.out.println("3. Modificar Produto");
	            System.out.println("4. Apagar Produto");
	            System.out.println("5. Sair");
	            System.out.print("Escolha uma opção: ");

	            int opcao = scanner.nextInt();
	            scanner.nextLine(); 

	            switch (opcao) {
	                case 1:
	                    cadastrarProduto(produtos, produtoPorNome, scanner);
	                    break;
	                case 2:
	                    visualizarProduto(produtos, scanner);
	                    break;
	                case 3:
	                    modificarProduto(produtos, produtoPorNome, scanner);
	                    break;
	                case 4:
	                    apagarProduto(produtos, produtoPorNome, scanner);
	                    break;
	                case 5:
	                    System.out.println("Saindo do programa.");
	                    scanner.close();
	                    System.exit(0);
	                    break;
	                default:
	                    System.out.println("Opção inválida. Tente novamente.");
	                    break;
	            }
	        }
	    }

	    private static void cadastrarProduto(List<Produto> produtos, Map<String, Produto> produtoPorNome, Scanner scanner) {
	        System.out.println("Cadastrar Produto:");

	        System.out.print("Nome: ");
	        String nome = scanner.nextLine();

	        if (produtoPorNome.containsKey(nome)) {
	            System.out.println("Produto com o mesmo nome já cadastrado.");
	            return;
	        }

	        System.out.print("Categoria (1-Sapato, 2-Roupa Masculina, 3-Roupa Feminina): ");
	        int categoria = scanner.nextInt();

	        System.out.print("Descrição: ");
	        String descricao = scanner.next();

	        System.out.print("Preço: ");
	        double preco = scanner.nextDouble();

	        Produto produto;

	        switch (categoria) {
	            case Categorias.SAPATO:
	                System.out.print("Tamanho: ");
	                String tamanhoSapato = scanner.next();
	                produto = new Sapato(nome, descricao, preco, tamanhoSapato);
	                break;
	            case Categorias.ROUPA_MASCULINA:
	                System.out.print("Tamanho: ");
	                String tamanhoRoupaMasc = scanner.next();
	                produto = new RoupaMasculina(nome, descricao, preco, tamanhoRoupaMasc);
	                break;
	            case Categorias.ROUPA_FEMININA:
	                System.out.print("Tamanho: ");
	                String tamanhoRoupaFem = scanner.next();
	                produto = new RoupaFeminina(nome, descricao, preco, tamanhoRoupaFem);
	                break;
	            default:
	                System.out.println("Categoria inválida.");
	                return;
	        }

	        produtos.add(produto);
	        produtoPorNome.put(nome, produto);
	        System.out.println("Produto cadastrado com sucesso.");
	    }

	    private static void visualizarProduto(List<Produto> produtos, Scanner scanner) {
	        System.out.println("Visualizar Produto:");
	        System.out.print("Nome do Produto: ");
	        String nome = scanner.nextLine();

	        if (produtoPorNome.containsKey(nome)) {
	            Produto produto = produtoPorNome.get(nome);
	            produto.mostrarProduto();
	        } else {
	            System.out.println("Produto não encontrado.");
	        }
	    }

	    private static void modificarProduto(List<Produto> produtos, Map<String, Produto> produtoPorNome, Scanner scanner) {
	        System.out.println("Modificar Produto:");
	        System.out.print("Nome do Produto: ");
	        String nome = scanner.nextLine();

	        if (produtoPorNome.containsKey(nome)) {
	            Produto produto = produtoPorNome.get(nome);

	            System.out.print("Nova descrição: ");
	            String novaDescricao = scanner.nextLine();

	            System.out.print("Novo preço: ");
	            double novoPreco = scanner.nextDouble();

	            produto.descricao = novaDescricao;
	            produto.preco = novoPreco;

	            System.out.println("Produto modificado com sucesso.");
	        } else {
	            System.out.println("Produto não encontrado.");
	        }
	    }

	    private static void apagarProduto(List<Produto> produtos, Map<String, Produto> produtoPorNome, Scanner scanner) {
	        System.out.println("Apagar Produto:");
	        System.out.print("Nome do Produto: ");
	        String nome = scanner.nextLine();

	        if (produtoPorNome.containsKey(nome)) {
	            Produto produto = produtoPorNome.get(nome);
	            produtos.remove(produto);
	            produtoPorNome.remove(nome);
	            System.out.println("Produto apagado com sucesso.");
	        } else {
	            System.out.println("Produto não encontrado.");
	        }
	    }
	}

