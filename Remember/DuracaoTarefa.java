package Remember;

import java.util.Date;

public class DuracaoTarefa extends Decorator implements Observer {
    
    public DuracaoTarefa(Componente componente, String descricao, Double inicio, Double fim) {
        super(componente);
		titulo = "Tarefa Com Duracao";
		this.descricao = descricao;
        data = new Date().toString();
		this.inicio = inicio;
		this.fim = fim;
    }

	// @Override
    // public void setDescricao(String novadescricao) {
    //     descricao = novadescricao + " (das " + inicio + "h às " + fim + "h)";

    // }

	@Override
	public void atualizar(Double novoinicio) {

		this.descricao = descricao + " (das " + novoinicio + "h às " + fim + "h)";
		this.inicio = novoinicio;
		
		System.out.println("Tarefa: " + titulo + " - " + descricao + " - Início: " + inicio);
    
	}
}
