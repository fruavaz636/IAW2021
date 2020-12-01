package es.iestriana.repaso.datos;

import java.util.Scanner;

public class Ejercicio02 {

	/*
	 * Request a number and show the square of the number. 
	 * The square of a number is obtained by adding as 
	 * many odd numbers as the number indicates. 
	 * The square of 1 is 1. The square of 2 is 4, 
	 * that is, 1 + 3. The square of 3 is 9, that is, 
	 * 1 + 3 + 5.
	 */
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int num = 0;
		do {
			System.out.println("Nº: ");
			num = sc.nextInt();
		} while (num < 1);

		System.out.println("El cuadrado de " + num 
				+ " es: " + cuadradoNumero(num));
		
		sc.close();
	}

	private static int cuadradoNumero(int num) {
		int cuadrado = 0;
		int impares = 1;
		
		for (int i = 0; i < num; i++) {
			cuadrado = cuadrado + impares;
			impares = impares + 2;
		}
		
		return cuadrado;
	}

}
