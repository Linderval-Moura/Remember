package Remember.Lembrete;

import java.util.Date;

import Remember.Componente;

import Remember.ConjuntoMelhoriasFactory;

public class LembreteSimples extends Componente  {
    
    private ConjuntoMelhoriasFactory melhorias;
    
    public LembreteSimples(ConjuntoMelhoriasFactory melhorias) {
		this.descricao = "Comprar pão";
		this.data = new Date().toString();
		this.melhorias = melhorias;
    }

    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public Componente montar() {

    	Componente componente = melhorias.setImportancia(this, descricao);
		componente = melhorias.setRecorrencia(componente, descricao, diasDaSemana);
    	
		return componente;
	}

    @Override
    public String toString() {
        return descricao;
    }
}
