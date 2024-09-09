package Remember;

import java.util.Set;

import Remember.PadraoDecorator.Componente;

public interface ConjuntoMelhoriasFactory {
	
	Componente setDuracao(Componente componente, String descricao, Double inicio, Double fim);
	Componente setHabito(Componente componente, String descricao, Set<DiaDaSemana> diasDaSemana);

	Componente setImportancia(Componente componente, String descricao);
    Componente setRecorrencia(Componente componente, String descricao, Set<DiaDaSemana> diasDaSemana);
	
}
