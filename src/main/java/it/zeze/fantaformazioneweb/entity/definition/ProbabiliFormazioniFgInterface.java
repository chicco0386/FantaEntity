package it.zeze.fantaformazioneweb.entity.definition;

import it.zeze.fantaformazioneweb.entity.Giocatori;

public interface ProbabiliFormazioniFgInterface extends java.io.Serializable {

	public ProbabiliFormazioniFgIdInterface getId();

	public void setId(ProbabiliFormazioniFgIdInterface id);

	public Giocatori getGiocatori();

	public void setGiocatori(Giocatori giocatori);

	public GiornateInterface getGiornate();

	public void setGiornate(GiornateInterface giornate);

}
