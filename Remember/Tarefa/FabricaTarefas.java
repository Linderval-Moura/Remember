package Remember.Tarefa;

import Remember.Componente;

public class FabricaTarefas implements FabricaDeTarefas {
   
    @Override
	public Componente getTarefa(int e) {

		if(e == 1)
			return new TarefaSimples();
		
		else if(e == 2)
			return new Creta();
		return null;
	}
}
