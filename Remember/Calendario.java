package Remember;
public class Calendario implements ICalendario {
    private int dia;
    private int mes;
    private int ano;

    public Calendario(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    @Override
    public int getDia() {
        return dia;
    }

    @Override
    public int getMes() {
        return mes;
    }

    @Override
    public int getAno() {
        return ano;
    }
}