package es.iestriana.main;

import es.iestriana.bean.Alumno;
import es.iestriana.dao.AlumnoDAO;
import es.iestriana.dao.AlumnoDAOListas;

public class Principal {

	public static void main(String[] args) {
		Alumno a1 = new Alumno("Juan", "López", 45, 6.6F);
		
		Alumno a2 = new Alumno("Antonio", "Pérez", 45, 6.6F);
		
		
		AlumnoDAO alDAO = new AlumnoDAOListas();
		
		alDAO.anadir(a1);
		alDAO.anadir(a2);
		
		alDAO.mostrarTodos();
		
		
		/*a1.setNombre("Juan2");
		
		a2.setNombre("Antonio2");
		
		System.out.println(a1.getNombre());
		
		System.out.println(a2.getNombre());
		
		System.out.println(a1);*/
		
	}

}
