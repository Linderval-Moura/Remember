package Remember;


public abstract class Decorator extends Componente{
	
	private Componente componente;
	
	public Decorator(Componente componente){
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
