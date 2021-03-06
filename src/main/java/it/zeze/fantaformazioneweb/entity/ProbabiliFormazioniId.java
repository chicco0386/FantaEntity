package it.zeze.fantaformazioneweb.entity;

// Generated 19-gen-2012 10.57.55 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Transient;

import org.hibernate.validator.Length;

/**
 * ProbabiliFormazioniId generated by hbm2java
 */
@Embeddable
public class ProbabiliFormazioniId implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3168200635972068497L;
	private int idGiornate;
	private int idUtentiFormazioni;
	private int idGiocatore;
	private int probTitolare;
	private int probPanchina;
	private String note = "";

	public ProbabiliFormazioniId() {
	}

	public ProbabiliFormazioniId(int idGiornate, int idUtentiFormazioni, int idGiocatore, int probTitolare, int probPanchina) {
		this.idGiornate = idGiornate;
		this.idUtentiFormazioni = idUtentiFormazioni;
		this.idGiocatore = idGiocatore;
		this.probTitolare = probTitolare;
		this.probPanchina = probPanchina;
	}

	public ProbabiliFormazioniId(int idGiornate, int idUtentiFormazioni, int idGiocatore, int probTitolare, int probPanchina, String note) {
		this.idGiornate = idGiornate;
		this.idUtentiFormazioni = idUtentiFormazioni;
		this.idGiocatore = idGiocatore;
		this.probTitolare = probTitolare;
		this.probPanchina = probPanchina;
		this.note = note;
	}

	@Column(name = "id_giornate", nullable = false)
	public int getIdGiornate() {
		return this.idGiornate;
	}

	public void setIdGiornate(int idGiornate) {
		this.idGiornate = idGiornate;
	}

	@Column(name = "id_utenti_formazioni", nullable = false)
	public int getIdUtentiFormazioni() {
		return this.idUtentiFormazioni;
	}

	public void setIdUtentiFormazioni(int idUtentiFormazioni) {
		this.idUtentiFormazioni = idUtentiFormazioni;
	}

	@Column(name = "id_giocatore", nullable = false)
	public int getIdGiocatore() {
		return this.idGiocatore;
	}

	public void setIdGiocatore(int idGiocatore) {
		this.idGiocatore = idGiocatore;
	}

	@Column(name = "prob_titolare", nullable = false)
	public int getProbTitolare() {
		return this.probTitolare;
	}

	public void setProbTitolare(int probTitolare) {
		this.probTitolare = probTitolare;
	}

	@Column(name = "prob_panchina", nullable = false)
	public int getProbPanchina() {
		return this.probPanchina;
	}

	public void setProbPanchina(int probPanchina) {
		this.probPanchina = probPanchina;
	}

	@Column(name = "note", length = 100)
	@Length(max = 100)
	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ProbabiliFormazioniId))
			return false;
		ProbabiliFormazioniId castOther = (ProbabiliFormazioniId) other;

		return (this.getIdGiornate() == castOther.getIdGiornate()) && (this.getIdUtentiFormazioni() == castOther.getIdUtentiFormazioni()) && (this.getIdGiocatore() == castOther.getIdGiocatore()) && (this.getProbTitolare() == castOther.getProbTitolare()) && (this.getProbPanchina() == castOther.getProbPanchina()) && ((this.getNote() == castOther.getNote()) || (this.getNote() != null && castOther.getNote() != null && this.getNote().equals(castOther.getNote())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdGiornate();
		result = 37 * result + this.getIdUtentiFormazioni();
		result = 37 * result + this.getIdGiocatore();
		result = 37 * result + this.getProbTitolare();
		result = 37 * result + this.getProbPanchina();
		result = 37 * result + (getNote() == null ? 0 : this.getNote().hashCode());
		return result;
	}

}
