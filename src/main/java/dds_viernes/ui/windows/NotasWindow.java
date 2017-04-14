package dds_viernes.ui.windows;

import java.awt.Color;

import org.uqbar.arena.layout.HorizontalLayout;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Label;
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
		mainPanel.setLayout(new HorizontalLayout());
		Panel nombre = new Panel(mainPanel);
		nombre.setLayout(new VerticalLayout());
		new Label(nombre).setText("Titulo");
		new Label(nombre).setText("Era mas facil").setBackground(Color.WHITE).setWidth(100);
		Panel notas = new Panel(mainPanel);
		notas.setLayout(new VerticalLayout());
		new Label(notas).setText("Nota");
		new Label(notas).setText("Era mas facil").setBackground(Color.WHITE).setWidth(100);
		new Label(notas).setText("Era mas facil").setBackground(Color.WHITE).setWidth(100);
		new Label(notas).setText("Era mas facil").setBackground(Color.WHITE).setWidth(100);
		Panel aprobacion = new Panel(mainPanel);
		aprobacion.setLayout(new VerticalLayout());
		new Label(aprobacion).setText("No/Aprobado");
		new Label(aprobacion).setText("Era mas facil").setBackground(Color.WHITE).setWidth(100);
		new Label(aprobacion).setText("Era mas facil").setBackground(Color.WHITE).setWidth(100);
		new Label(aprobacion).setText("Era mas facil").setBackground(Color.WHITE).setWidth(100);
	}

	@Override
	protected void createFormPanel(Panel mainPanel) {
		// TODO Auto-generated method stub
		
	}

}
