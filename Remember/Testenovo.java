package Remember;

public class Testenovo {
	public static void main(String[] args) {
		
		//Componente t = new Queijo(new Presunto(new Queijo(new SaoMiguel())));
	
		Componente t = new TarefaSimples();
		t = new TarefaComDuracao(t);
		t.setDescricao("Tarefa das 17h às 19h");
		
		System.out.println(t.getTitulo());
		System.out.println(t.getDescricao());
		System.out.println(t.getData());
		//System.out.println("");
		
	}

}
