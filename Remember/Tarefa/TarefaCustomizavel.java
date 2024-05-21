package Remember.Tarefa;

import java.util.Date;

import Remember.Componente;

//  implements Observer
public class TarefaCustomizavel extends Componente {

    public TarefaCustomizavel() {
		setTitulo("Completar projeto");
		setDescricao("Terminar a implementação do aplicativo");
		setData(new Date().toString());
    }

	// @Override
	// public void atualizar(int data) {
		
	// 	System.out.println("Tarefa: " + titulo + " - " + descricao + " - Início: " + data);
    
	// }

}
