package it.zeze.fantaformazioneweb.entity;

// Generated 19-gen-2012 10.57.55 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Transient;

/**
 * StatisticheId generated by hbm2java
 */
@Embeddable
public class StatisticheId implements java.io.Serializable {

	private int idGiocatore;
	private int idGiornata;
	private BigDecimal mediaVoto;
	private BigDecimal mediaVotoFm;
	private int goalFatti;
	private int goalRigore;
	private int goalSubiti;
	private int rigoriParati;
	private int rigoriSbagliati;
	private int autoreti;
	private int assist;
	private int ammonizioni;
	private int espulsioni;
	
	private int partiteGiocate=0;

	public StatisticheId() {
	}

	public StatisticheId(int idGiocatore, int idGiornata, BigDecimal mediaVoto, BigDecimal mediaVotoFm, int goalFatti, int goalRigore, int goalSubiti, int rigoriParati, int rigoriSbagliati, int autoreti, int assist, int ammonizioni, int espulsioni) {
		this.idGiocatore = idGiocatore;
		this.idGiornata = idGiornata;
		this.mediaVoto = mediaVoto;
		this.mediaVotoFm = mediaVotoFm;
		this.goalFatti = goalFatti;
		this.goalRigore = goalRigore;
		this.goalSubiti = goalSubiti;
		this.rigoriParati = rigoriParati;
		this.rigoriSbagliati = rigoriSbagliati;
		this.autoreti = autoreti;
		this.assist = assist;
		this.ammonizioni = ammonizioni;
		this.espulsioni = espulsioni;
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

	@Column(name = "media_voto", nullable = false, precision = 2, scale = 2)
	public BigDecimal getMediaVoto() {
		return this.mediaVoto;
	}

	public void setMediaVoto(BigDecimal mediaVoto) {
		this.mediaVoto = mediaVoto;
	}

	@Column(name = "media_voto_fm", nullable = false, precision = 2, scale = 2)
	public BigDecimal getMediaVotoFm() {
		return this.mediaVotoFm;
	}

	public void setMediaVotoFm(BigDecimal mediaVotoFm) {
		this.mediaVotoFm = mediaVotoFm;
	}

	@Column(name = "goal_fatti", nullable = false)
	public int getGoalFatti() {
		return this.goalFatti;
	}

	public void setGoalFatti(int goalFatti) {
		this.goalFatti = goalFatti;
	}

	@Column(name = "goal_rigore", nullable = false)
	public int getGoalRigore() {
		return this.goalRigore;
	}

	public void setGoalRigore(int goalRigore) {
		this.goalRigore = goalRigore;
	}

	@Column(name = "goal_subiti", nullable = false)
	public int getGoalSubiti() {
		return this.goalSubiti;
	}

	public void setGoalSubiti(int goalSubiti) {
		this.goalSubiti = goalSubiti;
	}

	@Column(name = "rigori_parati", nullable = false)
	public int getRigoriParati() {
		return this.rigoriParati;
	}

	public void setRigoriParati(int rigoriParati) {
		this.rigoriParati = rigoriParati;
	}

	@Column(name = "rigori_sbagliati", nullable = false)
	public int getRigoriSbagliati() {
		return this.rigoriSbagliati;
	}

	public void setRigoriSbagliati(int rigoriSbagliati) {
		this.rigoriSbagliati = rigoriSbagliati;
	}

	@Column(name = "autoreti", nullable = false)
	public int getAutoreti() {
		return this.autoreti;
	}

	public void setAutoreti(int autoreti) {
		this.autoreti = autoreti;
	}

	@Column(name = "assist", nullable = false)
	public int getAssist() {
		return this.assist;
	}

	public void setAssist(int assist) {
		this.assist = assist;
	}

	@Column(name = "ammonizioni", nullable = false)
	public int getAmmonizioni() {
		return this.ammonizioni;
	}

	public void setAmmonizioni(int ammonizioni) {
		this.ammonizioni = ammonizioni;
	}

	@Column(name = "espulsioni", nullable = false)
	public int getEspulsioni() {
		return this.espulsioni;
	}

	public void setEspulsioni(int espulsioni) {
		this.espulsioni = espulsioni;
	}

	@Transient
	public int getPartiteGiocate() {
		return partiteGiocate;
	}

	public void setPartiteGiocate(int partiteGiocate) {
		this.partiteGiocate = partiteGiocate;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof StatisticheId))
			return false;
		StatisticheId castOther = (StatisticheId) other;

		return (this.getIdGiocatore() == castOther.getIdGiocatore()) && (this.getIdGiornata() == castOther.getIdGiornata()) && ((this.getMediaVoto() == castOther.getMediaVoto()) || (this.getMediaVoto() != null && castOther.getMediaVoto() != null && this.getMediaVoto().equals(castOther.getMediaVoto()))) && ((this.getMediaVotoFm() == castOther.getMediaVotoFm()) || (this.getMediaVotoFm() != null && castOther.getMediaVotoFm() != null && this.getMediaVotoFm().equals(castOther.getMediaVotoFm()))) && (this.getGoalFatti() == castOther.getGoalFatti()) && (this.getGoalRigore() == castOther.getGoalRigore()) && (this.getGoalSubiti() == castOther.getGoalSubiti()) && (this.getRigoriParati() == castOther.getRigoriParati()) && (this.getRigoriSbagliati() == castOther.getRigoriSbagliati()) && (this.getAutoreti() == castOther.getAutoreti()) && (this.getAssist() == castOther.getAssist()) && (this.getAmmonizioni() == castOther.getAmmonizioni()) && (this.getEspulsioni() == castOther.getEspulsioni());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdGiocatore();
		result = 37 * result + this.getIdGiornata();
		result = 37 * result + (getMediaVoto() == null ? 0 : this.getMediaVoto().hashCode());
		result = 37 * result + (getMediaVotoFm() == null ? 0 : this.getMediaVotoFm().hashCode());
		result = 37 * result + this.getGoalFatti();
		result = 37 * result + this.getGoalRigore();
		result = 37 * result + this.getGoalSubiti();
		result = 37 * result + this.getRigoriParati();
		result = 37 * result + this.getRigoriSbagliati();
		result = 37 * result + this.getAutoreti();
		result = 37 * result + this.getAssist();
		result = 37 * result + this.getAmmonizioni();
		result = 37 * result + this.getEspulsioni();
		return result;
	}

}
