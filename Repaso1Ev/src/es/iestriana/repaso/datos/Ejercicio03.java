package es.iestriana.repaso.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio03 {

	/*
	 * Read two series of n numbers. Store them in 2 tables. 
	 * Order the tables. Merges the 2 tables into a table 
	 * of 2 * n elements so that this table is ordered.
	 */
	
	private static Scanner sc = new Scanner(System.in);
	
	private static int [] tabla1;
	private static int [] tabla2;
	private static int [] tablaOrdenada;
	
	public static void main(String[] args) {
		int num_elementos = 0;
		do {
			System.out.println("Nº ELEMENTOS: ");
			num_elementos = sc.nextInt();
		} while (num_elementos <= 0);
		
		tabla1 = new int[num_elementos];
		tabla2 = new int[num_elementos];
		tablaOrdenada = new int[2*num_elementos];
		
		rellenarYOrdenarTablas();
			
		fusionarTablas();
		
		mostrarTablas();
		
		sc.close();
	}

	private static void fusionarTablas() {
		int i = 0; // cursor de tabla 1
		int j = 0; // cursor de tabla 2
		int h = 0; // cursor de tablaOrdenada
		
		while (i < tabla1.length && j < tabla2.length) {
			if (tabla1[i]<tabla2[j]) {
				tablaOrdenada[h] = tabla1[i];
				i++;
				h++;
			} else {
				tablaOrdenada[h] = tabla2[j];
				j++;
				h++;
			}
		}
		
		if (i == tabla1.length) {
			while (j < tabla2.length) {
				tablaOrdenada[h] = tabla2[j];
				j++;
				h++;
			}
		} else if (j == tabla2.length) {
			while (i < tabla1.length) {
				tablaOrdenada[h] = tabla1[i];
				i++;
				h++;
			}
		}
	}

	private static void mostrarTablas() {
		System.out.println("TABLA 1");
		System.out.println(Arrays.toString(tabla1));
		System.out.println("TABLA 2");
		System.out.println(Arrays.toString(tabla2));
		System.out.println("TABLA ORDENADA");
		System.out.println(Arrays.toString(tablaOrdenada));
	}

	private static void rellenarYOrdenarTablas() {
		for (int i = 0; i < tabla1.length; i++) {
			tabla1[i] = new Random().nextInt(100) + 1;
			tabla2[i] = new Random().nextInt(100) + 1;
		}
		Arrays.sort(tabla1);
		Arrays.sort(tabla2);
	}

}
