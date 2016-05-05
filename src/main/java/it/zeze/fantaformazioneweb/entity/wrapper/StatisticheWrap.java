package it.zeze.fantaformazioneweb.entity.wrapper;

public abstract class StatisticheWrap implements java.io.Serializable {

	private static final long serialVersionUID = 7911256784916627135L;

	private StatisticheIdWrap id;
	private GiocatoriWrap giocatori;
	private GiornateWrap giornate;

	public StatisticheIdWrap getId() {
		return id;
	}

	public void setId(StatisticheIdWrap id) {
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
