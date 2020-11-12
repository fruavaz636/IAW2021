package es.iestriana.bucles.datos;

import java.util.Scanner;

public class Ejercicio04 {

	/*
	 * Program that displays and 
	 * calculates the product of the first n odd numbers
	 */
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int numeroDeImpares = 0;
		do {
			System.out.println("Nº: ");
			numeroDeImpares = sc.nextInt();
		} while (numeroDeImpares <= 0);
		
		long productoFinal = 1;
		int impar = 1;
		
		while (numeroDeImpares > 0) {
			productoFinal = productoFinal * impar;
			impar = impar + 2;
			
			numeroDeImpares--;
		}
		
		System.out.println("Producto de impares: " + productoFinal);

		
		
		sc.close();
	}

}
