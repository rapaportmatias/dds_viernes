package dds_viernes.ui.windows;

import java.util.ArrayList;
import java.util.List;

import org.uqbar.arena.layout.HorizontalLayout;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.tables.Column;
import org.uqbar.arena.widgets.tables.Table;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

import dds_viernes.ui.vm.NotasViewModel;
import dominio.Asignacion;

public class NotasWindow extends SimpleWindow<NotasViewModel> {
	
	private static final long serialVersionUID = 1L;
	
	private Button returnButton;
	private WindowOwner parent;
	private static NotasViewModel notasVM = new NotasViewModel();

	public NotasWindow(WindowOwner parent, String token) {
		super(parent, notasVM);
		this.parent = parent;
		getNotasVM().setToken(token);
	}

	@Override
	protected void createFormPanel(Panel mainPanel) {
		this.setTitle("Notas");	
		mainPanel.setLayout(new HorizontalLayout());
		Panel verticalPanel = new Panel(mainPanel);
		verticalPanel.setLayout(new VerticalLayout());
		
		Table<Asignacion> assignmentsTable = new Table<>(verticalPanel, Asignacion.class);
		assignmentsTable.bindItemsToProperty("asignaciones");
		
		Column<Asignacion> idsColumn = new Column<Asignacion>(assignmentsTable);
		idsColumn.setTitle("Titulo").setFixedSize(100).bindContentsToProperty("title");
	
		Column<Asignacion> descriptionsColumn = new Column<Asignacion>(assignmentsTable);
		descriptionsColumn.setTitle("Descripcion").setFixedSize(200).bindContentsToProperty("description");
		
		Column<Asignacion> gradesColumn = new Column<Asignacion>(assignmentsTable);
		gradesColumn.setTitle("Nota").setFixedSize(100).bindContentsToProperty("lastGrade");
		
		returnButton = new Button(verticalPanel).setCaption("Volver");
	}

	@Override
	protected void addActions(Panel actionsPanel) {
		returnButton.onClick(this::abrirMenu);
	}

	protected void abrirMenu() {
		MenuWindow menuWindow = new MenuWindow(this.parent, getNotasVM().getToken());
		this.close();
		menuWindow.open();
	}

	public static NotasViewModel getNotasVM() {
		return notasVM;
	}
}
