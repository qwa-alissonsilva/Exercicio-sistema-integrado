package application;

import java.util.Scanner;

public class Perfil {
	private boolean ativo = false;

	public String menuGrid() {
		for (int i = 0; i < 50; i++) {
			System.out.println();
		}
		return "-----------------------------------------------\n" + "MENU PRINCIPAL | CATEGORIA | FAVORITOS |"
				+ "\u001B[1m PERFIL \u001B[0m\n";
	}

	public String cadastro() {
		for (int i = 0; i < 50; i++) {
			System.out.println();
		}
		try (Scanner sc = new Scanner(System.in)) {
			String nomeCadastro = "ali";
			String senhaCadastro = "123";

			if (!this.ativo) {
				System.out.println("---------LOGIN--------------\n");
				System.out.print("Número de celular ou E-mail:\n");
				String nome = sc.nextLine();
				System.out.print("Digite sua senha: \n");
				String senha = sc.nextLine();

				if (nome.equals(nomeCadastro) && senha.equals(senhaCadastro)) {
					this.ativo = true;
				} else {
					for (int i = 0; i < 50; i++) {
						System.out.println();
					}
					System.out.println("---------CADASTRO--------------\n");
					System.out.print("Número de celular ou E-mail:\n");
					nomeCadastro = sc.nextLine();
					System.out.print("Digite sua senha: \n");
					senhaCadastro = sc.nextLine();
					this.ativo = true;
				}
			}
		}
		return menuGrid() + itensLogin();
	}

	public String itensLogin() {
		for (int i = 0; i < 50; i++) {
			System.out.println();
		}
		StringBuilder sb = new StringBuilder();
		sb.append("| Carteira |\n");
		sb.append("Cupons    Pontos      	\n");
		sb.append("| Meus pedidos |\n");
		sb.append("Não pago  Processando  Enviado\n");
		sb.append("| Serviços |\n");
		sb.append("Suporte Reclamações  Seguir \n");

		return sb.toString();
	}

	public void isAtivo() {
		this.ativo = true;
	}

}
