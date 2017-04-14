package dds_viernes.ui.windows;

import java.awt.Color;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.uqbar.arena.layout.HorizontalLayout;
import org.uqbar.arena.layout.Layout;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

import dds_viernes.ui.vm.MenuViewModel;

public class MenuWindow extends SimpleWindow<MenuViewModel> {

	private static final long serialVersionUID = 1L;

	private Button notasButton;
	private Button datosButton;
	WindowOwner nico;

	public MenuWindow(WindowOwner parent) {
		super(parent, new MenuViewModel());
		nico=parent;
	}

	@Override
	protected void createFormPanel(Panel mainPanel) {
		this.setTitle("Menu");
		mainPanel.setLayout(new HorizontalLayout());
		Panel izqPanel = new Panel(mainPanel);
		Panel derPanel = new Panel(mainPanel);
		izqPanel.setLayout(new VerticalLayout());
		derPanel.setLayout(new VerticalLayout());
		new Label(izqPanel).setText("Nombre:");
		new Label(izqPanel).setBackground(Color.WHITE);
		new Label(izqPanel).setText("Legajo:");
		new Label(izqPanel).setBackground(Color.WHITE);
		new Label(derPanel).setText("Apellido:");
		new Label(derPanel).setBackground(Color.WHITE);
		new Label(derPanel).setText("Usuario Git:");
		new Label(derPanel).setBackground(Color.WHITE);
		notasButton = new Button(izqPanel).setCaption("Ver Notas");
		datosButton = new Button(derPanel).setCaption("Actualizar Datos");

	}

	public void abrirNotas() {
		Dialog<?> dialog = new NotasWindow(nico);
		dialog.open();
		dialog.onAccept(() -> {
		});
	}

	public void abrirDatos() {
		Dialog<?> dialog = new DatosWindow(this);
		dialog.open();
		dialog.onAccept(() -> {
		});
	}

	@Override
	protected void addActions(Panel actionsPanel) {
		notasButton.onClick(this::abrirNotas);
		datosButton.onClick(this::abrirDatos);
	}

}
