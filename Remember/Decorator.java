package Remember;

import java.util.Date;

public abstract class Decorator extends Componente{
	
	private Componente componente;
	
	public Decorator(Componente componente){
		this.componente = componente;
	}

	@Override
	public String getTitulo() {
		return  titulo + componente.getTitulo();
	}
	
	@Override
	public String getDescricao() {
		return componente.getDescricao() +", " +descricao;
	}
	
	@Override
	public Date getData() {
		return componente.getData();
	}

}
