package Remember;

public class Testenovo {
	public static void main(String[] args) {
		
		//Componente t = new Queijo(new Presunto(new Queijo(new SaoMiguel())));
	
		Componente t = new TarefaSimples();
		t = new TarefaComDuracao(t);
		
		System.out.println(t.getTitulo());
		System.out.println(t.getDescricao());
		//System.out.println("");
		
		// s = new Misto();
		// s.setNome("Misto Quente");
		// s.custo = 15;
		// s = new Queijo(s);
		// s = new Queijo(s);
		// s = new Queijo(s);
		
	
				
        // System.out.println(s.getNome());
        // System.out.println(s.getCusto());

	}

}
