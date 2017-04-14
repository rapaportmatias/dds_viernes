package dds_viernes.ui.windows;

import org.uqbar.arena.layout.HorizontalLayout;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

import dds_viernes.ui.vm.MenuViewModel;

public class MenuWindow extends SimpleWindow<MenuViewModel> {

	private static final long serialVersionUID = 1L;

	private Button notasButton;
	private Button datosButton;
	private WindowOwner parent;
	private static MenuViewModel menuVM = new MenuViewModel();

	public MenuWindow(WindowOwner parent, String token) {
		super(parent, menuVM);
		this.parent = parent;
		menuVM.setToken(token);
	}

	@Override
	protected void createFormPanel(Panel mainPanel) {
		this.setTitle("Menu");
		mainPanel.setLayout(new HorizontalLayout());
		Panel izqPanel = new Panel(mainPanel);
		Panel derPanel = new Panel(mainPanel);
		izqPanel.setLayout(new VerticalLayout());
		derPanel.setLayout(new VerticalLayout());
		new Label(izqPanel).setText("Nombre:").setWidth(150);
		new Label(izqPanel).bindValueToProperty("nombre");
		new Label(izqPanel).setText("Legajo:").setWidth(150);
		new Label(izqPanel).bindValueToProperty("legajo");
		new Label(derPanel).setText("Apellido:").setWidth(150);
		new Label(derPanel).bindValueToProperty("apellido");
		new Label(derPanel).setText("Usuario Git:").setWidth(150);
		new Label(derPanel).bindValueToProperty("usuarioGit");
		notasButton = new Button(izqPanel).setCaption("Ver Notas");
		datosButton = new Button(derPanel).setCaption("Actualizar Datos");
	}

	public void abrirNotas() {
		NotasWindow notasWindow = new NotasWindow(this.parent, getMenuVM().getToken());
		this.close();
		notasWindow.open();
	}

	public void abrirDatos() {
		DatosWindow datosWindow = new DatosWindow(this.parent, getMenuVM().getToken());
		this.close();
		datosWindow.open();
	}

	@Override
	protected void addActions(Panel actionsPanel) {
		notasButton.onClick(this::abrirNotas);
		datosButton.onClick(this::abrirDatos);
	}

	public static MenuViewModel getMenuVM() {
		return menuVM;
	}
}
