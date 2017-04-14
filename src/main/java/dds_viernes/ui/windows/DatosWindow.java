package dds_viernes.ui.windows;

import java.awt.Color;

import org.uqbar.arena.layout.HorizontalLayout;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.WindowOwner;

import dds_viernes.ui.vm.DatosViewModel;

public class DatosWindow extends Dialog<DatosViewModel> {
	
	
	private static final long serialVersionUID = 1L;
	
	public DatosWindow(WindowOwner owner) {
		super(owner, new DatosViewModel());
	}

	@Override
	public void createContents(Panel mainPanel) {
	
	}

	@Override
	protected void createFormPanel(Panel mainPanel) {
		// TODO Auto-generated method stub
		this.setTitle("Datos");			

	}

}