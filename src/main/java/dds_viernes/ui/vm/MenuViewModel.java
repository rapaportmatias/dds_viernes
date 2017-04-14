package dds_viernes.ui.vm;

import java.io.IOException;
import java.util.HashMap;

import org.uqbar.commons.utils.Observable;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

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
	
	private void recibirDatosAlumno() {
		Mensajes mensajero = new Mensajes();
		String respuesta = mensajero.getStudent(token).getEntity(String.class);
		try {
			HashMap<String,Object> result =
			        new ObjectMapper().readValue(respuesta, HashMap.class);
			
			alumno.setNombre(result.get("first_name").toString());
			alumno.setApellido(result.get("last_name").toString());
			alumno.setLegajo(result.get("code").toString());
			alumno.setUsuarioGit(result.get("github_user").toString());
			
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
