package comunicacion;

public class Tesis extends Escrito{
	
	private String idea;
	private String[] argumentos;
	private String conclusion;
	private String referencias;
	private String interpretacion;
	
	public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] args, String conc, String ref, String inter) {
		super(origen, titulo, autor, paginas);
		this.idea = idea;
		this.argumentos = args;
		this.conclusion = conc;
		this.referencias = ref;
		this.interpretacion= inter;
	}
	
	
	public int palabrasTotales(int palabras) {
		
		int res = super.getPaginas()*palabras*5;
		
		return res;
	}
	
	public String interpretacion() {
		
		return interpretacion;
	}
	
	public String toString() {
		
		String res = super.getOrigen()+"\n"+super.getTitulo()+"\n"+super.getAutor()+"\n"+super.getPaginas()+"\n"+
					this.idea+"\n"+this.argumentos.length+"\n"+this.conclusion+"\n"+this.referencias;
		
		return res;
	}
	
	
	
	
	public String getIdea() {
		return idea;
	}
	
	public String[] getArgumentos() {
		return argumentos;
	}
	
	public String getConclusion() {
		return conclusion;
	}
	
	public String getReferencias() {
		return referencias;
	}
	
	
	
	public void setIdea(String idea) {
		this.idea = idea;
	}
	
	public void setArgumentos(String[] args) {
		this.argumentos = args;
	}
	
	public void setConclusion(String conc) {
		this.conclusion = conc;
	}
	
	public void setReferencias(String ref) {
		this.referencias = ref;
	}
	
	public void setInterpretacion(String inter) {
		this.interpretacion = inter;
	}
	
}
