package es.iestriana.bucles.datos;

import java.util.Scanner;

public class EjercicioSeis {

	/*
	 * Ask for a number and calculate its factorial
	 * 
	 */
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int num = 0;
		do {
			System.out.println("Nº: ");
			num = sc.nextInt();
		} while (num <= 0);
		
		long factorial = 1;
		
		for (int i = num; i > 0; i--) {
			factorial = factorial * i;
		}
		
		System.out.println("El factorial de " + 
							num + " es: "+ factorial);

		sc.close();
	}

}
