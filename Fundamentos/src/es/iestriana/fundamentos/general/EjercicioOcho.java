package es.iestriana.fundamentos.general;

import java.util.Scanner;

public class EjercicioOcho {

	/*
	 * Write a program that prompts the user for 
	 * the size of the side of an equilateral 
	 * triangle and calculates its perimeter and area.
	 */
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("LADO: ");
		double lado = sc.nextDouble();
		
		double perimetro = 3 * lado;
		double area = (lado * lado) / 2;
		
		System.out.println("PERÍMETRO: " + perimetro);
		System.out.println("ÁREA: " + area);
		
		sc.close();
	}

}
