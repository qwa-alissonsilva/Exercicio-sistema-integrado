package application;

import java.util.Scanner;

public class Categoria {
	private String camisa;
	private String calca;;

	public String menuGrid() {
		for (int i = 0; i < 50; i++) {
			System.out.println();
		}
		return "-----------------------------------------------\n" + "MENU PRINCIPAL" + " |" + "\u001B[1m"
				+ " CATEGORIA " + "\u001B[0m" + "| FAVORITOS | PERFIL";
	}

	public static String categorias() {
		Scanner scanner = new Scanner(System.in);
		StringBuilder resultado = new StringBuilder();

		System.out.println("1 - Novo\n" + "2 - Roupas Masculinas\n" + "3 - Roupas Femininas\n" + "4 - Calçados\n"
				+ "5 - Calçados infantis\n" + "6 - Roupas de banho\n" + "7 - Joias e acessorios\n" + "8 - Promoções\n");

		int escolha = scanner.nextInt();

		switch (escolha) {
		case 1:
			resultado.append("camisa xadrez: R$12,45\n").append("camisa quadriculada: R$16,77\n")
					.append("camisa polo: R$27,44\n");
			break;
		case 2:
			resultado.append("Calça masculina preta: R$15,75\n").append("Calça masculina verde: R$11,60\n")
					.append("Calça masculina vermelha: R$25,77\n");
			break;
		case 3:
			resultado.append("Calça feminina preta: R$15,75\n").append("Calça feminina verde: R$11,60\n")
					.append("Calça feminina vermelha: R$25,77\n");
			break;
		case 4:
			resultado.append("\"Tenis cano longo: R$76,35\n").append("Tenis cano medio: R$66,47\n")
					.append("Tenis cano curto: R$32,64 \n");
			break;
		case 5:
			resultado.append("mini tenis cano longo: R$56,35\n").append(" mini tenis cano medio: R$36,47\n")
					.append("mini tenis cano curto: R$22,64 \n");
			break;
		case 6:
			resultado.append("ropão de banho xadrez: R$62,55\n").append("chinelo para banho marrom: R$46,27\n")
					.append("Touca para banho: R$37,14\n");
			break;
		case 7:
			resultado.append("bracelete dourado: R$102,45\n").append("brinco azul: R$76,97\n")
					.append("colar fino: R$97,84\n");
			break;
		case 8:
			resultado.append("blusa de frio laranja : R$25,35\n").append("calça jogger quadriculada: R$436,77\n")
					.append("blusa roxa: R$27,44\n");
			break;

		default:
			resultado.append("Categoria inválida. Por favor, escolha uma opção válida.\n");
			break;
		}

		scanner.close();
		return resultado.toString();
	}

}
