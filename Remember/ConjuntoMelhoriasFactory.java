package Remember;

import java.util.Date;
import java.util.Set;

public interface ConjuntoMelhoriasFactory {
	
	Componente setDuracao(Componente componente, String descricao, Double inicio, Double fim);
	Componente setHabito(Componente componente, String descricao, Double inicio, Double fim, Set<DiaDaSemana> diasDaSemana);

	Componente setImportancia(Componente componente, String descricao);
    Componente setRecorrencia(Componente componente, String descricao, Set<DiaDaSemana> diasDaSemana);
	
}
