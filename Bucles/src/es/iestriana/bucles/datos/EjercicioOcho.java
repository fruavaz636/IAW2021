package es.iestriana.bucles.datos;

import java.util.Scanner;

public class EjercicioOcho {

	/*
	 * Ask the user for a number and indicate 
	 * how many prime numbers there are between 
	 * 1 and the number
	 */
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int numero = 0;
		do {
			System.out.println("Nº: ");
			numero = sc.nextInt();
		} while (numero <= 0);
		
		int contadorDePrimos = 0;
		
		for (int i = 1; i <= numero; i++) {
			if (esPrimo(i)) {
				contadorDePrimos++;
			}
		}
		
		System.out.println("Primos entre 1 y " + 
				numero + " son: " + contadorDePrimos);
		
		sc.close();
	}

	private static boolean esPrimo(int n) {
		boolean primo = true;
		
		for (int j = 2; j < n; j++) {
			if (n%j==0) {
				primo = false;
			}
		}
		
		return primo;
	}

}
