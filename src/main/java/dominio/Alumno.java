package dominio;

public class Alumno {
	private String nombre, apellido, legajo;
	
	public Alumno(String nombre, String apellido, String legajo){
		this.nombre = nombre;
		this.apellido = apellido;
		this.legajo = legajo;
	}

	public String getNombre() {
		return nombre;
	}

		
	public String getApellido() {
		return apellido;
	}


	public String getLegajo() {
		return legajo;
	}
}  
