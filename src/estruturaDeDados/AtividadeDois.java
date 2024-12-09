package estruturaDeDados;

import java.util.Scanner;
import java.util.Stack;

public class AtividadeDois {

	public static void main(String[] args) {
		Stack<String> pilhaLivros = new Stack<>();

		Scanner leia = new Scanner(System.in);

		int opcao;

		do {
			System.out.println("*****************************");
			System.out.println("Menu:");
			System.out.println("1 - Adicionar Livro na pilha");
			System.out.println("2 - Listar todos os Livros");
			System.out.println("3 - Retirar Livro da pilha");
			System.out.println("0 - Sair");
			System.out.println("*****************************");
			System.out.print("Entre com a opção desejada: ");
			opcao = leia.nextInt();
			leia.nextLine();

			switch (opcao) {
			case 1:
				System.out.print("Digite o nome do livro: ");
				String nomeLivro = leia.nextLine();
				pilhaLivros.push(nomeLivro);
				System.out.println(nomeLivro + " foi adicionado à pilha.");
				break;

			case 2:
				if (pilhaLivros.isEmpty()) {
					System.out.println("A pilha está vazia.");
				} else {
					System.out.println("Livros na pilha:");
					for (String livro : pilhaLivros) {
						System.out.println(livro);
					}
				}
				break;

			case 3:
				if (pilhaLivros.isEmpty()) {
					System.out.println("A pilha está vazia. Não há livros para retirar.");
				} else {
					String livroRetirado = pilhaLivros.pop();
					System.out.println(livroRetirado + " foi retirado da pilha.");
				}
				break;

			case 0:
				System.out.println("Encerrando o programa...");
				break;

			default:
				System.out.println("Opção inválida. Tente novamente.");
			}

			System.out.println();
		} while (opcao != 0);

	}

}
