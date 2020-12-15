package es.iestriana.main;

import es.iestriana.bean.Alumno;
import es.iestriana.dao.AlumnoDAO;
import es.iestriana.dao.AlumnoDAOListas;

public class Principal {

	public static void main(String[] args) {
		AlumnoDAO alumDAO = new AlumnoDAOListas();
		
		Alumno antonio = new Alumno("Antonio", "Ramos", 40, 5.5F);
		Alumno juan = new Alumno("Juan", "López", 35, 6.3F);
		Alumno maria = new Alumno("María", "Sánchez", 22, 7.7F);
		
		alumDAO.anadir(antonio);
		alumDAO.anadir(juan);
		alumDAO.anadir(maria);
		
		// Mostrar alumnos
		alumDAO.mostrar();
		
		alumDAO.borrar("Juan", "López");
		
		alumDAO.mostrar();
		
		Alumno alumBuscado = alumDAO.buscarPorNota(5.5F);
		if (alumBuscado != null) {
			System.out.println(alumBuscado);
		} else {
			System.out.println("Alumno no encontrado");
		}
		
		alumDAO.cambiarNota(alumBuscado, 9.9F);
		
		alumDAO.mostrar();
	}

}
