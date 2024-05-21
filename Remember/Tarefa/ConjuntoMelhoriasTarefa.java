package Remember.Tarefa;

import Remember.Componente;
import Remember.ConjuntoMelhoriasFactory;

public class ConjuntoMelhoriasTarefa implements ConjuntoMelhoriasFactory{
	
	@Override
	public Componente setDuracao(Componente componente, String descricao, Double inicio, Double fim) {
		return new DuracaoTarefa(componente, descricao, inicio, fim);
	}
	
	@Override
	public Componente setHabito(Componente componente, String descricao, Double inicio, Double fim) {
		return new HabitoTafera(componente, descricao, inicio, fim);
	}

}
