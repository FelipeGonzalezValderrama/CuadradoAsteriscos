package cl.felipeGonzalez;

import java.util.Scanner;

public class CuadradoAsterisco {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n; // tamaño del cuadrado
		int fila;
		int col;
		System.out.println("Lado del Cuadrado: ");
		n = sc.nextInt();
		for (fila = 1; fila <= n; fila++) {
			for (col = 1; col <= n; col++) {
				System.out.print(" * ");

			}
			System.out.println();
		}

	}

}
