package dds_viernes.ui.vm;

import org.uqbar.commons.utils.Observable;

import com.google.gson.Gson;

import dds_viernes.Mensajes;
import dominio.Alumno;

@Observable
public class MenuViewModel {

	private String token;
	private Alumno alumno;
	
	public MenuViewModel() {
		this.alumno = new Alumno();
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
		recibirDatosAlumno();
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
	
	private void recibirDatosAlumno() {
		Mensajes mensajero = new Mensajes();
		String respuesta = mensajero.getStudent(token).getEntity(String.class);
		Gson gson = new Gson();
		alumno = gson.fromJson(respuesta, Alumno.class);
	}
}
