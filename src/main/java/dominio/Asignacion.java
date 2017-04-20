package dominio;

public class Asignacion {
	
	private int id;
	private String[] grades;	
	private String description;
	private String title;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String[] getGrades() {
		return grades;
	}
	
	public void setGrades(String[] grades) {
		this.grades = grades;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getLastGrade() {
		if(grades.length == 0) {
			return "No hay notas";
		}
		return grades[grades.length - 1];
	}
}
