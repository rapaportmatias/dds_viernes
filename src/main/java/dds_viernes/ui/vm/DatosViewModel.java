package dds_viernes.ui.vm;

import org.uqbar.commons.utils.Observable;

import dominio.Alumno;

@Observable
public class DatosViewModel {
	
	private String token;
	private Alumno alumno;
	
	public DatosViewModel() {
		this.alumno = new Alumno();
	}
	
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public void setNombre(String nombre) {
		alumno.setFirst_name(nombre);
	}

	public void setApellido(String apellido) {
		alumno.setLast_name(apellido);
	}
	
	public void setLegajo(String legajo) {
		alumno.setCode(legajo);
	}

	public void setUsuarioGit(String usuarioGit) {
		alumno.setGithub_user(usuarioGit);
	}
	
	public String getNombre() {
		return alumno.getFirst_name();
	}

	public String getApellido() {
		return alumno.getLast_name();
	}
	
	public String getLegajo() {
		return alumno.getCode();
	}

	public String getUsuarioGit() {
		return alumno.getGithub_user();
	}
}
