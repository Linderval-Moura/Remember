package Remember.Tarefa;

import Remember.PadraoDecorator.Componente;
import Remember.PadraoDecorator.MelhoriaDecorator;

public class DuracaoTarefa extends MelhoriaDecorator {
    
    public DuracaoTarefa(Componente componente, String descricao, Double inicio, Double fim) {
        super(componente);
        titulo = "Adicionando Duracao";
        this.descricao = descricao;
        this.inicio = inicio;
        this.fim = fim;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " - Duração: " + "(das " + inicio + "h às " + fim + "h)";
    }

    public void atualizar(Double novoinicio) {

        this.descricao = descricao + " (das " + novoinicio + "h às " + fim + "h)";
        this.inicio = novoinicio;

        System.out.println("Tarefa: " + titulo + " - " + descricao + " - Início: " + inicio);

    }
}
