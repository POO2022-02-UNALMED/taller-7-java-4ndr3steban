package comunicacion;

public class Periodico extends Escrito{
	
	private String fecha;
	private String primicia;
	private String interpretacion;
	
	public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String pri, String inter) {
		super(origen, titulo, autor, paginas);
		this.fecha = fecha;
		this.primicia = pri;
		this.interpretacion = inter;
	}
	
	
	public int palabrasTotales(int palabras) {
		
		int res = super.getPaginas()*palabras*10;
		
		return res;
	}
	
	public String interpretacion() {
		
		return interpretacion;
	}
	
	public String toString() {
		
		String res = super.getOrigen()+"\n"+super.getTitulo()+"\n"+super.getAutor()+"\n"+super.getPaginas()+"\n"+
					this.fecha+"\n"+this.primicia;
		
		return res;
	}
	
	
	
	public String getFecha() {
		return fecha;
	}
	
	public String getPrimicia() {
		return primicia;
	}
	
	
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	public void setPrimicia(String prim) {
		this.primicia = prim;
	}
	
	public void setInterpretacion(String inter) {
		this.interpretacion = inter;
	}
	
}
