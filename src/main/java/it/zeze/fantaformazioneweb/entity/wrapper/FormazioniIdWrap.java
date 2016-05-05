package it.zeze.fantaformazioneweb.entity.wrapper;

public abstract class FormazioniIdWrap implements java.io.Serializable {

	private static final long serialVersionUID = -2150566597675171597L;

	private int idGiocatore;
	private int idUtentiFormazioni;

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
