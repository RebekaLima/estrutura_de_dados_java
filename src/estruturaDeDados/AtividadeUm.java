package estruturaDeDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AtividadeUm {

	public static void main(String[] args) {
		Queue<String> filaClientes = new LinkedList<>();
		
		Scanner leia = new Scanner(System.in);

		int opcao;

		do {
			System.out.println("*****************************");
			System.out.println("Menu:");
			System.out.println("1 - Adicionar Cliente na Fila");
			System.out.println("2 - Listar todos os Clientes");
			System.out.println("3 - Retirar Cliente da Fila");
			System.out.println("0 - Sair");
			System.out.println("*****************************");
			System.out.print("Entre com a opção desejada: ");
			opcao = leia.nextInt();
			leia.nextLine();

			switch (opcao) {
			case 1:
				System.out.print("Digite o nome do cliente: ");
				String nomeCliente = leia.nextLine();
				filaClientes.add(nomeCliente);
				System.out.println(nomeCliente + " foi adicionado à fila.");
				break;

			case 2:
				if (filaClientes.isEmpty()) {
					System.out.println("A fila está vazia.");
				} else {
					System.out.println("Clientes na fila:");
					for (String cliente : filaClientes) {
						System.out.println(cliente);
					}
				}
				break;

			case 3:
				if (filaClientes.isEmpty()) {
					System.out.println("A fila está vazia. Não há clientes para retirar.");
				} else {
					String clienteChamado = filaClientes.poll();
					System.out.println(clienteChamado + " foi chamado e retirado da fila.");
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
