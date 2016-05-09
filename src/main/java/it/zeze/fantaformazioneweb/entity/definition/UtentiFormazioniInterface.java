package it.zeze.fantaformazioneweb.entity.definition;

import java.math.BigDecimal;
import java.util.Set;

import it.zeze.fantaformazioneweb.entity.ProbabiliFormazioni;

public interface UtentiFormazioniInterface extends java.io.Serializable {

	public Integer getId();

	public void setId(Integer id);

	public UtentiInterface getUtenti();

	public void setUtenti(UtentiInterface utenti);

	public String getNomeFormazione();

	public void setNomeFormazione(String nomeFormazione);

	public BigDecimal getCrediti();

	public void setCrediti(BigDecimal crediti);

	public Set<ProbabiliFormazioni> getProbabiliFormazionis();

	public void setProbabiliFormazionis(Set<ProbabiliFormazioni> probabiliFormazionis);

	public Set<FormazioniInterface> getFormazionis();

	public void setFormazionis(Set<FormazioniInterface> formazionis);

}
