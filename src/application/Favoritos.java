package application;

import java.util.ArrayList;
import java.util.List;

public class Favoritos {
	public String menuGrid() {
		for (int i = 0; i < 50; i++) {
			System.out.println();
		}
		return "-----------------------------------------------\n" + "MENU PRINCIPAL | CATEGORIA |"
				+ "\u001B[1m FAVORITOS \u001B[0m" + "|" + " PERFIL";
	}

	public String favoritos() {
		StringBuilder sb = new StringBuilder();
		sb.append("            Lista de itens favoritos: \n");
		sb.append(" \n");
		sb.append("-----------------------       ------------------------\n");
		sb.append("| calça bege jogger   |       | camisa social preta   |  \n");
		sb.append("|      R$34,39        |       |         R$20,33       |\n");
		sb.append("-----------------------       ------------------------ \n");
		sb.append(" \n");
		sb.append("-----------------------       ------------------------\n");
		sb.append("|    blusa de frio lã |       |     short masculino   | \n");
		sb.append("|      R$12,24        |       |         R$39,33       |\n");
		sb.append("-----------------------       ------------------------ \n");
		sb.append(" \n");
		sb.append("-----------------------       ------------------------\n");
		sb.append("|    palitó sarja     |       |    blase marrom couro | \n");
		sb.append("|      R$44,88        |       |         R$57,63       |\n");
		sb.append("-----------------------       ------------------------ \n");
		sb.append(" \n");

		return sb.toString();
	}

	public List<String> salvaFavorito(String favorito) {
		List<String> favoritos = new ArrayList<>(List.of(favorito));
		return favoritos;
	}
}
