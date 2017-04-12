package dominio;

public class NotaConceptual implements Nota{
	private String nota;
	
	public NotaConceptual(){
		nota = "No hay nota";
	}

	public String getNota() {
		return nota;
	}

	public void setNota(String nota) {
		if(esNotaValida(nota))
		this.nota = nota;
	}
	
	private boolean esNotaValida(String nota){
		return  nota == "M" || nota == "B-" || nota == "R+";
	}
}
