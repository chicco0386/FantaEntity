package it.zeze.fantaformazioneweb.entity.definition;

import java.math.BigDecimal;
import java.util.Set;

import it.zeze.fantaformazioneweb.entity.Squadre;

public interface GiocatoriInterface extends java.io.Serializable {
	public int getId();

	public void setId(int id);

	public Squadre getSquadre();

	public void setSquadre(SquadreInterface squadre);

	public String getNome();

	public void setNome(String nome);

	public String getRuolo();

	public void setRuolo(String ruolo);

	public String getStagione();

	public void setStagione(String stagione);

	public BigDecimal getQuotazIniziale();

	public void setQuotazIniziale(BigDecimal quotazIniziale);

	public BigDecimal getQuotazAttuale();

	public void setQuotazAttuale(BigDecimal quotazAttuale);

//	public Set<ProbabiliFormazioniFgInterface> getProbabiliFormazioniFgs();
//
//	public void setProbabiliFormazioniFgs(Set<ProbabiliFormazioniFgInterface> probabiliFormazioniFgs);
//
//	public Set<ProbabiliFormazioniGazzettaInterface> getProbabiliFormazioniGazzettas();
//
//	public void setProbabiliFormazioniGazzettas(Set<ProbabiliFormazioniGazzettaInterface> probabiliFormazioniGazzettas);
//
//	public Set<FormazioniInterface> getFormazionis();
//
//	public void setFormazionis(Set<FormazioniInterface> formazionis);
//
//	public Set<StatisticheInterface> getStatistiches();
//
//	public void setStatistiches(Set<StatisticheInterface> statistiches);
//
//	public Set<ProbabiliFormazioniInterface> getProbabiliFormazionis();
//
//	public void setProbabiliFormazionis(Set<ProbabiliFormazioniInterface> probabiliFormazionis);

}
