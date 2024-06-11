package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		MenuPrincipal menu = new MenuPrincipal();
		Categoria categoria = new Categoria();
		Favoritos favoritos = new Favoritos();
		Perfil perfil = new Perfil();

		try {
			mostrarMenu(menu);
		} catch (Exception e) {
			try {
				mostrarCategorias(categoria);
			} catch (Exception e2) {
				try {
					mostrarFavoritos(favoritos);
				} catch (Exception e3) {
					try {
						mostrarPerfil(perfil);
					} catch (Exception e4) {
						System.out.println("Sistema fora do ar!!");
					}
				}
			}
		}

	}

	private static void mostrarMenu(MenuPrincipal menu) {
		System.out.println(menu.menuGrid());
		System.out.println(menu.promocoesNamorados());
		System.out.println(menu.emDestaque());
	}

	private static void mostrarCategorias(Categoria categoria) {
		System.out.println(categoria.menuGrid());
		System.out.println(categoria.categorias());
	}

	private static void mostrarFavoritos(Favoritos favoritos) {
		System.out.println(favoritos.menuGrid());
	}

	private static void mostrarPerfil(Perfil perfil) {
		System.out.println(perfil.menuGrid());
		System.out.println(perfil.cadastro());
	}
}
