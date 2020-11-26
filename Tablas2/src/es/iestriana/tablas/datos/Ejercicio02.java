package es.iestriana.tablas.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio02 {

	/*
	 * Read n numbers in increasing order. Ask the user for a 
	 * number and look it up In the table. Your current 
	 * position should be displayed. If not, indicate it with 
	 * a message
	 */
	
	private static Scanner sc = new Scanner(System.in);
	
	private static int [] numeros = new int [20];
	
	public static void main(String[] args) {
		rellenarTabla();
		
		Arrays.sort(numeros);
		
		mostrarTabla();
		
		System.out.println("Nº: ");
		int buscado = sc.nextInt();
		
		int pos = buscarNumero(buscado);

		if (pos == -1) {
			System.out.println("El número " + 
					buscado + " no se encuentra");
		} else {
			System.out.println("El número " + 
					buscado + " está en la posición " + pos);
		}
		
		
		sc.close();
	}

	private static void mostrarTabla() {
		System.out.println(Arrays.toString(numeros));
	}

	private static int buscarNumero(int buscado) {
		int pos = -1;
		
		for (int i = 0; i < numeros.length && pos == -1; i++) {
			if (numeros[i] == buscado) {
				pos = i;
			}
		}
		
		return pos;
	}

	private static void rellenarTabla() {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = new Random().nextInt(200);
		}
	}

}
