package dds_viernes.ui.vm;

import java.util.ArrayList;
import java.util.List;

import dominio.Asignacion;

public class NotasViewModel {

	private String token;
	private List<Asignacion> asignaciones;

	public NotasViewModel() {
		asignaciones = new ArrayList<>();
	}
	
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
}
