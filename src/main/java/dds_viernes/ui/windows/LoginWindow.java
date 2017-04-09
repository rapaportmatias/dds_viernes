package dds_viernes.ui.windows;

import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.MainWindow;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;
import org.uqbar.commons.utils.Observable;

import dds_viernes.ui.vm.LoginViewModel;;

public class LoginWindow extends SimpleWindow<LoginViewModel> {

	public LoginWindow(WindowOwner parent) {
		super(parent, new LoginViewModel());
	}
	
	@Override
	protected void addActions(Panel panelActions) {
		new Button(panelActions)
		.setCaption("Ingresar")
		.onClick(this::abrirMenu);
	}

	public void abrirMenu() {
		Dialog<?> dialog = new MenuWindow(this);
		dialog.open();
		dialog.onAccept(() -> {});
	}

	@Override
	protected void createFormPanel(Panel mainPanel) {
		// TODO Auto-generated method stub
		this.setTitle("Login");
		mainPanel.setLayout(new VerticalLayout());

		new Label(mainPanel).setText("Ingrese token");

		new TextBox(mainPanel).bindValueToProperty("token");	
		
	}


}
