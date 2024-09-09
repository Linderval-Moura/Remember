package Remember.Lembrete;

import java.util.Set;

import Remember.DiaDaSemana;
import Remember.PadraoDecorator.Componente;
import Remember.PadraoDecorator.MelhoriaDecorator;

public class LembreteRecorrente extends MelhoriaDecorator {

    public LembreteRecorrente (Componente componente, String descricao, Set<DiaDaSemana> diasDaSemana) {
        super(componente);
        this.descricao = descricao;
        this.diasDaSemana = diasDaSemana;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " - Repetir em: " + diasDaSemana;
    }
}
