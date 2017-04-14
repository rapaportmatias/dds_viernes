package dds_viernes.ui.windows;

import java.awt.Color;


import org.uqbar.arena.layout.HorizontalLayout;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

import dds_viernes.ui.vm.MenuViewModel;

public class MenuWindow extends SimpleWindow<MenuViewModel>{
		
	private static final long serialVersionUID = 1L;

	private Button notasButton;
	private Button datosButton;

	public MenuWindow(WindowOwner parent) {
		super(parent, new MenuViewModel());
	}

	@Override
	protected void createFormPanel(Panel mainPanel) {
		this.setTitle("Menu");
		mainPanel.setLayout(new HorizontalLayout());
		Panel izqPanel = new Panel(mainPanel);
		Panel derPanel = new Panel(mainPanel);
		notasButton = new Button(izqPanel).setCaption("Ver Notas");
		datosButton = new Button(izqPanel).setCaption("Actualizar Datos");
		new Label(derPanel).setBackground(Color.PINK).setWidth(300).setHeight(200);
		
		
	}
	
	public void abrirNotas() {
		Dialog<?> dialog = new NotasWindow(this);
		dialog.open();
		dialog.onAccept(() -> {});
	}
	
	public void abrirDatos() {
		Dialog<?> dialog = new DatosWindow(this);
		dialog.open();
		dialog.onAccept(() -> {});
	}

	@Override
	protected void addActions(Panel actionsPanel) {
		notasButton.onClick(this::abrirNotas);
		datosButton.onClick(this::abrirDatos);
	}
	
}
