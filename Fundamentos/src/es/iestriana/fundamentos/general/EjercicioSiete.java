package es.iestriana.fundamentos.general;

import java.util.Scanner;

public class EjercicioSiete {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("CANTIDAD: ");
		double cantidad = sc.nextDouble();
		
		System.out.println("INTERÉS: ");
		double interes = sc.nextDouble();
		
		System.out.println("PLAZO: ");
		int plazo = sc.nextInt();
		
		double total = cantidad 
				+ ((((cantidad * interes) / 100) 
				- (((cantidad * interes) / 100) * 1.8)) 
				* plazo);
		
		System.out.println("TOTAL: " + total);
		

	}

}
