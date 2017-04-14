package dds_viernes.ui.windows;

import org.uqbar.arena.layout.HorizontalLayout;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

import dds_viernes.ui.vm.NotasViewModel;

public class NotasWindow extends SimpleWindow<NotasViewModel> {
	
	private static final long serialVersionUID = 1L;
	
	private Button returnButton;
	private WindowOwner parent;

	public NotasWindow(WindowOwner parent) {
		super(parent, new NotasViewModel());
		this.parent = parent;
	}

	@Override
	protected void createFormPanel(Panel mainPanel) {
		this.setTitle("Notas");	
		mainPanel.setLayout(new HorizontalLayout());
		Panel verticalPanel = new Panel(mainPanel);
		verticalPanel.setLayout(new VerticalLayout());
		
		Panel firstPanel = new Panel(verticalPanel);
		firstPanel.setLayout(new HorizontalLayout());
		new Label(firstPanel).setText("Titulo/s:").setWidth(100);
		new Label(firstPanel).setText("Nota/s:").setWidth(100);
		new Label(firstPanel).setText("Aprobacion:").setWidth(100);
		
		Panel secondPanel = new Panel(verticalPanel);
		secondPanel.setLayout(new HorizontalLayout());
		new Label(secondPanel).setText("Era mas facil").setWidth(100);
		new Label(secondPanel).setText("Era mas facil").setWidth(100);
		new Label(secondPanel).setText("Era mas facil").setWidth(100);
		
		Panel thirdPanel = new Panel(verticalPanel);
		thirdPanel.setLayout(new HorizontalLayout());
		new Label(thirdPanel).setText("Era mas facil").setWidth(100);
		new Label(thirdPanel).setText("Era mas facil").setWidth(100);
		new Label(thirdPanel).setText("Era mas facil").setWidth(100);
		
		Panel fourthPanel = new Panel(verticalPanel);
		fourthPanel.setLayout(new HorizontalLayout());
		new Label(fourthPanel).setText("Era mas facil").setWidth(100);
		new Label(fourthPanel).setText("Era mas facil").setWidth(100);
		new Label(fourthPanel).setText("Era mas facil").setWidth(100);
		
		returnButton = new Button(verticalPanel).setCaption("Volver");
	}

	@Override
	protected void addActions(Panel actionsPanel) {
		returnButton.onClick(this::abrirMenu);
	}

	protected void abrirMenu() {
		MenuWindow menuWindow = new MenuWindow(this.parent);
		this.close();
		menuWindow.open();
	}
}
