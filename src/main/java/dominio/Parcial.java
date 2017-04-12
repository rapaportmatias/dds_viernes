package dominio;

public class Parcial implements Tarea{
	private Nota nota;
	
	public Parcial(Nota nota){
		this.nota = nota;
	}
	
	public void setNota(String nota) {
		this.nota.setNota(nota);
	}
	
	public String getNota() {
		return nota.getNota();
	}
}
