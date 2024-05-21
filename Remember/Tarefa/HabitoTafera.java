package Remember.Tarefa;

import java.util.Date;

import Remember.Componente;
import Remember.MelhoriaDecorator;

public class HabitoTafera extends MelhoriaDecorator {
    
    public HabitoTafera(Componente componente, String descricao, Double inicio, Double fim) {
        super(componente);
		titulo = "Tarefa que se tornará um habito";
		this.descricao = descricao;
        data = new Date().toString();
		this.inicio = inicio;
		this.fim = fim;
    }

    public void atualizar(Double novoinicio) {

        this.descricao = descricao + " (das " + novoinicio + "h às " + fim + "h)";
        this.inicio = novoinicio;

        System.out.println("Tarefa: " + titulo + " - " + descricao + " - Início: " + inicio);

    }

}
