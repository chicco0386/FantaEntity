package it.zeze.fantaformazioneweb.entity.wrapper;

import it.zeze.fantaformazioneweb.entity.Statistiche;

public class StatisticheWrap implements java.io.Serializable {

	private static final long serialVersionUID = 7911256784916627135L;

	private StatisticheIdWrap id;
	private GiocatoriWrap giocatori;
	private GiornateWrap giornate;

	public StatisticheWrap(Statistiche toCopy) {
		if (toCopy != null) {
			id = new StatisticheIdWrap(toCopy.getId());
			giocatori = new GiocatoriWrap(toCopy.getGiocatori());
			giornate = new GiornateWrap(toCopy.getGiornate());
		}
	}

	public Statistiche unwarp() {
		Statistiche toReturn = new Statistiche();
		if (id != null)
			toReturn.setId(id.unwrap());
		if (giocatori != null)
			toReturn.setGiocatori(giocatori.unwrap());
		if (giornate != null)
			toReturn.setGiornate(giornate.unwrap());
		return toReturn;
	}

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
