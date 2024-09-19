package Remember.Lembrete;

import java.util.Date;
import java.util.EnumSet;

import Remember.ConjuntoMelhoriasFactory;
import Remember.DiaDaSemana;
import Remember.PadraoDecorator.Componente;

/*
 * Classe Componente
 */
public class Lembrete extends Componente  {
    
    private final ConjuntoMelhoriasFactory melhorias;
    
    public Lembrete(ConjuntoMelhoriasFactory melhorias) {
		this.titulo = "Lembrar de Comprar Pão";
        this.descricao = "Comprar R$2 de Pão Integral";
		this.data = new Date();
		this.melhorias = melhorias;
    }

    public Componente montar() {

    	Componente componente = melhorias.setImportancia(
            this,
            "\nDias para comer pão - IMPORTANTE!"
        );

		componente = melhorias.setRecorrencia(
            componente,
            "\nDias para comprar pão",
            EnumSet.of(DiaDaSemana.TERCA, DiaDaSemana.QUINTA, DiaDaSemana.SABADO)
        );
    	
		return componente;
	}
}
