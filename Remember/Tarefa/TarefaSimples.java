package Remember.Tarefa;

import java.util.Date;

import Remember.Componente;

//  implements Observer
public class TarefaSimples extends Componente {

    public TarefaSimples() {
		setTitulo("Completar projeto");
		setDescricao("Terminar a implementação do aplicativo");
		setData(new Date().toString());
    }
	
}
