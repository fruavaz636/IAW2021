package es.iestriana.tablas.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BuscarRepetidos {

	private static Scanner sc = new Scanner(System.in);
	
	private static int [] numeros = new int[10];
	
	public static void main(String[] args) {	
		inicializarTabla();
		
		System.out.println("Nº Buscado: ");
		int valor = sc.nextInt();
		
		int repeticiones = calcularRepetidos(valor);
		
		System.out.println("El número " + valor + " se repite " + repeticiones + " veces");
		
		mostrarTabla();
		
		sc.close();
	}

	private static void mostrarTabla() {
		System.out.println(Arrays.toString(numeros));
	}

	private static int calcularRepetidos(int valor) {
		int repeticiones = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == valor) {
				repeticiones++;
			}
		}
		
		return repeticiones;
	}

	private static void inicializarTabla() {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = new Random().nextInt(20) + 1;
		}
	}

}
