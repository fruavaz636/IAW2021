package es.iestriana.repaso.datos;

import java.util.Scanner;

public class Ejercicio01 {
	
	/*
	 * Given two numbers, indicate whether they are friends 
	 * or not. Two numbers are friends if the sum of the 
	 * proper divisors of one of them is equal to the 
	 * other (the unit is considered a proper divisor, 
	 * but the same number is not) 
	 * 220 y 284 
	 * 284 = 1 + 2 + 4 + 71 + 142 = 220 
	 * 220 = 1 + 2 + 4 + 5 + 10 + 11 + 20 + 22 + 44 + 55 + 110 = 284
	 */
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Nº 1: ");
		int num1 = sc.nextInt();
		
		System.out.println("Nº 2: ");
		int num2 = sc.nextInt();
		
		if (sonAmigos(num1, num2)) {
			System.out.println(num1 + " es amigo de " + num2);
		} else {
			System.out.println(num1 + " no es amigo de " + num2);
		}		
		
		sc.close();
	}

	private static boolean sonAmigos(int num1, int num2) {
		boolean amigos = false;
		
		if (sumaDivisores(num1) == num2 
				&& sumaDivisores(num2) == num1) {
			amigos = true;
		}
		
		return amigos;
	}

	private static int sumaDivisores(int numero) {
		int suma = 0;
		
		for (int i = 1; i < numero; i++) {
			if (numero%i == 0) {
				suma = suma + i;
			}
		}
		
		return suma;
	}

}
