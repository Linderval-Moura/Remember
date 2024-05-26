package Remember;

import Remember.Tarefa.DuracaoTarefa;
import Remember.Tarefa.HabitoTarefa;
import Remember.Tarefa.TarefaCustomizavel;

import java.util.EnumSet;

public class RememberApp {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("");
		System.out.println("$$$$$   APP REMEMBER   $$$$$");
		System.out.println("");
		
		FabricaDeTarefas fab = new FabricaDeTarefas();
		
		/*Componente c = fab.getCarro(1);
		c = new MotorPopular(c);
		c = new CambioPopular(c);*/

		//Componente t = new TarefaComDuracao(new TarefaComDuracao(new TarefaSimples()));
	
		//Componente t = new TarefaCustomizavel();
		//t = new DuracaoTarefa(t, "Terminar testes", 17.30, 18.40);
		
		TarefaCustomizavel tCustomizavel = (TarefaCustomizavel)fab.getTarefa(2);
		Componente c = tCustomizavel.montar();

		System.out.println(c.getTitulo());
		System.out.println(c.getDescricao());
		System.out.println(c.getData());
		
		
	}

}
