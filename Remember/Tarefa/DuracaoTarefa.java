package Remember.Tarefa;

import Remember.Componente;
import Remember.MelhoriaDecorator;
import java.util.Date;

public class DuracaoTarefa extends MelhoriaDecorator {
    
    public DuracaoTarefa(Componente componente, String descricao, Double inicio, Double fim) {
        super(componente);
        titulo = "Tarefa Com Duracao";
        this.descricao = descricao;
        data = new Date();
        this.inicio = inicio;
        this.fim = fim;
    }

    public void atualizar(Double novoinicio) {

        this.descricao = descricao + " (das " + novoinicio + "h às " + fim + "h)";
        this.inicio = novoinicio;

        System.out.println("Tarefa: " + titulo + " - " + descricao + " - Início: " + inicio);

    }
}
