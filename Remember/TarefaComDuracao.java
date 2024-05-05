package Remember;

import java.util.Date;

public class TarefaComDuracao extends Decorator implements Observer {
    
    public TarefaComDuracao(Componente componente) {
        super(componente);
		titulo = "Tarefa Com Duracao ";
        descricao = "Tarefa das 17h às 19h";
        data = new Date();
    }

	@Override
	public void atualizar(int data) {
		
		System.out.println("Tarefa: " + titulo + " - " + descricao + " - Início: " + data);
    
	}
}
