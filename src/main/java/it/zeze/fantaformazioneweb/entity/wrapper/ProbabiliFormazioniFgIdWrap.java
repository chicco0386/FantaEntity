package it.zeze.fantaformazioneweb.entity.wrapper;

import it.zeze.fantaformazioneweb.entity.ProbabiliFormazioniFgId;

public  class ProbabiliFormazioniFgIdWrap implements java.io.Serializable {

	private static final long serialVersionUID = 7298934242123997536L;

	private int idGiocatore;
	private int idGiornata;
	private boolean titolare;
	private boolean panchina;
	
	public ProbabiliFormazioniFgIdWrap(ProbabiliFormazioniFgId toCopy) {
		idGiocatore = toCopy.getIdGiocatore();
		idGiornata = toCopy.getIdGiornata();
		titolare = toCopy.isTitolare();
		panchina = toCopy.isPanchina();
	}

	public int getIdGiocatore() {
		return idGiocatore;
	}

	public void setIdGiocatore(int idGiocatore) {
		this.idGiocatore = idGiocatore;
	}

	public int getIdGiornata() {
		return idGiornata;
	}

	public void setIdGiornata(int idGiornata) {
		this.idGiornata = idGiornata;
	}

	public boolean isTitolare() {
		return titolare;
	}

	public void setTitolare(boolean titolare) {
		this.titolare = titolare;
	}

	public boolean isPanchina() {
		return panchina;
	}

	public void setPanchina(boolean panchina) {
		this.panchina = panchina;
	}

}
