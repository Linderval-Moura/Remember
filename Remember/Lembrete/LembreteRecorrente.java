package Remember.Lembrete;

import java.util.Set;

import Remember.Componente;
import Remember.DiaDaSemana;
import Remember.MelhoriaDecorator;

public class LembreteRecorrente extends MelhoriaDecorator {

    public LembreteRecorrente (Componente componente, String descricao, Set<DiaDaSemana> diasDaSemana) {
        super(componente);
        this.descricao = descricao;
        this.diasDaSemana = diasDaSemana;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " - Repetir: " + diasDaSemana;
    }
}
