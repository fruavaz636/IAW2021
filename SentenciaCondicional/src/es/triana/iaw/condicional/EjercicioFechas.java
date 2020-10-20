package es.triana.iaw.condicional;

import java.util.Scanner;

public class EjercicioFechas {

	/*
	 * Ask the user for the day, 
	 * month and year and check that the date is correct
	 */
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("DÍA: ");
		int dia = sc.nextInt();
		
		System.out.println("MES: ");
		int mes = sc.nextInt();
		
		System.out.println("AÑO: ");
		int anyo = sc.nextInt();
		
		boolean fechaCorrecta = false;
		
		if (anyo >= 0) {
			boolean esBisiesto = ((anyo % 4 == 0 && anyo % 100 != 0) 
					|| (anyo % 400 == 0));
			if (mes >= 1 && mes <= 12) {
				switch (mes) {
				case 2:
					if (esBisiesto && dia >= 1 && dia <= 29) {
						fechaCorrecta = true;
					} else if (!esBisiesto && dia >= 1 && dia <= 28) {
						fechaCorrecta = true;
					}
					break;

				default:
					break;
				}
			}
		}
		
		if (fechaCorrecta) {
			System.out.println("La Fecha es Correcta");
		} else {
			System.out.println("La Fecha es Incorrecta");
		}
		
		sc.close();
	}

}
