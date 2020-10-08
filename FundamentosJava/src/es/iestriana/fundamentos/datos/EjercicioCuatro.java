package es.iestriana.fundamentos.datos;

import java.util.Scanner;

public class EjercicioCuatro {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("RADIO: ");
		double radio = sc.nextDouble();
		
		double area = Math.PI * Math.pow(radio, 2);
		double longitud = 2 * Math.PI * radio;
		
		System.out.println("AREA: " + area);
		System.out.println("LONGITUD: " + longitud);
	}

}
