package it.zeze.fantaformazioneweb.entity.wrapper;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import it.zeze.fantaformazioneweb.entity.UtentiFormazioni;

public  class UtentiFormazioniWrap implements java.io.Serializable {

	private static final long serialVersionUID = -7654849653649291780L;

	private Integer id;
	private UtentiWrap utenti;
	private String nomeFormazione;
	private BigDecimal crediti;
	private Set<ProbabiliFormazioniWrap> probabiliFormazionis = new HashSet<ProbabiliFormazioniWrap>(0);
	private Set<FormazioniWrap> formazionis = new HashSet<FormazioniWrap>(0);
	
	public UtentiFormazioniWrap(UtentiFormazioni toCopy) {
		id = toCopy.getId();
		utenti = new UtentiWrap(toCopy.getUtenti());
		nomeFormazione = toCopy.getNomeFormazione();
		crediti = toCopy.getCrediti();
	}
	
	public UtentiFormazioni unwrap() {
		UtentiFormazioni toReturn = new UtentiFormazioni();
		toReturn.setId(id);
		if (utenti != null) toReturn.setUtenti(utenti.unwrap());
		toReturn.setNomeFormazione(nomeFormazione);
		toReturn.setCrediti(crediti);
		return toReturn;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public UtentiWrap getUtenti() {
		return utenti;
	}

	public void setUtenti(UtentiWrap utenti) {
		this.utenti = utenti;
	}

	public String getNomeFormazione() {
		return nomeFormazione;
	}

	public void setNomeFormazione(String nomeFormazione) {
		this.nomeFormazione = nomeFormazione;
	}

	public BigDecimal getCrediti() {
		return crediti;
	}

	public void setCrediti(BigDecimal crediti) {
		this.crediti = crediti;
	}

	public Set<ProbabiliFormazioniWrap> getProbabiliFormazionis() {
		return probabiliFormazionis;
	}

	public void setProbabiliFormazionis(Set<ProbabiliFormazioniWrap> probabiliFormazionis) {
		this.probabiliFormazionis = probabiliFormazionis;
	}

	public Set<FormazioniWrap> getFormazionis() {
		return formazionis;
	}

	public void setFormazionis(Set<FormazioniWrap> formazionis) {
		this.formazionis = formazionis;
	}

}
