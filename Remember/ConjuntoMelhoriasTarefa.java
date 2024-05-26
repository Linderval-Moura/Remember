package Remember;

import java.util.Set;

import Remember.Tarefa.DuracaoTarefa;
import Remember.Tarefa.HabitoTarefa;

public class ConjuntoMelhoriasTarefa implements ConjuntoMelhoriasFactory{
	
	@Override
	public Componente setDuracao(Componente componente, String descricao, Double inicio, Double fim) {
		return new DuracaoTarefa(componente, descricao, inicio, fim);
	}
	
	@Override
	public Componente setHabito(Componente componente, String descricao, Double inicio, Double fim, Set<DiaDaSemana> diasDaSemana) {
		return new HabitoTarefa(componente, descricao, inicio, fim, diasDaSemana);
	}

}
