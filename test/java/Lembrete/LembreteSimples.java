
package Lembrete;


public class LembreteSimples implements Lembrete {
    private String descricao;

    
    public LembreteSimples(String descricao) {
        this.descricao = descricao;
    }

    
    public String getDescricao() {
        return descricao;
    }

   
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    @Override
    public String toString() {
        return descricao;
    }
}
