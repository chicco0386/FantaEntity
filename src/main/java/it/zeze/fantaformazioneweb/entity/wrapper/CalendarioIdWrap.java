package it.zeze.fantaformazioneweb.entity.wrapper;

import it.zeze.fantaformazioneweb.entity.CalendarioId;

public class CalendarioIdWrap implements java.io.Serializable {

	private static final long serialVersionUID = 8275156826731788223L;

	private int idGiornata;
	private int idSquadraCasa;
	private int idSquadraFuoriCasa;
	
	public CalendarioIdWrap(CalendarioId toCopy) {
		idGiornata = toCopy.getIdGiornata();
		idSquadraCasa = toCopy.getIdSquadraCasa();
		idSquadraFuoriCasa = toCopy.getIdSquadraFuoriCasa();
	}

	public int getIdGiornata() {
		return idGiornata;
	}

	public void setIdGiornata(int idGiornata) {
		this.idGiornata = idGiornata;
	}

	public int getIdSquadraCasa() {
		return idSquadraCasa;
	}

	public void setIdSquadraCasa(int idSquadraCasa) {
		this.idSquadraCasa = idSquadraCasa;
	}

	public int getIdSquadraFuoriCasa() {
		return idSquadraFuoriCasa;
	}

	public void setIdSquadraFuoriCasa(int idSquadraFuoriCasa) {
		this.idSquadraFuoriCasa = idSquadraFuoriCasa;
	}

}
