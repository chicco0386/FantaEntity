package it.zeze.fantaformazioneweb.entity.wrapper;

import it.zeze.fantaformazioneweb.entity.FormazioniId;

public  class FormazioniIdWrap implements java.io.Serializable {

	private static final long serialVersionUID = -2150566597675171597L;

	private int idGiocatore;
	private int idUtentiFormazioni;
	
	public FormazioniIdWrap(FormazioniId toCopy) {
		idGiocatore = toCopy.getIdGiocatore();
		idUtentiFormazioni = toCopy.getIdUtentiFormazioni();
	}

	public int getIdGiocatore() {
		return idGiocatore;
	}

	public void setIdGiocatore(int idGiocatore) {
		this.idGiocatore = idGiocatore;
	}

	public int getIdUtentiFormazioni() {
		return idUtentiFormazioni;
	}

	public void setIdUtentiFormazioni(int idUtentiFormazioni) {
		this.idUtentiFormazioni = idUtentiFormazioni;
	}

}
