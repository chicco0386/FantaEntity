package it.zeze.fantaformazioneweb.entity.wrapper;

public abstract class ProbabiliFormazioniIdWrap implements java.io.Serializable {

	private static final long serialVersionUID = 3126833251116520164L;

	private int idGiornate;
	private int idUtentiFormazioni;
	private int idGiocatore;
	private int probTitolare;
	private int probPanchina;
	private String note = "";

	public int getIdGiornate() {
		return idGiornate;
	}

	public void setIdGiornate(int idGiornate) {
		this.idGiornate = idGiornate;
	}

	public int getIdUtentiFormazioni() {
		return idUtentiFormazioni;
	}

	public void setIdUtentiFormazioni(int idUtentiFormazioni) {
		this.idUtentiFormazioni = idUtentiFormazioni;
	}

	public int getIdGiocatore() {
		return idGiocatore;
	}

	public void setIdGiocatore(int idGiocatore) {
		this.idGiocatore = idGiocatore;
	}

	public int getProbTitolare() {
		return probTitolare;
	}

	public void setProbTitolare(int probTitolare) {
		this.probTitolare = probTitolare;
	}

	public int getProbPanchina() {
		return probPanchina;
	}

	public void setProbPanchina(int probPanchina) {
		this.probPanchina = probPanchina;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

}
