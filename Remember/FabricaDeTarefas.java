package Remember;

import Remember.Tarefa.TarefaCustomizavel;
import Remember.Lembrete.LembreteSimples;

/*
 * Interface para implementar o padrão Factory Method
 * 
 */
public class FabricaDeTarefas implements InterfaceFabrica {
	
	private ConjuntoMelhoriasFactory melhorias = new ConjuntoMelhoriasTarefa();
   
    @Override
	public Componente getTarefa(int e) {

		if(e == 1)
			return new LembreteSimples(melhorias);
		
		else if(e == 2)
			return new TarefaCustomizavel(melhorias);
		
		return null;
	}
}
