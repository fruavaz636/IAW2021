package es.iestriana.dao;

import es.iestriana.bean.Alumno;

public interface AlumnoDAO {

	public void anadir(Alumno a);
	
	public Alumno buscarPorNota(float nota);
	
	public Alumno buscarPorEdad(int edad);
	
	public void borrar(String nombre, String apellidos);
	
	public void borrarTodos();
	
	public boolean cambiarNota(Alumno a, float nuevaNota);
	
	public void mostrar();
	
	// Todos los métodos
}
