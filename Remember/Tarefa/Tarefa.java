package Remember.Tarefa;

import java.util.Date;
import Remember.PadraoDecorator.Componente;
import Remember.ConjuntoMelhoriasFactory;
import java.util.EnumSet;
import Remember.DiaDaSemana;

/*
 * Classe Componente
 */
public class Tarefa extends Componente {

	private final ConjuntoMelhoriasFactory melhorias;
	
    public Tarefa(ConjuntoMelhoriasFactory melhorias) {
		this.titulo = "Completar projeto";
		this.descricao = "Implementação do aplicativo";
		this.data = new Date();
		this.melhorias = melhorias;
    }
    
    public Componente montar() {

		Componente componente = melhorias.setDuracao(
			this,
			"\nDuração para Terminar Testes",
			17.30, 18.40);
			
		componente = melhorias.setHabito(
			componente,
			"\nHábito Estudar Java",
			EnumSet.of(DiaDaSemana.SEGUNDA, DiaDaSemana.QUARTA, DiaDaSemana.DOMINGO)
		);
		
		return componente;

	}

	// public void atualizar(int data) { Essa parte não será usada
		
	// 	System.out.println("Tarefa: " + titulo + " - " + descricao + " - Início: " + data);
    
	// }

}
