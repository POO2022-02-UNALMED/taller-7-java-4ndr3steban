package comunicacion;

public class Libro extends Escrito {
	private String co_autor;
	private String editorial;
	private String edicion;
	private String interpretacion;
	
	
	public Libro(String origen, String titulo, String autor, int paginas, String coa, String edit, String edic, String inter) {
		super(origen, titulo, autor, paginas);
		this.co_autor = coa;
		this.editorial = edit;
		this.edicion = edic;
		this.interpretacion = inter;
	}
	
	public int palabrasTotales(int palabras) {
		
		int res = super.getPaginas()*palabras*2;
		
		return res;
	}
	
	public String interpretacion() {
		
		return interpretacion;
	}
	
	public String toString() {
		
		String res = super.getOrigen()+"\n"+super.getTitulo()+"\n"+super.getAutor()+"\n"+super.getPaginas()+"\n"+
					this.co_autor+"\n"+this.editorial+"\n"+this.edicion;
		
		return res;
	}
	
	
	
	public String getCo_autor() {
		return co_autor;
	}
	
	public String getEditorial() {
		return editorial;
	}
	
	public String getEdicion() {
		return edicion;
	}
	
	
	public void setCo_autor(String coa) {
		this.co_autor = coa;
	}
	
	public void setEditorial(String edit) {
		this.editorial = edit;
	}
	
	public void setEdicion(String edic) {
		this.edicion = edic;
	}
	
	public void setInterpretacion(String inter) {
		this.interpretacion = inter;
	}
	
	
}
