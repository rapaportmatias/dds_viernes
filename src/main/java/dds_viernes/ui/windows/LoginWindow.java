package dds_viernes.ui.windows;

import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;
import dds_viernes.ui.vm.LoginViewModel;;

public class LoginWindow extends SimpleWindow<LoginViewModel> {

	private static final long serialVersionUID = 1L;

	private Button ingresar;
	
	public LoginWindow(WindowOwner parent) {
		super(parent, new LoginViewModel());
	}
	
	@Override
	protected void createFormPanel(Panel mainPanel) {
		this.setTitle("Login");
		mainPanel.setLayout(new VerticalLayout());
		new Label(mainPanel).setText("Ingrese token").setWidth(200);
		new TextBox(mainPanel).bindValueToProperty("token");
		ingresar = new Button(mainPanel).setCaption("Ingresar");
	}
	
	@Override
	protected void addActions(Panel panelActions) {
		ingresar.onClick(this::abrirMenu);
	}

	public void abrirMenu() {
		Dialog<?> dialog = new MenuWindow(this);
		dialog.open();
		dialog.onAccept(() -> {});
	}
}
