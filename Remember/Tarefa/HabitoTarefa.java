package Remember.Tarefa;

import Remember.Componente;
import Remember.DiaDaSemana;
import Remember.MelhoriaDecorator;
import java.util.Date;
import java.util.Set;
import java.util.stream.Collectors;

public class HabitoTarefa extends MelhoriaDecorator {
    
    private Set<DiaDaSemana> diasDaSemana;
    private Double inicio;
    private Double fim;

    public HabitoTarefa(Componente componente, String descricao, Double inicio, Double fim, Set<DiaDaSemana> diasDaSemana) {
        super(componente);
        this.titulo = "Tarefa com Hábito";
        this.descricao = descricao;
        this.inicio = inicio;
        this.fim = fim;
        this.diasDaSemana = diasDaSemana;
        this.data = new Date().toString();
    }

    public void atualizar(Double novoinicio) {
        this.descricao = descricao + " (das " + novoinicio + "h às " + fim + "h)";
        this.inicio = novoinicio;
        System.out.println("Tarefa: " + titulo + " - " + descricao + " - Repetir em: " + getDiasDaSemanaComoString() + " - Início: " + inicio);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " - Repetir em: " + getDiasDaSemanaComoString();
    }

    private String getDiasDaSemanaComoString() {
        return diasDaSemana.stream().map(Enum::name).collect(Collectors.joining(", "));
    }
}






