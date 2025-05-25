package store;

import java.util.Date;

public class Cliente {

	private String cf;
	private String nome;
	private String cognome;
	private Date data;
	private String indirizzo;
	private String email;
	private String password;
	private String creditCard;
	private String cardExpire;
	private int numTotAcquisti;
	
	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}

	public String getCardExpire() {
		return cardExpire;
	}

	public void setCardExpire(String cardExpire) {
		this.cardExpire = cardExpire;
	}

	public int getNumTotAcquisti() {
		return numTotAcquisti;
	}

	public void setNumTotAcquisti(int numTotAcquisti) {
		this.numTotAcquisti = numTotAcquisti;
	}

	public Cliente() {
		
	}
	
	public String getCf() {
		return cf;
	}
	public void setCf(String cf) {
		this.cf = cf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	public void print() {
		System.out.printf("%-16s | %-10s | %-15s | %10s | %-70s | %-30s | %-15s | %-10s | %-10s | %-5d  \n",cf,nome,cognome,data,indirizzo,email,password,creditCard,cardExpire,numTotAcquisti);
	}
	
	@Override
	public String toString() {
		return "Cliente (" + cf + "), (" + nome + "), (" + cognome + "), (" + data + ") ";
	}
	
}
