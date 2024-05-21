package Remember.Lembrete;

public class LembreteImportanteDecorator implements Lembrete {
    private Lembrete lembrete;

    
    public LembreteImportanteDecorator(Lembrete lembrete) {
        this.lembrete = lembrete;
    }

    
    @Override
    public String getDescricao() {
       
        return lembrete.getDescricao() + " - IMPORTANTE!";
    }
}
