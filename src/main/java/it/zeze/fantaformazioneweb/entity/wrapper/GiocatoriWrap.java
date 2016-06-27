package it.zeze.fantaformazioneweb.entity.wrapper;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import it.zeze.fantaformazioneweb.entity.Giocatori;

public class GiocatoriWrap implements java.io.Serializable {

	private static final long serialVersionUID = -4691787156170180676L;

	private int id;
	private SquadreWrap squadre;
	private String nome;
	private String ruolo;
	private String stagione;
	private BigDecimal quotazIniziale;
	private BigDecimal quotazAttuale;
	private Set<ProbabiliFormazioniFgWrap> probabiliFormazioniFgs = new HashSet<ProbabiliFormazioniFgWrap>(0);
	private Set<ProbabiliFormazioniGazzettaWrap> probabiliFormazioniGazzettas = new HashSet<ProbabiliFormazioniGazzettaWrap>(0);
	private Set<FormazioniWrap> formazionis = new HashSet<FormazioniWrap>(0);
	private Set<StatisticheWrap> statistiches = new HashSet<StatisticheWrap>(0);
	private Set<ProbabiliFormazioniWrap> probabiliFormazionis = new HashSet<ProbabiliFormazioniWrap>(0);
	
	public GiocatoriWrap(){};
	
	public GiocatoriWrap(Giocatori toWrap){
		this.id = toWrap.getId();
		this.squadre = new SquadreWrap(toWrap.getSquadre());
		this.nome = toWrap.getNome();
		this.ruolo = toWrap.getRuolo();
		this.stagione = toWrap.getStagione();
		this.quotazIniziale = toWrap.getQuotazIniziale();
		this.quotazAttuale = toWrap.getQuotazAttuale();
	}
	
	public Giocatori unwrap(){
		Giocatori toReturn = new Giocatori(id, nome, ruolo, stagione, quotazIniziale, quotazAttuale);
		if (squadre != null) toReturn.setSquadre(squadre.unwrap());
		return toReturn;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public SquadreWrap getSquadre() {
		return squadre;
	}

	public void setSquadre(SquadreWrap squadre) {
		this.squadre = squadre;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRuolo() {
		return ruolo;
	}

	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}

	public String getStagione() {
		return stagione;
	}

	public void setStagione(String stagione) {
		this.stagione = stagione;
	}

	public BigDecimal getQuotazIniziale() {
		return quotazIniziale;
	}

	public void setQuotazIniziale(BigDecimal quotazIniziale) {
		this.quotazIniziale = quotazIniziale;
	}

	public BigDecimal getQuotazAttuale() {
		return quotazAttuale;
	}

	public void setQuotazAttuale(BigDecimal quotazAttuale) {
		this.quotazAttuale = quotazAttuale;
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

	public Set<FormazioniWrap> getFormazionis() {
		return formazionis;
	}

	public void setFormazionis(Set<FormazioniWrap> formazionis) {
		this.formazionis = formazionis;
	}

	public Set<StatisticheWrap> getStatistiches() {
		return statistiches;
	}

	public void setStatistiches(Set<StatisticheWrap> statistiches) {
		this.statistiches = statistiches;
	}

	public Set<ProbabiliFormazioniWrap> getProbabiliFormazionis() {
		return probabiliFormazionis;
	}

	public void setProbabiliFormazionis(Set<ProbabiliFormazioniWrap> probabiliFormazionis) {
		this.probabiliFormazionis = probabiliFormazionis;
	}

}
