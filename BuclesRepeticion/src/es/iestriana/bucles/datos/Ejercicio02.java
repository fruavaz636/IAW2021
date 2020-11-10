package es.iestriana.bucles.datos;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio02 {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int cantidad;
		do {
			System.out.println("INDICA EL Nº DE ELEMENTOS: ");
			cantidad = sc.nextInt();
		} while (cantidad <= 0);
		
		// orden -> 1: creciente, -1: decreciente, 0: desordenados
		int orden = comprobarOrden(cantidad);
		
		if (orden == 1) {
			System.out.println("CRECIENTE");
		} else if (orden == -1) {
			System.out.println("DECRECIENTE");
		} else {
			System.out.println("DESORDENADOS");
		}
		
		sc.close();
	}

	private static int comprobarOrden(int cantidad) {
		boolean creciente = false, decreciente = false;
		int numero = 0, anterior = 0;
		
		for (int i = 0; i < cantidad; i++) {
			System.out.println("Nº: ");
			numero = new Random().nextInt(100);
			System.out.println(numero);
			
			if (i == 0) {
				anterior = numero;
			} else {
				if (numero > anterior) {
					creciente = true;
				} else if (numero < anterior){
					decreciente = true;
				}
				anterior = numero;
			}
		}
		
		if (creciente == true && decreciente == false) {
			return 1;
		} else if (creciente == false && decreciente == true) {
			return -1;
		} else {
			return 0;
		}
	}
}
