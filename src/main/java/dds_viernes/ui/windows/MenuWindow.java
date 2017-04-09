package dds_viernes.ui.windows;

import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.WindowOwner;

import dds_viernes.ui.vm.MenuViewModel;

public class MenuWindow extends Dialog<MenuViewModel> {
		
	public MenuWindow(WindowOwner owner) {
		super(owner, new MenuViewModel());
	}

	@Override
	public void createContents(Panel mainPanel) {
		this.setTitle("Menu");
		mainPanel.setLayout(new VerticalLayout());	
		
		new Button(mainPanel)
		.setCaption("Ver notas")
		.onClick(this::abrirNotas);
		
		new Button(mainPanel)
		.setCaption("Actualizar datos")
		.onClick(this::abrirDatos);
		
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
	protected void createFormPanel(Panel mainPanel) {
		// TODO Auto-generated method stub
		
	}
}
