package it.zeze.fantaformazioneweb.entity.wrapper;

import it.zeze.fantaformazioneweb.entity.ProbabiliFormazioniGazzetta;

public  class ProbabiliFormazioniGazzettaWrap implements java.io.Serializable {

	private static final long serialVersionUID = 3533882847884615550L;

	private ProbabiliFormazioniGazzettaIdWrap id;
	private GiocatoriWrap giocatori;
	private GiornateWrap giornate;
	
	public ProbabiliFormazioniGazzettaWrap(ProbabiliFormazioniGazzetta toCopy) {
		id = new ProbabiliFormazioniGazzettaIdWrap(toCopy.getId());
		giocatori = new GiocatoriWrap(toCopy.getGiocatori());
		giornate = new GiornateWrap(toCopy.getGiornate());
	}

	public ProbabiliFormazioniGazzettaIdWrap getId() {
		return id;
	}

	public void setId(ProbabiliFormazioniGazzettaIdWrap id) {
		this.id = id;
	}

	public GiocatoriWrap getGiocatori() {
		return giocatori;
	}

	public void setGiocatori(GiocatoriWrap giocatori) {
		this.giocatori = giocatori;
	}

	public GiornateWrap getGiornate() {
		return giornate;
	}

	public void setGiornate(GiornateWrap giornate) {
		this.giornate = giornate;
	}

}
