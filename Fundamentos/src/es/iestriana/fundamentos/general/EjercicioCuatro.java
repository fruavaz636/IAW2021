package es.iestriana.fundamentos.general;

import java.util.Scanner;

public class EjercicioCuatro {
	
	/*
	 * Solicitar al usuario el radio de una circunferencia
	 * y calcular su longitud y su área
	 */

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("RADIO: ");
		double radio = sc.nextDouble();
		
		double area = Math.PI * Math.pow(radio, 2);
		double longitud = 2 * Math.PI * radio;
		
		System.out.println("AREA: " + Math.round(area*100.0)/100.0);
		System.out.println("LONGITUD: " + Math.round(longitud*100.0)/100.0);
		
		sc.close();
	}

}
