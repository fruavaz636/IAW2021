package es.iestriana.fundamentos.datos;

public class Tipos {

	public static void main(String[] args) {
		System.out.println("TIPOS");
		
		// Comentario de 1 línea
		/*
		 * Comentario de bloque
		 */
		
		// Tipos de Variables
		
		// Enteros
		byte b; // (8 bits)
		short sh; // (16 bits)
		int i; // (32 bits)
		long l; // (64 bits)
		
		char ch = 111;
		System.out.println(ch);
		
		// Reales
		float f; // 32 bits
		double d; // 64 bits
		
		f = 3.1416F;
		d = 3.1416;
		
		double pi = Math.PI;
		System.out.println(pi);
		
		// Lógicos
		boolean bol = false; // true
		
		// Cadenas
		String cad = "Valor de PI";
		String cad2 = "Tipo String";
		System.out.println(cad + ": " + pi);
		
		// Tipos Complejos
		Byte bb;
		Integer ii = 0;
		Short ss;
		System.out.println(ii.MAX_VALUE);
		Long ll;
		Character cc;
		Boolean bolb;
		
		System.out.println(cad.substring(0, 7));
	}
}
