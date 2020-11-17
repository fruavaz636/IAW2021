package es.iestriana.tablas.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio01 {

	/*
	 * Rellena una tabla de 20 números positivos de 
	 * manera aleatoria. Pida un número al usuario e indique
	 * en que posiciones de la tabla se encuentra. Indique también
	 * si el número no se encuentra en la tabla
	 */
	
	private static Scanner sc = new Scanner(System.in);
	
	private static int [] numeros = new int[20];
	
	public static void main(String[] args) {
		rellenarTabla();
		
		System.out.println(Arrays.toString(numeros));
		
		int valor;
		do {
			System.out.println("Nº: ");
			valor = sc.nextInt();
		} while (valor < 0 || valor > 99);
		
		mostrarPosiciones(valor);
		
		sc.close();
	}

	private static void mostrarPosiciones(int valor) {
		boolean encontrado = false;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == valor) {
				System.out.println(i);
				encontrado = true;
			}
		}		
		if (!encontrado) {
			System.out.println("Número no encontrado");
		}
	}

	private static void rellenarTabla() {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = new Random().nextInt(100);
		}
	}

}
