package es.iestriana.bucles.datos;

import java.util.Scanner;

public class EjercicioUno {

	/*
	 * Pedir 5 números. Mostrar la media de los positivos,
	 * media negativos y cantidad de ceros
	 */
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		double sumaPositivos = 0, sumaNegativos = 0;
		int contadorCeros = 0, contadorPositivos = 0, contadorNegativos = 0;
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Nº " + i + ": ");
			double numero = sc.nextDouble();
			
			if (numero > 0) {
				//sumaPositivos = sumaPositivos + numero;
				sumaPositivos += numero;
				contadorPositivos++;
			} else if (numero < 0) {
				sumaNegativos += numero;
				contadorNegativos++;
			} else {
				//contadorCeros = contadorCeros + 1;
				contadorCeros++;
			}
		}
		
		System.out.println("Media Positivos: " + (sumaPositivos/contadorPositivos));
		System.out.println("Media Negativos: " + (sumaNegativos/contadorNegativos));
		System.out.println("Cantidad de Ceros: " + contadorCeros);

		sc.close();
	}

}
