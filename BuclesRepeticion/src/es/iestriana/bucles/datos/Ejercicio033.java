package es.iestriana.bucles.datos;

import java.util.Scanner;

public class Ejercicio033 {
	
	/*
	 * You must request a positive number. 
	 * Show all numbers from requested to 0
	 */

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int numero;
		do {
			System.out.println("Nº: ");
			numero = sc.nextInt();
		} while (numero <= 0);
		
		for (int i = numero; i >= 0; i--) {
			System.out.println(i);
		}
		
		for (int i = 0; i <= numero; i++) {
			System.out.println(numero - i);
		}

		sc.close();
	}

}
