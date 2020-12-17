package es.iestriana.dao;

import java.util.ArrayList;
import java.util.List;

import es.iestriana.bean.Alumno;

public class AlumnoDAOListas implements AlumnoDAO {

	private List<Alumno> alumnos = new ArrayList<Alumno>();
	
	@Override
	public void anadir(Alumno a) {
		alumnos.add(a);		
	}

	@Override
	public Alumno buscarPorNota(float nota) {
		for (int i = 0; i < alumnos.size(); i++) {
			Alumno aux = alumnos.get(i);
			if (aux.getNota_expediente() == nota) {
				return aux;
			}
		}
		
		for (Alumno a : alumnos) {
			if (a.getNota_expediente() == nota) {
				return a;
			}
		}
		
		return null;
	}

	@Override
	public void buscarPorEdadYAumentar(int edad) {
		for (Alumno alumno : alumnos) {
			if (alumno.getEdad() == edad) {
				alumno.setEdad(alumno.getEdad() + 5);
			}
		}
	}

	@Override
	public void borrar(String nombre, String apellidos) {
		for (Alumno a : alumnos) {
			if (a.getNombre().equalsIgnoreCase(nombre) 
					&& a.getApellidos().equalsIgnoreCase(apellidos)) {
				alumnos.remove(a);
			}
		}
		
	}

	@Override
	public void mostrarTodos() {
		System.out.println("-- ALUMNOS --");
		for (Alumno alumno : alumnos) {
			System.out.println(alumno);
		}
	}

	

}
