package it.zeze.fantaformazioneweb.entity.wrapper;

import it.zeze.fantaformazioneweb.entity.ProbabiliFormazioni;

public  class ProbabiliFormazioniWrap implements java.io.Serializable {

	private static final long serialVersionUID = 6209980427459599352L;

	private ProbabiliFormazioniIdWrap id;
	private GiornateWrap giornate;
	private UtentiFormazioniWrap utentiFormazioni;
	private GiocatoriWrap giocatori;
	
	public ProbabiliFormazioniWrap(ProbabiliFormazioni toCopy) {
		id = new ProbabiliFormazioniIdWrap(toCopy.getId());
		giornate = new GiornateWrap(toCopy.getGiornate());
		utentiFormazioni = new UtentiFormazioniWrap(toCopy.getUtentiFormazioni());
		giocatori = new GiocatoriWrap(toCopy.getGiocatori());
	}
	
	public ProbabiliFormazioni unwrap(){
		ProbabiliFormazioni toReturn = new ProbabiliFormazioni();
		if (id != null) toReturn.setId(id.unwrap());
		if (giornate != null) toReturn.setGiornate(giornate.unwrap());
		if (utentiFormazioni != null) toReturn.setUtentiFormazioni(utentiFormazioni.unwrap());
		if (giocatori != null) toReturn.setGiocatori(giocatori.unwrap());
		return toReturn;
	}

	public ProbabiliFormazioniIdWrap getId() {
		return id;
	}

	public void setId(ProbabiliFormazioniIdWrap id) {
		this.id = id;
	}

	public GiornateWrap getGiornate() {
		return giornate;
	}

	public void setGiornate(GiornateWrap giornate) {
		this.giornate = giornate;
	}

	public UtentiFormazioniWrap getUtentiFormazioni() {
		return utentiFormazioni;
	}

	public void setUtentiFormazioni(UtentiFormazioniWrap utentiFormazioni) {
		this.utentiFormazioni = utentiFormazioni;
	}

	public GiocatoriWrap getGiocatori() {
		return giocatori;
	}

	public void setGiocatori(GiocatoriWrap giocatori) {
		this.giocatori = giocatori;
	}

}
