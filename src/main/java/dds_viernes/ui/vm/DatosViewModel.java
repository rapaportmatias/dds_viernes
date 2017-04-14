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
		alumno.setNombre(nombre);
	}

	public void setApellido(String apellido) {
		alumno.setApellido(apellido);
	}
	
	public void setLegajo(String legajo) {
		alumno.setLegajo(legajo);
	}

	public void setUsuarioGit(String usuarioGit) {
		alumno.setUsuarioGit(usuarioGit);
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
