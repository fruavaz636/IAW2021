package es.iestriana.tablas.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio04 {
	
	/*
	 * Read 2 tables of n numbers and mix it in a third 
	 * table in the following way: 1st from A, 1st from B, 
	 * 2nd from A, 2nd from B, 3rd from A, 3rd from B, ...
	 */
	
	private static int [] numerosA;
	private static int [] numerosB;
	private static int [] mezcla;

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int cantidad;
		do {
			System.out.println("Nº de Elementos: ");
			cantidad = sc.nextInt();
		} while (cantidad <= 0);
		
		numerosA = new int [cantidad];
		numerosB = new int [cantidad];
		mezcla = new int [cantidad*2];
		
		rellenarNumeros();
		
		mezclarNumeros();
		
		mostrarResultado();

		sc.close();
	}

	private static void mostrarResultado() {
		System.out.println("NÚMEROS A: " + Arrays.toString(numerosA));
		System.out.println("NÚMEROS B: " + Arrays.toString(numerosB));
		System.out.println("MEZCLA AyB: " + Arrays.toString(mezcla));
	}

	private static void mezclarNumeros() {
		int cursorM = 0;
		for (int i = 0; i < numerosA.length; i++) {
			mezcla[cursorM] = numerosA[i];
			cursorM++;
			mezcla[cursorM] = numerosB[i];
			cursorM++;
		}
	}

	private static void rellenarNumeros() {
		for (int i = 0; i < numerosA.length; i++) {
			numerosA[i] = new Random().nextInt(50) + 1;
			numerosB[i] = new Random().nextInt(50) + 1;
		}
	}

}
