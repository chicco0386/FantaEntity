package it.zeze.fantaformazioneweb.entity.wrapper;

import it.zeze.fantaformazioneweb.entity.ProbabiliFormazioniGazzettaId;

public class ProbabiliFormazioniGazzettaIdWrap implements java.io.Serializable {

	private static final long serialVersionUID = 7541652731846164639L;
	
	private int idGiocatore;
	private int idGiornata;
	private boolean titolare;
	private boolean panchina;
	
	public ProbabiliFormazioniGazzettaIdWrap(ProbabiliFormazioniGazzettaId toCopy) {
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
