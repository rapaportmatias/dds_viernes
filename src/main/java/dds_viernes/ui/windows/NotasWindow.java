package dds_viernes.ui.windows;

import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.WindowOwner;

import dds_viernes.ui.vm.NotasViewModel;

public class NotasWindow extends Dialog<NotasViewModel> {
	
	public NotasWindow(WindowOwner owner) {
		super(owner, new NotasViewModel());
	}

	@Override
	public void createContents(Panel mainPanel) {
		this.setTitle("Notas");			
		
	}

	@Override
	protected void createFormPanel(Panel mainPanel) {
		// TODO Auto-generated method stub
		
	}

}
