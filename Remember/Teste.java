package Remember;

import java.util.Date;

public class Teste {
    public static void main(String[] args) {
        // Criar uma tarefa
        String titulo = "Completar projeto";
        String descricao = "Terminar a implementação do aplicativo";
        Date data = new Date(); // Data atual

        Tarefa tarefa = new Tarefa(titulo, descricao, data);

        // Testar a atualização da tarefa
        System.out.println("Tarefa criada:");
        System.out.println("Título: " + tarefa.getTitulo());
        System.out.println("Descrição: " + tarefa.getDescricao());
        System.out.println("Data: " + tarefa.getData());

        // Simular atualização da data da tarefa
        Date novaData = new Date();
        tarefa.setData(novaData);

        System.out.println("\nTarefa atualizada:");
        System.out.println("Nova data: " + tarefa.getData());
    }
}
