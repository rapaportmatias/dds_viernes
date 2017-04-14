package dds_viernes.ui.windows;

import org.uqbar.arena.layout.HorizontalLayout;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;

import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

import dds_viernes.ui.vm.DatosViewModel;

public class DatosWindow extends SimpleWindow<DatosViewModel> {

	private static final long serialVersionUID = 1L;
	
	private WindowOwner parent;
	private Button actualizar;
	
	public DatosWindow(WindowOwner parent) {
		super(parent, new DatosViewModel());
		this.parent = parent;
	}

	@Override
	protected void createFormPanel(Panel mainPanel) {
		this.setTitle("Actualizacion de datos");
		mainPanel.setLayout(new HorizontalLayout());
		Panel verticalPanel = new Panel(mainPanel);
		verticalPanel.setLayout(new VerticalLayout());
		
		Panel firstLabelPanel = new Panel(verticalPanel);
		firstLabelPanel.setLayout(new HorizontalLayout());
		new Label(firstLabelPanel).setText("Nombre:").setWidth(100);
		new Label(firstLabelPanel).setText("Apellido:").setWidth(100);
		
		Panel firstTextBoxPanel = new Panel(verticalPanel);
		firstTextBoxPanel.setLayout(new HorizontalLayout());
		new TextBox(firstTextBoxPanel).setWidth(100).bindValueToProperty("nombre");
		new TextBox(firstTextBoxPanel).setWidth(100).bindValueToProperty("apellido");
		
		Panel secondLabelPanel = new Panel(verticalPanel);
		secondLabelPanel.setLayout(new HorizontalLayout());
		new Label(secondLabelPanel).setText("Legajo:").setWidth(100);
		new Label(secondLabelPanel).setText("Usuario Git:").setWidth(100);
		
		Panel secondTextBoxPanel = new Panel(verticalPanel);
		secondTextBoxPanel.setLayout(new HorizontalLayout());
		new TextBox(secondTextBoxPanel).setWidth(100).bindValueToProperty("legajo");
		new TextBox(secondTextBoxPanel).setWidth(100).bindValueToProperty("usuarioGit");
		
		actualizar = new Button(verticalPanel).setCaption("Actualizar");
	}

	@Override
	protected void addActions(Panel actionsPanel) {
		actualizar.onClick(this::actualizarDatos);
	}

	protected void actualizarDatos() {
		this.abrirMenu();
	}
	
	protected void abrirMenu() {
		MenuWindow menuWindow = new MenuWindow(this.parent);
		this.close();
		menuWindow.open();
	}
}