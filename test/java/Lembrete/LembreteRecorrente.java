
package Lembrete;


public class LembreteRecorrente extends LembreteSimples {
    private String periodo;

    // Construtor
    public LembreteRecorrente(String descricao, String periodo) {
        super(descricao);
        this.periodo = periodo;
    }

    // Método para obter o período de recorrência
    public String getPeriodo() {
        return periodo;
    }

    // Método para definir o período de recorrência
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    // Sobrescrita do método toString para incluir o período de recorrência
    @Override
    public String toString() {
        return super.toString() + " (Recorrente: " + periodo + ")";
    }
}
