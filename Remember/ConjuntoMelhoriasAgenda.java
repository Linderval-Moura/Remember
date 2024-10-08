package Remember;

import java.util.Set;

import Remember.Lembrete.LembreteImportante;
import Remember.Lembrete.LembreteRecorrente;
import Remember.PadraoDecorator.Componente;
import Remember.Tarefa.DuracaoTarefa;
import Remember.Tarefa.HabitoTarefa;

/*
 * Classe para implementar o padrão Abstract Method
 */
public class ConjuntoMelhoriasAgenda implements ConjuntoMelhoriasFactory{

	@Override
    public Componente setImportancia(Componente componente, String descricao) {
        return new LembreteImportante(componente, descricao);
    }

    @Override
    public Componente setRecorrencia(Componente componente, String descricao, Set<DiaDaSemana> diasDaSemana) {
        return new LembreteRecorrente(componente, descricao, diasDaSemana);
    }
	
	@Override
	public Componente setDuracao(Componente componente, String descricao, Double inicio, Double fim) {
		return new DuracaoTarefa(componente, descricao, inicio, fim);
	}
	
	@Override
	public Componente setHabito(Componente componente, String descricao, Set<DiaDaSemana> diasDaSemana) {
		return new HabitoTarefa(componente, descricao, diasDaSemana);
	}

}
