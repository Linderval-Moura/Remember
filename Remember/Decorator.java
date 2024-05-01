package Remember;

public abstract class Decorator extends Componente{
	
	private Componente componente;
	
	public Decorator(Componente componente){
		this.componente = componente;
	}

	@Override
	public double getCusto() {
		return  custo + componente.getCusto();
	}
	
	@Override
	public String getNome() {
		return componente.getNome() +", " +nome;
	}

}
