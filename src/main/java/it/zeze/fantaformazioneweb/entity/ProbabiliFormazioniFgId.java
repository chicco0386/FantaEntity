package it.zeze.fantaformazioneweb.entity;

// Generated 19-gen-2012 10.57.55 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ProbabiliFormazioniFgId generated by hbm2java
 */
@Embeddable
public class ProbabiliFormazioniFgId implements java.io.Serializable {

	private int idGiocatore;
	private int idGiornata;
	private boolean titolare;
	private boolean panchina;

	public ProbabiliFormazioniFgId() {
	}

	public ProbabiliFormazioniFgId(int idGiocatore, int idGiornata) {
		this.idGiocatore = idGiocatore;
		this.idGiornata = idGiornata;
	}

	public ProbabiliFormazioniFgId(int idGiocatore, int idGiornata, boolean titolare, boolean panchina) {
		this.idGiocatore = idGiocatore;
		this.idGiornata = idGiornata;
		this.titolare = titolare;
		this.panchina = panchina;
	}

	@Column(name = "id_giocatore", nullable = false)
	public int getIdGiocatore() {
		return this.idGiocatore;
	}

	public void setIdGiocatore(int idGiocatore) {
		this.idGiocatore = idGiocatore;
	}

	@Column(name = "id_giornata", nullable = false)
	public int getIdGiornata() {
		return this.idGiornata;
	}

	public void setIdGiornata(int idGiornata) {
		this.idGiornata = idGiornata;
	}

	@Column(name = "titolare")
	public boolean isTitolare() {
		return this.titolare;
	}

	public void setTitolare(boolean titolare) {
		this.titolare = titolare;
	}

	@Column(name = "panchina")
	public boolean isPanchina() {
		return this.panchina;
	}

	public void setPanchina(boolean panchina) {
		this.panchina = panchina;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ProbabiliFormazioniFgId))
			return false;
		ProbabiliFormazioniFgId castOther = (ProbabiliFormazioniFgId) other;

		return (this.getIdGiocatore() == castOther.getIdGiocatore()) && (this.getIdGiornata() == castOther.getIdGiornata()) && ((this.isTitolare() == castOther.isTitolare()) || (this.isTitolare() == (castOther.isTitolare()))) && ((this.isPanchina() == castOther.isPanchina()) || (this.isPanchina() == (castOther.isPanchina())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdGiocatore();
		result = 37 * result + this.getIdGiornata();
		result = 37 * result + (isTitolare() ? 1 : 0);
		result = 37 * result + (isPanchina() ? 1 : 0);
		return result;
	}

}
