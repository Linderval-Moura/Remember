package Remember.Lembrete;

public class TesteLembretes {
    public static void main(String[] args) {
        // Criando um lembrete simples
        LembreteSimples lembreteSimples = new LembreteSimples("Comprar pão");

        // Criando um lembrete importante
        LembreteImportanteDecorator lembreteImportante = new LembreteImportanteDecorator(new LembreteSimples("Pagar conta de luz"));

        // Criando um lembrete recorrente
        LembreteRecorrente lembreteRecorrente = new LembreteRecorrente("Ir à academia", "Diariamente");

        // Exibindo os lembretes
        System.out.println("Lembrete Simples: " + lembreteSimples.getDescricao());
        System.out.println("Lembrete Importante: " + lembreteImportante.getDescricao());
        System.out.println("Lembrete Recorrente: " + lembreteRecorrente.getDescricao() + " - " + lembreteRecorrente.getPeriodo());
    }
    
}
