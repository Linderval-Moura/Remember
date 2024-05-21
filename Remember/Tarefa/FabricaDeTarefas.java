package Remember.Tarefa;

import Remember.Componente;

public class FabricaDeTarefas implements InterfaceFabrica {
   
    @Override
	public Componente getTarefa(int e) {

		if(e == 1)
			return new TarefaSimples();
		
		else if(e == 2)
			return new TarefaCustomizavel();
		return null;
	}
}
