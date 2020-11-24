package es.iestriana.tablas.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Explicacion {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Unidimensionales
		int [] nombreTabla = new int [10];
		
		
		// Multidimensionales
		float [][] temperaturas = new float[6][3];
		
		// Inicializar		
		String[] diasdelasemana = {"Lunes", "Martes", "Miércoles"};
		
		int [] numeros = {1,2,3,4,5,6};
		
		int[][] valores = {{1,2},{4,5},{7,8}};
		
		int cantidad = 10;
		int [] tabla = new int[cantidad];
		
		// Obtener valores
//		System.out.println(numeros[0]);
//		System.out.println(valores[1][1] + "," + valores[1][1]);
//		System.out.println(valores[0].length);
		
		int n = numeros[2];
		int v = valores[0][1];
		
		// Modificar la tabla
		numeros[0] = 11;
		valores[0][0] = 11;
		numeros[0]++;
		numeros[1] = numeros[2] + numeros[3];
		
		// Inicializar
		for (int i = 0; i < tabla.length; i++) {
			//System.out.println("Nº: ");
			//tabla[i] = sc.nextInt();
			tabla[i] = new Random().nextInt(50);
		}
		
//		for (int i = 0; i < valores.length; i++) {
//			for (int j = 0; j < valores[i].length; j++) {
//				//System.out.println("Nº: ");
//				valores[i][j] = new Random().nextInt(50);
//			}
//		}
		
		mostrarTabla(tabla);
		//mostrarTablaMulti(valores);
		
		System.out.println(Arrays.toString(tabla));
		Arrays.sort(tabla);
		System.out.println(Arrays.toString(tabla));
		//Arrays.fill(tabla, 11);
		System.out.println(Arrays.toString(tabla));
		System.out.println(Arrays.binarySearch(tabla, 25));
		
		//int [] auxiliar = Arrays.copyOf(tabla, 15);
		int [] auxiliar = Arrays.copyOfRange(tabla, 2, 5);
		
		sc.close();
	}

	private static void mostrarTablaMulti(int[][] valores) {
		for (int i = 0; i < valores.length; i++) {
			System.out.println("Fila " + i);
			for (int j = 0; j < valores[i].length; j++) {
				System.out.print(valores[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void mostrarTabla(int[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		System.out.println();
	}	
}







