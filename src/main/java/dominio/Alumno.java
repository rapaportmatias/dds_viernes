package dominio;

public class Alumno {
	
	private String nombre;
	private String apellido;
	private String legajo;
	private String usuarioGit;
	
	public Alumno(String nombre, String apellido, String legajo, String usuarioGit){
		this.nombre = nombre;
		this.apellido = apellido;
		this.legajo = legajo;
		this.usuarioGit = usuarioGit;
	}
	
	public Alumno() {}

	public String getNombre() {
		return nombre;
	}
	
	public String getApellido() {
		return apellido;
	}

	public String getLegajo() {
		return legajo;
	}

	public String getUsuarioGit() {
		return usuarioGit;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}

	public void setUsuarioGit(String usuarioGit) {
		this.usuarioGit = usuarioGit;
	}
}  
