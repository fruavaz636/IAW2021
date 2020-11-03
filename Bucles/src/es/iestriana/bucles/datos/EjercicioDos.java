package es.iestriana.bucles.datos;

import java.util.Random;
import java.util.Scanner;

public class EjercicioDos {

	/*
	 * Leer una serie de n números (solicitar la cantidad al usuario). Debemos
	 * mostrar si los números introducidos están ordenados de forma creciente,
	 * decreciente o desordenados.
	 */

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int cantidad;
		do {
			System.out.println("INDIQUE CANTIDAD DE NÚMEROS: ");
			cantidad = sc.nextInt();
		} while (cantidad <= 0);

		int orden = 0;
		// 1:creciente, -1:decreciente, 0:desordenados

		orden = comprobarOrden(cantidad);
		
		switch (orden) {
		case 1:
			System.out.println("CRECIENTE");
			break;
		case -1:
			System.out.println("DECRECIENTE");
			break;
		default:
			System.out.println("DESORDENADOS");
			break;
		}

		sc.close();
	}

	private static int comprobarOrden(int cantidad) {
		boolean creciente = false, decreciente = false;

		// Variables para almacenar el número y el siguiente
		int auxiliar = 0, numero = 0;

		for (int i = 0; i < cantidad; i++) {
			//System.out.println("Nº: ");
			//numero = sc.nextInt();
			
			// Números aleatorios
			numero = new Random().nextInt(100)+1;
			System.out.print(numero + " ");

			if (i == 0) {
				auxiliar = numero;
			} else {
				if (numero > auxiliar) {
					creciente = true;
				} else if (numero < auxiliar) {
					decreciente = true;
				}
				auxiliar = numero;
			}
		}

		if (creciente && !decreciente) {
			return 1;
		} else if (!creciente && decreciente) {
			return -1;
		} else {
			return 0;
		}
	}

}
