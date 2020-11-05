package es.iestriana.bucles.datos;

import java.util.Scanner;

public class EjercicioCinco {

	/*
	 * Write a program that reads a number from 
	 * the keyboard and performs the sum of the 
	 * next 100 numbers, displaying the result 
	 * on the screen
	 */
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Nº: ");
		int numero = sc.nextInt();
		
		int suma = 0;
		
		for (int i = numero + 1; i <= numero + 100; i++) {
			suma = suma + i;
		}
		
		System.out.println("SUMA: " + suma);
		
		sc.close();
	}

}
