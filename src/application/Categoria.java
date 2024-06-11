package application;

public class Categoria {
	public String menuGrid() {
		for (int i = 0; i < 50; i++) {
			System.out.println();
		}
		return "-----------------------------------------------\n" + "MENU PRINCIPAL" + " |" + "\u001B[1m"
				+ " CATEGORIA " + "\u001B[0m" + "| FAVORITOS | PERFIL";
	}

	public String categorias() {
		StringBuilder sb = new StringBuilder();
		sb.append("Novo\n");
		sb.append("Roupas Masculinas\n");
		sb.append("Roupas Femininas\n");
		sb.append("Calçados\n");
		sb.append("Calçados infantis\n");
		sb.append("Roupas de banho\n");
		sb.append("Joias e acessorios\n");
		sb.append("Promoções\n");
	
		return sb.toString();
	}
}
