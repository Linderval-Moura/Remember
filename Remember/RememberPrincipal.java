package Remember;

import Remember.Tarefa.DuracaoTarefa;
import Remember.Tarefa.HabitoTarefa;
import Remember.Tarefa.TarefaCustomizavel;

import java.util.EnumSet;

public class RememberPrincipal {
	public static void main(String[] args) throws InterruptedException {
		
		//HyundaiPopular fab = new HyundaiPopular();
	

		//Componente t = new TarefaComDuracao(new TarefaComDuracao(new TarefaSimples()));
	
		Componente t = new TarefaCustomizavel(null);
		t = new DuracaoTarefa(t, "Terminar testes", 17.30, 18.40);
		//t.setDescricao("Terminar testes");
		//((DuracaoTarefa) t).setDescricao("Terminar testes");
                
        // Adicionando o hábito de repetir a tarefa em dias específicos
		
		System.out.println(t.getTitulo());
		System.out.println(t.getDescricao() + " (das " + t.getInicio() + "h às " + t.getFim() + "h)");
		System.out.println(t.getData());
		System.out.println("");
		
		Thread.sleep(5000);
		// Atualizando data com padrão Observer  
		((DuracaoTarefa) t).atualizar(17.20);
		
		if (t instanceof DuracaoTarefa) {
            ((DuracaoTarefa) t).atualizar(17.20);
        } else if (t instanceof HabitoTarefa) {
            ((HabitoTarefa) t).atualizar(17.20);
        }
		
		System.out.println("");
		System.out.println("#####   T 2   #####");
		System.out.println("");
		
		Componente t2 = new TarefaCustomizavel(null);
        t2 = new HabitoTarefa(t2, "Estudar Java", 17.30, 18.40, EnumSet.of(DiaDaSemana.SEGUNDA, DiaDaSemana.QUARTA, DiaDaSemana.DOMINGO));

        System.out.println(t2.getTitulo());
		System.out.println(t2.getDescricao() + " (das " + t.getInicio() + "h às " + t.getFim() + "h)");
		System.out.println(t2.getData());
		System.out.println("");
		
		System.out.println(t2.getTitulo());
		System.out.println(t2.getDescricao());
		System.out.println(t2.getData());
		
		
		
	}

}
