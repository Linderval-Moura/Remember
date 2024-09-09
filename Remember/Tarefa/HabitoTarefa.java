
package Remember.Tarefa;

import Remember.Componente;
import Remember.DiaDaSemana;
import Remember.MelhoriaDecorator;
import java.util.Set;
//import java.util.stream.Collectors;

public class HabitoTarefa extends MelhoriaDecorator {
	
    public HabitoTarefa(Componente componente, String descricao, Set<DiaDaSemana> diasDaSemana) {
        super(componente);
        this.titulo = "Adicionando Hábito";
        this.descricao = descricao;
        this.diasDaSemana = diasDaSemana;
    }

    public void atualizar(Double novoinicio) {
        this.descricao = descricao + " (das " + novoinicio + "h às " + fim + "h)";
        this.inicio = novoinicio;
        System.out.println("Tarefa: " + titulo + " - " + descricao + " - Repetir em: " + diasDaSemana + " - Início: " + inicio);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " - Repetir em: " + diasDaSemana;
    }

    // private String getDiasDaSemanaComoString() {
    //     return diasDaSemana.stream().map(Enum::name).collect(Collectors.joining(", "));
    // }
}







