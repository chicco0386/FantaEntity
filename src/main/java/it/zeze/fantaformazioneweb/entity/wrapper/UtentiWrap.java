package it.zeze.fantaformazioneweb.entity.wrapper;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public abstract class UtentiWrap implements java.io.Serializable {

	private static final long serialVersionUID = 1104818271479726497L;

	private int id;
	private String username;
	private String password;
	private String passwordRepeat;
	private String mail;
	private Date dataRegistrazione;
	private Date dataUltimoAccesso;
	private Set<UtentiFormazioniWrap> utentiFormazionis = new HashSet<UtentiFormazioniWrap>(0);

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordRepeat() {
		return passwordRepeat;
	}

	public void setPasswordRepeat(String passwordRepeat) {
		this.passwordRepeat = passwordRepeat;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Date getDataRegistrazione() {
		return dataRegistrazione;
	}

	public void setDataRegistrazione(Date dataRegistrazione) {
		this.dataRegistrazione = dataRegistrazione;
	}

	public Date getDataUltimoAccesso() {
		return dataUltimoAccesso;
	}

	public void setDataUltimoAccesso(Date dataUltimoAccesso) {
		this.dataUltimoAccesso = dataUltimoAccesso;
	}

	public Set<UtentiFormazioniWrap> getUtentiFormazionis() {
		return utentiFormazionis;
	}

	public void setUtentiFormazionis(Set<UtentiFormazioniWrap> utentiFormazionis) {
		this.utentiFormazionis = utentiFormazionis;
	}

}
