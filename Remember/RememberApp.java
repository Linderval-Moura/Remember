package Remember;

import Remember.Lembrete.LembreteSimples;
//import Remember.Tarefa.DuracaoTarefa;
//import Remember.Tarefa.HabitoTarefa;
import Remember.Tarefa.TarefaCustomizavel;

//import java.util.EnumSet;

public class RememberApp {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("");
		System.out.println("$$$$$   APP REMEMBER   $$$$$");
		System.out.println("TarefaCustomizavel");
		
		FabricaDeAgendas fab = new FabricaDeAgendas();
		
		/*Componente c = fab.getCarro(1);
		c = new MotorPopular(c);
		c = new CambioPopular(c);*/

		//Componente t = new TarefaComDuracao(new TarefaComDuracao(new TarefaSimples()));
	
		//Componente t = new TarefaCustomizavel();
		//t = new DuracaoTarefa(t, "Terminar testes", 17.30, 18.40);
		
		TarefaCustomizavel tCustomizavel = (TarefaCustomizavel)fab.getAgenda(2);
		Componente c = tCustomizavel.montar();

		System.out.println(c.getTitulo());
		System.out.println(c.getDescricao());
		System.out.println(c.getData());
		
		System.out.println("");
		System.out.println("$$$$$   APP REMEMBER   $$$$$");
		System.out.println("LembreteSimples");
		
		FabricaDeAgendas fab2 = new FabricaDeAgendas();
		
        LembreteSimples lembrete = (LembreteSimples)fab2.getAgenda(1);
        
        Componente lembreteMelhorado = lembrete.montar();

        System.out.println(lembreteMelhorado.getDescricao());
		
	}

}
