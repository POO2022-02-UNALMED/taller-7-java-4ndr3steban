package comunicacion;

public class Alfabeto extends Pictograma{
	
	private String[] letras;
	private String interpretacion;
	
	
	public Alfabeto(String origen, String[] letras, String interp) {
		super(origen);
		this.letras = letras;
		this.interpretacion = interp;
	}
	
	public int cantidadLetras() {
		
		return letras.length;
	}
	
	public String interpretacion() {
		return interpretacion;
	}
	
	public String toString() {
		
		String res = letras[0]+", ";
		for (int i =1; i< letras.length-1 ; i++) {
			res = res+letras[i]+", ";
		}
		
		res = res+letras[letras.length-1];
		
		return res;
	}
	
	

	
	public String[] getLetras() {
		return letras;
	}
	
	
	
	public void setLetras(String[] letras) {
		this.letras = letras;
	}
	
	public void setInterpretacion(String inter) {
		this.interpretacion = inter;
	}
	
	
}
