package it.zeze.fantaformazioneweb.entity.definition;

import java.math.BigDecimal;

public interface StatisticheIdInterface extends java.io.Serializable {

	public int getIdGiocatore();

	public void setIdGiocatore(int idGiocatore);

	public int getIdGiornata();

	public void setIdGiornata(int idGiornata);

	public BigDecimal getMediaVoto();

	public void setMediaVoto(BigDecimal mediaVoto);

	public BigDecimal getMediaVotoFm();

	public void setMediaVotoFm(BigDecimal mediaVotoFm);

	public int getGoalFatti();

	public void setGoalFatti(int goalFatti);

	public int getGoalRigore();

	public void setGoalRigore(int goalRigore);

	public int getGoalSubiti();

	public void setGoalSubiti(int goalSubiti);

	public int getRigoriParati();

	public void setRigoriParati(int rigoriParati);

	public int getRigoriSbagliati();

	public void setRigoriSbagliati(int rigoriSbagliati);

	public int getAutoreti();

	public void setAutoreti(int autoreti);

	public int getAssist();

	public void setAssist(int assist);

	public int getAmmonizioni();

	public void setAmmonizioni(int ammonizioni);

	public int getEspulsioni();

	public void setEspulsioni(int espulsioni);

	public int getPartiteGiocate();

	public void setPartiteGiocate(int partiteGiocate);

}
