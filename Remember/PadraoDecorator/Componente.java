package Remember.PadraoDecorator;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import Remember.DiaDaSemana;

/*
 * Classe para implementar o padrão Decorator
 * 
 */
public class Componente {
	
	protected String titulo;
	protected String descricao;
	protected Date data;
	protected Double inicio;
	protected Double fim;
	protected Set<DiaDaSemana> diasDaSemana;
	
	public Set<DiaDaSemana> getDiasDaSemana() {
		return diasDaSemana;
	}

	public void setDiasDaSemana(Set<DiaDaSemana> diasDaSemana) {
		this.diasDaSemana = diasDaSemana;
	}

	public String getTitulo() {
		return "\nTitulo: " + titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getDescricao() {
		return "\nDescrição: " + descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getData() {
		// Formata a data para o padrão brasileiro
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "\nData: " + sdf.format(data);
	}
	
	public void setData(Date data) {
		this.data = data;
	}

	public String getInicio() {
		// Formata a data para o padrão brasileiro
		return formatarHora(inicio);
	}
	
	public void setInicio(Double inicio) {
		this.inicio = inicio;
	}

	public String getFim() {
		// Formata a data para o padrão brasileiro
		return formatarHora(fim);
	}
	
	public void setFim(Double fim) {
		this.fim = fim;
	}
	
	
	private String formatarHora(Double horaDecimal) {
        if (horaDecimal == null) {
            return "";
        }
        int horas = horaDecimal.intValue();
        int minutos = (int) ((horaDecimal - horas) * 60);
        return String.format("%02d:%02d", horas, minutos);
    }

}
