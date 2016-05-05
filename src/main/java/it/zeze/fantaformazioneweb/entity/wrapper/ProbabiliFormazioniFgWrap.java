package it.zeze.fantaformazioneweb.entity.wrapper;

public abstract class ProbabiliFormazioniFgWrap implements java.io.Serializable {

	private static final long serialVersionUID = 5165863124619527150L;

	private ProbabiliFormazioniFgIdWrap id;
	private GiocatoriWrap giocatori;
	private GiornateWrap giornate;

	public ProbabiliFormazioniFgIdWrap getId() {
		return id;
	}

	public void setId(ProbabiliFormazioniFgIdWrap id) {
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
