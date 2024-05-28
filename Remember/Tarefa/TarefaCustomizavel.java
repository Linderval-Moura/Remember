package Remember.Tarefa;

import java.util.Date;
import Remember.Componente;
import Remember.ConjuntoMelhoriasFactory;
import java.util.EnumSet;
import Remember.DiaDaSemana;

public class TarefaCustomizavel extends Componente {

	private ConjuntoMelhoriasFactory melhorias;
	private EnumSet<DiaDaSemana> diasDaSemana;
	
    public TarefaCustomizavel(ConjuntoMelhoriasFactory melhorias) {
		this.titulo = "Completar projeto";
		this.descricao = "Terminar a implementação do aplicativo";
		this.data = new Date();
		this.melhorias = melhorias;
		this.diasDaSemana = EnumSet.noneOf(DiaDaSemana.class);
    }
    
    public Componente montar() {

		Componente componente = melhorias.setDuracao(this, descricao, inicio, fim);
		componente = melhorias.setHabito(componente, descricao, inicio, fim, diasDaSemana);
		
		return componente;

	}

	// public void atualizar(int data) {
		
	// 	System.out.println("Tarefa: " + titulo + " - " + descricao + " - Início: " + data);
    
	// }

}
