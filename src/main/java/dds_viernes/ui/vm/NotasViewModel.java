package dds_viernes.ui.vm;

import org.uqbar.commons.utils.Observable;

import com.google.gson.Gson;

import dds_viernes.Mensajes;
import dominio.Alumno;
import dominio.Asignacion;

@Observable
public class NotasViewModel {

	private String token;
	private Alumno alumno;
	
	public NotasViewModel() { }
	
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
		recibirNotas();
	}

	private void recibirNotas() {
		Mensajes mensajero = new Mensajes();
		String respuesta = mensajero.getStudentAssignments(token).getEntity(String.class);
		Gson gson = new Gson();		alumno = gson.fromJson(respuesta, Alumno.class);
	}
	
	public Asignacion[] getAsignaciones() {
		return alumno.getAssignments();
	}
}
