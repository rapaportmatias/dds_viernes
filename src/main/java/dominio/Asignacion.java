package dominio;

import java.util.ArrayList;
import java.util.List;

public class Asignacion {
	Alumno alumno;
	Tarea tarea;
	public List<String> notas;
	
	public Asignacion(Alumno alumno, Tarea tarea){
		this.alumno = alumno;
		this.tarea = tarea;
		notas = new ArrayList<String>();
	}
	
	public void calificarAlAlumnoCon(String nota){
		/*tarea.setNota(nota);
		notas.add(tarea.getNota());*/
	}
}
