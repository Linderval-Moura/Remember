package Remember;

import java.util.Date;

public class Componente {
	
	protected String titulo;
	protected String descricao;
	protected Date data;
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public Date getData() {
		return data;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void setData(Date data) {
		this.data = data;
	}

}
