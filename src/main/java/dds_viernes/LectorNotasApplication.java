package dds_viernes;

import org.uqbar.arena.Application;
import org.uqbar.arena.windows.Window;

import dds_viernes.ui.windows.LoginWindow;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;


public class LectorNotasApplication extends Application{

	public static void main(String[] args) {		
		new LectorNotasApplication().start();
		 
	}
	
	@Override
	protected Window<?> createMainWindow() {
		return new LoginWindow(this);
	}
}

