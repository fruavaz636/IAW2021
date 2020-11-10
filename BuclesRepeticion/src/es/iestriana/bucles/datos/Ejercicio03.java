package es.iestriana.bucles.datos;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio03 {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// El sistema guarda un número
		int random = new Random().nextInt(50)+1;
		
		// nº de intentos
		int intentos = 5;
		
		// variable para cuando encuentre el numero
		boolean encontrada = false;
		
		do {
			System.out.println("Nº: ");
			int numero = sc.nextInt();
			
			if (numero > random) {
				System.out.println("Nº BUSCADO MÁS PEQUEÑO");
			} else if (numero < random) {
				System.out.println("Nº BUSCADO MÁS GRANDE");
			} else {
				encontrada = true;
			}
			intentos--;
		} while (intentos > 0 && !encontrada);
		
		if (encontrada) {
			System.out.println("Has encontrado el número " 
		+ random + " en " + (5-intentos) + " intentos");
		} else {
			System.out.println("No has encontrado el número " + random);
		}
		
		sc.close();
	}

}
