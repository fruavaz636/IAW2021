package es.iestriana.bucles.datos;

import java.util.Scanner;

public class EjercicioSiete {
	
	/*
	 * Design an application that displays the 
	 * multiplication tables from 1 to 10. In 
	 * addition, ask the user which table she 
	 * wants to show
	 */
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		for (int tabla = 1; tabla <= 10; tabla++) {
			
			System.out.println("Tabla del " + tabla);
			
			for (int numero = 1; numero <= 10; numero++) {
				
				System.out.println(tabla + " * " + numero 
						+ " = " + (tabla*numero));
			}
		}
		
		int numeroTabla = 0;
		do {
			System.out.println("TABLA: ");
			numeroTabla = sc.nextInt();
		} while (numeroTabla <= 0);
		
		for (int i = 1; i <= 10; i++) {
			
			System.out.println(numeroTabla + " * " + i 
					+ " = " + (numeroTabla*i));
			
		}

		sc.close();
	}

}
