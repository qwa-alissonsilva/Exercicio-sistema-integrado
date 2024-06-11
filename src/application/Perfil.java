package application;

import java.util.Scanner;

public class Perfil {
	public String menuGrid() {
		for (int i = 0; i < 50; i++) {
			System.out.println();
		}
		return "-----------------------------------------------\n" + "MENU PRINCIPAL | CATEGORIA |" + " FAVORITOS "
				+ "|" + "\u001B[1m PERFIL \u001B[0m";
	}

	public String cadastro() {
		for (int i = 0; i < 50; i++) {
			System.out.println();
		}
		StringBuilder sb = new StringBuilder();
		sb.append("---------LOGIN--------------\n");
		sb.append("Número de celular ou E-mail:\n");
		sb.append("Digite sua senha: \n");

		return sb.toString();
	}
}
