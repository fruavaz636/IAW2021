package es.iestriana.iaw.condicionales;

import java.util.Scanner;

public class Ejercicio13 {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("PESO (KG): ");
		double peso = sc.nextDouble();
		
		System.out.println("ALTURA (M): ");
		double altura = sc.nextDouble();
		
		double imc = peso / Math.pow(altura, 2);
		
		if (imc < 16) {
			System.out.println("Ingreso Urgente en Hospital");
		} else if (imc >= 16 && imc < 18) {
			System.out.println("Peso Bajo");
		} else if (imc >= 18 && imc < 25) {
			System.out.println("Peso Normal");
		} else if (imc >= 25 && imc < 30) {
			System.out.println("SobrePeso Grado I");
		} else if (imc >= 30 && imc < 35) {
			System.out.println("SobrePeso Grado II");
		} else if (imc >= 35 && imc < 40) {
			System.out.println("SobrePeso Grado III");
		} else {
			System.out.println("SobrePeso Grado IV");
		}
			
		
		
		sc.close();
	}

}
