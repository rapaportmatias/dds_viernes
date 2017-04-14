package dds_viernes.ui.vm;

import org.uqbar.commons.utils.Observable;

import dominio.Alumno;

@Observable
public class MenuViewModel {

	private String token;
	private Alumno alumno;
	
	public MenuViewModel() {
		this.alumno = new Alumno("Nombre", "Apellido", "Legajo", "Usuario");
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	public String getNombre() {
		return alumno.getNombre();
	}
	
	public String getApellido() {
		return alumno.getApellido();
	}
	
	public String getLegajo() {
		return alumno.getLegajo();
	}
	
	public String getUsuarioGit() {
		return alumno.getUsuarioGit();
	}
}
