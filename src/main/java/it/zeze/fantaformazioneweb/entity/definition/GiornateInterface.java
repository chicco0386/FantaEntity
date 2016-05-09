package it.zeze.fantaformazioneweb.entity.definition;

import java.util.Date;

public interface GiornateInterface extends java.io.Serializable {

	public Integer getId();

	public void setId(Integer id);
	
	public Integer getNumeroGiornata();

	public void setNumeroGiornata(Integer numeroGiornata);

	public String getStagione();

	public void setStagione(String stagione);

	public Date getData();

	public void setData(Date data);

//	public Set<StatisticheInterface> getStatistiches();
//
//	public void setStatistiches(Set<StatisticheInterface> statistiches);
//
//	public Set<ProbabiliFormazioniFgInterface> getProbabiliFormazioniFgs();
//
//	public void setProbabiliFormazioniFgs(Set<ProbabiliFormazioniFgInterface> probabiliFormazioniFgs);
//
//	public Set<ProbabiliFormazioniGazzettaInterface> getProbabiliFormazioniGazzettas();
//
//	public void setProbabiliFormazioniGazzettas(Set<ProbabiliFormazioniGazzettaInterface> probabiliFormazioniGazzettas);
//
//	public Set<Calendario> getCalendarios();
//
//	public void setCalendarios(Set<Calendario> calendarios);
//
//	public Set<ProbabiliFormazioniInterface> getProbabiliFormazionis();
//
//	public void setProbabiliFormazionis(Set<ProbabiliFormazioniInterface> probabiliFormazionis);

}
