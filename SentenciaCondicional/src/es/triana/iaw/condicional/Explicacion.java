package es.triana.iaw.condicional;

import java.util.Scanner;

public class Explicacion {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Nº 1: ");
		int num1 = sc.nextInt();
		
		System.out.println("Nº 2: ");
		int num2 = sc.nextInt();
		
		if (num1 == num2) {
			System.out.println(num1 + " es igual a " + num2);
		} else if (num1 > num2) {
			System.out.println(num1 + " es mayor que " + num2);
		} else {
			System.out.println(num2 + " es mayor que " + num1);
		}
		
		boolean condicion = num1 == num2;
		if (!condicion)
			System.out.println(num1 + " es igual a " + num2);
		else
			System.out.println(num1 + " no es igual a " + num2);
		
		
		if (num1 % num2 == 0)
			System.out.println(num1 + " es múltiplo de " + num2);
		else if (num2 % num1 == 0)
			System.out.println(num2 + " es múltiplo de " + num1);
		else
			System.out.println("No son múltiplos");
		
		System.out.println("Nº 3: ");
		int num3 = sc.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			if (num2 > num3) {
				System.out.println("Orden: " + num1 + ", " + num2 + ", " + num3);
			} else {
				System.out.println("Orden: " + num1 + ", " + num3 + ", " + num2);
			}
		} else if (num2 > num1 && num2 > num3) {
			if (num1 > num3) {
				System.out.println("Orden: " + num2 + ", " + num1 + ", " + num3);
			} else {
				System.out.println("Orden: " + num2 + ", " + num3 + ", " + num1);
			}
		} else {
			if (num1 > num2) {
				System.out.println("Orden: " + num3 + ", " + num1 + ", " + num2);
			} else {
				System.out.println("Orden: " + num3 + ", " + num2 + ", " + num1);				
			}
		}
		
		sc.close();
	}

}
