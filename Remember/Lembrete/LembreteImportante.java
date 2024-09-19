package Remember.Lembrete;

import Remember.PadraoDecorator.Componente;
import Remember.PadraoDecorator.MelhoriaDecorator;

/*
 * Classe Decorator
 */
public class LembreteImportante extends MelhoriaDecorator {
    
    public LembreteImportante (Componente componente, String descricao) {
        super(componente);
        this.titulo = "Importante";
        this.descricao = descricao;
    }
    
    @Override
    public String getDescricao() {
    	return super.getDescricao();
    }
}
