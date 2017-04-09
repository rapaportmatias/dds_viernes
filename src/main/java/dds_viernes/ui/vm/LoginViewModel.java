package dds_viernes.ui.vm;

import org.uqbar.commons.utils.Observable;

@Observable
public class LoginViewModel {
	
	private String token;
	
	public LoginViewModel() {
		super();
	}

	// ********************************************************
	// ** Acciones
	// ********************************************************	
	
	// ********************************************************
	// ** Atributos
	// ********************************************************

	public String getToken() {
		return this.token;
	}

	public void setMillas(String token) {
		this.token = token;
	}
	
}
