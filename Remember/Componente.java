package Remember;

/*
 * Classe para implementar o padrão Decorator
 * 
 */
public class Componente {
	
	protected String titulo;
	protected String descricao;
	protected String data;
	protected Double inicio;
	protected Double fim;
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getData() {
		// Formata a data para o padrão brasileiro
		//SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}

	public Double getInicio() {
		// Formata a data para o padrão brasileiro
		//SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return inicio;
	}
	
	public void setInicio(Double inicio) {
		this.inicio = inicio;
	}

	public Double getFim() {
		// Formata a data para o padrão brasileiro
		//SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return fim;
	}
	
	public void setFim(Double fim) {
		this.fim = fim;
	}

}
