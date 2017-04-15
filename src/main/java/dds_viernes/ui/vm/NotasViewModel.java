package dds_viernes.ui.vm;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import dds_viernes.Mensajes;
import dominio.Asignacion;
import scala.collection.parallel.ParIterableLike.Foreach;

public class NotasViewModel {

	private String token;
	public ArrayList<Asignacion> asignaciones;
	
	public NotasViewModel() {
		asignaciones = new ArrayList<>();
	}
	
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
		recibirNotas();
		
	}
	
	public ArrayList<Asignacion> getAsignaciones(){
		return asignaciones; 
	}
	
	private void recibirNotas() {
		Mensajes mensajero = new Mensajes();
		String respuesta = mensajero.getStudentAssignments(token).getEntity(String.class);
		try {
			HashMap<String, ArrayList<Asignacion>> result =
			        new ObjectMapper().readValue(respuesta, HashMap.class);
			
			//asignacion.setNombre(result.get("first_name").toString());

			asignaciones = result.get("assignments");
			//	asignaciones = (result.get("asignments")).toList();
			/*for (Asignacion asignacion : asignaciones) {
				
			}*/
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
