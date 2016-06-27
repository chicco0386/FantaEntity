package it.zeze.fantaformazioneweb.entity.wrapper;

import java.math.BigDecimal;

import it.zeze.fantaformazioneweb.entity.Formazioni;

public class FormazioniWrap implements java.io.Serializable {

	private static final long serialVersionUID = 5390409177660627974L;

	private FormazioniIdWrap id;
	private BigDecimal prezzoAcquisto;
	private UtentiFormazioniWrap utentiFormazioni;
	private GiocatoriWrap giocatori;
	
	public FormazioniWrap(Formazioni toCopy) {
		id = new FormazioniIdWrap(toCopy.getId());
		prezzoAcquisto = toCopy.getPrezzoAcquisto();
		utentiFormazioni = new UtentiFormazioniWrap(toCopy.getUtentiFormazioni());
		giocatori = new GiocatoriWrap(toCopy.getGiocatori());
	}

	public FormazioniIdWrap getId() {
		return id;
	}

	public void setId(FormazioniIdWrap id) {
		this.id = id;
	}

	public BigDecimal getPrezzoAcquisto() {
		return prezzoAcquisto;
	}

	public void setPrezzoAcquisto(BigDecimal prezzoAcquisto) {
		this.prezzoAcquisto = prezzoAcquisto;
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
