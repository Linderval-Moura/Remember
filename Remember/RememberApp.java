package Remember;

import Remember.Lembrete.Lembrete;
import Remember.PadraoDecorator.Componente;
import Remember.Tarefa.Tarefa;

/*
 * Classe Principal
 */
public class RememberApp {
	public static void main(String[] args) {
		System.out.println(" ");
		System.out.println("!!!!!   TAREFA REMEMBER   !!!!!");
		System.out.println("Tarefa");
		
		FabricaDeAgendas fab = new FabricaDeAgendas();
		
		Tarefa tarefaMelorada = (Tarefa)fab.getAgenda(2);
		Componente c = tarefaMelorada.montar();

		System.out.println(c.getTitulo());
		System.out.println(c.getDescricao());
		System.out.println(c.getData());
		
		System.out.println(" ");
		System.out.println("!!!!!   LEMBRETE REMEMBER   !!!!!");
		System.out.println("Lembrete");
		
		FabricaDeAgendas fab2 = new FabricaDeAgendas();
		
        Lembrete lembreteMelorado = (Lembrete)fab2.getAgenda(1);
        
        Componente c2 = lembreteMelorado.montar();

		System.out.println(c2.getTitulo());
		System.out.println(c2.getDescricao());
		System.out.println(c2.getData());
	}

}
