package Remember.Lembrete;

import java.util.Date;
import java.util.EnumSet;

import Remember.ConjuntoMelhoriasFactory;
import Remember.DiaDaSemana;
import Remember.PadraoDecorator.Componente;

public class LembreteSimples extends Componente  {
    
    private ConjuntoMelhoriasFactory melhorias;
    
    public LembreteSimples(ConjuntoMelhoriasFactory melhorias) {
		this.descricao = "Lembrar de Comprar Pão";
		this.data = new Date();
		this.melhorias = melhorias;
    }

    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public Componente montar() {

    	Componente componente = melhorias.setImportancia(this, 
        "- IMPORTANTE!"
        );

		componente = melhorias.setRecorrencia(componente, 
        descricao, 
        EnumSet.of(DiaDaSemana.DOMINGO, DiaDaSemana.QUARTA, DiaDaSemana.SEXTA, DiaDaSemana.SABADO)
        );
    	
		return componente;
	}

    @Override
    public String toString() {
        return descricao;
    }
}
