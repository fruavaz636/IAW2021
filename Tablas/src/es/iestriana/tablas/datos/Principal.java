package es.iestriana.tablas.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Principal {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		// Unidimensionales
		int [] nombreTabla = new int [10];
		
		int nombreTabla1[];
		
		
		// Multidimensionales		
		float [][] temperaturas = new float[6][3];
		
		
		// Inicializar
		int [] numeros = {1,2,3,4,5};
		//System.out.println(numeros.length);
		
		//int [][] valores = new int [2][3];
		int [][] valores = {{1,2,3},{4,5,6}};
		
		String [][] cadenas = {{"cad1", "cad2"},{"cad3", "cad4"}};
		
		
		int cantidad = 10;
		int [] tabla = new int[cantidad];
		
		// Obtener un valor
		System.out.println(numeros[4]);
		int valor = numeros[4];
		String cad = cadenas[1][0];
		System.out.println(cad);
		
		// Modificar un valor
		numeros[0] = 11;
		numeros[0]++;
		numeros[1] = numeros[2] + numeros[3];
		
		// Inicializar una tabla unidimensional
		for (int i = 0; i < tabla.length; i++) {
			System.out.println("Nº: ");
			tabla[i] = sc.nextInt();
		}
		
		// Inicializar una tabla multidimensional
		System.out.println("Longitud de Temperaturas: " + temperaturas.length);
		for (int i = 0; i < temperaturas.length; i++) {
			for (int j = 0; j < temperaturas[i].length; j++) {
				//System.out.print("(" + i + "," + j + ") ");
				temperaturas[i][j] = sc.nextFloat();
			}
			System.out.println();
		}
		
		// Nº de repeticiones de un número en la tabla
		System.out.println("Nº A BUSCAR: ");
		int buscado = sc.nextInt();
		int n = calcularRepetidos(tabla, buscado);
		System.out.println("El número " + buscado 
				+ " se repite " + n + " veces");
		
		
		// Mostrar una tabla
		mostrarTabla(tabla);
		mostrarTablaMulti(temperaturas);
		*/
		
		int [] datos = new int[10];
		for (int i = 0; i < datos.length; i++) {
			datos[i] = new Random().nextInt(100);
		}
		
		mostrarTabla(datos);
		
		System.out.println();
		
		System.out.println(Arrays.toString(datos));
		Arrays.sort(datos);
		System.out.println(Arrays.toString(datos));
		//Arrays.fill(datos, 123);
		//System.out.println(Arrays.toString(datos));
		System.out.println("El numero está en la posición " + Arrays.binarySearch(datos, 33));
		
		//int [] auxiliar = Arrays.copyOf(datos, 5);
		int [] auxiliar = Arrays.copyOfRange(datos, 2, 7);
		System.out.println(Arrays.toString(auxiliar));
		
		sc.close();
	}

	private static void mostrarTablaMulti(float[][] temperaturas) {
		for (int i = 0; i < temperaturas.length; i++) {
			for (int j = 0; j < temperaturas[i].length; j++) {
				System.out.print(temperaturas[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void mostrarTabla(int[] tabla) {
		for (int i = 0; i < tabla.length; i++) {
			System.out.print(tabla[i] + " ");
		}		
	}

	private static int calcularRepetidos(int[] tabla, int buscado) {
		int repeticiones = 0;
		
		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] == buscado) {
				repeticiones++;
			}
		}
		
		return repeticiones;
	}

}
