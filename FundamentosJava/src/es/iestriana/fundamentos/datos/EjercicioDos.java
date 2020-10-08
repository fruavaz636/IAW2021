package es.iestriana.fundamentos.datos;

import java.util.Scanner;

public class EjercicioDos {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {				
		System.out.println("BASE: ");
		int base = sc.nextInt();
		System.out.println("ALTURA: ");
		int altura = sc.nextInt();
		
		int perimetro = 2 * (base + altura);
		int area = base * altura;
		
		System.out.println("PERÍMETRO: " + perimetro);
		System.out.println("ÁREA: " + area);
	}

}
