package Remember;

import Remember.Tarefa.Tarefa;
import Remember.Lembrete.Lembrete;
import Remember.PadraoDecorator.Componente;

/*
 * Classe Fabrica para implementar o padrão Factory Method
 */
public class FabricaDeAgendas implements InterfaceFabrica {
	
	private ConjuntoMelhoriasFactory melhorias = new ConjuntoMelhoriasAgenda();
   
    @Override
	public Componente getAgenda(int e) {

		if(e == 1)
			return new Lembrete(melhorias);
		
		else if(e == 2)
			return new Tarefa(melhorias);
		
		return null;
	}
}
