package it.zeze.fantaformazioneweb.entity.wrapper;

public abstract class CalendarioWrap implements java.io.Serializable {

	private static final long serialVersionUID = -6113345100536770859L;

	private CalendarioIdWrap id;
	private SquadreWrap squadreByIdSquadraFuoriCasa;
	private GiornateWrap giornate;
	private SquadreWrap squadreByIdSquadraCasa;

	public CalendarioIdWrap getId() {
		return id;
	}

	public void setId(CalendarioIdWrap id) {
		this.id = id;
	}

	public SquadreWrap getSquadreByIdSquadraFuoriCasa() {
		return squadreByIdSquadraFuoriCasa;
	}

	public void setSquadreByIdSquadraFuoriCasa(SquadreWrap squadreByIdSquadraFuoriCasa) {
		this.squadreByIdSquadraFuoriCasa = squadreByIdSquadraFuoriCasa;
	}

	public GiornateWrap getGiornate() {
		return giornate;
	}

	public void setGiornate(GiornateWrap giornate) {
		this.giornate = giornate;
	}

	public SquadreWrap getSquadreByIdSquadraCasa() {
		return squadreByIdSquadraCasa;
	}

	public void setSquadreByIdSquadraCasa(SquadreWrap squadreByIdSquadraCasa) {
		this.squadreByIdSquadraCasa = squadreByIdSquadraCasa;
	}

}
