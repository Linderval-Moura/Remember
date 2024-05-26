package Remember.Tarefa;

import java.util.Date;

import Remember.Componente;
import Remember.ConjuntoMelhoriasFactory;

//  implements Observer
public class TarefaCustomizavel extends Componente {

	private ConjuntoMelhoriasFactory melhorias;
	
    public TarefaCustomizavel(ConjuntoMelhoriasFactory melhorias) {
		this.titulo = "Completar projeto";
		this.descricao = "Terminar a implementação do aplicativo";
		this.data = new Date().toString();
		this.melhorias = melhorias;
    }
    
    public Componente montar() {

		Componente componente = melhorias.setDuracao(this, data, fim, fim);
		componente = melhorias.setHabito(componente, data, fim, fim, null);
		
		return componente;

	}

	// public void atualizar(int data) {
		
	// 	System.out.println("Tarefa: " + titulo + " - " + descricao + " - Início: " + data);
    
	// }

}
