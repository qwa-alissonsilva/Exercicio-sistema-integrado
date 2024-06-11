package application;

public class MenuPrincipal {

	public String menuGrid() {
		return "-----------------------------------------------\n" + "\u001B[1m" + "MENU PRINCIPAL" + "\u001B[0m"
				+ " | CATEGORIA | FAVORITOS | PERFIL";
	}

	public String promocoesNamorados() {
		StringBuilder sb = new StringBuilder();
		sb.append("            Promoção Dia dos Namorados\n");
		sb.append(" ");
		sb.append(" ");
		sb.append(" ");
		sb.append(" \n");
		sb.append("-----------------------       ------------------------\n");
		sb.append("| Camisa social preta |       | Calça sarja masculina | \n");
		sb.append("|      R$24,99        |       |         R$19,33       |\n");
		sb.append("-----------------------       ------------------------ \n");
		sb.append(" \n");
		sb.append("-----------------------       ------------------------\n");
		sb.append("|    Camisa confort   |       | Calça sport masculina | \n");
		sb.append("|      R$22,24        |       |         R$19,33       |\n");
		sb.append("-----------------------       ------------------------ \n");
		sb.append(" \n");
		sb.append("-----------------------       ------------------------\n");
		sb.append("|    Camisa polo      |       | Calça jeans masculina | \n");
		sb.append("|      R$14,88        |       |         R$27,63       |\n");
		sb.append("-----------------------       ------------------------ \n");
		sb.append(" \n");

		return sb.toString();
	}

	public String emDestaque() {
		StringBuilder sb = new StringBuilder();
		sb.append("Mais vendidos: \n");
		sb.append("calça sarja :  R$14,99 | Camisa quadriculada: R$11,46 | Camisa xadrez: R$10,75 \n");
		sb.append("calça Jogger : R$17,49 | calça Reta:          R$16,33 | calça Skinny: R$10,75  \n");

		return sb.toString();
	}

}
