package Remember;

import java.util.Date;

public class Tarefa implements Observer {
    private String titulo;
    private String descricao;
    private Date data;

    public Tarefa(String titulo, String descricao, Date data) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.data = data;
    }

	@Override
	public void atualizar(int data) {
		
		System.out.println("Tarefa: " + titulo + " - " + descricao + " - Início: " + data);
    
		
	}

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

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
}
