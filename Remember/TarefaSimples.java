package Remember;

import java.util.Date;
//  implements Observer
public class TarefaSimples extends Componente {

    public TarefaSimples() {
		setTitulo("Completar projeto");
		setDescricao("Terminar a implementação do aplicativo");
		setData(new Date().toString());
    }

	// @Override
	// public void atualizar(int data) {
		
	// 	System.out.println("Tarefa: " + titulo + " - " + descricao + " - Início: " + data);
    
	// }

}
