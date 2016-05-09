package it.zeze.fantaformazioneweb.entity.definition;

import it.zeze.fantaformazioneweb.entity.Giocatori;

public interface ProbabiliFormazioniInterface extends java.io.Serializable {

	public ProbabiliFormazioniIdInterface getId();

	public void setId(ProbabiliFormazioniIdInterface id);

	public GiornateInterface getGiornate();

	public void setGiornate(GiornateInterface giornate);

	public UtentiFormazioniInterface getUtentiFormazioni();

	public void setUtentiFormazioni(UtentiFormazioniInterface utentiFormazioni);

	public Giocatori getGiocatori();

	public void setGiocatori(Giocatori giocatori);

}
