package store;

import java.util.Date;

public class Pagamento {

	int id;
	Date dataPagamento;
	String tipo;
	double importo;
	
	public Pagamento() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getImporto() {
		return importo;
	}

	public void setImporto(double importo) {
		this.importo = importo;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}
	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	
	public void print() {
		System.out.printf("%-2d | %-10s | %-10s | %-10f \n",id,tipo,dataPagamento,importo);
	}
	
	@Override
	public String toString() {
		return "Pagamento (" + id + "), (" + tipo + "), (" + importo + "), (" + dataPagamento + ") ";
	}
	
}
