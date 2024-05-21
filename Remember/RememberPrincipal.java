package Remember;

import Remember.Tarefa.DuracaoTarefa;
import Remember.Tarefa.TarefaCustomizavel;

public class RememberPrincipal {
	public static void main(String[] args) throws InterruptedException {
		
		//Componente t = new TarefaComDuracao(new TarefaComDuracao(new TarefaSimples()));
	
		Componente t = new TarefaCustomizavel();
		t = new DuracaoTarefa(t, "Terminar testes", 17.30, 18.40);
		//t.setDescricao("Terminar testes");
		//((DuracaoTarefa) t).setDescricao("Terminar testes");
		
		System.out.println(t.getTitulo());
		System.out.println(t.getDescricao() + " (das " + t.getInicio() + "h às " + t.getFim() + "h)");
		System.out.println(t.getData());
		System.out.println("");
		
		Thread.sleep(5000);
		// Atualizando data com padrão Observer  
		((DuracaoTarefa) t).atualizar(17.20);
		System.out.println(t.getTitulo());
		System.out.println(t.getDescricao());
		System.out.println(t.getData());
		
	}

}
