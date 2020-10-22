package es.triana.iaw.condicional;

import java.util.Scanner;

public class EjercicioDia {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("DÍA: ");
		int dia = sc.nextInt();
		
		System.out.println("MES: ");
		int mes = sc.nextInt();
		
		System.out.println("AÑO: ");
		int anyo = sc.nextInt();
		
		System.out.println("Fecha Anterior: " + dia + "/" + mes + "/" + anyo);
		
		// Suponemos que la fecha es correcta
		int diasQueTieneElMes = 0;
		
		switch (mes) {
		case 2:
			diasQueTieneElMes = 28;
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			diasQueTieneElMes = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			diasQueTieneElMes = 30;
		default:
			break;
		}
		
		dia++;
		
		if (dia > diasQueTieneElMes) {
			dia = 1;
			mes++;
			
			if (mes > 12) {
				mes = 1;
				anyo++;
			}
		}
		
		System.out.println("Fecha Nueva: " + dia + "/" + mes + "/" + anyo);

	}

}
