package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		MenuPrincipal menu = new MenuPrincipal();
		Categoria categoria = new Categoria();
		Favoritos favoritos = new Favoritos();
		Perfil perfil = new Perfil();
		Scanner sc = new Scanner(System.in);

		try{
			mostrarMenu(menu);
		}catch(Exception e ) {
			System.out.println();
		}
//		 mostrarCategorias(categoria);
//		 mostrarFavoritos(favoritos);
//		 mostrarPerfil(perfil);

	}

	private static void mostrarMenu(MenuPrincipal menu) {
		System.out.println(menu.menuGrid());
		System.out.println(menu.promocoesNamorados());
		System.out.println(menu.emDestaque());
		System.out.println(" [2] Categoria [3] Favoritos [4] Perfil");
	}

	private static void mostrarCategorias(Categoria categoria) {
		System.out.println(categoria.menuGrid());
		System.out.println(categoria.categorias());
	}

	private static void mostrarFavoritos(Favoritos favoritos) {
		System.out.println(favoritos.menuGrid());
		System.out.println(favoritos.favoritos());
	}

	private static void mostrarPerfil(Perfil perfil) {
		System.out.println(perfil.menuGrid());
		System.out.println(perfil.cadastro());
	}
}
