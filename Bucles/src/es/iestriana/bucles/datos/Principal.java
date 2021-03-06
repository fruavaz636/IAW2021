package es.iestriana.bucles.datos;

import java.util.Scanner;

public class Principal {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// do while
		/*int numero;
		do {
			System.out.println("Nº: ");
			numero = sc.nextInt();
		} while (numero < 0);
		
		// while
		System.out.println("Nº: ");
		numero = sc.nextInt();
		while (numero < 0) {
			System.out.println("Nº: ");
			numero = sc.nextInt();			
		}*/
		
		// for
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		for (int i = 10, j = 10; i >= 1 && j >= 5; i--, j--) {
			System.out.println(i + " " + j);
		}
		
		int i=10,j=10;
		while (i >= 1 && j >= 5) {
			System.out.println(i + " " + j);
		}
		
		sc.close();
	}

}
