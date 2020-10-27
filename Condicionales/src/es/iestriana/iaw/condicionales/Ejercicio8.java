package es.iestriana.iaw.condicionales;

import java.util.Scanner;

public class Ejercicio8 {

	/*
	 * Ask the user for the day, 
	 * month and year and check that the date is correct
	 */
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Día: ");
		int dia = sc.nextInt();
		
		System.out.println("Mes: ");
		int mes = sc.nextInt();
		
		System.out.println("Año: ");
		int anyo = sc.nextInt();
		
		boolean fechaCorrecta = false;
		
		// Comprobar si es correcta la fecha
		if (anyo >= 0) {
			boolean esBisiesto = ((anyo % 4 == 0 && anyo % 100 != 0) 
										|| (anyo % 400 == 0));
			if (mes >= 1 && mes <= 12) {
				switch (mes) {
				case 2:
					if (dia >= 1 && dia <= 29 && esBisiesto) {
						fechaCorrecta = true;
					} else if (dia >= 1 && dia <= 28 && !esBisiesto) {
						fechaCorrecta = true;
					}
					break;
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					if (dia >= 1 && dia <= 31) {
						fechaCorrecta = true;
					}
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					if (dia >= 1 && dia <= 30) {
						fechaCorrecta = true;
					}
					break;
				default:
					/*if (dia >= 1 && dia <= 30) {
						fechaCorrecta = true;
					}
					break;*/
				}
			}
		}		
		
		if (fechaCorrecta) {
			System.out.println("Fecha Correcta: " + dia + "/" + mes + "/" + anyo);
		} else {
			System.out.println("Fecha Incorrecta: " + dia + "/" + mes + "/" + anyo);
		}
		
		sc.close();
	}

}
