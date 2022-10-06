package comunicacion;

public class Fabula extends Escrito{
	
	private String ensenanza;
	private String interpretacion;
	
	public Fabula(String origen, String titulo, String autor, int paginas, String enz, String inter) {
		super(origen, titulo, autor, paginas);
		this.ensenanza = enz;
		this.interpretacion = inter;
	}
	
	public int palabrasTotales(int palabras) {
		
		int res = super.getPaginas()*palabras*1;
		
		return res;
	}
	
	public String interpretacion() {
		
		return interpretacion;
	}
	
	public String toString() {
		
		String res = super.getOrigen()+"\n"+super.getTitulo()+"\n"+super.getAutor()+"\n"+super.getPaginas()+"\n"+
					this.ensenanza;
		
		return res;
	}
	
	
	
	public String getEnsenanza() {
		return ensenanza;
	}
	
	
	public void setEnsenanza(String ensen) {
		this.ensenanza = ensen;
	}
	
	public void setInterpretacion(String inter) {
		this.interpretacion = inter;
	}
	
	
	
}
