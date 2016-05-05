package it.zeze.fantaformazioneweb.entity.wrapper;

public abstract class ProbabiliFormazioniWrap implements java.io.Serializable {

	private static final long serialVersionUID = 6209980427459599352L;

	private ProbabiliFormazioniIdWrap id;
	private GiornateWrap giornate;
	private UtentiFormazioniWrap utentiFormazioni;
	private GiocatoriWrap giocatori;

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
