package Remember.Tarefa;

import Remember.Componente;
import java.util.Date;

//  implements Observer
public class TarefaSimples extends Componente {
	
    public TarefaSimples() {
		setTitulo("Completar projeto");
		setDescricao("Terminar a implementação do aplicativo");
		setData(new Date().toString());
		
    }
	
}
