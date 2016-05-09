package it.zeze.fantaformazioneweb.entity.definition;

import it.zeze.fantaformazioneweb.entity.Giocatori;
import it.zeze.fantaformazioneweb.entity.Giornate;

public interface ProbabiliFormazioniGazzettaInterface extends java.io.Serializable {

	public ProbabiliFormazioniGazzettaIdInterface getId();

	public void setId(ProbabiliFormazioniGazzettaIdInterface id);

	public Giocatori getGiocatori();

	public void setGiocatori(Giocatori giocatori);

	public Giornate getGiornate();

	public void setGiornate(GiornateInterface giornate);

}
