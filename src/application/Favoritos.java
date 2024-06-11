package application;

public class Favoritos {
	public String menuGrid() {
		for (int i = 0; i < 50; i++) {
			System.out.println();
		}
		return "-----------------------------------------------\n" + "MENU PRINCIPAL | CATEGORIA |"
				+ "\u001B[1m FAVORITOS \u001B[0m" + "|" + " PERFIL";
	}
}
