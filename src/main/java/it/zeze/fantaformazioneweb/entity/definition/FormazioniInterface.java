package it.zeze.fantaformazioneweb.entity.definition;

import java.math.BigDecimal;

import it.zeze.fantaformazioneweb.entity.FormazioniId;
import it.zeze.fantaformazioneweb.entity.Giocatori;

public interface FormazioniInterface extends java.io.Serializable {
	
	public FormazioniId getId();

	public void setId(FormazioniIdInterface id);
	
	public UtentiFormazioniInterface getUtentiFormazioni();

	public void setUtentiFormazioni(UtentiFormazioniInterface utentiFormazioni);
	
	public Giocatori getGiocatori();

	public void setGiocatori(GiocatoriInterface giocatori);

	public BigDecimal getPrezzoAcquisto();

	public void setPrezzoAcquisto(BigDecimal prezzoAcquisto);

}
