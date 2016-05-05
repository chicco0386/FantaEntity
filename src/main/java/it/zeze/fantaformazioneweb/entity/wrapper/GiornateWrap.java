package it.zeze.fantaformazioneweb.entity.wrapper;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import it.zeze.fantaformazioneweb.entity.Giornate;

public abstract class GiornateWrap implements java.io.Serializable {

	private static final long serialVersionUID = -4939490367429370117L;
	
	private Integer id;
	private Integer numeroGiornata;
	private String stagione;
	private Date data;
	private Set<StatisticheWrap> statistiches = new HashSet<StatisticheWrap>(0);
	private Set<ProbabiliFormazioniFgWrap> probabiliFormazioniFgs = new HashSet<ProbabiliFormazioniFgWrap>(0);
	private Set<ProbabiliFormazioniGazzettaWrap> probabiliFormazioniGazzettas = new HashSet<ProbabiliFormazioniGazzettaWrap>(0);
	private Set<CalendarioWrap> calendarios = new HashSet<CalendarioWrap>(0);
	private Set<ProbabiliFormazioniWrap> probabiliFormazionis = new HashSet<ProbabiliFormazioniWrap>(0);
	
	public GiornateWrap(Giornate toCopy) {
		id = toCopy.getId();
		numeroGiornata = toCopy.getNumeroGiornata();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumeroGiornata() {
		return numeroGiornata;
	}

	public void setNumeroGiornata(Integer numeroGiornata) {
		this.numeroGiornata = numeroGiornata;
	}

	public String getStagione() {
		return stagione;
	}

	public void setStagione(String stagione) {
		this.stagione = stagione;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Set<StatisticheWrap> getStatistiches() {
		return statistiches;
	}

	public void setStatistiches(Set<StatisticheWrap> statistiches) {
		this.statistiches = statistiches;
	}

	public Set<ProbabiliFormazioniFgWrap> getProbabiliFormazioniFgs() {
		return probabiliFormazioniFgs;
	}

	public void setProbabiliFormazioniFgs(Set<ProbabiliFormazioniFgWrap> probabiliFormazioniFgs) {
		this.probabiliFormazioniFgs = probabiliFormazioniFgs;
	}

	public Set<ProbabiliFormazioniGazzettaWrap> getProbabiliFormazioniGazzettas() {
		return probabiliFormazioniGazzettas;
	}

	public void setProbabiliFormazioniGazzettas(Set<ProbabiliFormazioniGazzettaWrap> probabiliFormazioniGazzettas) {
		this.probabiliFormazioniGazzettas = probabiliFormazioniGazzettas;
	}

	public Set<CalendarioWrap> getCalendarios() {
		return calendarios;
	}

	public void setCalendarios(Set<CalendarioWrap> calendarios) {
		this.calendarios = calendarios;
	}

	public Set<ProbabiliFormazioniWrap> getProbabiliFormazionis() {
		return probabiliFormazionis;
	}

	public void setProbabiliFormazionis(Set<ProbabiliFormazioniWrap> probabiliFormazionis) {
		this.probabiliFormazionis = probabiliFormazionis;
	}

}
