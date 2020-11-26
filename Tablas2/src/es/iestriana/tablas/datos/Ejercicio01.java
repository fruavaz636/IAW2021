package es.iestriana.tablas.datos;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio01 {
	
	/*
	 * 1. Read n whole numbers, save them in the table 
	 * and show the mean of the positives, negative mean 
	 * and number of zeros
	 */
	
	private static Scanner sc = new Scanner(System.in);
	
	private static int [] tabla;

	public static void main(String[] args) {
		int cantidadNumeros = 0;
		do {
			System.out.println("CANTIDAD DE NÚMEROS: ");
			cantidadNumeros = sc.nextInt();
		} while (cantidadNumeros <= 0);
		
		tabla = new int [cantidadNumeros];
		
		rellenarTabla();

		int contPos = 0, contNeg = 0, contCeros = 0;
		int sumaPos = 0, sumaNeg = 0;
		
		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] > 0) {
				contPos++;
				sumaPos += tabla[i];
			} else if (tabla[i] < 0) {
				contNeg++;
				sumaNeg += tabla[i];
			} else {
				contCeros++;
			}
		}
		
		if (contPos > 0) {
			System.out.println("Media Pos: " + sumaPos/contPos);
		} else {
			System.out.println("No hay positivos");
		}
		
		if (contNeg > 0) {
			System.out.println("Media Neg: " + sumaNeg/contNeg);
		} else {
			System.out.println("No hay negativos");
		}
		
		System.out.println("Nº de Ceros: " + contCeros);
		sc.close();
	}

	private static void rellenarTabla() {
		for (int i = 0; i < tabla.length; i++) {
			System.out.println("Nº: ");
			tabla[i] = sc.nextInt();
		}
	}

}
