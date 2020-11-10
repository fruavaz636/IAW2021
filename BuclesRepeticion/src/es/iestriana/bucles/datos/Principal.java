package es.iestriana.bucles.datos;

import java.util.Scanner;

public class Principal {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// do while
		int numero;
		do {
			System.out.println("Nº: ");
			numero = sc.nextInt();
		} while (numero <= 0);
		
		// while		
		System.out.println("Nº: ");
		int num = sc.nextInt();
		while (num <= 0) {
			System.out.println("Nº: ");
			num = sc.nextInt();
		}		
		
		while (numero >= 0) {
			System.out.println(numero);
			numero--;
		}
		
		// for
		for (int i = 0, j = 0; i < 10 && j < 8; i++,j++) {
			System.out.println(i + " " + j);
		}
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {

			}
		}
		
		sc.close();
	}

}
