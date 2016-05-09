package it.zeze.fantaformazioneweb.entity.definition;

import it.zeze.fantaformazioneweb.entity.Giocatori;

public interface StatisticheInterface extends java.io.Serializable {

	public StatisticheIdInterface getId();

	public void setId(StatisticheIdInterface id);

	public Giocatori getGiocatori();

	public void setGiocatori(Giocatori giocatori);

	public GiornateInterface getGiornate();

	public void setGiornate(GiornateInterface giornate);

}
