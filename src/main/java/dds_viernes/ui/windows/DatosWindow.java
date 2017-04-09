package dds_viernes.ui.windows;

import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.WindowOwner;

import dds_viernes.ui.vm.DatosViewModel;

public class DatosWindow extends Dialog<DatosViewModel> {
	
	public DatosWindow(WindowOwner owner) {
		super(owner, new DatosViewModel());
	}

	@Override
	public void createContents(Panel mainPanel) {
		this.setTitle("Datos");			
		
	}

	@Override
	protected void createFormPanel(Panel mainPanel) {
		// TODO Auto-generated method stub
		
	}

}