package it.zeze.fantaformazioneweb.entity.definition;

public interface CalendarioInterface extends java.io.Serializable {

	public CalendarioIdInterface getId();

	public void setId(CalendarioIdInterface id);

	public SquadreInterface getSquadreByIdSquadraFuoriCasa();

	public void setSquadreByIdSquadraFuoriCasa(SquadreInterface squadreByIdSquadraFuoriCasa);

	public GiornateInterface getGiornate();

	public void setGiornate(GiornateInterface giornate);

	public SquadreInterface getSquadreByIdSquadraCasa();

	public void setSquadreByIdSquadraCasa(SquadreInterface squadreByIdSquadraCasa);

}
