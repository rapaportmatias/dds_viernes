package dominio;

public class NotaNumerica implements Nota{
	private String nota;
	
	public NotaNumerica(){
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
		return  nota == "1" || nota == "2" 
			 || nota == "3" || nota == "4" || nota == "5"
			 || nota == "6" || nota == "7" || nota == "8"
			 || nota == "9" || nota == "10";
	}
}
