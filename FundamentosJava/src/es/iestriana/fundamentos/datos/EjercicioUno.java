package es.iestriana.fundamentos.datos;

import java.util.Scanner;

public class EjercicioUno {

	/*
	 * Programa que realice la conversión
	 * de grados Celsius a Fahrenheit.
	 * Los grados Celsius debe introducirlos
	 * el usuario
	 */
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Indica Grados Celsius: ");
		double gradosCelsius = sc.nextDouble(); 
		double fahrenheit = (gradosCelsius * 1.8) + 32;
		System.out.println(gradosCelsius 
				+ " grados celsius son "
				+ fahrenheit
				+ " grados fahrenheit");
	}

}
