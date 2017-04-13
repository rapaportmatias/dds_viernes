package dds_viernes;

import org.uqbar.arena.Application;
import org.uqbar.arena.windows.Window;

import dds_viernes.ui.windows.LoginWindow;



public class LectorNotasApplication extends Application{

	public static void main(String[] args) {		
		new LectorNotasApplication().start();
		 
	}
	
	@Override
	protected Window<?> createMainWindow() {
		return new LoginWindow(this);
	}
}

