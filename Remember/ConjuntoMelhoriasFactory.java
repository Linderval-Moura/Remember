package Remember;

import java.util.Set;

public interface ConjuntoMelhoriasFactory {
	
	Componente setDuracao(Componente componente, String descricao, Double inicio, Double fim);
	Componente setHabito(Componente componente, String descricao, Double inicio, Double fim, Set<DiaDaSemana> diasDaSemana);

	Componente setLembreteImportanteDecorator(Componente componente, String descricao, Double inicio, Double fim);
	Componente setHabito(Componente componente, String descricao, Double inicio, Double fim, Set<DiaDaSemana> diasDaSemana);

	
}
