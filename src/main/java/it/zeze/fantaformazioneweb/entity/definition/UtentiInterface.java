package it.zeze.fantaformazioneweb.entity.definition;

import java.util.Date;
import java.util.Set;

public interface UtentiInterface extends java.io.Serializable {

	public int getId();

	public void setId(int id);

	public String getUsername();

	public void setUsername(String username);

	public String getPassword();

	public void setPassword(String password);

	public String getPasswordRepeat();

	public void setPasswordRepeat(String passwordRepeat);

	public String getMail();

	public void setMail(String mail);

	public Date getDataRegistrazione();

	public void setDataRegistrazione(Date dataRegistrazione);

	public Date getDataUltimoAccesso();

	public void setDataUltimoAccesso(Date dataUltimoAccesso);

	public Set<UtentiFormazioniInterface> getUtentiFormazionis();

	public void setUtentiFormazionis(Set<UtentiFormazioniInterface> utentiFormazionis);

}
