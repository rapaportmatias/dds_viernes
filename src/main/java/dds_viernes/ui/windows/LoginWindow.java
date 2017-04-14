package dds_viernes.ui.windows;

import org.uqbar.arena.layout.HorizontalLayout;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;
import dds_viernes.ui.vm.LoginViewModel;;

public class LoginWindow extends SimpleWindow<LoginViewModel> {

	private static final long serialVersionUID = 1L;

	private Button ingresar;
	WindowOwner parent;
	
	public LoginWindow(WindowOwner parent) {
		super(parent, new LoginViewModel());
		this.parent = parent;
	}
	
	@Override
	protected void createFormPanel(Panel mainPanel) {
		this.setTitle("Login");
		mainPanel.setLayout(new HorizontalLayout());
		Panel panel = new Panel(mainPanel);
		panel.setLayout(new VerticalLayout());
		new Label(panel).setText("Ingrese su token:").setWidth(200);
		new TextBox(panel).bindValueToProperty("token");
		ingresar = new Button(panel).setCaption("Iniciar Sesion");
	}
	
	@Override
	protected void addActions(Panel panelActions) {
		ingresar.onClick(this::abrirMenu);
	}

	public void abrirMenu() {
		MenuWindow menuWindow = new MenuWindow(this.parent);
		this.close();
		menuWindow.open();
	}
}
