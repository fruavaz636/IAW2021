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
		/*for (int i = 0; i < alumnos.size(); i++) {
			Alumno aux = alumnos.get(i);
			if (aux.getNota_expediente() == nota) {
				return aux;
			}
		}*/
		
		for (Alumno a : alumnos) {
			if (a.getNota_expediente() == nota) {
				return a;
			}
		}
		
		return null;
	}

	@Override
	public Alumno buscarPorEdad(int edad) {
		for (Alumno a : alumnos) {
			if (a.getEdad() == edad) {
				return a;
			}
		}
		return null;
	}

	@Override
	public void borrar(String nombre, String apellidos) {
		for (Alumno a : alumnos) {
			if (a.getNombre().equals(nombre) 
					&& a.getApellidos().equals(apellidos)) {
				alumnos.remove(a);
			}
		}
		
		for (int i = 0; i < alumnos.size(); i++) {
			Alumno aux = alumnos.get(i);
			if (aux.getNombre().equals(nombre) 
					&& aux.getApellidos().equals(apellidos)) {
				alumnos.remove(i);
			}
		}
	}

	@Override
	public void borrarTodos() {
		alumnos.clear();
	}

	@Override
	public boolean cambiarNota(Alumno a, float nuevaNota) {
		boolean encontrado = false;
		for (Alumno alum : alumnos) {
			if (alum.equals(a)) {
				alum.setNota_expediente(nuevaNota);
				encontrado = true;
			}
		}
		return encontrado;
	}

	@Override
	public void mostrar() {
		System.out.println("-- ALUMNOS --");
		for (Alumno a : alumnos) {
			System.out.println(a);
		}
		System.out.println("-------------");
	}

}
