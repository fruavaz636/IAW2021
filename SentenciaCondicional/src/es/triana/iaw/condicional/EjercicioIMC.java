package es.triana.iaw.condicional;

import java.util.Scanner;

public class EjercicioIMC {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("PESO (Kg): ");
		double peso = sc.nextDouble();
		
		System.out.println("ALTURA (M): ");
		double altura = sc.nextDouble();
		
		double imc = (peso / Math.pow(altura, 2));
		
		if (imc < 16) {
			System.out.println("Ingresar Hospital");
		} else if (imc >= 16 && imc < 18) {
			System.out.println("Bajo Peso");
		} else if (imc >= 18 && imc < 25) {
			System.out.println("Peso Normal");
		} else if (imc >= 25 && imc < 30) {
			System.out.println("Obesidad Grado 1");
		} else if (imc >= 30 && imc < 35) {
			System.out.println("Obesidad Grado 2");
		} else if (imc >= 35 && imc < 40) {
			System.out.println("Obesidad Grado 3");
		} else {
			System.out.println("Obesidad Grado 4");
		}
		
	}

}
