package es.iestriana.tablas.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio05 {

	/*
	 * Create a table of n numbers and move it down one 
	 * position, that is, the first becomes second, 
	 * second becomes third, and so on successively. 
	 * The last becomes the first
	 */
	
	private static int [] numeros;
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int cantidad;
		do {
			System.out.println("Nº de Elementos: ");
			cantidad = sc.nextInt();
		} while (cantidad <= 0);
		
		numeros = new int [cantidad];
		
		rellenarNumeros();
		
		mostrarNumeros();
		
		moverPosiciones();
		
		mostrarNumeros();
		
		sc.close();
	}
	
	private static void mostrarNumeros() {
		System.out.println("NÚMEROS: " + Arrays.toString(numeros));
	}

	private static void moverPosiciones() {
		int ultimo = numeros[numeros.length-1];
		for (int i = numeros.length - 2; i >= 0; i--) {
			numeros[i+1] = numeros[i];
		}
		numeros[0] = ultimo;
	}

	private static void rellenarNumeros() {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = new Random().nextInt(50) + 1;
		}
	}

}
