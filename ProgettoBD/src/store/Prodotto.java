package store;

public class Prodotto {

	int codice;
	String marca;
	double prezzo;
	int quantita;
	String colore;
	
	public Prodotto() {

	}
	
	public int getCodice() {
		return codice;
	}
	public void setCodice(int codice) {
		this.codice = codice;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public int getQuantita() {
		return quantita;
	}
	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}
	public String getColore() {
		return colore;
	}
	public void setColore(String colore) {
		this.colore = colore;
	}
	
	public void print() {
		System.out.printf("%-2s | %-15s | %-7f | %-3d | %-10s  \n",codice,marca,prezzo,quantita,colore);
	}
	
	@Override
	public String toString() {
		return "Prodotto (" + codice + "), (" + marca + "), (" + prezzo + "), (" + quantita + ") " + "(" + prezzo + "), " + "(" + colore + ")";
	}
	
}
