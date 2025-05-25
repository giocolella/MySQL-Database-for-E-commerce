package store;

import java.util.Date;

public class Ordine {

	int id;
	String idCliente;
	int idPagamento;
	Date dataOrdine;
	int idSpedizione;
	
	public Ordine() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}
	public int getIdPagamento() {
		return idPagamento;
	}
	public void setIdPagamento(int idPagamento) {
		this.idPagamento = idPagamento;
	}
	public Date getDataOrdine() {
		return dataOrdine;
	}
	public void setDataOrdine(Date dataOrdine) {
		this.dataOrdine = dataOrdine;
	}
	public int getIdSpedizione() {
		return idSpedizione;
	}
	public void setIdSpedizione(int idSpedizione) {
		this.idSpedizione = idSpedizione;
	}
	
	public void print() {
		System.out.printf("%-5d | %-16s | %-5d | %-10s | %-5d  \n",id,idCliente,idPagamento,dataOrdine,idSpedizione);
	}
}
