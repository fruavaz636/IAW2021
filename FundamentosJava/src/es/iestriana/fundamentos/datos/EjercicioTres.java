package es.iestriana.fundamentos.datos;

import java.util.Scanner;

public class EjercicioTres {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("SEGUNDOS: ");
		int segundosTotales = sc.nextInt();
		
		int horas = segundosTotales / 3600;
		int minutos = (segundosTotales - horas*3600) / 60;
		int segundos = segundosTotales - (horas*3600) - (minutos*60);
		
		System.out.println("HORAS: " + horas + 
							" MINUTOS: " + minutos +
							" SEGUNDOS: " + segundos);

	}

}
