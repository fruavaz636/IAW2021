package es.iestriana.fundamentos.general;

import java.util.Scanner;

import javax.crypto.AEADBadTagException;

public class EjercicioDos {

	
	/*
	 * Programa que defina 2 variables enteras
	 * con la base y altura de un rectángulo. 
	 * Calcula su perímetro y área
	 */
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int base, altura;
		System.out.println("Introduce la Base: ");
		base = sc.nextInt();
		System.out.println("Introduce la Altura: ");
		altura = sc.nextInt();
		
		int perimetro = 2 * (base + altura);
		int area = base * altura;
		
		System.out.println("PERÍMETRO: " + perimetro);
		System.out.println("ÁREA: " + area);
	}
	
	/*public static void main(String[] args) {
		System.out.println("Introduce la Base: ");
		int base = sc.nextInt();
		System.out.println("Introduce la Altura: ");
		int altura = sc.nextInt();
		
		System.out.println("PERÍMETRO: " + (2 * (base + altura)));
		System.out.println("ÁREA: " + (base * altura));
	}*/
}







