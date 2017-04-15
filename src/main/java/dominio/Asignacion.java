package dominio;

import java.util.ArrayList;
import java.util.List;

public class Asignacion {
	

	public List<String> notas;	
	private String descripcion;
	private String titulo;
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public Asignacion(Alumno alumno, Tarea tarea){

		notas = new ArrayList<String>();
	}
	
	public void calificarAlAlumnoCon(String nota){
		/*tarea.setNota(nota);
		notas.add(tarea.getNota());*/
	}
}
