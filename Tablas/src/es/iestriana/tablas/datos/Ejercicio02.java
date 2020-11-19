package es.iestriana.tablas.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio02 {
	
	/*
	 * Read the table of n numbers and save the even 
	 * numbers in another table and the odd numbers 
	 * in another table.
	 */

	private static Scanner sc = new Scanner(System.in);
	
	private static int [] numeros; // Con todos los números
	private static int [] pares;
	private static int [] impares;
	
	private static int cursorPares = 0, cursorImpares = 0;
	
	public static void main(String[] args) {
		int cantidad;
		do {
			System.out.println("Nº de Elementos: ");
			cantidad = sc.nextInt();
		} while (cantidad <= 0);
		
		numeros = new int [cantidad];
		pares = new int [cantidad];
		impares = new int [cantidad];
		
		inicializarNumeros();
		
		dividirParesImpares();
		
		mostrarTablas();
		
		sc.close();
	}

	private static void mostrarTablas() {
		System.out.println("NÚMEROS: " + Arrays.toString(numeros));
		System.out.println("PARES: " + Arrays.toString(pares));
		System.out.println("IMPARES: " + Arrays.toString(impares));
		
		for (int i = 0; i < pares.length && pares[i]!=0; i++) {
			System.out.print(pares[i] + " ");			
		}
		System.out.println();
		for (int i = 0; i < cursorPares; i++) {
			System.out.print(pares[i] + " ");
		}
	}

	private static void dividirParesImpares() {
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i]%2 == 0) {
				pares[cursorPares] = numeros[i];
				cursorPares++;
			} else {
				impares[cursorImpares] = numeros[i];
				cursorImpares++;
			}
		}
	}

	private static void inicializarNumeros() {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = new Random().nextInt(50) + 1;
		}
	}

}
