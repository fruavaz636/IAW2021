package es.iestriana.dao;

import es.iestriana.bean.Alumno;

public interface AlumnoDAO {

	public void anadir(Alumno a);
	
	public Alumno buscarPorNota(float nota);
	
	public void buscarPorEdadYAumentar(int edad);
	
	public void borrar(String nombre, String apellidos);
	
	public void mostrarTodos();
}
