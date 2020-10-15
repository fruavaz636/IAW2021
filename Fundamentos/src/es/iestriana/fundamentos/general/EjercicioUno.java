package es.iestriana.fundamentos.general;

import java.util.Scanner;

public class EjercicioUno {

	/*
	 * Programa que realice la conversión de grados Celsius
	 * a Fahrenheit. Los grados Celsius los debe introducir
	 * el usuario
	 */
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("GRADOS CELSIUS: ");
		double gradosCelsius = sc.nextDouble();
		double gradosFahrenheit = (gradosCelsius * 1.8) + 32;
		System.out.println(gradosCelsius 
				+ " grados Celsius son "
				+ gradosFahrenheit 
				+ " grados Fahrenheit");
	}

}










