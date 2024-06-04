package Remember.Lembrete;

import Remember.Componente;
import Remember.MelhoriaDecorator;

public class LembreteImportante extends MelhoriaDecorator {
    
    public LembreteImportante (Componente componente, String descricao) {
        super(componente);
        this.descricao = descricao;
    }
    
    @Override
    public String getDescricao() {
    	return super.getDescricao();
    }
}