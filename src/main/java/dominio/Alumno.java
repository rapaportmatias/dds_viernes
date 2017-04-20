package dominio;

public class Alumno {
	
	private String first_name;
	private String last_name;
	private String code;
	private String github_user;
	private Asignacion[] assignments;
	
	public Alumno(String nombre, String apellido, String legajo, String usuarioGit){
		this.first_name = nombre;
		this.last_name = apellido;
		this.code = legajo;
		this.github_user = usuarioGit;
	}
	
	public Alumno(Asignacion[] assignments) {
		this.assignments = assignments;
	}
	
	public Alumno() {
		
	}

	public String getFirst_name() {
		return first_name;
	}
	
	public String getLast_name() {
		return last_name;
	}

	public String getCode() {
		return code;
	}

	public String getGithub_user() {
		return github_user;
	}
	
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setGithub_user(String github_user) {
		this.github_user = github_user;
	}

	public Asignacion[] getAssignments() {
		return assignments;
	}
}  
