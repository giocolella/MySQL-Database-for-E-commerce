package store;

public class ChitarraElettrica {

	String tipoPickup;
	int numeroCorde;
	int idProdotto;
	
	public ChitarraElettrica() {
		
	}
	
	public String getTipoPickup() {
		return tipoPickup;
	}
	public void setTipoPickup(String tipoPickup) {
		this.tipoPickup = tipoPickup;
	}
	public int getNumeroCorde() {
		return numeroCorde;
	}
	public void setNumeroCorde(int numeroCorde) {
		this.numeroCorde = numeroCorde;
	}
	public int getIdProdotto() {
		return idProdotto;
	}
	public void setIdProdotto(int idProdotto) {
		this.idProdotto = idProdotto;
	}
	
	public void print() {
		System.out.printf("%-15s | %-2d | %-5d  \n",tipoPickup,numeroCorde,idProdotto);
	}
	
}
