package es.iestriana.bucles.datos;

import java.util.Scanner;

public class Ejercicio01 {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		double sumaPositivos = 0, sumaNegativos = 0;
		int contadorPositivos = 0, contadorNegativos = 0, 
				contadorCeros = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println("Nº: ");
			double num = sc.nextDouble();
			
			if (num > 0) {
				//sumaPositivos = sumaPositivos + num;
				sumaPositivos += num;
				//contadorPositivos = contadorPositivos + 1;
				contadorPositivos++;
			} else if (num < 0) {
				sumaNegativos += num;
				contadorNegativos++;
			} else {
				contadorCeros++;
			}
		}
		
		System.out.println("Media de Positivos: " + 
					(sumaPositivos/contadorPositivos));
		System.out.println("Media de Negativos: " +
					(sumaNegativos/contadorNegativos));
		System.out.println("Contador de Ceros: " + 
					contadorCeros);
		
		
		sc.close();
	}

}
