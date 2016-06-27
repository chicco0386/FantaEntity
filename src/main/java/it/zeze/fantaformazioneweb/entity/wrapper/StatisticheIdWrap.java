package it.zeze.fantaformazioneweb.entity.wrapper;

import java.math.BigDecimal;

import it.zeze.fantaformazioneweb.entity.StatisticheId;

public  class StatisticheIdWrap implements java.io.Serializable {

	private static final long serialVersionUID = 7405273769890408299L;

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
	private int partiteGiocate = 0;
	
	public StatisticheIdWrap(StatisticheId toCopy) {
		idGiocatore = toCopy.getIdGiocatore();
		idGiornata = toCopy.getIdGiornata();
		mediaVoto = toCopy.getMediaVoto();
		mediaVotoFm = toCopy.getMediaVotoFm();
		goalFatti = toCopy.getGoalFatti();
		goalRigore = toCopy.getGoalRigore();
		goalSubiti = toCopy.getGoalSubiti();
		rigoriParati = toCopy.getRigoriParati();
		rigoriSbagliati = toCopy.getRigoriSbagliati();
		autoreti = toCopy.getAutoreti();
		assist = toCopy.getAssist();
		ammonizioni = toCopy.getAmmonizioni();
		espulsioni = toCopy.getEspulsioni();
		partiteGiocate = toCopy.getPartiteGiocate();
	}
	
	public StatisticheId unwrap(){
		StatisticheId toReturn = new StatisticheId(idGiocatore, idGiornata, mediaVoto, mediaVotoFm, goalFatti, goalRigore, goalSubiti, rigoriParati, rigoriSbagliati, autoreti, assist, ammonizioni, espulsioni);
		toReturn.setPartiteGiocate(partiteGiocate);
		return toReturn;
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

	public BigDecimal getMediaVoto() {
		return mediaVoto;
	}

	public void setMediaVoto(BigDecimal mediaVoto) {
		this.mediaVoto = mediaVoto;
	}

	public BigDecimal getMediaVotoFm() {
		return mediaVotoFm;
	}

	public void setMediaVotoFm(BigDecimal mediaVotoFm) {
		this.mediaVotoFm = mediaVotoFm;
	}

	public int getGoalFatti() {
		return goalFatti;
	}

	public void setGoalFatti(int goalFatti) {
		this.goalFatti = goalFatti;
	}

	public int getGoalRigore() {
		return goalRigore;
	}

	public void setGoalRigore(int goalRigore) {
		this.goalRigore = goalRigore;
	}

	public int getGoalSubiti() {
		return goalSubiti;
	}

	public void setGoalSubiti(int goalSubiti) {
		this.goalSubiti = goalSubiti;
	}

	public int getRigoriParati() {
		return rigoriParati;
	}

	public void setRigoriParati(int rigoriParati) {
		this.rigoriParati = rigoriParati;
	}

	public int getRigoriSbagliati() {
		return rigoriSbagliati;
	}

	public void setRigoriSbagliati(int rigoriSbagliati) {
		this.rigoriSbagliati = rigoriSbagliati;
	}

	public int getAutoreti() {
		return autoreti;
	}

	public void setAutoreti(int autoreti) {
		this.autoreti = autoreti;
	}

	public int getAssist() {
		return assist;
	}

	public void setAssist(int assist) {
		this.assist = assist;
	}

	public int getAmmonizioni() {
		return ammonizioni;
	}

	public void setAmmonizioni(int ammonizioni) {
		this.ammonizioni = ammonizioni;
	}

	public int getEspulsioni() {
		return espulsioni;
	}

	public void setEspulsioni(int espulsioni) {
		this.espulsioni = espulsioni;
	}

	public int getPartiteGiocate() {
		return partiteGiocate;
	}

	public void setPartiteGiocate(int partiteGiocate) {
		this.partiteGiocate = partiteGiocate;
	}

}
