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

	public MenuWindow(WindowOwner parent) {
		super(parent, new MenuViewModel());
		this.parent = parent;
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
		new Label(izqPanel).setText("Aca va el nombre");
		new Label(izqPanel).setText("Legajo:").setWidth(150);
		new Label(izqPanel).setText("Aca va el legajo");
		new Label(derPanel).setText("Apellido:").setWidth(150);
		new Label(derPanel).setText("Aca va el apellido");
		new Label(derPanel).setText("Usuario Git:").setWidth(150);
		new Label(derPanel).setText("Aca va el usuario");
		notasButton = new Button(izqPanel).setCaption("Ver Notas");
		datosButton = new Button(derPanel).setCaption("Actualizar Datos");
	}

	public void abrirNotas() {
		NotasWindow notasWindow = new NotasWindow(this.parent);
		this.close();
		notasWindow.open();
	}

	public void abrirDatos() {
		DatosWindow datosWindow = new DatosWindow(this.parent);
		this.close();
		datosWindow.open();
	}

	@Override
	protected void addActions(Panel actionsPanel) {
		notasButton.onClick(this::abrirNotas);
		datosButton.onClick(this::abrirDatos);
	}
}
