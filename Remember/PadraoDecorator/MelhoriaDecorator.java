package Remember.PadraoDecorator;

/*
 * Classe para implementar o padrão Decorator
 * 
 */
public abstract class MelhoriaDecorator extends Componente{
	
	private Componente componente;
	
	public MelhoriaDecorator(Componente componente){
		this.componente = componente;
	}

	@Override
	public String getTitulo() {
		return componente.getTitulo() +", " +titulo;
	}
	
	@Override
	public String getDescricao() {
		return componente.getDescricao() +", " +descricao;
	}
	
	@Override
	public String getData() {
		return componente.getData();
	}

}
